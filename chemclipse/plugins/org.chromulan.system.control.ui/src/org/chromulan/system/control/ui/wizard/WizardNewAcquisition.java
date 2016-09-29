/*******************************************************************************
 * Copyright (c) 2015, 2016 Jan Holy.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Jan Holy - initial API and implementation
 *******************************************************************************/
package org.chromulan.system.control.ui.wizard;

import java.util.List;

import org.chromulan.system.control.device.IDevicesProfile;
import org.eclipse.jface.wizard.Wizard;

public class WizardNewAcquisition extends Wizard {

	private WizardModelAcquisition modelAcquisition;
	private WizardNewAcquisitionProfile page1;
	private WizardNewAcquisitionMain page2;
	private WizardNewAcquisitionMultiple page3;

	public WizardNewAcquisition(List<IDevicesProfile> devicesProfil) {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Acquisition wizard");
		modelAcquisition = new WizardModelAcquisition();
		page1 = new WizardNewAcquisitionProfile(devicesProfil);
		page2 = new WizardNewAcquisitionMain();
		page3 = new WizardNewAcquisitionMultiple();
	}

	@Override
	public void addPages() {

		addPage(page1);
		addPage(page2);
		addPage(page3);
	}

	public WizardModelAcquisition getModel() {

		return modelAcquisition;
	}

	@Override
	public boolean performFinish() {

		return page2.isPageComplete() && page1.isPageComplete();
	}
}
