package com.ksc.kec.model.transform;

import com.ksc.kec.model.TerminateInstancesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * 
 * TerminateInstancesResult StAX Unmarshaller
 *
 */
public class TerminateInstancesResultStaxUnmarshaller implements Unmarshaller<TerminateInstancesResult, StaxUnmarshallerContext> {
	private static TerminateInstancesResultStaxUnmarshaller instance;

	public static TerminateInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new TerminateInstancesResultStaxUnmarshaller();
		return instance;
	}

	@Override
	public TerminateInstancesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		TerminateInstancesResult result = new TerminateInstancesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		
		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return result;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("InstancesSet/Item", targetDepth)) {
					result.addInstanceSet(OperateInfoStaxUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("RequestId", targetDepth)) {
					result.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return result;
				}
			}
		}
	}

}
