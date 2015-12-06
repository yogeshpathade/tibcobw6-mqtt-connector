package com.bitzing.bw.palette.mqtt.design.mqttmessagesubscriber;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttFactory;
import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber;

public class MQTTMessageSubscriberModelHelper extends BWAbstractModelHelper 

{

	/**
	 * Create an instance of the activity configuration model and provide "good" default values.
	 *
	 * @return new instance
	 */
    @Override
    public EObject createInstance() {
        MQTTMessageSubscriber activity = MqttFactory.eINSTANCE.createMQTTMessageSubscriber();
        return activity;
    }
}
