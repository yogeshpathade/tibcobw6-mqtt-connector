package com.bitzing.bw.palette.mqtt.design;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class MQTT extends AbstractUIPlugin 


{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.tibco.bw.palette.mqtt.design"; //$NON-NLS-1$

	// The shared instance
	private static MQTT plugin;
	
	/**
	 * The constructor
	 */
	public MQTT() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static MQTT getDefault() {
		return plugin;
	}

}
