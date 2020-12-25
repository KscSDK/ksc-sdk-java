package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ReturnEpcRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ReturnEpc.
 * </p>
 */
@Data
public class ReturnEpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ReturnEpcRequest> {

    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ReturnEpcRequest that = (ReturnEpcRequest) o;
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
    public Request<ReturnEpcRequest> getDryRunRequest() {
        Request<ReturnEpcRequest> request = new ReturnEpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ReturnEpcRequest clone() {
        return (ReturnEpcRequest) super.clone();
    }
}

