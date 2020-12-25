package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.AttachKeyRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by pengtong on 2020/9/30 15:06.
 */
public class AttachKeyRequestMarshaller implements
        Marshaller<Request<AttachKeyRequest>, AttachKeyRequest> {

    @Override
    public Request<AttachKeyRequest> marshall(AttachKeyRequest attachKeyRequest) {

        if (attachKeyRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AttachKeyRequest> request = new DefaultRequest<AttachKeyRequest>(
                attachKeyRequest, "kec");
        request.addParameter("Action", "AttachKey");
        String version = attachKeyRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (attachKeyRequest.getInstanceIds() != null && attachKeyRequest.getInstanceIds().size() > 0) {
            for (int i = 0; i < attachKeyRequest.getKeyIds().size(); i++) {
                request.addParameter("InstanceId." + (i + 1),
                        StringUtils.fromString(attachKeyRequest.getInstanceIds().get(i)));
            }
        }

        if (attachKeyRequest.getKeyIds() != null && attachKeyRequest.getKeyIds().size() > 0) {
            for (int i = 0; i < attachKeyRequest.getKeyIds().size(); i++) {
                request.addParameter("KeyId." + (i + 1),
                        StringUtils.fromString(attachKeyRequest.getKeyIds().get(i)));
            }
        }

        return request;
    }
}
