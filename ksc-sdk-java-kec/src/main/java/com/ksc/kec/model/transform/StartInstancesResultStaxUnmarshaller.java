package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.StartInstancesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * 
 * StartInstancesResult StAX Unmarshaller
 *
 */
public class StartInstancesResultStaxUnmarshaller implements Unmarshaller<StartInstancesResult, StaxUnmarshallerContext> {
	private static StartInstancesResultStaxUnmarshaller instance;

	public static StartInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new StartInstancesResultStaxUnmarshaller();
		return instance;
	}

	@Override
	public StartInstancesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		StartInstancesResult result = new StartInstancesResult();
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
