package com.ksc.epc.model.transform;

import com.ksc.epc.model.ResourceRequirement;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class ResourceRequirementJsonUnmarshaller implements Unmarshaller<ResourceRequirement, JsonUnmarshallerContext> {
    private static ResourceRequirementJsonUnmarshaller instance;

    public static ResourceRequirementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceRequirementJsonUnmarshaller();
        return instance;
    }

    @Override
    public ResourceRequirement unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceRequirement ResourceRequirement = new ResourceRequirement();
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
                    if (context.testExpression("ResourceRequirementId", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setResourceRequirementId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostType", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setHostType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Region", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AvailabilityZone", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("RequirementCount", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setRequirementCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("ReserveCount", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setReserveCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("ProjectName", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("UsageDate", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setUsageDate(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Description", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Progress", targetDepth)) {
                        context.nextToken();
                            ResourceRequirement.setProgress(context.getUnmarshaller(String.class).unmarshall(context));
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
        return ResourceRequirement;
    }
}
