package com.bitzing.bw.palette.mqtt.runtime;

import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.EventSource;
import com.tibco.bw.runtime.EventSourceContext;
import com.tibco.bw.runtime.annotation.Property;

public class MQTTMessageSubscriberEventSource<N> extends EventSource<N> implements MQTTContants {
	
	@Property
	public MQTTMessageSubscriber eventSourceConfig;
	private boolean isStart;
	private MqttTopicSubscriber<N> mqttTopicSubscriber = null;
	
	/**
	 *
	 * This method is called by the BusinessWorks Engine when an event source is destroyed. 
	 * This method must be implemented to release or cleanup any resources held by the event source.
	 */
	@Override
	public synchronized void destroy() {
		this.mqttTopicSubscriber.destroy();
	}
	
	/**
	 * @generated
	 *
	 * Returns a boolean value to indicate the event source state.
	 * @return <code>true</code> if the event source is in a started state; otherwise <code>false</code>
	 */
	@Override
	public synchronized boolean isStarted() {
		return isStart;
	}
	
	/**
	 *
     * This method is called by the BusinessWorks Engine to start the event source.  Until this 
     * method is called, the event source must not notify the BusinessWorks Engine of an new event.  
     * <p>
     * Once the event source is started, the event source must use the interface {@link EventSourceContext} 
     * to notify the BusinessWorks Engine of an new event. The {@link EventSourceContext} object can be 
     * obtained from the method {@link EventSource#getEventSourceContext()}.
     */
	@Override
	public synchronized void start() {
		this.mqttTopicSubscriber.start();
		this.isStart = true;
	}

	
	/**
	 *
     * This method is called by the BusinessWorks Engine to stop the event source from processing
     * new events.
     * <p>  
     * After this method is called, the event source must NOT use the interface {@link EventSourceContext}
     * to notify the BusinessWorks Engine of an new event.  However where applicable, the event source should be 
     * able to process the response for the previous events that has been already notified to the BusinessWorks Engine.
     * <p>
     * The implementation of this method should be cautious about releasing or deleting any resources that are required 
     * to start the event source, since the method {@link EventSource#start()} can be called after the method {@link EventSource#stop()}.
     *
	 */
	@Override
	public synchronized void stop() {
		this.mqttTopicSubscriber.stop();
		this.isStart = false;
	}
	
	/**
	 *
	 * This method is called by the BusinessWorks Engine when an event source is 
	 * initialized. The argument '<code>eventSourceKind</code>' of this method 
	 * denotes whether the event source is being initialized for a BusinessWorks
	 * ProcessStarter activity or a BusinessWorks SignalIn activity.  
	 * <p>
	 * This method may perform any required initialization; however it must not start the 
	 * event source. The event source must wait until the method {@link EventSource#start()} is called 
	 * by the BusinessWorks Engine before processing new events.
	 * 
	 * @param eventSourceKind
	 *            Indicates if the event source is being initialized for a ProcessStarter activity or 
	 *            a SignalIn activity. The value {@link EventSourceKind#PROCESS_STARTER} indicates 
	 *            a ProcessStarter activity and the value {@link EventSourceKind#SIGNAL_IN} indicates 
	 *            a SignalIn activity.
	 *             
	 * @throws ActivityLifecycleFault
	 * 			  Thrown if the event source initialization is unsuccessful or encounters an error.
	 */
	@Override
	public void init(com.tibco.bw.runtime.EventSource.EventSourceKind eventSourceKind)
			throws ActivityLifecycleFault {
		this.mqttTopicSubscriber = new MqttTopicSubscriber<>(getEventSourceContext(), 
				eventSourceConfig.getServerURI(), eventSourceConfig.getClientID(), eventSourceConfig.getTopic());
		this.mqttTopicSubscriber.init();
	}
}
