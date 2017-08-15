package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListBlacklist;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ListBlacklistUnmarshaller  implements Unmarshaller<ListBlacklist, JsonUnmarshallerContext> {
    private static ListBlacklistUnmarshaller instance;

    public static ListBlacklistUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListBlacklistUnmarshaller();
        return instance;
    }
    @Override
    public ListBlacklist unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListBlacklist result = new ListBlacklist();
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
                if (context.testExpression(ParamConstant.FORBID_UNIX_TIME, targetDepth)) {
                    context.nextToken();
                    result.setForbidUnixTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.FORBID_TILL_UNIX_TIME, targetDepth)) {
                    context.nextToken();
                    result.setForbidTillUnixTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM, targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return result;
    }
}
