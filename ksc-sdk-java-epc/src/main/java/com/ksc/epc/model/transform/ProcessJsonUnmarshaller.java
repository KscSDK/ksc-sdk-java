package com.ksc.epc.model.transform;

import com.ksc.epc.model.Process;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        import com.ksc.epc.model.CommunicationContent;

public class ProcessJsonUnmarshaller implements Unmarshaller<Process, JsonUnmarshallerContext> {
    private static ProcessJsonUnmarshaller instance;

    public static ProcessJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProcessJsonUnmarshaller();
        return instance;
    }

    @Override
    public Process unmarshall(JsonUnmarshallerContext context) throws Exception {
        Process Process = new Process();
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
                    if (context.testExpression("Attribute", targetDepth)) {
                        context.nextToken();
                            Process.setAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("OperationProcessId", targetDepth)) {
                        context.nextToken();
                            Process.setOperationProcessId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ProcessId", targetDepth)) {
                        context.nextToken();
                            Process.setProcessId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Status", targetDepth)) {
                        context.nextToken();
                            Process.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Sn", targetDepth)) {
                        context.nextToken();
                            Process.setSn(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Region", targetDepth)) {
                        context.nextToken();
                            Process.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AvailabilityZone", targetDepth)) {
                        context.nextToken();
                            Process.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Confirm", targetDepth)) {
                        context.nextToken();
                            Process.setConfirm(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Type", targetDepth)) {
                        context.nextToken();
                            Process.setType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Title", targetDepth)) {
                        context.nextToken();
                            Process.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("MachineCount", targetDepth)) {
                        context.nextToken();
                            Process.setMachineCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("Content", targetDepth)) {
                        context.nextToken();
                            Process.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            Process.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CommunicationContentSet", targetDepth)) {
                        context.nextToken();
                        Process.setCommunicationContentSet(new ListUnmarshaller<CommunicationContent>(CommunicationContentJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return Process;
    }
}
