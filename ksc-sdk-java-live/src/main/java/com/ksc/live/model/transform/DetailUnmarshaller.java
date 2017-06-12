package com.ksc.live.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.live.model.Detail;
import com.ksc.live.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import java.util.List;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

/**
 * Created by yangfan on 2017/4/19.
 */
public class DetailUnmarshaller implements
        Unmarshaller<Detail, JsonUnmarshallerContext> {

    private static DetailUnmarshaller instance;

    public synchronized static DetailUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetailUnmarshaller();
        }
        return instance;
    }


    @Override
    public Detail unmarshall(JsonUnmarshallerContext context) throws Exception {
        Detail detail = new Detail();
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
                    detail.setPubdomain(context.getUnmarshaller(String.class).unmarshall(context));
                }else if (context.testExpression(ParamConstant.CLIENT_IP, targetDepth)) {
                    context.nextToken();
                    detail.setClientip(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.APP, targetDepth)) {
                    context.nextToken();
                    detail.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAMNAME, targetDepth)) {
                    context.nextToken();
                    detail.setStreamname(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBTIME, targetDepth)) {
                    context.nextToken();
                    detail.setPubtime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURFPS, targetDepth)) {
                    context.nextToken();
                    detail.setCurfps(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURBITRATE, targetDepth)) {
                    context.nextToken();
                    detail.setCurbitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.FRAMELOSSRATE, targetDepth)) {
                    context.nextToken();
                    detail.setFramelossrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
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
        return detail;
    }
}
