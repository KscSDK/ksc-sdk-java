package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.CreateRecordDetail;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/2.
 */
public class CreateRecordDetailUnmarshaller implements
        Unmarshaller<CreateRecordDetail, JsonUnmarshallerContext> {

    private static CreateRecordDetailUnmarshaller instance;

    public synchronized static CreateRecordDetailUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateRecordDetailUnmarshaller();
        }
        return instance;
    }

    @Override
    public CreateRecordDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateRecordDetail detail = new CreateRecordDetail();
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
                    detail.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                }else if (context.testExpression(ParamConstant.PUBDOMAIN, targetDepth)) {
                    context.nextToken();
                    detail.setPubdomain(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RECID, targetDepth)) {
                    context.nextToken();
                    detail.setRecID(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETCODE, targetDepth)) {
                    context.nextToken();
                    detail.setRetcode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETMSG, targetDepth)) {
                    context.nextToken();
                    detail.setRetMsg(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM, targetDepth)) {
                    context.nextToken();
                    detail.setStream(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.UNIQUE_NAME, targetDepth)) {
                    context.nextToken();
                    detail.setUniqueName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                        currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return detail;
    }
}
