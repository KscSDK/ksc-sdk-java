package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListRealtimePubStreamsInfoResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/22.
 */
public class ListRealtimePubStreamsInfoUnmarshaller implements Unmarshaller<ListRealtimePubStreamsInfoResult, JsonUnmarshallerContext> {

    private static ListRealtimePubStreamsInfoUnmarshaller instance;

    public static ListRealtimePubStreamsInfoUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRealtimePubStreamsInfoUnmarshaller();
        return instance;
    }
    @Override
    public ListRealtimePubStreamsInfoResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRealtimePubStreamsInfoResult result = new ListRealtimePubStreamsInfoResult();
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
                if (context.testExpression(ParamConstant.DATA,targetDepth)) {
                    context.nextToken();
                    result.setData(ListRealtimePubStreamsInfoDetailUnmarshaller.getInstance().unmarshall(context));
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
