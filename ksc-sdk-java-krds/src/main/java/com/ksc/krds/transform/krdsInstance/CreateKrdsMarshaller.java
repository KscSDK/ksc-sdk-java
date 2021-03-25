package com.ksc.krds.transform.krdsInstance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.CreateKrdsRequest;
import com.ksc.transform.Marshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CreateKrdsMarshaller implements Marshaller<Request<CreateKrdsRequest>, CreateKrdsRequest> {

    public  Request<CreateKrdsRequest> marshall(CreateKrdsRequest createKrdsRequest){
        if (createKrdsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<CreateKrdsRequest> request = new DefaultRequest<CreateKrdsRequest>(createKrdsRequest, "krds");
        request.addParameter("Action", "CreateDBInstance");
        String version = createKrdsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        request.addHeader("x-ksc-request-id", createKrdsRequest.getRequestId());

        for (Field field: createKrdsRequest.getClass().getDeclaredFields()){
            try {
                String firstLetter = field.getName().substring(0, 1).toUpperCase();
                String getter = "get" + firstLetter + field.getName().substring(1);
                Method getMethod = createKrdsRequest.getClass().getMethod(getter);
                Object value = getMethod.invoke(createKrdsRequest);
                if (value !=null) {
                    request.addParameter(field.getName(), value.toString());
                }
            }catch (Exception e){

            }
        }
        return request;
    }

}
