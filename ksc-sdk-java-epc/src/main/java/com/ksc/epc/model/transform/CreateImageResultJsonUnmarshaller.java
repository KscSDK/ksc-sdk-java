package com.ksc.epc.model.transform;

import com.ksc.epc.model.CreateImageResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

/**
 * CreateImageResult Json Unmarshaller
 */
public class CreateImageResultJsonUnmarshaller implements Unmarshaller<CreateImageResult, JsonUnmarshallerContext> {
    @Override
    public CreateImageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateImageResult createImageResult = new CreateImageResult();
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
                    if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                            createImageResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Image", targetDepth)) {
                    context.nextToken();
                        createImageResult.setImage(ImageJsonUnmarshaller.getInstance().unmarshall(context));
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
        return createImageResult;
    }

    private static CreateImageResultJsonUnmarshaller instance;

    public static CreateImageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateImageResultJsonUnmarshaller();
        return instance;
    }
}
