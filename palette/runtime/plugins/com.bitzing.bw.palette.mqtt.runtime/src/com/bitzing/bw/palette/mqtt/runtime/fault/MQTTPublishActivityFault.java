package com.bitzing.bw.palette.mqtt.runtime.fault;

import javax.xml.namespace.QName;
import org.genxdm.ProcessingContext;

import com.bitzing.bw.palette.mqtt.runtime.MQTTContants;
import com.tibco.bw.runtime.ActivityContext;
import com.tibco.neo.localized.BundleMessage;
import org.genxdm.mutable.MutableModel;
import org.genxdm.mutable.NodeFactory;
public class MQTTPublishActivityFault extends MQTTActivityBaseException implements MQTTContants{
	private static final long serialVersionUID = 1L;
	
	private Object[] data = null;
	private BundleMessage bundleMessage = null;
	Integer errorCode = null;
	
	public <N> MQTTPublishActivityFault(ActivityContext<N> activityContext, Integer code,
			BundleMessage bundleMessage, Object[] data) {
		super(activityContext, code, bundleMessage);
		this.data = data;
		this.bundleMessage = bundleMessage;
		this.errorCode = code;
	}
	

	public QName getFaultElementQName() {
		//TODO Faults wont work with the miss match of the target namespace in the generated code.
		//http://schemas.tibco.com/bw/plugins/MQTT/MQTTExceptions is not part of the fault schema 
		//so change it to the original schema. else suggest defining seperate fault schema file
		//and load the schema and use the same one. here the correct one is http://www.tibco.com/MQTT/MQTTPublishActivity
		return new QName("http://www.tibco.com/MQTT/MQTTPublishActivity","MQTTPublishActivityFault");
	}
	/**
	 *
	 * This method to set fault data according to design time
	 * @param processingContext
	 *			XML processing context.  
	 */
	public <N> void buildFault(ProcessingContext<N> pcx) {
		N MQTTPublishActivityFault = this.createFaultMessageElement(pcx);
		MQTTPublishActivityFault = this.constructErrData(MQTTPublishActivityFault, pcx);
		this.setData(MQTTPublishActivityFault);

	}
	
	/**
	 * This method to generate fault data
	 * @param MQTTPublishActivityFault
	 *			the root element of fault		
	 * @param processingContext
	 *			XML processing context.  
	 * @return An XML Element which adheres to the fault schema of the activity
	 */
	private <N, A> N constructErrData(N MQTTPublishActivityFault, ProcessingContext<N> processingContext) {
		MutableModel<N> mutableModel = processingContext.getMutableContext().getModel();
		
		NodeFactory<N> noteFactory = mutableModel.getFactory(MQTTPublishActivityFault);
		
		N exceptionMessage = noteFactory.createElement("", EXCEPTION_MESSAGE, "");
		mutableModel.appendChild(MQTTPublishActivityFault, exceptionMessage);
		N exceptionMessagevalueNode = noteFactory.createText(bundleMessage.format(data));
		mutableModel.appendChild(exceptionMessage, exceptionMessagevalueNode);
		
		N exceptionCode = noteFactory.createElement("", EXCEPTION_CODE, "");
		mutableModel.appendChild(MQTTPublishActivityFault, exceptionCode);
		N exceptionCodevalueNode = noteFactory.createText(errorCode.toString());
		mutableModel.appendChild(exceptionCode, exceptionCodevalueNode);

		return MQTTPublishActivityFault;
	}

}
