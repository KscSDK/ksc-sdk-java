package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyDnsRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyDns.
 * </p>
 */
@Data
public class ModifyDnsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyDnsRequest> {

    /**
     * 网卡ID
     */
    private String networkInterfaceId;
    /**
     * DNS1
     */
    private String dNS1;
    /**
     * DNS2
     */
    private String dNS2;
    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyDnsRequest that = (ModifyDnsRequest) o;
        if (networkInterfaceId != null ? !networkInterfaceId.equals(that.networkInterfaceId) : that.networkInterfaceId != null)
            return false;
        if (dNS1 != null ? !dNS1.equals(that.dNS1) : that.dNS1 != null)
            return false;
        if (dNS2 != null ? !dNS2.equals(that.dNS2) : that.dNS2 != null)
            return false;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (networkInterfaceId != null ? networkInterfaceId.hashCode() : 0);
        result = 31 * result + (dNS1 != null ? dNS1.hashCode() : 0);
        result = 31 * result + (dNS2 != null ? dNS2.hashCode() : 0);
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyDnsRequest> getDryRunRequest() {
        Request<ModifyDnsRequest> request = new ModifyDnsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyDnsRequest clone() {
        return (ModifyDnsRequest) super.clone();
    }
}

