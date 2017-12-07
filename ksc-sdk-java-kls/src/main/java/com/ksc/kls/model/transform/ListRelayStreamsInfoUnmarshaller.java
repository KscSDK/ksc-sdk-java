package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListRelayStreamsInfoResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.RelayStreamsInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ListRelayStreamsInfoUnmarshaller implements Unmarshaller<ListRelayStreamsInfoResult, JsonUnmarshallerContext> {
    private static ListRelayStreamsInfoUnmarshaller instance;

    public static ListRelayStreamsInfoUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRelayStreamsInfoUnmarshaller();
        return instance;
    }

    @Override
    public ListRelayStreamsInfoResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRelayStreamsInfoResult result = new ListRelayStreamsInfoResult();
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
                if (context.testExpression(ParamConstant.ERRORNO, targetDepth)) {
                    context.nextToken();
                    result.setErrno(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ERRMSG,targetDepth)) {
                    context.nextToken();
                    result.setErrmsg(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.COUNT,targetDepth)) {
                    context.nextToken();
                    result.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RESULT,targetDepth)) {
                    context.nextToken();
                    result.setResult(new ListUnmarshaller<RelayStreamsInfo>(RelayStreamsInfoUnmarshaller.getInstance()).unmarshall(context));
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
