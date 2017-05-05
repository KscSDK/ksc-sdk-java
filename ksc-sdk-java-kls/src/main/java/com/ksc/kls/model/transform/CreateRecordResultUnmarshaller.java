package com.ksc.kls.model.transform;


import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.CreateRecordDetail;
import com.ksc.kls.model.CreateRecordResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.*;


import javax.xml.soap.Detail;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

/**
 * Created by yangfan on 2017/4/26.
 */
public class CreateRecordResultUnmarshaller implements Unmarshaller<CreateRecordResult, JsonUnmarshallerContext> {

    private static CreateRecordResultUnmarshaller instance;

    public static CreateRecordResultUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateRecordResultUnmarshaller();
        return instance;
    }



    @Override
    public CreateRecordResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateRecordResult result = new CreateRecordResult();
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
                    result.setData(CreateRecordDetailUnmarshaller.getInstance().unmarshall(context));
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
