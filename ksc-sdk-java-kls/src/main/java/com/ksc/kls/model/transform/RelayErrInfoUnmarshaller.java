package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListRelayErrInfo;
import com.ksc.kls.model.ListRelayErrInfoDetail;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class RelayErrInfoUnmarshaller implements Unmarshaller<ListRelayErrInfo, JsonUnmarshallerContext> {
    private static RelayErrInfoUnmarshaller instance;

    public static RelayErrInfoUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelayErrInfoUnmarshaller();
        return instance;
    }
    @Override
    public ListRelayErrInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRelayErrInfo result = new ListRelayErrInfo();
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
                if (context.testExpression(ParamConstant.APP, targetDepth)) {
                    context.nextToken();
                    result.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBDOMAIN,targetDepth)) {
                    context.nextToken();
                    result.setPubtime(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STOP_TIME,targetDepth)) {
                    context.nextToken();
                    result.setStoptime(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM_NAME,targetDepth)) {
                    context.nextToken();
                    result.setStreamname(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.DETAIL,targetDepth)) {
                    context.nextToken();
                    result.setDetail(new ListUnmarshaller<ListRelayErrInfoDetail>(ListRelayErrInfoDetailUnmarshaller.getInstance()).unmarshall(context));
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
