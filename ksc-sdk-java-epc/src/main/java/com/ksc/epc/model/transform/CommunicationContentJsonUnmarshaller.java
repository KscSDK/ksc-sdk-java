package com.ksc.epc.model.transform;

import com.ksc.epc.model.CommunicationContent;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class CommunicationContentJsonUnmarshaller implements Unmarshaller<CommunicationContent, JsonUnmarshallerContext> {
    private static CommunicationContentJsonUnmarshaller instance;

    public static CommunicationContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommunicationContentJsonUnmarshaller();
        return instance;
    }

    @Override
    public CommunicationContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        CommunicationContent CommunicationContent = new CommunicationContent();
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
                    if (context.testExpression("Remarks", targetDepth)) {
                        context.nextToken();
                            CommunicationContent.setRemarks(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Author", targetDepth)) {
                        context.nextToken();
                            CommunicationContent.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            CommunicationContent.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
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
        return CommunicationContent;
    }
}
