package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.SetTimingSnapshotMarshaller;

import java.io.Serializable;

public class SetTimingSnapshotRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<SetTimingSnapshotRequest> {
    private String cacheId;
    private String timingSwitch;
    private String timezone;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getTimingSwitch() {
        return timingSwitch;
    }

    public void setTimingSwitch(String timingSwitch) {
        this.timingSwitch = timingSwitch;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public Request<SetTimingSnapshotRequest> getDryRunRequest() {
        Request<SetTimingSnapshotRequest> request = new SetTimingSnapshotMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
