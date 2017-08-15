package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListRelayErrInfo;
import com.ksc.kls.model.ListRelayErrInfoResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ListRelayErrInfoUnmarshaller implements Unmarshaller<ListRelayErrInfoResult, JsonUnmarshallerContext> {
    private static ListRelayErrInfoUnmarshaller instance;

    public static ListRelayErrInfoUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRelayErrInfoUnmarshaller();
        return instance;
    }

    @Override
    public ListRelayErrInfoResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRelayErrInfoResult result = new ListRelayErrInfoResult();
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
                if (context.testExpression(ParamConstant.COUNT, targetDepth)) {
                    context.nextToken();
                    result.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.DURAPTION,targetDepth)) {
                    context.nextToken();
                    result.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ERRORNO,targetDepth)) {
                    context.nextToken();
                    result.setErrno(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ERRMSG,targetDepth)) {
                    context.nextToken();
                    result.setErrmsg(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RESULT,targetDepth)) {
                    context.nextToken();
                    result.setResult(new ListUnmarshaller<ListRelayErrInfo>(RelayErrInfoUnmarshaller.getInstance()).unmarshall(context));
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
