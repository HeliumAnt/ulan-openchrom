package org.chromulan.system.control.device.setting;

public class ValueLong extends ValueNumer<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3491606819668506456L;

	public ValueLong(IDeviceSetting device, String name, Long defValue, boolean isChangeable) {
		super(device, name, defValue, isChangeable, Long.MIN_VALUE, Long.MAX_VALUE);
	}

}