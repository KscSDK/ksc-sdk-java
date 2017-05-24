package com.ksc.network.vpc.transform.subnet;

import com.ksc.network.vpc.model.subnet.CreateSubnetResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateSubnetResult StAX Unmarshaller
 */
public class CreateSubnetResultStaxUnmarshaller implements
		Unmarshaller<CreateSubnetResult, StaxUnmarshallerContext> {

	public CreateSubnetResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateSubnetResult CreateSubnetResult = new CreateSubnetResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateSubnetResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Subnet", targetDepth)) {
					CreateSubnetResult.setSubnet(SubnetStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					CreateSubnetResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateSubnetResult;
				}
			}
		}
	}

	private static CreateSubnetResultStaxUnmarshaller instance;

	public static CreateSubnetResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateSubnetResultStaxUnmarshaller();
		return instance;
	}
}
