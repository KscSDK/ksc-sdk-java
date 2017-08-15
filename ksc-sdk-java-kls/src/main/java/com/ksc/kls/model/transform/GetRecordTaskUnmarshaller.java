package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.GetRecordTaskDetail;
import com.ksc.kls.model.GetRecordTaskResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/4/27.
 */
public class GetRecordTaskUnmarshaller implements Unmarshaller<GetRecordTaskResult, JsonUnmarshallerContext> {

    private static GetRecordTaskUnmarshaller instance;

    public static GetRecordTaskUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRecordTaskUnmarshaller();
        return instance;
    }
    @Override
    public GetRecordTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecordTaskResult result = new GetRecordTaskResult();
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
                    result.setData(GetRecordTaskDetailUnmarshaller.getInstance().unmarshall(context));
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
