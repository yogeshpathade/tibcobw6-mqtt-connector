package com.bitzing.bw.palette.mqtt.design.mqttpublishactivity;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttFactory;
import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity;

public class MQTTPublishActivityModelHelper extends BWAbstractModelHelper {

    @Override
    public EObject createInstance() {
        MQTTPublishActivity activity = MqttFactory.eINSTANCE.createMQTTPublishActivity();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
