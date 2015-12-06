package com.bitzing.bw.palette.mqtt.runtime.fault;

import com.tibco.bw.runtime.ActivityLifecycleFault;

public class MQTTActivityLifecycleFault extends ActivityLifecycleFault 

{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6098514979064369160L;


	public MQTTActivityLifecycleFault(String message) {
		super(message);
	}
}
