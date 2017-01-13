package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.WarningStream;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WarningStream Unmarshaller
 */

public class WarningStreamUnmarshaller implements Unmarshaller<WarningStream, JsonUnmarshallerContext> {

    private static WarningStreamUnmarshaller instance;

    public synchronized static WarningStreamUnmarshaller getInstance() {
        if (instance == null) {
            instance = new WarningStreamUnmarshaller();
        }
        return instance;
    }

    @Override
    public WarningStream unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        WarningStream result = new WarningStream();
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
                if (context.testExpression(ParamConstant.STREAM, targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.ALARM_TIME, targetDepth)) {
                    context.nextToken();
                    result.setAlarmTime(context.getUnmarshaller(Long.class)
                            .unmarshall(context));
                    ;
                }

            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                        currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return result;
    }

}
