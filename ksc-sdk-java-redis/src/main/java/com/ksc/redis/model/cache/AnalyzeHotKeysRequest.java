package com.ksc.redis.model.cache;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.model.backup.ExportSnapshotRequest;
import com.ksc.redis.transform.backup.ExportSnapshotMarshaller;
import com.ksc.redis.transform.cache.AnalyzeHotKeysMarshaller;
import lombok.SneakyThrows;

import java.io.Serializable;

/***
 * @ClassName: AnalyzeHotKeysRequest
 * @Description:TODO
 * @version : V1.0
 */
public class AnalyzeHotKeysRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AnalyzeHotKeysRequest> {
    private String AvailableZone;
    private String CacheId;
    private String Engine;
    private String Mode;

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

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }


    @Override
    public Request<AnalyzeHotKeysRequest> getDryRunRequest() throws Exception {
        Request<AnalyzeHotKeysRequest> request = new AnalyzeHotKeysMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
