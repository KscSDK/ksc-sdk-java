package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers;
import com.ksc.vcs.model.ListUniqueNamesResult;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListUniqueNamesResult Unmarshaller
 */

public class ListUniqueNamesResultUnmarshaller extends BaseJsonUnmarshaller<ListUniqueNamesResult, JsonUnmarshallerContext> {

    private static ListUniqueNamesResultUnmarshaller instance;

    private ListUniqueNamesResultUnmarshaller() {
    }

    public synchronized static ListUniqueNamesResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListUniqueNamesResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public ListUniqueNamesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListUniqueNamesResult result = new ListUniqueNamesResult();
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
                result.setUniqueNamesList(new ListUnmarshaller<String>(
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
    public ListUniqueNamesResult handleException(Exception e) {
        ListUniqueNamesResult result = new ListUniqueNamesResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
