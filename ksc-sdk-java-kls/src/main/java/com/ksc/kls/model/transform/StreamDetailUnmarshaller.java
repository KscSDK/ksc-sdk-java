package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.StreamDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import org.omg.CORBA.INTERNAL;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/22.
 */
public class StreamDetailUnmarshaller implements Unmarshaller<StreamDetail, JsonUnmarshallerContext> {

    private static StreamDetailUnmarshaller instance;

    public static StreamDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamDetailUnmarshaller();
        return instance;
    }

    @Override
    public StreamDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamDetail result = new StreamDetail();
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
                if (context.testExpression(ParamConstant.CLIENT_IP,targetDepth)) {
                    context.nextToken();
                    result.setClientip(context.getUnmarshaller(String.class).unmarshall(context));
                }  else if (context.testExpression(ParamConstant.FIN_TIME,targetDepth)) {
                    context.nextToken();
                    result.setFintime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUB_TIME,targetDepth)) {
                    context.nextToken();
                    result.setPubtime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STATUS_CODE,targetDepth)) {
                    context.nextToken();
                    result.setStatusCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STATUS_MESSAGE,targetDepth)) {
                    context.nextToken();
                    result.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
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
