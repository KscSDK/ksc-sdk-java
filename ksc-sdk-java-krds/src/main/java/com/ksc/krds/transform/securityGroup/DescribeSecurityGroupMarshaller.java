package com.ksc.krds.transform.securityGroup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupRequest;
import com.ksc.transform.Marshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DescribeSecurityGroupMarshaller implements Marshaller<Request<DescribeSecurityGroupRequest>, DescribeSecurityGroupRequest> {

    public  Request<DescribeSecurityGroupRequest> marshall(DescribeSecurityGroupRequest describeSecurityGroupRequest){
        if (describeSecurityGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeSecurityGroupRequest> request = new DefaultRequest<DescribeSecurityGroupRequest>(describeSecurityGroupRequest, "krds");
        request.addParameter("Action", "DescribeSecurityGroup");
        String version = describeSecurityGroupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        for (Field field: describeSecurityGroupRequest.getClass().getDeclaredFields()){
            try {
                String firstLetter = field.getName().substring(0, 1).toUpperCase();
                String getter = "get" + firstLetter + field.getName().substring(1);
                Method getMethod = describeSecurityGroupRequest.getClass().getMethod(getter);
                Object value = getMethod.invoke(describeSecurityGroupRequest);
                if (value !=null) {
                    request.addParameter(field.getName(), value.toString());
                }
            }catch (Exception e){

            }
        }
        return request;
    }

}
