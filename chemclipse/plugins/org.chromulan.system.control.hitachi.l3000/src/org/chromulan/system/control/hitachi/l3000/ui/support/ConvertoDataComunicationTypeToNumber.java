/*******************************************************************************
 * Copyright (c) 2016 Jan Holy.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Jan Holy - initial API and implementation
 *******************************************************************************/
package org.chromulan.system.control.hitachi.l3000.ui.support;

import org.chromulan.system.control.hitachi.l3000.model.ControlDevice;
import org.eclipse.core.databinding.conversion.Converter;

public class ConvertoDataComunicationTypeToNumber extends Converter {

	public ConvertoDataComunicationTypeToNumber() {
		super(String.class, Integer.class);
	}

	@Override
	public Object convert(Object fromObject) {

		String name = (String)fromObject;
		if(name.equals(ControlDevice.SETTING_DATA_OUTPUT_ANALOG)) {
			return ControlDevice.OUTPUT_ANALOG;
		} else if(name.equals(ControlDevice.SETTING_DATA_OUTPUT_DATA_COMMUNICATION)) {
			return ControlDevice.OUTPUT_DIGITAL;
		}
		return null;
	}
}
