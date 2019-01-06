package org.monarchinitiative.pheno.view;

import org.protege.editor.owl.ui.view.AbstractOWLViewComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;

public class PhenoViewComponent extends AbstractOWLViewComponent {

    private static final Logger log = LoggerFactory.getLogger(PhenoViewComponent.class);

    private Metrics metricsComponent;

    @Override
    protected void initialiseOWLView() throws Exception {
        setLayout(new BorderLayout());
        add(new JLabel("Phenotype Term Editor"),BorderLayout.PAGE_START);
        metricsComponent = new Metrics(getOWLModelManager());
        add(metricsComponent, BorderLayout.CENTER);
        log.info("Example View Component initialized");
    }

	@Override
	protected void disposeOWLView() {
		metricsComponent.dispose();
	}
}
