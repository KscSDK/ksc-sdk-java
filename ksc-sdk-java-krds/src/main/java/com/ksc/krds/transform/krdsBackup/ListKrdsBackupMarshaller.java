package com.ksc.krds.transform.krdsBackup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupRequest;
import com.ksc.transform.Marshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

        for (Field field : listKrdsBackupRequest.getClass().getDeclaredFields()) {
            try {
                String getter = "get" + upperCaseFirstLetter(field.getName());
                Method getMethod = listKrdsBackupRequest.getClass().getMethod(getter);
                Object value = getMethod.invoke(listKrdsBackupRequest);
                if (value != null) {
                    request.addParameter(field.getName(), value.toString());
                }
            } catch (Exception e) {
//                log.warn(e);
            }
        }

        request.addParameter("Version", version);
        request.addParameter("DBInstanceIdentifier", listKrdsBackupRequest.getDBInatanceIdentifier());
        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }

    private String upperCaseFirstLetter(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
}
