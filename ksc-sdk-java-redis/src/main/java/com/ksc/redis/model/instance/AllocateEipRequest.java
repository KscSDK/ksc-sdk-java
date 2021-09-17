package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.AllocateEipMarshaller;

import java.io.Serializable;

/***
 * @ClassName: AllocateEipResponse
 * @Description:TODO
 * @version : V1.0
 */
public class AllocateEipRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AllocateEipRequest> {
    private String CacheId;
    private String InsType;

    public String getCacheId() {
        return CacheId;
    }

    public void setCacheId(String cacheId) {
        CacheId = cacheId;
    }

    public String getInsType() {
        return InsType;
    }

    public void setInsType(String insType) {
        InsType = insType;
    }

    @Override
    public Request<AllocateEipRequest> getDryRunRequest() {
        Request<AllocateEipRequest> request = new AllocateEipMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));

        return request;
    }
}
