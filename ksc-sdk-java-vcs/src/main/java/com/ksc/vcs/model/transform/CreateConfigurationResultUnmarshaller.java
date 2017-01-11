package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.CreateConfigurationResult;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateConfigurationResult Unmarshaller
 */

public class CreateConfigurationResultUnmarshaller extends BaseJsonUnmarshaller<CreateConfigurationResult, JsonUnmarshallerContext> {
    private static CreateConfigurationResultUnmarshaller instance;

    public synchronized static CreateConfigurationResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateConfigurationResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public CreateConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateConfigurationResult result = new CreateConfigurationResult();
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
    public CreateConfigurationResult handleException(Exception e) {
        CreateConfigurationResult result = new CreateConfigurationResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
