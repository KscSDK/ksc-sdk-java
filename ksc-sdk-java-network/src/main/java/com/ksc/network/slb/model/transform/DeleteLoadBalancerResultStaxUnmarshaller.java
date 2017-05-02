package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteLoadBalancerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteVpcResult StAX Unmarshaller
 */
public class DeleteLoadBalancerResultStaxUnmarshaller implements
		Unmarshaller<DeleteLoadBalancerResult, StaxUnmarshallerContext> {

	public DeleteLoadBalancerResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteLoadBalancerResult DeleteLoadBalancerResult = new DeleteLoadBalancerResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteLoadBalancerResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteLoadBalancerResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteLoadBalancerResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteLoadBalancerResult;
				}
			}
		}
	}

	private static DeleteLoadBalancerResultStaxUnmarshaller instance;

	public static DeleteLoadBalancerResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteLoadBalancerResultStaxUnmarshaller();
		return instance;
	}
}
