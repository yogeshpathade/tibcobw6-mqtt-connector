package com.bitzing.bw.palette.mqtt.design.mqttpublishactivity;

import com.tibco.bw.design.field.AttributeBindingField;
import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage;
import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity;
import com.bitzing.bw.palette.mqtt.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class MQTTPublishActivityGeneralSection extends AbstractBWTransactionalSection {

    private AttributeBindingField serverURIABF;

    private Text serverURI;

    private AttributeBindingField clientIDABF;

    private Text clientID;

    @Override
    protected Class<?> getModelClass() {
       return MQTTPublishActivity.class;
    }


    @Override
    protected void initBindings() {
        getBindingManager().bind(serverURIABF, getInput(), MqttPackage.Literals.MQTT_PUBLISH_ACTIVITY__SERVER_URI); 
        getBindingManager().bind(clientIDABF, getInput(), MqttPackage.Literals.MQTT_PUBLISH_ACTIVITY__CLIENT_ID); 
    }


    @Override
    protected Composite doCreateControl(final Composite root) {
        Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.MQTTPUBLISHACTIVITY_SERVERURI, true);
   	    serverURI = BWFieldFactory.getInstance().createTextBox(parent);

   	    serverURIABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, serverURI, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.MQTTPUBLISHACTIVITY_CLIENTID, true);
   	    clientID = BWFieldFactory.getInstance().createTextBox(parent);

   	    clientIDABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, clientID, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

        return parent;
    }
  

}
