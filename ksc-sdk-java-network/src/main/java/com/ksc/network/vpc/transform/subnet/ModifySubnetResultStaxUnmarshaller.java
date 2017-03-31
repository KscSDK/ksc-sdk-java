package com.ksc.network.vpc.transform.subnet;

import com.ksc.network.vpc.model.subnet.ModifySubnetResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateVpcResult StAX Unmarshaller
 */
public class ModifySubnetResultStaxUnmarshaller implements
		Unmarshaller<ModifySubnetResult, StaxUnmarshallerContext> {

	public ModifySubnetResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifySubnetResult ModifySubnetResult = new ModifySubnetResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifySubnetResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Subnet", targetDepth)) {
					ModifySubnetResult.setSubnet(SubnetStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					ModifySubnetResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifySubnetResult;
				}
			}
		}
	}

	private static ModifySubnetResultStaxUnmarshaller instance;

	public static ModifySubnetResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifySubnetResultStaxUnmarshaller();
		return instance;
	}
}
