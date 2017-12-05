package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListRealtimeStreamsInfoData;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.ThirdStreamsInfoDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;
import static com.fasterxml.jackson.core.JsonToken.*;

public class ListRealtimeStreamsDataUnmarshaller implements Unmarshaller<ListRealtimeStreamsInfoData, JsonUnmarshallerContext> {

    private static ListRealtimeStreamsDataUnmarshaller instance;

    public synchronized static ListRealtimeStreamsDataUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListRealtimeStreamsDataUnmarshaller();
        }
        return instance;
    }


    @Override
    public ListRealtimeStreamsInfoData unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRealtimeStreamsInfoData result = new ListRealtimeStreamsInfoData();
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
                if (context.testExpression(ParamConstant.UNIQUE_NAME,targetDepth)) {
                    context.nextToken();
                    result.setUniqueName(context.getUnmarshaller(String.class).unmarshall(context));
                }else if (context.testExpression(ParamConstant.APP, targetDepth)) {
                    context.nextToken();
                    result.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BW, targetDepth)) {
                    context.nextToken();
                    result.setBw(context.getUnmarshaller(Long.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ONLINE_USER, targetDepth)) {
                    context.nextToken();
                    result.setOnlineUser(context.getUnmarshaller(Long.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.COUNT, targetDepth)) {
                    context.nextToken();
                    result.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETCODE, targetDepth)) {
                    context.nextToken();
                    result.setRetCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETMSG, targetDepth)) {
                    context.nextToken();
                    result.setRetMsg(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAMS, targetDepth)) {
                    context.nextToken();
                    result.setStreams(new ListUnmarshaller<ThirdStreamsInfoDetail>(ThirdStreamsInfoDetailUnmarshaller.getInstance()).unmarshall(context));
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
