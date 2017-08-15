package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListRelayErrInfoDetail;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import org.omg.PortableInterceptor.INACTIVE;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ListRelayErrInfoDetailUnmarshaller implements Unmarshaller<ListRelayErrInfoDetail, JsonUnmarshallerContext> {

    private static ListRelayErrInfoDetailUnmarshaller instance;

    public static ListRelayErrInfoDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRelayErrInfoDetailUnmarshaller();
        return instance;
    }

    @Override
    public ListRelayErrInfoDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRelayErrInfoDetail result = new ListRelayErrInfoDetail();
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
                if (context.testExpression(ParamConstant.CLIENT_IP, targetDepth)) {
                    context.nextToken();
                    result.setClientip(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ERROR_CODE,targetDepth)) {
                    context.nextToken();
                    result.setErrcode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBDOMAIN,targetDepth)) {
                    context.nextToken();
                    result.setPubdomain(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.TIME,targetDepth)) {
                    context.nextToken();
                    result.setTime(context.getUnmarshaller(Integer.class).unmarshall(context));
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
