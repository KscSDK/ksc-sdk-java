package com.ksc.epc.model.transform;

import com.ksc.epc.model.DeviceAttribute;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        import com.ksc.epc.model.CpuDevice;
        import com.ksc.epc.model.GpuDevice;
        import com.ksc.epc.model.PhysicalDiskDevice;
        import com.ksc.epc.model.MonthlyPrice;

public class DeviceAttributeJsonUnmarshaller implements Unmarshaller<DeviceAttribute, JsonUnmarshallerContext> {
    private static DeviceAttributeJsonUnmarshaller instance;

    public static DeviceAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceAttributeJsonUnmarshaller();
        return instance;
    }

    @Override
    public DeviceAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeviceAttribute DeviceAttribute = new DeviceAttribute();
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
                    if (context.testExpression("DeviceAttributeId", targetDepth)) {
                        context.nextToken();
                            DeviceAttribute.setDeviceAttributeId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostType", targetDepth)) {
                        context.nextToken();
                            DeviceAttribute.setHostType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostTypeName", targetDepth)) {
                        context.nextToken();
                            DeviceAttribute.setHostTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Memory", targetDepth)) {
                        context.nextToken();
                            DeviceAttribute.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("NetworkCard", targetDepth)) {
                        context.nextToken();
                            DeviceAttribute.setNetworkCard(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CpuDeviceSet", targetDepth)) {
                        context.nextToken();
                        DeviceAttribute.setCpuDeviceSet(new ListUnmarshaller<CpuDevice>(CpuDeviceJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("GpuDeviceSet", targetDepth)) {
                        context.nextToken();
                        DeviceAttribute.setGpuDeviceSet(new ListUnmarshaller<GpuDevice>(GpuDeviceJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("PhysicalDiskDeviceSet", targetDepth)) {
                        context.nextToken();
                        DeviceAttribute.setPhysicalDiskDeviceSet(new ListUnmarshaller<PhysicalDiskDevice>(PhysicalDiskDeviceJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("PriceSet", targetDepth)) {
                        context.nextToken();
                        DeviceAttribute.setPriceSet(new ListUnmarshaller<MonthlyPrice>(MonthlyPriceJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return DeviceAttribute;
    }
}
