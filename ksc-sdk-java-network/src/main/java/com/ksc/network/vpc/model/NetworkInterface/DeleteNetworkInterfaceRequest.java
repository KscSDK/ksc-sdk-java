package com.ksc.network.vpc.model.NetworkInterface;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkInterface.DeleteNetworkInterfaceRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteNetworkInterface.
 * </p>
 */
@Data
public class DeleteNetworkInterfaceRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteNetworkInterfaceRequest> {

    /**
     * 弹性网卡ID
     */
    private String networkInterfaceId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteNetworkInterfaceRequest that = (DeleteNetworkInterfaceRequest) o;
        if (networkInterfaceId != null ? !networkInterfaceId.equals(that.networkInterfaceId) : that.networkInterfaceId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (networkInterfaceId != null ? networkInterfaceId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteNetworkInterfaceRequest> getDryRunRequest() {
        Request<DeleteNetworkInterfaceRequest> request = new DeleteNetworkInterfaceRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteNetworkInterfaceRequest clone() {
        return (DeleteNetworkInterfaceRequest) super.clone();
    }
}

