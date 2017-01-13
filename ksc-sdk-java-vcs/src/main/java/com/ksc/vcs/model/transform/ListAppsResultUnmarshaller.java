package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers;
import com.ksc.vcs.model.ListAppsResult;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListAppsResult Unmarshaller
 */

public class ListAppsResultUnmarshaller extends BaseJsonUnmarshaller<ListAppsResult, JsonUnmarshallerContext> {

    private static ListAppsResultUnmarshaller instance;

    public synchronized static ListAppsResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListAppsResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public ListAppsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListAppsResult result = new ListAppsResult();
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
                result.setAppsList(new ListUnmarshaller<String>(
                        SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(context));
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
    public ListAppsResult handleException(Exception e) {
        ListAppsResult result = new ListAppsResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}