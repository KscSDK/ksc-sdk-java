package com.ksc.krds.transform.krdsInstance;

import com.google.gson.Gson;
import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.ModifyDBNetworkRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;

public class ModifyDBNetworkMarshaller implements Marshaller<Request<ModifyDBNetworkRequest>, ModifyDBNetworkRequest>{

    public  Request<ModifyDBNetworkRequest> marshall(ModifyDBNetworkRequest listKrdsBackupRequest){
        if (listKrdsBackupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ModifyDBNetworkRequest> request = new DefaultRequest<ModifyDBNetworkRequest>(listKrdsBackupRequest, "krds");
        request.addParameter("Action", "ModifyDBNetwork");
        String version = listKrdsBackupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.addHeader("Accept", "application/json");

        byte[] content = new Gson().toJson(listKrdsBackupRequest).getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }

}
