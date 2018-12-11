package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.RelayStreamsInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class RelayStreamsInfoUnmarshaller implements Unmarshaller<RelayStreamsInfo, JsonUnmarshallerContext> {

    private static RelayStreamsInfoUnmarshaller instance;

    public static RelayStreamsInfoUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelayStreamsInfoUnmarshaller();
        return instance;
    }

    @Override
    public RelayStreamsInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        RelayStreamsInfo result = new RelayStreamsInfo();
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
                if (context.testExpression(ParamConstant.PUBDOMAIN, targetDepth)) {
                    context.nextToken();
                    result.setPubtime(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CLIENT_IP,targetDepth)) {
                    context.nextToken();
                    result.setClientip(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.APP,targetDepth)) {
                    context.nextToken();
                    result.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM_NAME,targetDepth)) {
                    context.nextToken();
                    result.setStreamname(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURFPS,targetDepth)) {
                    context.nextToken();
                    result.setCurfps(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURBITRATE,targetDepth)) {
                    context.nextToken();
                    result.setCurbitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.FRAME_LOSSRATE,targetDepth)) {
                    context.nextToken();
                    result.setFramelossrate(context.getUnmarshaller(Float.class).unmarshall(context));
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
