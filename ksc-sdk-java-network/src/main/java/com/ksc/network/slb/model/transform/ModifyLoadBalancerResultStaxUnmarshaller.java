package com.ksc.network.slb.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.slb.model.ModifyLoadBalancerResult;
import com.ksc.network.vpc.model.Nat.ModifyNatResult;
import com.ksc.network.vpc.transform.Nat.AssociateNatStaxUnmarshaller;
import com.ksc.network.vpc.transform.Nat.NatIpStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * CreateVpcResult StAX Unmarshaller
 */
public class ModifyLoadBalancerResultStaxUnmarshaller implements
		Unmarshaller<ModifyLoadBalancerResult, StaxUnmarshallerContext> {

	public ModifyLoadBalancerResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyLoadBalancerResult ModifyLoadBalancerResult = new ModifyLoadBalancerResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyLoadBalancerResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					ModifyLoadBalancerResult.setCreateTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcId", targetDepth)) {
					ModifyLoadBalancerResult.setVpcId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

                if (context.testExpression("LoadBalancerState", targetDepth)) {
                    ModifyLoadBalancerResult.setLoadBalancerState(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerName", targetDepth)) {
                    ModifyLoadBalancerResult.setLoadBalancerName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Type", targetDepth)) {
                    ModifyLoadBalancerResult.setType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerId", targetDepth)) {
                    ModifyLoadBalancerResult.setLoadBalancerId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

				else if(context.testExpression("RequestId", targetDepth)){
					ModifyLoadBalancerResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyLoadBalancerResult;
				}
			}
		}
	}

	private static ModifyLoadBalancerResultStaxUnmarshaller instance;

	public static ModifyLoadBalancerResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyLoadBalancerResultStaxUnmarshaller();
		return instance;
	}
}
