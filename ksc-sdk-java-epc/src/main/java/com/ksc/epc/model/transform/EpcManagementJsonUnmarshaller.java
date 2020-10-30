package com.ksc.epc.model.transform;

import com.ksc.epc.model.EpcManagement;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class EpcManagementJsonUnmarshaller implements Unmarshaller<EpcManagement, JsonUnmarshallerContext> {
    private static EpcManagementJsonUnmarshaller instance;

    public static EpcManagementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EpcManagementJsonUnmarshaller();
        return instance;
    }

    @Override
    public EpcManagement unmarshall(JsonUnmarshallerContext context) throws Exception {
        EpcManagement EpcManagement = new EpcManagement();
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
                    if (context.testExpression("EpcManagementId", targetDepth)) {
                        context.nextToken();
                            EpcManagement.setEpcManagementId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("EpcManagementIp", targetDepth)) {
                        context.nextToken();
                            EpcManagement.setEpcManagementIp(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("EpcManagementUserName", targetDepth)) {
                        context.nextToken();
                            EpcManagement.setEpcManagementUserName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Password", targetDepth)) {
                        context.nextToken();
                            EpcManagement.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostName", targetDepth)) {
                        context.nextToken();
                            EpcManagement.setHostName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Sn", targetDepth)) {
                        context.nextToken();
                            EpcManagement.setSn(context.getUnmarshaller(String.class).unmarshall(context));
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
        return EpcManagement;
    }
}
