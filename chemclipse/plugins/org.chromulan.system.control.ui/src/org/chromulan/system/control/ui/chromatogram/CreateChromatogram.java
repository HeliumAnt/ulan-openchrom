/*******************************************************************************
 * Copyright (c) 2015 Jan Holy.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Jan Holy - initial API and implementation
 *******************************************************************************/
package org.chromulan.system.control.ui.chromatogram;

import javax.inject.Inject;

import org.chromulan.system.control.model.IControlDevice;
import org.chromulan.system.control.model.chromatogram.IChromatogramRecording;
import org.chromulan.system.control.model.chromatogram.IChromatogramRecordingWSD;
import org.chromulan.system.control.ui.events.IAnalysisUIEvents;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class CreateChromatogram {

	@Inject
	private EModelService modelService;
	@Inject
	private MApplication aplication;
	@Inject
	private EPartService partService;

	@Inject
	@Optional
	public void displayChromatogam(@UIEventTopic(value = IAnalysisUIEvents.TOPIC_ANALYSIS_CHROMULAN_UI_CHROMATOGRAM_DISPLAY) IChromatogramRecording chromatogram) {

		MPart part = MBasicFactory.INSTANCE.createPart();
		part.setLabel(chromatogram.getName());
		part.setElementId("ChromatogramRecording");
		part.setCloseable(true);
		part.setObject(chromatogram);
		part.setContributionURI("bundleclass://org.chromulan.system.control.ui/org.chromulan.system.control.ui.chromatogram.ChromatogramViewer");
		MPartStack stack = (MPartStack)modelService.find("org.chromulan.system.control.ui.partstack.2", aplication);
		stack.getChildren().add(part);
		partService.activate(part);
	}
}