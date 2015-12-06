package com.bitzing.bw.palette.mqtt.runtime;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.genxdm.Model;

import com.bitzing.bw.palette.mqtt.runtime.RuntimeMessageBundle;
import com.bitzing.bw.palette.mqtt.runtime.fault.MQTTPublishActivityFault;
import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.neo.localized.MessageBundle;


public class MQTTPublishMessageActivity<N> extends SyncActivity<N> implements MQTTContants {

	@Property
	public MQTTPublishActivity activityConfig;

	@Override
	public void init() throws ActivityLifecycleFault {
		super.init();
	}
	

    @Override
	public void destroy() {
		super.destroy();
	}
	
    /**
     * 
     * @param input 
     *           This is the activity input data. It is an XML Element which adheres to the input schema of the activity or <code>null</code> if the activity does not require an input. The 
     *           activity input data should be processed using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
     * @param processContext
	 *           Context that is associated with a BusinessWorks Process instance. This context is unique per BusinessWorks Process instance and it 
	 *           is not visible to other BusinessWorks Process instances.  Also this context is valid only within the BusinessWorks Engine thread on 
	 *           which this method is invoked. Therefore this context must not be saved or used by a different thread that is created or managed by the activity
	 *           implementation. 
     * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output. 
     *         This is the activity output data and it should be created using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
     * @throws ActivityFault
     *           Thrown if the activity execution is unsuccessful or encounters an error.
	 */
	@Override
	public N execute(N input, ProcessContext<N> processContext) throws ActivityFault {
        if(getActivityLogger().isDebugEnabled()){
	        String serializedInputNode = XMLUtils.serializeNode(input, processContext.getXMLProcessingContext());
		    activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_INPUT, new Object[] {activityContext.getActivityName(), serializedInputNode});
		}
        String serverURI = activityConfig.getServerURI();
        String clientId = activityConfig.getClientID();
         
		String msgBody = MQTTPluginHelper.getElementValue(input, processContext.getXMLProcessingContext(), MESSAGE_BODY, 
				activityContext.getActivityInputType().getTargetNamespace());
		
		String qosValue = MQTTPluginHelper.getElementValue(input, processContext.getXMLProcessingContext(), QOS, 
				activityContext.getActivityInputType().getTargetNamespace());
		
		String topic = MQTTPluginHelper.getElementValue(input, processContext.getXMLProcessingContext(), 
				TOPIC, activityContext.getActivityInputType().getTargetNamespace());
		
		try {
			MqttClient client = new MqttClient(serverURI, clientId);
			client.connect();
			
			MqttMessage message = new MqttMessage();
			message.setPayload(msgBody
	                .getBytes());
			message.setQos(Integer.valueOf(qosValue));
			
			client.publish(topic, message);
			
			client.disconnect();
			
		} catch (MqttException e) {
			MQTTPublishActivityFault activityFault = new MQTTPublishActivityFault(activityContext, 
					RuntimeMessageBundle.ERROR_OCCURED_MQTT_PUBLISH.getErrorCode(), RuntimeMessageBundle.ERROR_OCCURED_MQTT_PUBLISH, 
					new Object[]{e.getCause()});
			 throw activityFault;
			 
		}
		
        return null;
	}
	
}
