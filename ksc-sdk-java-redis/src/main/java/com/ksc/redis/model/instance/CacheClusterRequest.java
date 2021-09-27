package com.ksc.redis.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.instance.LockCacheClusterMarshaller;
import com.ksc.redis.transform.instance.OpenDirectAccessToClusterMarshaller;

import java.io.Serializable;

/***
 * @ClassName: CacheClusterRequest
 * @Description:TODO 缓存服务锁定/解锁
 * @version : V1.0
 */
public class CacheClusterRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CacheClusterRequest> {
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

    private String CacheId;
    private String AvailableZone;

    @Override
    public Request<CacheClusterRequest> getDryRunRequest() throws Exception {
        Request<CacheClusterRequest> request = new LockCacheClusterMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
