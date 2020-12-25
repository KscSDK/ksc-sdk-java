package com.ksc.epc.model.transform;

import com.ksc.epc.model.Image;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class ImageJsonUnmarshaller implements Unmarshaller<Image, JsonUnmarshallerContext> {
    private static ImageJsonUnmarshaller instance;

    public static ImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonUnmarshaller();
        return instance;
    }

    @Override
    public Image unmarshall(JsonUnmarshallerContext context) throws Exception {
        Image Image = new Image();
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
                    if (context.testExpression("ImageId", targetDepth)) {
                        context.nextToken();
                            Image.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ImageName", targetDepth)) {
                        context.nextToken();
                            Image.setImageName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ImageType", targetDepth)) {
                        context.nextToken();
                            Image.setImageType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("OsName", targetDepth)) {
                        context.nextToken();
                            Image.setOsName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("OsType", targetDepth)) {
                        context.nextToken();
                            Image.setOsType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("EnableContainer", targetDepth)) {
                        context.nextToken();
                            Image.setEnableContainer(context.getUnmarshaller(Boolean.class).unmarshall(context));
                    }
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            Image.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
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
        return Image;
    }
}
