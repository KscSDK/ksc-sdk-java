package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.AttachKeyRequest;
import com.ksc.kec.model.DetachKeyRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by pengtong on 2020/9/30 15:06.
 */
public class DetachKeyRequestMarshaller implements
        Marshaller<Request<DetachKeyRequest>, DetachKeyRequest> {

    @Override
    public Request<DetachKeyRequest> marshall(DetachKeyRequest detachKeyRequest) {

        if (detachKeyRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DetachKeyRequest> request = new DefaultRequest<DetachKeyRequest>(
                detachKeyRequest, "kec");
        request.addParameter("Action", "DetachKey");
        String version = detachKeyRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (detachKeyRequest.getInstanceIds() != null && detachKeyRequest.getInstanceIds().size() > 0) {
            for (int i = 0; i < detachKeyRequest.getKeyIds().size(); i++) {
                request.addParameter("InstanceId." + (i + 1),
                        StringUtils.fromString(detachKeyRequest.getInstanceIds().get(i)));
            }
        }

        if (detachKeyRequest.getKeyIds() != null && detachKeyRequest.getKeyIds().size() > 0) {
            for (int i = 0; i < detachKeyRequest.getKeyIds().size(); i++) {
                request.addParameter("KeyId." + (i + 1),
                        StringUtils.fromString(detachKeyRequest.getKeyIds().get(i)));
            }
        }

        return request;
    }
}
