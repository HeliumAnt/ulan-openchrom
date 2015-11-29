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
package org.chromulan.system.control.model.data;

import org.chromulan.system.control.model.IControlDevice;

public class AbstractDeviceData extends AbstractAnalysisData implements IDeviceData {

	IControlDevice device;

	public AbstractDeviceData(IControlDevice device) {

		this.device = device;
	}

	@Override
	public IControlDevice getControlDevice() {

		return device;
	}

	@Override
	public String getName() {

		return device.getName();
	}
}
