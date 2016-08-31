package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.RebootInstancesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * 
 * RebootInstancesResult StAX Unmarshaller
 *
 */
public class RebootInstancesResultStaxUnmarshaller implements Unmarshaller<RebootInstancesResult, StaxUnmarshallerContext> {
	private static RebootInstancesResultStaxUnmarshaller instance;

	public static RebootInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RebootInstancesResultStaxUnmarshaller();
		return instance;
	}

	@Override
	public RebootInstancesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		RebootInstancesResult result = new RebootInstancesResult();
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
