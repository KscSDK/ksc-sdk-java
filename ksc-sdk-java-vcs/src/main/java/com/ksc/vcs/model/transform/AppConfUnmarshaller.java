package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.AppConf;
import com.ksc.vcs.model.AppRecog;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppConf Unmarshaller
 */

public class AppConfUnmarshaller implements
        Unmarshaller<AppConf, JsonUnmarshallerContext> {
    private static AppConfUnmarshaller instance;

    public synchronized static AppConfUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AppConfUnmarshaller();
        }
        return instance;
    }

    @Override
    public AppConf unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppConf appConf = new AppConf();
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
                if (context.testExpression(ParamConstant.RECOG, targetDepth)) {
                    context.nextToken();
                    appConf.setRecog(new ListUnmarshaller<AppRecog>(AppRecogUnmarshaller.getInstance()).unmarshall(context));
                } else if (context.testExpression(ParamConstant.NOTIFY, targetDepth)) {
                    context.nextToken();
                    appConf.setNotify(AppNotifyUnmarshaller.getInstance().unmarshall(context));
                } else if (context.testExpression(ParamConstant.ARCHIVE, targetDepth)) {
                    context.nextToken();
                    appConf.setArchive(AppArchiveUnmarshaller.getInstance().unmarshall(context));
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
        return appConf;
    }
}
