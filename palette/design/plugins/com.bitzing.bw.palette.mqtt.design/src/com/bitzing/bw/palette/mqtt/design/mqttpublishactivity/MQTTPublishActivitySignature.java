package com.bitzing.bw.palette.mqtt.design.mqttpublishactivity;

import java.util.List;

import org.eclipse.xsd.XSDElementDeclaration;
import com.tibco.bw.design.api.BWActivitySignature;
import com.tibco.bw.model.activityconfig.Configuration;

public class MQTTPublishActivitySignature extends BWActivitySignature {
	
    @Override
    public boolean hasOutput() {
        return false;
    }
     
    @Override
    public XSDElementDeclaration getInputType(final Configuration config) {
        XSDElementDeclaration inputType = null;
        inputType =  MQTTPublishActivitySchema.getInputType(); 
  
        return inputType;
    } 
   
    @Override
    public XSDElementDeclaration getOutputType(final Configuration config) {
        return null;
    }

   
    @Override
    public List<XSDElementDeclaration> getFaultTypes(final Configuration config) {
    	List<XSDElementDeclaration> faultType = null;
        faultType =  MQTTPublishActivitySchema.getFaultElements();
		return faultType;
    }
}
