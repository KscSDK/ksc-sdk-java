package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.ScreenshotArchive;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScreenshotArchive Unmarshaller
 */

public class ScreenshotArchiveUnmarshaller implements
        Unmarshaller<ScreenshotArchive, JsonUnmarshallerContext> {
    private static ScreenshotArchiveUnmarshaller instance;

    public synchronized static ScreenshotArchiveUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ScreenshotArchiveUnmarshaller();
        }
        return instance;
    }

    @Override
    public ScreenshotArchive unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScreenshotArchive screenshotArchive = new ScreenshotArchive();
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
                    screenshotArchive.setBucket(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.BLOCK_OBJECT, targetDepth)) {
                    context.nextToken();
                    screenshotArchive.setBlockObject(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.ALARM_OBJECT, targetDepth)) {
                    context.nextToken();
                    screenshotArchive.setAlarmObject(context.getUnmarshaller(String.class)
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
        return screenshotArchive;
    }
}
