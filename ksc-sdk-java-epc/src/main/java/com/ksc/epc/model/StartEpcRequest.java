package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.StartEpcRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for StartEpc.
 * </p>
 */
@Data
public class StartEpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<StartEpcRequest> {

    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        StartEpcRequest that = (StartEpcRequest) o;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<StartEpcRequest> getDryRunRequest() {
        Request<StartEpcRequest> request = new StartEpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public StartEpcRequest clone() {
        return (StartEpcRequest) super.clone();
    }
}

