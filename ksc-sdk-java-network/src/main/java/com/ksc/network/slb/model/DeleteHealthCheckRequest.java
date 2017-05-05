package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteHealthCheckRequestMarshaller;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/24.
 */
public class DeleteHealthCheckRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteHealthCheckRequest> {

    /**
     * 健康检查的ID
     */
    private String HealthCheckId;

    public String getHealthCheckId() {
        return HealthCheckId;
    }

    public void setHealthCheckId(String healthCheckId) {
        HealthCheckId = healthCheckId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteHealthCheckRequest that = (DeleteHealthCheckRequest) o;

        return HealthCheckId != null ? HealthCheckId.equals(that.HealthCheckId) : that.HealthCheckId == null;
    }

    @Override
    public int hashCode() {
        return HealthCheckId != null ? HealthCheckId.hashCode() : 0;
    }

    @Override
    public DeleteHealthCheckRequest clone() {
        return (DeleteHealthCheckRequest) super.clone();
    }

    @Override
    public Request<DeleteHealthCheckRequest> getDryRunRequest() {
        Request<DeleteHealthCheckRequest> request = new DeleteHealthCheckRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
