package com.bitzing.bw.palette.mqtt.runtime;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.genxdm.io.FragmentBuilder;
import org.genxdm.mutable.MutableModel;
import org.genxdm.mutable.NodeFactory;

import com.tibco.bw.runtime.EventSourceContext;

public class MqttTopicSubscriber<N> implements MqttCallback, MQTTContants{
	
	private EventSourceContext eventSourceContext = null;
	private String serverURI = null;
	private String clientId = null;
	private String topic = null;
	
	private MqttClient mqttClient = null;
	
	public MqttTopicSubscriber(EventSourceContext eventSourceContext,
			String serverURI, String clientId, String topic) {
		this.eventSourceContext = eventSourceContext;
		this.serverURI = serverURI;
		this.clientId = clientId;
		this.topic = topic;
	}
	
	public void init(){
		try {
			mqttClient = new MqttClient(serverURI, clientId);
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start(){
		try {
			this.mqttClient.connect();
			this.mqttClient.setCallback(this);
			this.mqttClient.subscribe(topic);
		} catch (MqttSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void stop(){
		try {
			this.mqttClient.disconnect();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void destroy(){
		try {
			this.mqttClient.close();
			this.mqttClient = null;
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void connectionLost(Throwable arg0) {
		// TODO throw exception event
		
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {
		
	}

	@Override
	public void messageArrived(String topic, MqttMessage msg) throws Exception {
		N MQTTMessageSubscriberOutput = this.getOutputRootElement(eventSourceContext.getXMLProcessingContext());
		buildStructuredOutput(MQTTMessageSubscriberOutput, topic, msg.toString());
		eventSourceContext.newEvent(MQTTMessageSubscriberOutput, null);
	}
	
	
	/**
	 *
	 * This method to build the output.
	 * @param MQTTMessageSubscriberOutput
	 *			This is the root element of output. 
	 * @param processingContext
	 *			XML processing context.
	 * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output.
	 */
	private <A> void buildStructuredOutput(N MQTTMessageSubscriberOutput, String topicNm, String msgData) throws Exception {
	    MutableModel<N> mutableModel = eventSourceContext.getXMLProcessingContext().getMutableContext().getModel();
	    NodeFactory<N> noteFactory = mutableModel.getFactory(MQTTMessageSubscriberOutput);

		N message = noteFactory.createElement("", MESSAGE_BODY, "");
		mutableModel.appendChild(MQTTMessageSubscriberOutput, message);

		N messagevalueNode = noteFactory.createText(msgData);
		mutableModel.appendChild(message, messagevalueNode);
		
		N topic = noteFactory.createElement("", TOPIC, "");
		mutableModel.appendChild(MQTTMessageSubscriberOutput, topic);
		N topicvalueNode = noteFactory.createText(topicNm);
		mutableModel.appendChild(topic, topicvalueNode);
    }
    
	/**
	 *
	 * This method to get the root element of output. 
	 * @param pcx
	 * 			XML processing context
	 * @return An XML Element
	 */
	protected N getOutputRootElement(ProcessingContext<N> pcx) {
		final FragmentBuilder<N> builder = pcx.newFragmentBuilder();

		Model<N> model = pcx.getModel();
		builder.startDocument(null, XML);
		try {
			builder.startElement(eventSourceContext.getEventSourceOutputType().getTargetNamespace(), MSG_SUB_OUTPUT, NAMESPACE);
			try {
			} finally {
				builder.endElement();
			}
		} finally {
			builder.endDocument();
		}
		N output = builder.getNode();
		N activityOutput = model.getFirstChild(output);
		return activityOutput;
	}

}
