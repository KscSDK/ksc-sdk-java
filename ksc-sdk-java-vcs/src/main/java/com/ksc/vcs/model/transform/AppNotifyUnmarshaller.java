package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.AppNotify;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppNotify Unmarshaller
 */

public class AppNotifyUnmarshaller implements
        Unmarshaller<AppNotify, JsonUnmarshallerContext> {
    private static AppNotifyUnmarshaller instance;

    public synchronized static AppNotifyUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AppNotifyUnmarshaller();
        }
        return instance;
    }

    @Override
    public AppNotify unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppNotify appNotify = new AppNotify();
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
                if (context.testExpression(ParamConstant.URL, targetDepth)) {
                    context.nextToken();
                    appNotify.setUrl(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.NOTIFY_TYPE, targetDepth)) {
                    context.nextToken();
                    appNotify.setNotifyType(new ListUnmarshaller<String>(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return appNotify;
    }
}
