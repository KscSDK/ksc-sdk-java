package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.StopStreamRecordDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/3.
 */
public class StopStreamRecordDetailUnmarshaller implements Unmarshaller<StopStreamRecordDetail,JsonUnmarshallerContext> {
    private static StopStreamRecordDetailUnmarshaller instance;

    public static StopStreamRecordDetailUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopStreamRecordDetailUnmarshaller();
        return instance;
    }

    @Override
    public StopStreamRecordDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopStreamRecordDetail result = new StopStreamRecordDetail();
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
                } else if (context.testExpression(ParamConstant.KS3FULLPATHMP4, targetDepth)) {
                    context.nextToken();
                    result.setKs3FullPathMP4(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.KS3FULLPATHM3U8, targetDepth)) {
                    context.nextToken();
                    result.setKs3FullPathM3U8(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETMSG, targetDepth)) {
                    context.nextToken();
                    result.setRetMsg(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETCODE, targetDepth)) {
                    context.nextToken();
                    result.setRetcode(context.getUnmarshaller(Integer.class).unmarshall(context));
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
