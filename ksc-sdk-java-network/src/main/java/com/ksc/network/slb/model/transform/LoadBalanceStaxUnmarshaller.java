package com.ksc.network.slb.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.slb.model.LoadBalance;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

public class LoadBalanceStaxUnmarshaller implements Unmarshaller<LoadBalance, StaxUnmarshallerContext> {
	private static LoadBalanceStaxUnmarshaller instance;

	public static LoadBalanceStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new LoadBalanceStaxUnmarshaller();
		return instance;
	}

	@Override
	public LoadBalance unmarshall(StaxUnmarshallerContext context) throws Exception {
		LoadBalance loadBalance = new LoadBalance();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return loadBalance;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("CreateTime", targetDepth)) {
					loadBalance.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("LoadBalancerName", targetDepth)) {
					loadBalance.setLoadBalancerName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("VpcId", targetDepth)) {
					loadBalance.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("LoadBalancerId", targetDepth)) {
					loadBalance.setLoadBalancerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Type", targetDepth)) {
					loadBalance.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("SubnetId", targetDepth)) {
					loadBalance.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("AllocationId", targetDepth)) {
					loadBalance.setAllocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("PublicIp", targetDepth)) {
					loadBalance.setPublicIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("State", targetDepth)) {
					loadBalance.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("LoadBalancerState", targetDepth)) {
					loadBalance.setLoadBalancerState(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("ProjectId", targetDepth)) {
					loadBalance.setProjectId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return loadBalance;
				}
			}
		}
	}

}
