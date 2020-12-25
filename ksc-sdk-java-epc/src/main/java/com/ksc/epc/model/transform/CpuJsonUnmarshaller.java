package com.ksc.epc.model.transform;

import com.ksc.epc.model.Cpu;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class CpuJsonUnmarshaller implements Unmarshaller<Cpu, JsonUnmarshallerContext> {
    private static CpuJsonUnmarshaller instance;

    public static CpuJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CpuJsonUnmarshaller();
        return instance;
    }

    @Override
    public Cpu unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cpu Cpu = new Cpu();
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
                    if (context.testExpression("Model", targetDepth)) {
                        context.nextToken();
                            Cpu.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Frequence", targetDepth)) {
                        context.nextToken();
                            Cpu.setFrequence(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Count", targetDepth)) {
                        context.nextToken();
                            Cpu.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("CoreCount", targetDepth)) {
                        context.nextToken();
                            Cpu.setCoreCount(context.getUnmarshaller(Integer.class).unmarshall(context));
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
        return Cpu;
    }
}
