package com.ksc.krds.transform.securityGroup;

import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupResponse;
import com.ksc.krds.transform.BaseUnmarshaller;
import com.ksc.krds.transform.BaseData;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class SecurityGroupUnmarshaller<R extends KrdsResponse> extends BaseUnmarshaller<R> {

    @Override
    protected void doInvokeMethod(JsonUnmarshallerContext context, Method method, Field field, BaseData data)
            throws Exception {
        if (field.getType().getName().equals("java.util.List")) {
            context.nextToken();
            List<DescribeSecurityGroupResponse.SecurityGroup> list
                    = new ListUnmarshaller<DescribeSecurityGroupResponse.SecurityGroup>(SecurityGroupJsonUnmarshaller
                    .getInstance()).unmarshall(context);
            method.invoke(data, list);
        }
    }

}
