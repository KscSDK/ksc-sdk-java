package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ListStreamDurations;
import com.ksc.kls.model.ListStreamDurationsResult;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.StreamDurationsDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.StringUtils;

import java.util.List;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Created by yangfan on 2017/5/4.
 */
public class ListStreamDurationsDataUnmarshaller implements Unmarshaller<ListStreamDurationsResult, JsonUnmarshallerContext> {

    private static ListStreamDurationsDataUnmarshaller instance;

    public synchronized static ListStreamDurationsDataUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListStreamDurationsDataUnmarshaller();
        }
        return instance;
    }

    @Override
    public ListStreamDurationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListStreamDurations result = new ListStreamDurations();
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
                    result.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                }else if (context.testExpression(ParamConstant.COUNT, targetDepth)) {
                    context.nextToken();
                    result.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.PUBDOMAIN, targetDepth)) {
                    context.nextToken();
                    result.setPubdomain(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETCODE, targetDepth)) {
                    context.nextToken();
                    result.setRetCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RETMSG, targetDepth)) {
                    context.nextToken();
                    result.setRetMsg(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.UNIQUE_NAME, targetDepth)) {
                    context.nextToken();
                    result.setUniqueName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.RESULT, targetDepth)) {
                    context.nextToken();
                    result.setResult(new ListUnmarshaller<StreamDurationsDetail>(StreamDurationsDetailUnmarshaller.getInstance()).unmarshall(context));
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
