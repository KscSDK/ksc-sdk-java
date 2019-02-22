package com.ksc.krds.transform.krdsBackup;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class KrdsBackupJsonUnmarshaller implements Unmarshaller<ListKrdsBackupResponse.DBBackup, JsonUnmarshallerContext> {
    public ListKrdsBackupResponse.DBBackup unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListKrdsBackupResponse.DBBackup result = (new ListKrdsBackupResponse()).new DBBackup();
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
                if (context.testExpression("DBBackupIdentifier", targetDepth)) {
                    context.nextToken();
                    result.setDBBackupIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("DBBackupName", targetDepth)) {
                    context.nextToken();
                    result.setDBBackupName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("BackupCreateTime", targetDepth)) {
                    context.nextToken();
                    result.setBackupCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("BackupUpdatedTime", targetDepth)) {
                    context.nextToken();
                    result.setBackupUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    result.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("BackupSize", targetDepth)) {
                    context.nextToken();
                    result.setBackupSize(context.getUnmarshaller(Double.class).unmarshall(context));
                } else if (context.testExpression("RemotePath", targetDepth)) {
                    context.nextToken();
                    result.setRemotePath(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("BackupMode", targetDepth)) {
                    context.nextToken();
                    result.setBackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("BackupType", targetDepth)) {
                    context.nextToken();
                    result.setBackupType(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("ParentId", targetDepth)) {
                    context.nextToken();
                    result.setParentId(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    result.setDBInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    result.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    result.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
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

    private static KrdsBackupJsonUnmarshaller instance;


    public static KrdsBackupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KrdsBackupJsonUnmarshaller();
        return instance;
    }
}
