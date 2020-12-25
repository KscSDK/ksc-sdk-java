package com.ksc.network.eip.model.transform;

import com.ksc.network.eip.model.ModifyAddressResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class ModifyAddressResultStaxUnMarshaller implements
        Unmarshaller<ModifyAddressResult, StaxUnmarshallerContext> {

    @Override
    public ModifyAddressResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyAddressResult modifyAddressResult = new ModifyAddressResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyAddressResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PublicIp", targetDepth)) {
                    modifyAddressResult.setPublicIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllocationId", targetDepth)) {
                    modifyAddressResult.setAllocationId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    modifyAddressResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("BandWidth", targetDepth)) {
                    modifyAddressResult.setBandWidth(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("CreateTime", targetDepth)) {
                    modifyAddressResult.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                } else if (context.testExpression("LineId", targetDepth)) {
                    modifyAddressResult.setLineId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyAddressResult;
                }
            }
        }
    }

    private static ModifyAddressResultStaxUnMarshaller instance;

    public static ModifyAddressResultStaxUnMarshaller getInstance() {
        if (instance == null)
            instance = new ModifyAddressResultStaxUnMarshaller();
        return instance;
    }
}
