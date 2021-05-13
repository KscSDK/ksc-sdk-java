package com.ksc.krds.transform.krdsBackup;

import com.ksc.krds.model.krdsBackup.CreateDBBackupResponse;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupResponse;
import com.ksc.krds.transform.BaseData;
import com.ksc.krds.transform.BaseUnmarshaller;
import com.ksc.transform.JsonUnmarshallerContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CreateDBBackupUnmarshaller extends BaseUnmarshaller<CreateDBBackupResponse> {

    @Override
    protected void init() {
        setResult(new CreateDBBackupResponse());
    }

    @Override
    protected void doInvokeMethod(JsonUnmarshallerContext context, Method method, Field field, BaseData data) throws Exception {
        context.nextToken();
        ListKrdsBackupResponse.DBBackup instance = (ListKrdsBackupResponse.DBBackup) getUnmarshaller(field).unmarshall(context);
        method.invoke(data, instance);
    }

    public boolean isExpression(JsonUnmarshallerContext context, int targetDepth, Field field) {
        return context.testExpression(field.getName(), targetDepth);
    }
}
