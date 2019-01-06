package org.monarchinitiative.pheno.menu;

import org.protege.editor.owl.ui.action.ProtegeOWLAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ToolsMenu2 extends ProtegeOWLAction {

	public void initialise() throws Exception {
	}

	public void dispose() throws Exception {
	}

	public void actionPerformed(ActionEvent event) {
		StringBuilder message = new StringBuilder("This is the second example menu item under the Tools menu.\n");
		message.append("The active ontology has ");
		message.append(getOWLModelManager().getActiveOntology().getAxiomCount());
		message.append(" axioms.");
		JOptionPane.showMessageDialog(getOWLWorkspace(), message.toString());	
	}
}
