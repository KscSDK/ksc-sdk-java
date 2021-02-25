package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsInstance.Instance;
import com.ksc.krds.model.krdsInstance.ListKrdsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class ListKrdsResponseJsonUnmarshaller implements Unmarshaller<ListKrdsResponse, JsonUnmarshallerContext> {
    public ListKrdsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListKrdsResponse result = new ListKrdsResponse();
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
                if (context.testExpression("Instances", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setInstances(
                            new ListUnmarshaller<Instance>(KrdsInstanceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    result.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalCount", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxRecords", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setMaxRecords(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Marker", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setMarker(context.getUnmarshaller(Integer.class).unmarshall(context));
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

    private static ListKrdsResponseJsonUnmarshaller instance;


    public static ListKrdsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListKrdsResponseJsonUnmarshaller();
        return instance;
    }
}
