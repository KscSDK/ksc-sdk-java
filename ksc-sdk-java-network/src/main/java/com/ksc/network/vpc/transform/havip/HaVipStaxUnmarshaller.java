package com.ksc.network.vpc.transform.havip;

import com.ksc.network.vpc.model.havip.HaVip;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * HaVip StAX Unmarshaller
 */
public class HaVipStaxUnmarshaller implements
		Unmarshaller<HaVip, StaxUnmarshallerContext> {

    @Override
	public HaVip unmarshall(StaxUnmarshallerContext context) throws Exception {
        HaVip haVip = new HaVip();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return haVip;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcId", targetDepth)) {
                    haVip.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SubnetId", targetDepth)) {
                    haVip.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HaVipId", targetDepth)) {
                    haVip.setHaVipId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("IpAddress", targetDepth)) {
					haVip.setIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CreateTime", targetDepth)) {
                    haVip.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("MasterNetworkInterfaceId", targetDepth)) {
					haVip.setMasterNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("SlaveNetworkInterfaceIdSet/item", targetDepth)) {
					haVip.adSlaveNetworkInterfaceIdSet(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return haVip;
				}
			}
		}
	}

	private static HaVipStaxUnmarshaller instance;

	public static HaVipStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new HaVipStaxUnmarshaller();
		return instance;
	}
}
