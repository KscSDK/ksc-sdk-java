package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.WarningScreenshotsRecog;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WarningScreenshotsRecog Unmarshaller
 */

public class WarningScreenshotsRecogUnmarshaller implements Unmarshaller<WarningScreenshotsRecog, JsonUnmarshallerContext> {

    private static WarningScreenshotsRecogUnmarshaller instance;

    public synchronized static WarningScreenshotsRecogUnmarshaller getInstance() {
        if (instance == null) {
            instance = new WarningScreenshotsRecogUnmarshaller();
        }
        return instance;
    }

    @Override
    public WarningScreenshotsRecog unmarshall(JsonUnmarshallerContext context) throws Exception {
        WarningScreenshotsRecog result = new WarningScreenshotsRecog();
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
                if (context.testExpression(ParamConstant.RECOG_TYPE, targetDepth)) {
                    context.nextToken();
                    result.setRecogType(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.THRESHOLD, targetDepth)) {
                    context.nextToken();
                    result.setThreshold(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.RATE, targetDepth)) {
                    context.nextToken();
                    result.setRate(context.getUnmarshaller(String.class)
                            .unmarshall(context));
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
