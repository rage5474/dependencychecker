package de.raphaelgeissler.dependencychecker.ui.builder.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import de.raphaelgeissler.dependencychecker.ui.builder.Activator;

public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public PreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Set path to DependencyChecker config file. Use absolute path or relative - means relative to workspace.");
	}

	public void createFieldEditors() {
		addField(new StringFieldEditor(PreferenceConstants.CHECKER_CONFIG_PATH, "Path to DependencyChecker config file:",
				getFieldEditorParent()));
	}

	public void init(IWorkbench workbench) {
	}

}