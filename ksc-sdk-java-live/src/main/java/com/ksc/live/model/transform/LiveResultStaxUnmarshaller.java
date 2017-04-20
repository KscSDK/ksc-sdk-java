package com.ksc.live.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.live.model.Detail;
import com.ksc.live.model.LiveResult;
import com.ksc.live.model.ParamConstant;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAddressesResult StAX Unmarshaller
 */
public class LiveResultStaxUnmarshaller extends BaseJsonUnmarshaller<LiveResult, JsonUnmarshallerContext> {

    private static LiveResultStaxUnmarshaller instance;

    public static LiveResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LiveResultStaxUnmarshaller();
        return instance;
    }



    @Override
    public LiveResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        LiveResult result = new LiveResult();
        this.handleSuccess(result, context);

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
                if (context.testExpression(ParamConstant.COUNT, targetDepth)) {
                    context.nextToken();
                    result.setCount(context.getUnmarshaller(Integer.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.TOTAL, targetDepth)) {
                    context.nextToken();
                    result.setTotal(context.getUnmarshaller(Integer.class)
                            .unmarshall(context));
                } else if (context.testExpression(ParamConstant.RESULT, targetDepth)) {
                    context.nextToken();
                    result.setResult(new ListUnmarshaller<Detail>(DetailUnmarshaller.getInstance()).unmarshall(context));
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
        return result;
    }

    @Override
    public LiveResult handleException(Exception e) {
        LiveResult result = new LiveResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
