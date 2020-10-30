package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ReinstallCustomerEpcRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ReinstallCustomerEpc.
 * </p>
 */
@Data
public class ReinstallCustomerEpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ReinstallCustomerEpcRequest> {

    /**
     * 实例ID
     */
    private String hostId;
    /**
     * PXE server的IP
     */
    private String serverIp;
    /**
     * PXE server的路径
     */
    private String path;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ReinstallCustomerEpcRequest that = (ReinstallCustomerEpcRequest) o;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        if (serverIp != null ? !serverIp.equals(that.serverIp) : that.serverIp != null)
            return false;
        if (path != null ? !path.equals(that.path) : that.path != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        result = 31 * result + (serverIp != null ? serverIp.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ReinstallCustomerEpcRequest> getDryRunRequest() {
        Request<ReinstallCustomerEpcRequest> request = new ReinstallCustomerEpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ReinstallCustomerEpcRequest clone() {
        return (ReinstallCustomerEpcRequest) super.clone();
    }
}

