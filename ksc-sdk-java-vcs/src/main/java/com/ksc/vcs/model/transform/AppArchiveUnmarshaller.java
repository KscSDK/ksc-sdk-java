package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.AppArchive;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppArchive Unmarshaller
 */

public class AppArchiveUnmarshaller implements
        Unmarshaller<AppArchive, JsonUnmarshallerContext> {
    private static AppArchiveUnmarshaller instance;

    public synchronized static AppArchiveUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AppArchiveUnmarshaller();
        }
        return instance;
    }

    @Override
    public AppArchive unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppArchive appArchive = new AppArchive();
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
                if (context.testExpression(ParamConstant.SCREENSHOT_ARCHIVE, targetDepth)) {
                    context.nextToken();
                    appArchive.setScreenshotArchive(ScreenshotArchiveUnmarshaller.getInstance().unmarshall(context));
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
        return appArchive;
    }
}
