package com.ksc.krds.transform.krdsInstance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.DeleteKrdsRequest;
import com.ksc.transform.Marshaller;

public class DeleteKrdsMarshaller implements Marshaller<Request<DeleteKrdsRequest>, DeleteKrdsRequest> {

    public  Request<DeleteKrdsRequest> marshall(DeleteKrdsRequest deleteKrdsRequest){
        if (deleteKrdsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DeleteKrdsRequest> request = new DefaultRequest<DeleteKrdsRequest>(deleteKrdsRequest, "krds");
        request.addParameter("Action", "DeleteDBInstance");
        String version = deleteKrdsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        request.addHeader("x-ksc-request-id", "wwstestCreate123456");

        request.addParameter("DBInstanceIdentifier", deleteKrdsRequest.getDBInstanceIdentifier());
        return request;
    }

}
