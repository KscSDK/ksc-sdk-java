package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.GetConfigurationResult;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetConfigurationResult Unmarshaller
 */

public class GetConfigurationResultUnmarshaller extends
        BaseJsonUnmarshaller<GetConfigurationResult, JsonUnmarshallerContext> {
    private static GetConfigurationResultUnmarshaller instance;

    public synchronized static GetConfigurationResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetConfigurationResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public GetConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetConfigurationResult result = new GetConfigurationResult();
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
                if (context.testExpression(ParamConstant.UNIQUE_NAME, targetDepth)) {
                    context.nextToken();
                    result.setUniqueName(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.APP, targetDepth)) {
                    context.nextToken();
                    result.setApp(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.CONF, targetDepth)) {
                    context.nextToken();
                    result.setConf(AppConfUnmarshaller.getInstance().unmarshall(context));
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
    public GetConfigurationResult handleException(Exception e) {
        GetConfigurationResult result = new GetConfigurationResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
