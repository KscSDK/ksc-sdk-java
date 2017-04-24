package com.ksc.network.vpc.transform.VpcPeeringConnection;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Nat.Nat;
import com.ksc.network.vpc.model.VpcPeeringConnection.VpcPeeringConnection;
import com.ksc.network.vpc.transform.Nat.AssociateNatStaxUnmarshaller;
import com.ksc.network.vpc.transform.Nat.NatIpStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroupRule StAX Unmarshaller
 */
public class VpcPeeringConnectionStaxUnmarshaller implements Unmarshaller<VpcPeeringConnection, StaxUnmarshallerContext> {

	public VpcPeeringConnection unmarshall(StaxUnmarshallerContext context) throws Exception {
		VpcPeeringConnection vpcPeeringConnection = new VpcPeeringConnection();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return vpcPeeringConnection;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					vpcPeeringConnection.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcPeeringConnectionId", targetDepth)) {
					vpcPeeringConnection.setVpcPeeringConnectionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

                if (context.testExpression("VpcPeeringConnectionType", targetDepth)) {
					vpcPeeringConnection.setVpcPeeringConnectionType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PeeringName", targetDepth)) {
					vpcPeeringConnection.setPeeringName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
					vpcPeeringConnection.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BandWidth", targetDepth)) {
					vpcPeeringConnection.setBandWidth(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequesterVpcInfo", targetDepth)) {
					vpcPeeringConnection.setRequesterVpcInfo(RequesterVpcInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccepterVpcInfo", targetDepth)) {
					vpcPeeringConnection.setAccepterVpcInfo(AccepterVpcInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return vpcPeeringConnection;
				}
			}
		}
	}

	private static VpcPeeringConnectionStaxUnmarshaller instance;

	public static VpcPeeringConnectionStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new VpcPeeringConnectionStaxUnmarshaller();
		return instance;
	}
}
