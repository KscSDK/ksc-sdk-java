package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.RecordDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/4/27.
 */
public class RecordDetailUnmarshaller implements Unmarshaller<RecordDetail, JsonUnmarshallerContext> {

    private static RecordDetailUnmarshaller instance;

    public static RecordDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecordDetailUnmarshaller();
        return instance;
    }

    @Override
    public RecordDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecordDetail result = new RecordDetail();
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
                if (context.testExpression(ParamConstant.BUCKET, targetDepth)) {
                    context.nextToken();
                    result.setBucket(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.DURAPTION, targetDepth)) {
                    context.nextToken();
                    result.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STARTUNIXTIME, targetDepth)) {
                    context.nextToken();
                    result.setStartUnixTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ENDUNIXTIME, targetDepth)) {
                    context.nextToken();
                    result.setEndUnixTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.FAILDETAIL, targetDepth)) {
                    context.nextToken();
                    result.setFailDetail(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.KS3FULLPATHMP4, targetDepth)) {
                    context.nextToken();
                    result.setKs3FullPathMP4(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.KS3FULLPATHM3U8, targetDepth)) {
                    context.nextToken();
                    result.setKs3FullPathM3U8(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RECID, targetDepth)) {
                    context.nextToken();
                    result.setRecID(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RECSTATUS, targetDepth)) {
                    context.nextToken();
                    result.setRecStatus(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RECTYPE, targetDepth)) {
                    context.nextToken();
                    result.setRecType(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.STREAM, targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class).unmarshall(context));
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
