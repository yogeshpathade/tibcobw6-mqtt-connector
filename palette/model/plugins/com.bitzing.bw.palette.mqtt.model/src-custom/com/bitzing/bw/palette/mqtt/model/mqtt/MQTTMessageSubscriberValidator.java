package com.bitzing.bw.palette.mqtt.model.mqtt;

import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber;
import com.tibco.bw.validation.process.EventSourceConfigurationValidator;
import com.tibco.bw.validation.exception.ValidationException;
import com.tibco.bw.validation.process.EventSourceValidationContext;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage;
import com.bitzing.bw.palette.mqtt.model.utils.Messages;
import com.bitzing.bw.palette.mqtt.model.utils.MessageCode;
import org.eclipse.osgi.util.NLS;

public class MQTTMessageSubscriberValidator implements EventSourceConfigurationValidator {	
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
	public void validateBWEventSourceConfiguration(EventSourceValidationContext context) throws ValidationException {
		MQTTMessageSubscriber model =(MQTTMessageSubscriber) context.getEventSourceConfigurationModel();    	
		
	    String topicModul = context.getAttributeBindingPropertyName("topic");
		if(topicModul == null || "".equals(topicModul)){
		    String topic = model.getTopic(); 
		    if(topic == null || "".equals(topic)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Topic"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, MqttPackage.Literals.MQTT_MESSAGE_SUBSCRIBER__TOPIC);
		    }
		}
	    String ServerURIModul = context.getAttributeBindingPropertyName("ServerURI");
		if(ServerURIModul == null || "".equals(ServerURIModul)){
		    String ServerURI = model.getServerURI(); 
		    if(ServerURI == null || "".equals(ServerURI)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"ServerURI"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, MqttPackage.Literals.MQTT_MESSAGE_SUBSCRIBER__SERVER_URI);
		    }
		}
	    String ClientIDModul = context.getAttributeBindingPropertyName("ClientID");
		if(ClientIDModul == null || "".equals(ClientIDModul)){
		    String ClientID = model.getClientID(); 
		    if(ClientID == null || "".equals(ClientID)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"clientID"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, MqttPackage.Literals.MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID);
		    }
		}	
		// begin-custom-code
	    // end-custom-code
  	}
}
