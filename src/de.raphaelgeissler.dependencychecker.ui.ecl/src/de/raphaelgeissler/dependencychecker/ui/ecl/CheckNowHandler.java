package de.raphaelgeissler.dependencychecker.ui.ecl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidatorFactory;

public class CheckNowHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				Object element = structuredSelection.getFirstElement();
				System.out.println(element.getClass());

				if (element instanceof IFile) {
					IFile checkerFile = (IFile) element;
					System.out.println(checkerFile.getLocationURI());
					DependencyValidator dependencyValidator = DependencyValidatorFactory.createDependencyValidator(
							new File(checkerFile.getLocationURI().getPath()).getAbsolutePath(),
							getManifestFilePaths());
					dependencyValidator.validate();
				}
			}

		}

		return null;
	}

	
	private List<String> getManifestFilePaths()
	{
		List<String> manifestFilePaths = new ArrayList<>();
		
		for(IProject nextProject : getProjects())
		{
			if(nextProject.isOpen())
			{
				IFile file = nextProject.getFile("/META-INF/MANIFEST.MF");
				if(file.exists())
					manifestFilePaths.add(new File(file.getLocationURI()).getAbsolutePath());
			}
		}
		
		return manifestFilePaths;
	}
	
	private IProject[] getProjects() {

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		return projects;
	}

}
