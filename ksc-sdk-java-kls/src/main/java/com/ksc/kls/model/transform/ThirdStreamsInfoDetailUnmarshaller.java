package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.ThirdStreamsInfoDetail;
import com.ksc.kls.model.ThirdStreamsInfoPullsInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;
import static com.fasterxml.jackson.core.JsonToken.*;

public class ThirdStreamsInfoDetailUnmarshaller implements Unmarshaller<ThirdStreamsInfoDetail, JsonUnmarshallerContext> {
    private static ThirdStreamsInfoDetailUnmarshaller instance;

    public static ThirdStreamsInfoDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThirdStreamsInfoDetailUnmarshaller();
        return instance;
    }


    @Override
    public ThirdStreamsInfoDetail unmarshall(JsonUnmarshallerContext context) throws Exception {

        ThirdStreamsInfoDetail result = new ThirdStreamsInfoDetail();
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
                if (context.testExpression(ParamConstant.NODE, targetDepth)) {
                    context.nextToken();
                    result.setNode(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.FLR, targetDepth)) {
                    context.nextToken();
                    result.setFLR(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BWREAL, targetDepth)) {
                    context.nextToken();
                    result.setBwReal(context.getUnmarshaller(Long.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.VCODEC, targetDepth)) {
                    context.nextToken();
                    result.setVcodec(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ACODEC, targetDepth)) {
                    context.nextToken();
                    result.setAcodec(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ONLINE_USER, targetDepth)) {
                    context.nextToken();
                    result.setOnlineUser(context.getUnmarshaller(Long.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BW, targetDepth)) {
                    context.nextToken();
                    result.setBw(context.getUnmarshaller(Long.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BWINAUDIO, targetDepth)) {
                    context.nextToken();
                    result.setBwInAudio(context.getUnmarshaller(Double.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BWIN, targetDepth)) {
                    context.nextToken();
                    result.setBwIn(context.getUnmarshaller(Double.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BWDIFF, targetDepth)) {
                    context.nextToken();
                    result.setBwDiff(context.getUnmarshaller(Double.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.WIDTH, targetDepth)) {
                    context.nextToken();
                    result.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CLIENTIP, targetDepth)) {
                    context.nextToken();
                    result.setClientip(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURBITRATE, targetDepth)) {
                    context.nextToken();
                    result.setCurbitrate(context.getUnmarshaller(Double.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.CURFPS, targetDepth)) {
                    context.nextToken();
                    result.setCurfps(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.FRSME_RATE, targetDepth)) {
                    context.nextToken();
                    result.setFrameRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.HEIGHT, targetDepth)) {
                    context.nextToken();
                    result.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBTIME, targetDepth)) {
                    context.nextToken();
                    result.setPubtime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.SAMPLE_RATE, targetDepth)) {
                    context.nextToken();
                    result.setSampleRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM, targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PULLS, targetDepth)) {
                    context.nextToken();
                    result.setPulls(new ListUnmarshaller<ThirdStreamsInfoPullsInfo>(ThirdStreamsInfoPullsInfoUnmarshaller.getInstance()).unmarshall(context));
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
