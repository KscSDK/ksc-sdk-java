package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.vcs.model.GetNotifyCfgResult;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetNotifyCfgResult Unmarshaller
 */

public class GetNotifyCfgResultUnmarshaller extends
        BaseJsonUnmarshaller<GetNotifyCfgResult, JsonUnmarshallerContext> {

    private static GetNotifyCfgResultUnmarshaller instance;

    public synchronized static GetNotifyCfgResultUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetNotifyCfgResultUnmarshaller();
        return instance;
    }

    @Override
    public GetNotifyCfgResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetNotifyCfgResult result = new GetNotifyCfgResult();
        this.handleSuccess(result, context);

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
                    result.setUrl(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.NOTIFY_TYPE, targetDepth)) {
                    context.nextToken();
                    result.setNotifyType(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

    @Override
    public GetNotifyCfgResult handleException(Exception e) {
        GetNotifyCfgResult result = new GetNotifyCfgResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
