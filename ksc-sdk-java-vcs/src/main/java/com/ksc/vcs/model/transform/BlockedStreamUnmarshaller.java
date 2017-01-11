package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.BlockedStream;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BlockedStream Unmarshaller
 */

public class BlockedStreamUnmarshaller implements
        Unmarshaller<BlockedStream, JsonUnmarshallerContext> {

    private static BlockedStreamUnmarshaller instance;

    public synchronized static BlockedStreamUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlockedStreamUnmarshaller();
        return instance;
    }

    @Override
    public BlockedStream unmarshall(JsonUnmarshallerContext context) throws Exception {
        BlockedStream result = new BlockedStream();
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
                } else if (context.testExpression(ParamConstant.TIME, targetDepth)) {
                    context.nextToken();
                    result.setTime(context.getUnmarshaller(Long.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.SCREENSHOT, targetDepth)) {
                    context.nextToken();
                    result.setScreenshot(ScreenshotUnmarshaller.getInstance()
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
