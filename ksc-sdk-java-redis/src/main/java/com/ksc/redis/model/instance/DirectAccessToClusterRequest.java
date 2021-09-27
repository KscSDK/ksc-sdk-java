package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.CreateReadOnlyRedisMarshaller;
import com.ksc.redis.transform.instance.OpenDirectAccessToClusterMarshaller;

import java.io.Serializable;

/***
 * @ClassName: DirectAccessToClusterRequest
 * @Description:TODO 缓存服务直连 开启/关闭
 * @version : V1.0
 */
public class DirectAccessToClusterRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DirectAccessToClusterRequest> {
    private String CacheId;
    private String AvailableZone;

    public String getCacheId() {
        return CacheId;
    }

    public void setCacheId(String cacheId) {
        CacheId = cacheId;
    }

    public String getAvailableZone() {
        return AvailableZone;
    }

    public void setAvailableZone(String availableZone) {
        AvailableZone = availableZone;
    }

    @Override
    public Request<DirectAccessToClusterRequest> getDryRunRequest() throws Exception {
        Request<DirectAccessToClusterRequest> request = new OpenDirectAccessToClusterMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
