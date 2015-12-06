/*
 * This software is confidential and proprietary information of TIBCO Software Inc.
 * Overridable true
 */
package com.bitzing.bw.palette.mqtt.model.utils;

import java.util.ResourceBundle;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "com.bitzing.bw.palette.mqtt.model.utils.messages";

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	public static ResourceBundle getBundle() {
		return ResourceBundle.getBundle(BUNDLE_NAME);
	}
    
	
	public static String MQTTPUBLISHACTIVITY_SERVERURI;
	public static String MQTTPUBLISHACTIVITY_CLIENTID;
	public static String MQTTMESSAGESUBSCRIBER_SERVERURI;
	public static String MQTTMESSAGESUBSCRIBER_CLIENTID;
	public static String MQTTMESSAGESUBSCRIBER_TOPIC;
	public static String PALETTE_PARAMETER_VALUE_INVALID;	
}
