package com.ksc.network.eip.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.eip.model.Address;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Address StAX Unmarshaller
 */
public class AddressStaxUnmarshaller implements
        Unmarshaller<Address, StaxUnmarshallerContext> {

    public Address unmarshall(StaxUnmarshallerContext context) throws Exception {
        Address address = new Address();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return address;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstanceId", targetDepth)) {
                    address.setInstanceId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }else if (context.testExpression("PublicIp", targetDepth)) {
                    address.setPublicIp(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }else if (context.testExpression("AllocationId", targetDepth)) {
                    address.setAllocationId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }else if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    address.setNetworkInterfaceId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }else if (context.testExpression("State", targetDepth)) {
                    address.setState(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }else if (context.testExpression("LineId", targetDepth)) {
                    address.setLineId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }else if (context.testExpression("BandWidth", targetDepth)) {
                    address.setBandWidth(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }else if (context.testExpression("InstanceType", targetDepth)) {
                    address.setInstanceType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }else if (context.testExpression("InternetGatewayId", targetDepth)) {
                    address.setInstanceType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }else if (context.testExpression("CreateTime", targetDepth)) {
                    address.setCreateTime(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return address;
                }
            }
        }
    }

    private static AddressStaxUnmarshaller instance;

    public static AddressStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressStaxUnmarshaller();
        return instance;
    }
}
