package com.bitzing.bw.palette.mqtt.model.mqtt;

import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity;
import com.tibco.bw.validation.process.ActivityConfigurationValidator;
import com.tibco.bw.validation.process.ActivityValidationContext;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage;
import com.bitzing.bw.palette.mqtt.model.utils.Messages;
import com.bitzing.bw.palette.mqtt.model.utils.MessageCode;
import org.eclipse.osgi.util.NLS;

public class MQTTPublishActivityValidator implements ActivityConfigurationValidator {	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * Validates Activity model configuration.
	 * @param context
	 *			The activity validation context.Developers can retrieve following informations:
	 *          <li> Activity Configuration Model(EMF model)</li>
 	 *          <li> Name of the EventSource Activity</li>
     *          <li> Value of process property used in Activity Configuration</li>
     *          <li> Name of property configured in the Attribute Binding Field</li>
     *          <li> Name of the process</li><br>
	 */	
	@Override
	public void validateBWActivityConfiguration(ActivityValidationContext context) {
	    MQTTPublishActivity model =(MQTTPublishActivity) context.getActivityConfigurationModel();    	
		
	    String serverURIModul = context.getAttributeBindingPropertyName("serverURI");
		if(serverURIModul == null || "".equals(serverURIModul)){
		    String serverURI = model.getServerURI(); 
		    if(serverURI == null || "".equals(serverURI)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Server URI"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, MqttPackage.Literals.MQTT_PUBLISH_ACTIVITY__SERVER_URI);
		    }
		}
	    String clientIDModul = context.getAttributeBindingPropertyName("clientID");
		if(clientIDModul == null || "".equals(clientIDModul)){
		    String clientID = model.getClientID(); 
		    if(clientID == null || "".equals(clientID)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Client ID"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, MqttPackage.Literals.MQTT_PUBLISH_ACTIVITY__CLIENT_ID);
		    }
		}	
		// begin-custom-code
	    // end-custom-code
  	}
}
