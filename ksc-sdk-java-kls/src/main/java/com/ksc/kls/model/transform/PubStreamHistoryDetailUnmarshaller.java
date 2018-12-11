package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.PubStreamHistoryDetail;
import com.ksc.kls.model.StreamDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/22.
 */
public class PubStreamHistoryDetailUnmarshaller implements Unmarshaller<PubStreamHistoryDetail, JsonUnmarshallerContext> {

    private static PubStreamHistoryDetailUnmarshaller instance;

    public static PubStreamHistoryDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new PubStreamHistoryDetailUnmarshaller();
        return instance;
    }


    @Override
    public PubStreamHistoryDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        PubStreamHistoryDetail result = new PubStreamHistoryDetail();
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
                if (context.testExpression(ParamConstant.STREAM,targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class).unmarshall(context));
                }  else if (context.testExpression(ParamConstant.DETAIL,targetDepth)) {
                    context.nextToken();
                    result.setDetail(new ListUnmarshaller<StreamDetail>(StreamDetailUnmarshaller.getInstance()).unmarshall(context));
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
