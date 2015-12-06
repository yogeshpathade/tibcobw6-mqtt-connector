package com.bitzing.bw.palette.mqtt.design.mqttpublishactivity;
import org.eclipse.xsd.XSDElementDeclaration;
import com.tibco.bw.design.api.BWExtensionActivitySchema;
import java.io.InputStream;
import org.eclipse.xsd.XSDSchema;
import java.util.ArrayList;
import java.util.List;

public class MQTTPublishActivitySchema extends BWExtensionActivitySchema {
	private static MQTTPublishActivitySchema INSTANCE = new MQTTPublishActivitySchema();

	private static final String SCHEMA_FILE_PATH = "/schema/MQTTPublishActivitySchema.xsd";

	private static final String INPUT_TYPE_ELEMENT_NAME = "MQTTPublishActivityInput";

    private static final String[] MQTT_PLUGIN_FAULT_TYPE_ELEMENT_NAMES = new String[] { "MQTTPublishActivityFault" }; //$NON-NLS-1$

	public static XSDElementDeclaration getInputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema();
		XSDElementDeclaration activityInputType = null;
		if (activitySignatureSchema != null) {
			activityInputType = activitySignatureSchema.resolveElementDeclaration(INPUT_TYPE_ELEMENT_NAME);
		}

		return activityInputType;
	}
	

   public static List<XSDElementDeclaration> getFaultElements() {
      List<XSDElementDeclaration> faultTypeElements = new ArrayList<XSDElementDeclaration>();
      XSDSchema faultSchema = INSTANCE.loadSchema(); 
      if(faultSchema != null) {
         for (String faultElementName : MQTT_PLUGIN_FAULT_TYPE_ELEMENT_NAMES) {
            XSDElementDeclaration faultTypesElement = faultSchema.resolveElementDeclaration(faultElementName);
            if(faultTypesElement != null) {
               faultTypeElements.add(faultTypesElement);
            }
         }
      }
      
      return faultTypeElements;
    }
	
	@Override
	protected InputStream getSchemaAsInputStream() {
		return this.getClass().getResourceAsStream(SCHEMA_FILE_PATH);
	}
	
}
