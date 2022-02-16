package com.ksc.krds.transform.krdsInstance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.OverrideDBInstanceByPointInTimeRequest;
import com.ksc.krds.transform.ActionEnum;
import com.ksc.transform.Marshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class OverrideDBInstanceByPointInTimeMarshaller implements Marshaller<Request<OverrideDBInstanceByPointInTimeRequest>, OverrideDBInstanceByPointInTimeRequest> {

    public  Request<OverrideDBInstanceByPointInTimeRequest> marshall(OverrideDBInstanceByPointInTimeRequest baseRequest){
        if (baseRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<OverrideDBInstanceByPointInTimeRequest> request = new DefaultRequest<OverrideDBInstanceByPointInTimeRequest>(baseRequest, "krds");
        request.addParameter("Action", ActionEnum.OVERRIDE_POINT_IN_TIME.val());
        String version = baseRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);

        for (Field field: baseRequest.getClass().getDeclaredFields()){
            try {
                String firstLetter = field.getName().substring(0, 1).toUpperCase();
                String getter = "get" + firstLetter + field.getName().substring(1);
                Method getMethod = baseRequest.getClass().getMethod(getter);
                Object value = getMethod.invoke(baseRequest);
                if (value !=null) {
                    request.addParameter(field.getName(), value.toString());
                }
            }catch (Exception e){

            }
        }
        request.setHttpMethod(HttpMethodName.GET);
        request.addHeader("x-ksc-request-id", baseRequest.getRequestId());
        return request;
    }
}
