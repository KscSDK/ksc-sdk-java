package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsInstance.Instance;
import com.ksc.krds.model.krdsInstance.ModifyInstanceResp;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

public class ModifyInstanceRespJsonUnmarshaller implements Unmarshaller<ModifyInstanceResp, JsonUnmarshallerContext> {
    @Override
    public ModifyInstanceResp unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModifyInstanceResp result = new ModifyInstanceResp();
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == VALUE_NULL){
            return null;
        }

        if (token == null){
            token = context.nextToken();
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Instances", targetDepth+1)) {
                    context.nextToken();
                    result.getData()
                            .setInstances(new ListUnmarshaller<Instance>(KrdsInstanceJsonUnmarshaller
                                    .getInstance()).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    result.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
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
