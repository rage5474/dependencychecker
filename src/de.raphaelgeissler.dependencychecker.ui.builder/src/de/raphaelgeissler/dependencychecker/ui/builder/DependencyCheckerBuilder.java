package de.raphaelgeissler.dependencychecker.ui.builder;

import java.io.File;
import java.util.Arrays;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;

import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResultMessage;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidatorFactory;

public class DependencyCheckerBuilder extends IncrementalProjectBuilder {

	class DependencyCheckerDeltaVisitor implements IResourceDeltaVisitor {
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				checkManifest(resource);
				break;
			case IResourceDelta.REMOVED:
				break;
			case IResourceDelta.CHANGED:
				checkManifest(resource);
				break;
			}
			return true;
		}
	}

	class DependencyCheckerResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkManifest(resource);
			return true;
		}
	}

	public static final String BUILDER_ID = "de.raphaelgeissler.dependencychecker.ui.builder.dependencyCheckerBuilder";

	private static final String MARKER_TYPE = "de.raphaelgeissler.dependencychecker.dependencyproblem";

	private void addMarker(IFile file, String message, int lineNumber, int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor) throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
	}

	void checkManifest(IResource resource) {
		if (resource instanceof IFile && resource.getName().equalsIgnoreCase("manifest.mf")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);
			Preferences preferences = InstanceScope.INSTANCE
					  .getNode(Activator.PLUGIN_ID);
			
			String checkerConfigPath = preferences.get("checkerConfigPath", "default");
			checkerConfigPath = addWorkspacePathToRelativePath(checkerConfigPath);
			DependencyValidator validator = DependencyValidatorFactory.createDependencyValidator(
					checkerConfigPath,
					Arrays.asList(new File(resource.getLocationURI()).getAbsolutePath()));

			DependencyValidationResult result = validator.validate();
			if(!result.wasSuccessful())
			{
				for(DependencyValidationResultMessage nextMessage : result.getResultMessages())
				{
					if(!nextMessage.correct())
						DependencyCheckerBuilder.this.addMarker(file, "Dependency " + nextMessage.getDependencyPluginId() + " not allowed.", nextMessage.getLineNumber(), IMarker.SEVERITY_WARNING);
				}
			}

		}
	}
	
	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	private String addWorkspacePathToRelativePath(String checkerConfigPath) {
		if(!new File(checkerConfigPath).isAbsolute())
		{
			File workspace = new File(ResourcesPlugin.getWorkspace().getRoot().getLocationURI());
			checkerConfigPath = new File(workspace, checkerConfigPath).getAbsolutePath();
		}
		return checkerConfigPath;
	}

	protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
		try {
			getProject().accept(new DependencyCheckerResourceVisitor());
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		delta.accept(new DependencyCheckerDeltaVisitor());
	}
}
