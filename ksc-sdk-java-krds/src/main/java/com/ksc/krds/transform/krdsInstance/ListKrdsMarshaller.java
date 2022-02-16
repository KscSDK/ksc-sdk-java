package com.ksc.krds.transform.krdsInstance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.ListKrdsRequest;
import com.ksc.krds.transform.ActionEnum;
import com.ksc.transform.Marshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ListKrdsMarshaller implements Marshaller<Request<ListKrdsRequest>, ListKrdsRequest> {

    public  Request<ListKrdsRequest> marshall(ListKrdsRequest listKrdsRequest){
        if (listKrdsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ListKrdsRequest> request = new DefaultRequest<ListKrdsRequest>(listKrdsRequest, "krds");
        request.addParameter("Action", ActionEnum.DESCRIBE.val());
        String version = listKrdsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);

        for (Field field: listKrdsRequest.getClass().getDeclaredFields()){
            try {
                String firstLetter = field.getName().substring(0, 1).toUpperCase();
                String getter = "get" + firstLetter + field.getName().substring(1);
                Method getMethod = listKrdsRequest.getClass().getMethod(getter);
                Object value = getMethod.invoke(listKrdsRequest);
                if (value !=null) {
                    request.addParameter(field.getName(), value.toString());
                }
            }catch (Exception e){

            }
        }

        request.addParameter("Marker", listKrdsRequest.getMarker().toString());
        request.addParameter("MaxRecords", listKrdsRequest.getMaxRecords().toString());

        //request.addParameter("DBInstanceIdentifier", "92171662-b2de-46b4-9047-641e53aafc5d");
        request.setHttpMethod(HttpMethodName.GET);
        request.addHeader("x-ksc-request-id", listKrdsRequest.getRequestId());
        return request;
    }

}
