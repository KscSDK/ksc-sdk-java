package com.ksc.redis.model.cache;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.cache.DescribeHotKeysMarshaller;

import java.io.Serializable;

/***
 * @ClassName: DescribeHotKeysRequest
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeHotKeysRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeHotKeysRequest> {
    private String AvailableZone;
    private String CacheId;
    private Integer Limit = 10;
    private Integer Offset = 0;
    private String SortKey;
    private String SortDir;

    public String getAvailableZone() {
        return AvailableZone;
    }

    public void setAvailableZone(String availableZone) {
        AvailableZone = availableZone;
    }

    public String getCacheId() {
        return CacheId;
    }

    public void setCacheId(String cacheId) {
        CacheId = cacheId;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setLimit(Integer limit) {
        Limit = limit;
    }

    public Integer getOffset() {
        return Offset;
    }

    public void setOffset(Integer offset) {
        Offset = offset;
    }

    public String getSortKey() {
        return SortKey;
    }

    public void setSortKey(String sortKey) {
        SortKey = sortKey;
    }

    public String getSortDir() {
        return SortDir;
    }

    public void setSortDir(String sortDir) {
        SortDir = sortDir;
    }

    @Override
    public Request<DescribeHotKeysRequest> getDryRunRequest() throws Exception {
        Request<DescribeHotKeysRequest> request = new DescribeHotKeysMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
