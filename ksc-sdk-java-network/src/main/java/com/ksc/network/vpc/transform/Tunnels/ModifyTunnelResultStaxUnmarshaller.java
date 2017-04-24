package com.ksc.network.vpc.transform.Tunnels;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Tunnels.ModifyTunnelResult;
import com.ksc.network.vpc.model.VpcPeeringConnection.ModifyVpcPeeringConnectionResult;
import com.ksc.network.vpc.transform.VpcPeeringConnection.VpcPeeringConnectionStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * ModifySecurityGroupResult StAX Unmarshaller
 */
public class ModifyTunnelResultStaxUnmarshaller implements
		Unmarshaller<ModifyTunnelResult, StaxUnmarshallerContext> {

	public ModifyTunnelResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyTunnelResult ModifyTunnelResult = new ModifyTunnelResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyTunnelResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Tunnel", targetDepth)) {
					ModifyTunnelResult.setTunnel(TunnelStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;

				}else if(context.testExpression("RequestId", targetDepth)){
					ModifyTunnelResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyTunnelResult;
				}
			}
		}
	}

	private static ModifyTunnelResultStaxUnmarshaller instance;

	public static ModifyTunnelResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyTunnelResultStaxUnmarshaller();
		return instance;
	}
}
