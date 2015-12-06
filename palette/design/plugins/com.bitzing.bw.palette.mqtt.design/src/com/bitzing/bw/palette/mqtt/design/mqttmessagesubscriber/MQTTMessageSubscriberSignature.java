package com.bitzing.bw.palette.mqtt.design.mqttmessagesubscriber;

import java.util.List;

import org.eclipse.xsd.XSDElementDeclaration;
import com.tibco.bw.design.api.BWEventSourceSignature;
import com.tibco.bw.model.activityconfig.Configuration;

public class MQTTMessageSubscriberSignature extends BWEventSourceSignature 
{
 
 	/**
     *
     * Method to identify if an activity performs an action that can be confirmed by the Confirm activity.
     * 
     * @return true for activities that can be confirmed or false (default) for activities that cannot be confirmed
     */
    public boolean isConfirmable() { 
    	return true; 
    }
    
   /**
	*
	* Method to return the output element declaration of this activity.
	* @param config
	*			activity configuration
	* @return the output element declaration
	*/
    @Override
    public XSDElementDeclaration getOutputType(final Configuration config) {
        XSDElementDeclaration outPutType = null;
        outPutType =  MQTTMessageSubscriberSchema.getOutputType();
        return outPutType;
    }

    /**
	 * Method to return the list of fault element declarations that this activity may throw.
	 * @param config
	 *            current configuration of the activity, in case the faults depend on how the activity is current configured
	 * @return list of elements or an empty list if none
	 */
    @Override
    public List<XSDElementDeclaration> getFaultTypes(final Configuration config) {
    	List<XSDElementDeclaration> faultType = null;
		return faultType;
    }
}
