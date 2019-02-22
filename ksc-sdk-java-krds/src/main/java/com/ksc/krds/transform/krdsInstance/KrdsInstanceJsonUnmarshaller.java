package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsInstance.Instance;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class KrdsInstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {
    private static KrdsInstanceJsonUnmarshaller instance;

    public static KrdsInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KrdsInstanceJsonUnmarshaller();
        return instance;
    }

    @Override
    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();
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
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    instance.setDBInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("DBInstanceName", targetDepth)) {
                    context.nextToken();
                    instance.setDBInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("DBInstanceStatus", targetDepth)) {
                    context.nextToken();
                    instance.setDBInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("DBInstanceType", targetDepth)) {
                    context.nextToken();
                    instance.setDBInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("GroupId", targetDepth)) {
                    context.nextToken();
                    instance.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Vip", targetDepth)) {
                    context.nextToken();
                    instance.setVip(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    instance.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    instance.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    instance.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("MasterUserName", targetDepth)) {
                    context.nextToken();
                    instance.setMasterUserName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("BillType", targetDepth)) {
                    context.nextToken();
                    instance.setBillType(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("ProjectName", targetDepth)) {
                    context.nextToken();
                    instance.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    instance.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    instance.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("DBInstanceClass", targetDepth)) {
                    context.nextToken();
                    instance.setDBInstanceClass(DBInstanceClassJsonUnmarshaller.getInstance().unmarshall(context));
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
        return instance;
    }
}
