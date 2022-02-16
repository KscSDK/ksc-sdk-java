package com.ksc.network.vpc.transform.vpc;

import com.ksc.network.vpc.model.vpc.Vpc;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Vpc StAX Unmarshaller
 */
public class VpcStaxUnmarshaller implements
		Unmarshaller<Vpc, StaxUnmarshallerContext> {

	public Vpc unmarshall(StaxUnmarshallerContext context) throws Exception {
		Vpc vpc = new Vpc();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return vpc;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcId", targetDepth)) {
					vpc.setVpcId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcName", targetDepth)) {
					vpc.setVpcName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("CidrBlock", targetDepth)) {
					vpc.setCidrBlock(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("CreateTime", targetDepth)) {
					vpc.setCreateTime(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("IsDefault", targetDepth)) {
					vpc.setDefault(BooleanStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("SecondaryCidrSet/item", targetDepth)) {
					vpc.addSecondaryCidrSet(SecondaryCidrStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return vpc;
				}
			}
		}
	}

	private static VpcStaxUnmarshaller instance;

	public static VpcStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new VpcStaxUnmarshaller();
		return instance;
	}
}
