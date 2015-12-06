package com.bitzing.bw.palette.mqtt.design.mqttmessagesubscriber;

import com.tibco.bw.design.field.AttributeBindingField;
import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage;
import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber;
import com.bitzing.bw.palette.mqtt.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class MQTTMessageSubscriberGeneralSection extends AbstractBWTransactionalSection 
{

    private AttributeBindingField serverURIABF;
    private Text serverURI;

    private AttributeBindingField clientIDABF;
    private Text clientID;

    private AttributeBindingField topicABF;
    private Text topic;

	@Override
    protected Class<?> getModelClass() {
       return MQTTMessageSubscriber.class;
    }

    /**
	 *
	 * Initialize bindings of controls to the input. 
	 */
    @Override
    protected void initBindings() {
        getBindingManager().bind(serverURIABF, getInput(), MqttPackage.Literals.MQTT_MESSAGE_SUBSCRIBER__SERVER_URI); 
        getBindingManager().bind(clientIDABF, getInput(), MqttPackage.Literals.MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID); 
        getBindingManager().bind(topicABF, getInput(), MqttPackage.Literals.MQTT_MESSAGE_SUBSCRIBER__TOPIC); 
    }

	/**
	 * This method to create the section-specific UI.
	 * @param root
	 * @return
	 */
    @Override
    protected Composite doCreateControl(final Composite root) {
        Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.MQTTMESSAGESUBSCRIBER_SERVERURI, true);
   	    serverURI = BWFieldFactory.getInstance().createTextBox(parent);

   	    serverURIABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, serverURI, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.MQTTMESSAGESUBSCRIBER_CLIENTID, true);
   	    clientID = BWFieldFactory.getInstance().createTextBox(parent);

   	    clientIDABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, clientID, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.MQTTMESSAGESUBSCRIBER_TOPIC, true);
   	    topic = BWFieldFactory.getInstance().createTextBox(parent);

   	    topicABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, topic, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

        return parent;
    }
  

}
