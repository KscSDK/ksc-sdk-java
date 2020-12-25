package com.ksc.epc.model.transform;

import com.ksc.epc.model.Inspection;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class InspectionJsonUnmarshaller implements Unmarshaller<Inspection, JsonUnmarshallerContext> {
    private static InspectionJsonUnmarshaller instance;

    public static InspectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InspectionJsonUnmarshaller();
        return instance;
    }

    @Override
    public Inspection unmarshall(JsonUnmarshallerContext context) throws Exception {
        Inspection Inspection = new Inspection();
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
                    if (context.testExpression("HostId", targetDepth)) {
                        context.nextToken();
                            Inspection.setHostId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Sn", targetDepth)) {
                        context.nextToken();
                            Inspection.setSn(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Region", targetDepth)) {
                        context.nextToken();
                            Inspection.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AvailabilityZone", targetDepth)) {
                        context.nextToken();
                            Inspection.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Status", targetDepth)) {
                        context.nextToken();
                            Inspection.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AlarmType", targetDepth)) {
                        context.nextToken();
                            Inspection.setAlarmType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AlarmDescription", targetDepth)) {
                        context.nextToken();
                            Inspection.setAlarmDescription(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            Inspection.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
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
        return Inspection;
    }
}
