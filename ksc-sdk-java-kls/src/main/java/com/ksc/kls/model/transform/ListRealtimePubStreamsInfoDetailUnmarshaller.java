package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListRealtimePubStreamsInfo;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.StreamInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/22.
 */
public class ListRealtimePubStreamsInfoDetailUnmarshaller implements Unmarshaller<ListRealtimePubStreamsInfo, JsonUnmarshallerContext> {

    private static ListRealtimePubStreamsInfoDetailUnmarshaller instance;

    public static ListRealtimePubStreamsInfoDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRealtimePubStreamsInfoDetailUnmarshaller();
        return instance;
    }
    @Override
    public ListRealtimePubStreamsInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRealtimePubStreamsInfo result = new ListRealtimePubStreamsInfo();
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
                if (context.testExpression(ParamConstant.APP,targetDepth)) {
                    context.nextToken();
                    result.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.COUNT,targetDepth)) {
                    context.nextToken();
                    result.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.MARKER,targetDepth)) {
                    context.nextToken();
                    result.setMarker(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ORDERTIME,targetDepth)) {
                    context.nextToken();
                    result.setOrderTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBDOMAIN,targetDepth)) {
                    context.nextToken();
                    result.setPubdomain(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETCODE,targetDepth)) {
                    context.nextToken();
                    result.setRetCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETMSG,targetDepth)) {
                    context.nextToken();
                    result.setRetMsg(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.TOTAL,targetDepth)) {
                    context.nextToken();
                    result.setTotal(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.UNIQUE_NAME,targetDepth)) {
                    context.nextToken();
                    result.setUniqueName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RESULT,targetDepth)) {
                    context.nextToken();
                    result.setResult(new ListUnmarshaller<StreamInfo>(RealtimePubStreamsInfoUnmarshaller.getInstance()).unmarshall(context));
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
