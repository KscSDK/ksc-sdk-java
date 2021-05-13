package com.ksc.krds.transform.krdsBackup;

import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.transform.BaseData;
import com.ksc.krds.transform.BaseUnmarshaller;
import com.ksc.transform.JsonUnmarshallerContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BackupUnmarshaller extends BaseUnmarshaller<KrdsResponse> {

    @Override
    protected void init() {

    }

    @Override
    protected void doInvokeMethod(JsonUnmarshallerContext context, Method method, Field field, BaseData data) throws Exception {

    }
}
