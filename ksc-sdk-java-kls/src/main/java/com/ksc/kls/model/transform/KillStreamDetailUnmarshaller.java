package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.KillStreamCacheDetail;
import com.ksc.kls.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/19.
 */
public class KillStreamDetailUnmarshaller implements Unmarshaller<KillStreamCacheDetail, JsonUnmarshallerContext> {

    private static KillStreamDetailUnmarshaller instance;

    public synchronized static KillStreamDetailUnmarshaller getInstance() {
        if (instance == null) {
            instance = new KillStreamDetailUnmarshaller();
        }
        return instance;
    }

    @Override
    public KillStreamCacheDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        KillStreamCacheDetail detail = new KillStreamCacheDetail();
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
                    detail.setRetCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }else if (context.testExpression(ParamConstant.RETMSG, targetDepth)) {
                    context.nextToken();
                    detail.setRetMsg(context.getUnmarshaller(String.class).unmarshall(context));
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
