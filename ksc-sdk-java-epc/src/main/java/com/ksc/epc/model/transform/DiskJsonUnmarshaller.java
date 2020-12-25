package com.ksc.epc.model.transform;

import com.ksc.epc.model.Disk;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class DiskJsonUnmarshaller implements Unmarshaller<Disk, JsonUnmarshallerContext> {
    private static DiskJsonUnmarshaller instance;

    public static DiskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DiskJsonUnmarshaller();
        return instance;
    }

    @Override
    public Disk unmarshall(JsonUnmarshallerContext context) throws Exception {
        Disk Disk = new Disk();
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
                    if (context.testExpression("DiskType", targetDepth)) {
                        context.nextToken();
                            Disk.setDiskType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("SystemDiskSpace", targetDepth)) {
                        context.nextToken();
                            Disk.setSystemDiskSpace(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Raid", targetDepth)) {
                        context.nextToken();
                            Disk.setRaid(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DiskAttribute", targetDepth)) {
                        context.nextToken();
                            Disk.setDiskAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DiskCount", targetDepth)) {
                        context.nextToken();
                            Disk.setDiskCount(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Space", targetDepth)) {
                        context.nextToken();
                            Disk.setSpace(context.getUnmarshaller(String.class).unmarshall(context));
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
        return Disk;
    }
}
