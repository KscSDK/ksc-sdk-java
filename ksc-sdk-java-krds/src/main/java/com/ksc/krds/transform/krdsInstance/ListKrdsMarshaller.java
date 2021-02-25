package com.ksc.krds.transform.krdsInstance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.ListKrdsRequest;
import com.ksc.transform.Marshaller;


public class ListKrdsMarshaller implements Marshaller<Request<ListKrdsRequest>, ListKrdsRequest> {

    public  Request<ListKrdsRequest> marshall(ListKrdsRequest listKrdsRequest){
        if (listKrdsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ListKrdsRequest> request = new DefaultRequest<ListKrdsRequest>(listKrdsRequest, "krds");
        request.addParameter("Action", "DescribeDBInstances");
        String version = listKrdsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.addParameter("Marker", listKrdsRequest.getMarker().toString());
        request.addParameter("MaxRecords", listKrdsRequest.getMaxRecords().toString());
        //request.addParameter("DBInstanceIdentifier", "92171662-b2de-46b4-9047-641e53aafc5d");
        request.setHttpMethod(HttpMethodName.GET);
        request.addHeader("x-ksc-request-id", "RequestId123");
        return request;
    }

}
