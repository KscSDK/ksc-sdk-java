package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ForbidStreamDetail;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ForbidStreamDetailUnmarshaller implements Unmarshaller<ForbidStreamDetail, JsonUnmarshallerContext> {
    private static ForbidStreamDetailUnmarshaller instance;

    public static ForbidStreamDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new ForbidStreamDetailUnmarshaller();
        return instance;
    }

    @Override
    public ForbidStreamDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ForbidStreamDetail result = new ForbidStreamDetail();
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
                if (context.testExpression(ParamConstant.RETCODE, targetDepth)) {
                    context.nextToken();
                    result.setRetCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETMSG, targetDepth)) {
                    context.nextToken();
                    result.setRetMsg(context.getUnmarshaller(String.class).unmarshall(context));
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
