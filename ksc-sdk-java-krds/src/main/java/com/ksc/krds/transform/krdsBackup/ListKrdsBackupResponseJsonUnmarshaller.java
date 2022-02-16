package com.ksc.krds.transform.krdsBackup;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupResponse;
import com.ksc.krds.transform.krdsInstance.ListKrdsResponseJsonUnmarshaller;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class ListKrdsBackupResponseJsonUnmarshaller implements Unmarshaller<ListKrdsBackupResponse, JsonUnmarshallerContext> {
    public ListKrdsBackupResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListKrdsBackupResponse result = new ListKrdsBackupResponse();
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
                if (context.testExpression("DBBackup", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setDBBackup(
                            new ListUnmarshaller<ListKrdsBackupResponse.DBBackup>(KrdsBackupJsonUnmarshaller.getInstance()).unmarshall(context));
                } else if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    result.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }else  if (context.testExpression("MaxRecords", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setMaxRecords(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                else if (context.testExpression("TotalCount", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
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
