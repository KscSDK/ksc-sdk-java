package com.ksc.network.vpc.transform.vpc;

import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import com.ksc.network.vpc.model.vpc.ModifyVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteVpcResult StAX Unmarshaller
 */
public class ModifyVpcResultStaxUnmarshaller implements
		Unmarshaller<ModifyVpcResult, StaxUnmarshallerContext> {

	public ModifyVpcResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyVpcResult ModifyVpcResult = new ModifyVpcResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyVpcResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					ModifyVpcResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					ModifyVpcResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyVpcResult;
				}
			}
		}
	}

	private static ModifyVpcResultStaxUnmarshaller instance;

	public static ModifyVpcResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyVpcResultStaxUnmarshaller();
		return instance;
	}
}
