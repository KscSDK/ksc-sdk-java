package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.Screenshot;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Screenshot Unmarshaller
 */

public class ScreenshotUnmarshaller implements
        Unmarshaller<Screenshot, JsonUnmarshallerContext> {

    private static ScreenshotUnmarshaller instance;

    public synchronized static ScreenshotUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScreenshotUnmarshaller();
        return instance;
    }

    @Override
    public Screenshot unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        Screenshot result = new Screenshot();
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
                if (context.testExpression(ParamConstant.BUCKET, targetDepth)) {
                    context.nextToken();
                    result.setBucket(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.KEY, targetDepth)) {
                    context.nextToken();
                    result.setKey(context.getUnmarshaller(String.class)
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
