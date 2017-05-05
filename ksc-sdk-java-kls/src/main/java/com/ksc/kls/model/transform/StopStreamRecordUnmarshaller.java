package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.StopStreamRecordDetail;
import com.ksc.kls.model.StopStreamRecordRequest;
import com.ksc.kls.model.StopStreamRecordResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/4/27.
 */
public class StopStreamRecordUnmarshaller implements Unmarshaller<StopStreamRecordResult,JsonUnmarshallerContext> {

    private static StopStreamRecordUnmarshaller instance;

    public static StopStreamRecordUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopStreamRecordUnmarshaller();
        return instance;
    }

    @Override
    public StopStreamRecordResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopStreamRecordResult result = new StopStreamRecordResult();
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
                    result.setData(StopStreamRecordDetailUnmarshaller.getInstance().unmarshall(context));
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
