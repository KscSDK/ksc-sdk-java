package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.StreamDurationsDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;


import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/4.
 */
public class StreamDurationsDetailUnmarshaller implements Unmarshaller<StreamDurationsDetail, JsonUnmarshallerContext> {

    private static StreamDurationsDetailUnmarshaller instance;

    public synchronized static StreamDurationsDetailUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamDurationsDetailUnmarshaller();
        }
        return instance;
    }

    @Override
    public StreamDurationsDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamDurationsDetail result = new StreamDurationsDetail();
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
                if (context.testExpression(ParamConstant.DURAPTION,targetDepth)) {
                    context.nextToken();
                    result.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STARTUNIXTIME, targetDepth)) {
                    context.nextToken();
                    result.setStartTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ENDUNIXTIME, targetDepth)) {
                    context.nextToken();
                    result.setEndTime(context.getUnmarshaller(Integer.class).unmarshall(context));
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
