package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.WarningScreenshots;
import com.ksc.vcs.model.WarningScreenshotsRecog;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WarningScreenshot Unmarshaller
 */

public class WarningScreenshotsUnmarshaller implements Unmarshaller<WarningScreenshots, JsonUnmarshallerContext> {

    private static WarningScreenshotsUnmarshaller instance;

    public synchronized static WarningScreenshotsUnmarshaller getInstance() {
        if (instance == null) {
            instance = new WarningScreenshotsUnmarshaller();
        }
        return instance;
    }

    @Override
    public WarningScreenshots unmarshall(JsonUnmarshallerContext context) throws Exception {
        WarningScreenshots result = new WarningScreenshots();
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
                } else if (context.testExpression(ParamConstant.TIME, targetDepth)) {
                    context.nextToken();
                    result.setTime(context.getUnmarshaller(Long.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.RECOG, targetDepth)) {
                    context.nextToken();
                    result.setRecog(new ListUnmarshaller<WarningScreenshotsRecog>(WarningScreenshotsRecogUnmarshaller.getInstance()).unmarshall(context));
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
