package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.GetRecordTaskDetail;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/4.
 */
public class GetRecordTaskDetailUnmarshaller implements Unmarshaller<GetRecordTaskDetail, JsonUnmarshallerContext> {

    private static GetRecordTaskDetailUnmarshaller instance;

    public static GetRecordTaskDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRecordTaskDetailUnmarshaller();
        return instance;
    }

    @Override
    public GetRecordTaskDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecordTaskDetail result = new GetRecordTaskDetail();
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
                if (context.testExpression(ParamConstant.RECID, targetDepth)) {
                    context.nextToken();
                    result.setRecID(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.UNIQUE_NAME, targetDepth)) {
                    context.nextToken();
                    result.setUniqueName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.APP, targetDepth)) {
                    context.nextToken();
                    result.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBDOMAIN, targetDepth)) {
                    context.nextToken();
                    result.setPubdomain(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM, targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETCODE, targetDepth)) {
                    context.nextToken();
                    result.setRetCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RECTYPE, targetDepth)) {
                    context.nextToken();
                    result.setRecType(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BUCKET, targetDepth)) {
                    context.nextToken();
                    result.setBucket(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STARTUNIXTIME, targetDepth)) {
                    context.nextToken();
                    result.setStartUnixTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ENDUNIXTIME, targetDepth)) {
                    context.nextToken();
                    result.setEndUnixTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.DURAPTION, targetDepth)) {
                    context.nextToken();
                    result.setDuration(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.KS3FULLPATHM3U8, targetDepth)) {
                    context.nextToken();
                    result.setKs3FullPathM3U8(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.KS3FULLPATHMP4, targetDepth)) {
                    context.nextToken();
                    result.setKs3FullPathMP4(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RECSTATUS, targetDepth)) {
                    context.nextToken();
                    result.setRecStatus(context.getUnmarshaller(Integer.class).unmarshall(context));
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
