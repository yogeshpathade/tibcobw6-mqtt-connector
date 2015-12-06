package com.bitzing.bw.palette.mqtt.design.mqttmessagesubscriber;
import org.eclipse.xsd.XSDElementDeclaration;
import com.tibco.bw.design.api.BWExtensionActivitySchema;
import java.io.InputStream;
import org.eclipse.xsd.XSDSchema;

public class MQTTMessageSubscriberSchema extends BWExtensionActivitySchema 

{
	private static MQTTMessageSubscriberSchema INSTANCE = new MQTTMessageSubscriberSchema();

	private static final String SCHEMA_FILE_PATH = "/schema/MQTTMessageSubscriberSchema.xsd";

	private static final String OUTPUT_TYPE_ELEMENT_NAME = "MQTTMessageSubscriberOutput";

	public static XSDElementDeclaration getOutputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema(); 
		XSDElementDeclaration activityOutputType = null;
		if (activitySignatureSchema != null) {
			activityOutputType = activitySignatureSchema.resolveElementDeclaration(OUTPUT_TYPE_ELEMENT_NAME);
		}
		
		return activityOutputType;
	}	
	
	@Override
	protected InputStream getSchemaAsInputStream() {
		return this.getClass().getResourceAsStream(SCHEMA_FILE_PATH);
	}
	
}
