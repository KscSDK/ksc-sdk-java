package com.ksc.kls.model.transform;

import com.ksc.kls.model.ListRealtimeStreamsInfoResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

public class ListRealtimeStreamsInfoUnmarshaller implements Unmarshaller<ListRealtimeStreamsInfoResult, JsonUnmarshallerContext> {

    private static ListRealtimeStreamsInfoUnmarshaller instance;

    public synchronized static ListRealtimeStreamsInfoUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListRealtimeStreamsInfoUnmarshaller();
        }
        return instance;
    }

    @Override
    public ListRealtimeStreamsInfoResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRealtimeStreamsInfoResult result = new ListRealtimeStreamsInfoResult();
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
                    result.setData(ListRealtimeStreamsDataUnmarshaller.getInstance().unmarshall(context));
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
