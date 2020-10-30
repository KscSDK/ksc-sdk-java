package com.ksc.epc.model.transform;

import com.ksc.epc.model.DescribePhysicalMonitorResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
import com.ksc.epc.model.Item;
import com.ksc.epc.model.Item;
import com.ksc.epc.model.Item;
import com.ksc.epc.model.Item;
import com.ksc.epc.model.Item;

/**
 * DescribePhysicalMonitorResult Json Unmarshaller
 */
public class DescribePhysicalMonitorResultJsonUnmarshaller implements Unmarshaller<DescribePhysicalMonitorResult, JsonUnmarshallerContext> {
    @Override
    public DescribePhysicalMonitorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePhysicalMonitorResult describePhysicalMonitorResult = new DescribePhysicalMonitorResult();
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
                    if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                            describePhysicalMonitorResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CPUInfo", targetDepth)) {
                    context.nextToken();
                    describePhysicalMonitorResult.setCPUInfo(new ListUnmarshaller<Item>(ItemJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("MemoryInfo", targetDepth)) {
                    context.nextToken();
                    describePhysicalMonitorResult.setMemoryInfo(new ListUnmarshaller<Item>(ItemJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("DiskInfo", targetDepth)) {
                    context.nextToken();
                    describePhysicalMonitorResult.setDiskInfo(new ListUnmarshaller<Item>(ItemJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("FanInfo", targetDepth)) {
                    context.nextToken();
                    describePhysicalMonitorResult.setFanInfo(new ListUnmarshaller<Item>(ItemJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("PowerInfo", targetDepth)) {
                    context.nextToken();
                    describePhysicalMonitorResult.setPowerInfo(new ListUnmarshaller<Item>(ItemJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return describePhysicalMonitorResult;
    }

    private static DescribePhysicalMonitorResultJsonUnmarshaller instance;

    public static DescribePhysicalMonitorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePhysicalMonitorResultJsonUnmarshaller();
        return instance;
    }
}
