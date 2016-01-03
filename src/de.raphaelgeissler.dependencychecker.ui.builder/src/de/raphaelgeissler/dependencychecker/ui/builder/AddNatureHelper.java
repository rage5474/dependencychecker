package de.raphaelgeissler.dependencychecker.ui.builder;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IStartup;

public class AddNatureHelper implements IStartup {

	private IResourceChangeListener listener = new IResourceChangeListener() {
		public void resourceChanged(IResourceChangeEvent event) {
			if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
				List<IProject> projects = getProjects(event.getDelta());
				for (IProject nextProject : projects) {
					try {
						addNatureIfNeeded(nextProject);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		private List<IProject> getProjects(IResourceDelta delta) {
			final List<IProject> projects = new ArrayList<IProject>();
			try {
				delta.accept(new IResourceDeltaVisitor() {
					public boolean visit(IResourceDelta delta) throws CoreException {
						if (delta.getKind() == IResourceDelta.ADDED
								&& delta.getResource().getType() == IResource.PROJECT) {
							IProject project = (IProject) delta.getResource();
							if (project.isAccessible()) {
								projects.add(project);
							}
						}
						// only continue for the workspace root
						return delta.getResource().getType() == IResource.ROOT;
					}
				});
			} catch (CoreException e) {
				// handle error
			}
			return projects;
		}
	};

	@Override
	public void earlyStartup() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(listener, IResourceChangeEvent.POST_CHANGE);
		for (IProject nextProject : workspace.getRoot().getProjects())
			try {
				addNatureIfNeeded(nextProject);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private void addNatureIfNeeded(IProject project) throws CoreException {
		if (project.isAccessible() && isNatureMissing(project)) {
			addNature(project);
		}
	}

	private boolean isNatureMissing(IProject project) throws CoreException {
		boolean result = true;

		IProjectDescription description = project.getDescription();
		for (String nextNatureId : description.getNatureIds()) {
			if (DependencyCheckerNature.NATURE_ID.equals(nextNatureId)) {
				result = false;
				break;
			}
		}

		return result;
	}

	private void addNature(final IProject project) throws CoreException {
		new Job("AddingNatureToProject") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					IProjectDescription description;
					description = project.getDescription();
					String[] natures = description.getNatureIds();
					String[] newNatures = new String[natures.length + 1];
					System.arraycopy(natures, 0, newNatures, 0, natures.length);
					newNatures[natures.length] = DependencyCheckerNature.NATURE_ID;
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
				} catch (CoreException e1) {
					e1.printStackTrace();
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		}.schedule();
		
	}
}
