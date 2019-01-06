package org.monarchinitiative.pheno.menu;

import org.protege.editor.owl.ui.action.ProtegeOWLAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ToolsMenu1 extends ProtegeOWLAction {

	public void initialise() throws Exception {
	}

	public void dispose() throws Exception {
	}

	public void actionPerformed(ActionEvent event) {
		StringBuilder message = new StringBuilder("This example menu item is under the Tools menu.\n");
		message.append("The currently selected class is ");
		message.append(getOWLWorkspace().getOWLSelectionModel().getLastSelectedClass());
		message.append(".");
		JOptionPane.showMessageDialog(getOWLWorkspace(), message.toString());	
	}
}
