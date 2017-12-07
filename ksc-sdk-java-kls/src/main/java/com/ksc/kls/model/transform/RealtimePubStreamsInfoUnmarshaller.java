package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.StreamInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import org.omg.CORBA.INTERNAL;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/22.
 */
public class RealtimePubStreamsInfoUnmarshaller implements Unmarshaller<StreamInfo, JsonUnmarshallerContext> {

    private static RealtimePubStreamsInfoUnmarshaller instance;

    public static RealtimePubStreamsInfoUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealtimePubStreamsInfoUnmarshaller();
        return instance;
    }
    @Override
    public StreamInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamInfo result = new StreamInfo();
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
                if (context.testExpression(ParamConstant.BWIN,targetDepth)) {
                    context.nextToken();
                    result.setBwIn(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BWINAUDIO,targetDepth)) {
                    context.nextToken();
                    result.setBwInAudio(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BWREAL,targetDepth)) {
                    context.nextToken();
                    result.setBwReal(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CLIENT_IP,targetDepth)) {
                    context.nextToken();
                    result.setClientip(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURFPS,targetDepth)) {
                    context.nextToken();
                    result.setCurfps(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURBITRATE,targetDepth)) {
                    context.nextToken();
                    result.setCurbitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.FRSME_RATE,targetDepth)) {
                    context.nextToken();
                    result.setFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.HEIGHT,targetDepth)) {
                    context.nextToken();
                    result.setHeight(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBDOMAIN,targetDepth)) {
                    context.nextToken();
                    result.setPubtime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.SAMPLE_RATE,targetDepth)) {
                    context.nextToken();
                    result.setSampleRate(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM,targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.UPDATE_TIME,targetDepth)) {
                    context.nextToken();
                    result.setUpdateTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.WIDTH,targetDepth)) {
                    context.nextToken();
                    result.setWidth(context.getUnmarshaller(String.class).unmarshall(context));
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
