package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.DescribeVpnTunnelsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeVpnTunnelsResult StAX Unmarshaller
 */
public class DescribeVpnTunnelsResultStaxUnmarshaller implements Unmarshaller<DescribeVpnTunnelsResult, StaxUnmarshallerContext> {
    @Override
    public DescribeVpnTunnelsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeVpnTunnelsResult describeVpnTunnelsResult = new DescribeVpnTunnelsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeVpnTunnelsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeVpnTunnelsResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnTunnelSet/item", targetDepth)) {
                    describeVpnTunnelsResult.addVpnTunnelSet(VpnTunnelStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeVpnTunnelsResult;
                }
            }
        }
    }

    private static DescribeVpnTunnelsResultStaxUnmarshaller instance;

    public static DescribeVpnTunnelsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeVpnTunnelsResultStaxUnmarshaller();
        return instance;
    }
}
