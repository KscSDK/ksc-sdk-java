package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.OperateInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * 
 * OperateInfo StAX Unmarshaller
 *
 */
public class OperateInfoStaxUnmarshaller implements Unmarshaller<OperateInfo, StaxUnmarshallerContext> {
	private static OperateInfoStaxUnmarshaller instance;

	public static OperateInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new OperateInfoStaxUnmarshaller();
		return instance;
	}

	@Override
	public OperateInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		OperateInfo info = new OperateInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return info;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("InstanceId", targetDepth)) {
					info.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("Return", targetDepth)) {
					info.setReturn(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return info;
				}
			}
		}
	}

}
