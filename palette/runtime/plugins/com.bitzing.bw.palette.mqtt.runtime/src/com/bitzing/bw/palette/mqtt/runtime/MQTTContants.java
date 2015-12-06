package com.bitzing.bw.palette.mqtt.runtime;

public interface MQTTContants 

{
	public static final String ACTIVITY_OUTPUT_ROOT_ELEMENT_NAME = "ActivityOutputType";
	public static final String ACTIVITY_OUTPUT_ELEMENT_NAME = "output";
	public static final String ACTIVITY_INPUT_REQUIRED_ELEMENT_NAME = "required";
	public static final String ACTIVITY_INPUT_OPTIONAL_ELEMENT_NAME = "optional";
	
	public static final String START_RUN_SUCCESSFULLY = "Succeed";
	public static final String START_RUN_STATUS = "Status";
	public static final String START_RUN_SLEEP_TIME = "SleepTime";
	
	public static final String MESSAGE_BODY = "message";
	public static final String QOS = "qos";
	public static final String TOPIC = "topic";
	
	public static final String EXCEPTION_MESSAGE = "exceptionMessage";
	public static final String EXCEPTION_CODE = "exceptionCode";
	
	public static final String MSG_SUB_OUTPUT = "MQTTMessageSubscriberOutput";
	public static final String NAMESPACE = "ns0";
	public static final String XML = "xml";
}
