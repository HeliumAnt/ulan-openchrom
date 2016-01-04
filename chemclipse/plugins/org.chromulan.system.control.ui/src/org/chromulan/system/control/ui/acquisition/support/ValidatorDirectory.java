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
package org.chromulan.system.control.ui.acquisition.support;

import java.io.File;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ValidatorDirectory implements IValidator {

	@Override
	public IStatus validate(Object value) {

		if(value instanceof File) {
			File file = (File)value;
			if(file.isDirectory()) {
				return Status.OK_STATUS;
			} else {
				return ValidationStatus.error("directory path is not valid");
			}
		} else {
			return ValidationStatus.error("directory path is not valid");
		}
	}
}
