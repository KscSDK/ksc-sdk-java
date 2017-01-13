package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.AppRecog;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppRecog Unmarshaller
 */

public class AppRecogUnmarshaller implements
        Unmarshaller<AppRecog, JsonUnmarshallerContext> {
    private static AppRecogUnmarshaller instance;

    public synchronized static AppRecogUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AppRecogUnmarshaller();
        }
        return instance;
    }

    @Override
    public AppRecog unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppRecog appRecog = new AppRecog();
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
                    appRecog.setRecogType(AppRecog.ScreenShotMonitor.valueOf(context.getUnmarshaller(String.class)
                            .unmarshall(context)));
                } else if (context.testExpression(ParamConstant.ENABLE, targetDepth)) {
                    context.nextToken();
                    appRecog.setEnable(context.getUnmarshaller(Boolean.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.THRESHOLD, targetDepth)) {
                    context.nextToken();
                    appRecog.setThreshold(new ListUnmarshaller<Double>(SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return appRecog;
    }
}


