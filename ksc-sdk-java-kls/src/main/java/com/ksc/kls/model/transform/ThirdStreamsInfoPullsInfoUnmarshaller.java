package com.ksc.kls.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kls.model.ParamConstant;
import com.ksc.kls.model.ThirdStreamsInfoPullsInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import static com.fasterxml.jackson.core.JsonToken.*;

public class ThirdStreamsInfoPullsInfoUnmarshaller implements Unmarshaller<ThirdStreamsInfoPullsInfo, JsonUnmarshallerContext> {

    private static ThirdStreamsInfoPullsInfoUnmarshaller instance;

    public static ThirdStreamsInfoPullsInfoUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThirdStreamsInfoPullsInfoUnmarshaller();
        return instance;
    }

    @Override
    public ThirdStreamsInfoPullsInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ThirdStreamsInfoPullsInfo result = new ThirdStreamsInfoPullsInfo();
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
                if (context.testExpression(ParamConstant.STREAM, targetDepth)) {
                    context.nextToken();
                    result.setStream(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.BW, targetDepth)) {
                    context.nextToken();
                    result.setBw(context.getUnmarshaller(Long.class).unmarshall(context));
                } else if (context.testExpression(ParamConstant.ONLINE_USER, targetDepth)) {
                    context.nextToken();
                    result.setOnlineUser(context.getUnmarshaller(Long.class).unmarshall(context));
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
