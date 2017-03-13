package com.ksc.network.vpc.transform.vpc;

import com.ksc.network.vpc.model.vpc.CreateVpcResult;
import com.ksc.network.vpc.transform.VpcStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateVpcResult StAX Unmarshaller
 */
public class CreateVpcResultStaxUnmarshaller implements
		Unmarshaller<CreateVpcResult, StaxUnmarshallerContext> {

	public CreateVpcResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateVpcResult CreateVpcResult = new CreateVpcResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateVpcResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Vpc", targetDepth)) {
					CreateVpcResult.setVpc(VpcStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					CreateVpcResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateVpcResult;
				}
			}
		}
	}

	private static CreateVpcResultStaxUnmarshaller instance;

	public static CreateVpcResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateVpcResultStaxUnmarshaller();
		return instance;
	}
}
