package org.monarchinitiative.pheno.view;

import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.event.EventType;
import org.protege.editor.owl.model.event.OWLModelManagerListener;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Metrics extends JPanel {

    private JButton refreshButton = new JButton("Refresh");

    private JLabel textComponent = new JLabel();

    private OWLModelManager modelManager;


    private ActionListener refreshAction = e -> recalculate();
    
    private OWLModelManagerListener modelListener = event -> {
        if (event.getType() == EventType.ACTIVE_ONTOLOGY_CHANGED) {
            recalculate();
        }
    };
    
    public Metrics(OWLModelManager modelManager) {
    	this.modelManager = modelManager;
        recalculate();
        
        modelManager.addListener(modelListener);
        refreshButton.addActionListener(refreshAction);
        
        add(textComponent);
        add(refreshButton);
    }
    
    public void dispose() {
        modelManager.removeListener(modelListener);
        refreshButton.removeActionListener(refreshAction);
    }
    
    private void recalculate() {
        int count = modelManager.getActiveOntology().getClassesInSignature().size();
        if (count == 0) {
            count = 1;  // owl:Thing is always there.
        }
        textComponent.setText("Total classes = " + count);
    }
}
