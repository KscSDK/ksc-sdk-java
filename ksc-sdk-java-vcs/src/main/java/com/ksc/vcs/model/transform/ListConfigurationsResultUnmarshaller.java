package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.vcs.model.GetConfigurationResult;
import com.ksc.vcs.model.ListConfigurationsResult;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListConfigurationsResult Unmarshaller
 */

public class ListConfigurationsResultUnmarshaller extends BaseJsonUnmarshaller<ListConfigurationsResult, JsonUnmarshallerContext> {

    private static ListConfigurationsResultUnmarshaller instance;

    public synchronized static ListConfigurationsResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListConfigurationsResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public ListConfigurationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListConfigurationsResult result = new ListConfigurationsResult();
        this.handleSuccess(result, context);

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;
            if (token == START_ARRAY) {
                result.setConfigurationsList(new ListUnmarshaller<GetConfigurationResult>(
                        GetConfigurationResultUnmarshaller.getInstance()).unmarshall(context));
                break;
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
    public ListConfigurationsResult handleException(Exception e) {
        ListConfigurationsResult result = new ListConfigurationsResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
