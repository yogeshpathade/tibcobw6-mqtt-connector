package com.bitzing.bw.palette.mqtt.runtime;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;

public class MQTTPluginHelper {
	
	public static <N> String getElementValue(
			N inputData, final ProcessingContext<N> pcx, String name, String namespace) {

		Model<N> model = pcx.getModel();
		N element = model.getFirstChildElementByName(inputData, null,
				name);  
		
		String value = null;
		if(element != null){
			value = model.getStringValue(element);
		}
		return value;
	}

}
