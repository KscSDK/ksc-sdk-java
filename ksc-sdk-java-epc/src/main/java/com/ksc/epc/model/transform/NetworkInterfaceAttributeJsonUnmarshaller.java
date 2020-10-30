package com.ksc.epc.model.transform;

import com.ksc.epc.model.NetworkInterfaceAttribute;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        import com.ksc.epc.model.SecurityGroup;

public class NetworkInterfaceAttributeJsonUnmarshaller implements Unmarshaller<NetworkInterfaceAttribute, JsonUnmarshallerContext> {
    private static NetworkInterfaceAttributeJsonUnmarshaller instance;

    public static NetworkInterfaceAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceAttributeJsonUnmarshaller();
        return instance;
    }

    @Override
    public NetworkInterfaceAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkInterfaceAttribute NetworkInterfaceAttribute = new NetworkInterfaceAttribute();
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;
        while (true) {
            if (token == null)
                break;
            if (token == FIELD_NAME || token == START_OBJECT) {
                    if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                        context.nextToken();
                            NetworkInterfaceAttribute.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("NetworkInterfaceType", targetDepth)) {
                        context.nextToken();
                            NetworkInterfaceAttribute.setNetworkInterfaceType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("SubnetId", targetDepth)) {
                        context.nextToken();
                            NetworkInterfaceAttribute.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("PrivateIpAddress", targetDepth)) {
                        context.nextToken();
                            NetworkInterfaceAttribute.setPrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DNS1", targetDepth)) {
                        context.nextToken();
                            NetworkInterfaceAttribute.setDNS1(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DNS2", targetDepth)) {
                        context.nextToken();
                            NetworkInterfaceAttribute.setDNS2(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Mac", targetDepth)) {
                        context.nextToken();
                            NetworkInterfaceAttribute.setMac(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("SecurityGroupSet", targetDepth)) {
                        context.nextToken();
                        NetworkInterfaceAttribute.setSecurityGroupSet(new ListUnmarshaller<SecurityGroup>(SecurityGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                    || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return NetworkInterfaceAttribute;
    }
}
