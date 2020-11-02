package com.ksc.krds.transform.krdsBackup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupRequest;
import com.ksc.transform.Marshaller;

public class ListKrdsBackupMarshaller implements Marshaller<Request<ListKrdsBackupRequest>, ListKrdsBackupRequest> {

    public  Request<ListKrdsBackupRequest> marshall(ListKrdsBackupRequest listKrdsBackupRequest){
        if (listKrdsBackupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ListKrdsBackupRequest> request = new DefaultRequest<ListKrdsBackupRequest>(listKrdsBackupRequest, "krds");
        request.addParameter("Action", "DescribeDBBackups");
        String version = listKrdsBackupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.addParameter("DBInstanceIdentifier", listKrdsBackupRequest.getDBInatanceIdentifier());
        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }

}
