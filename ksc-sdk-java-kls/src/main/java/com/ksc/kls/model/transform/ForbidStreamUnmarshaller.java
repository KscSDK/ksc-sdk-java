package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ForbidStreamResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ForbidStreamUnmarshaller implements Unmarshaller<ForbidStreamResult, JsonUnmarshallerContext> {
    private static ForbidStreamUnmarshaller instance;

    public static ForbidStreamUnmarshaller getInstance() {
        if (instance == null)
            instance = new ForbidStreamUnmarshaller();
        return instance;
    }

    @Override
    public ForbidStreamResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ForbidStreamResult result = new ForbidStreamResult();
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
                if (context.testExpression(ParamConstant.DATA, targetDepth)) {
                    context.nextToken();
                    result.setData(ForbidStreamDetailUnmarshaller.getInstance().unmarshall(context));
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
