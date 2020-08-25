package com.ksc.network.eip.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.eip.model.transform.ModifyAddressRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyAddress.
 * </p>
 */
@Data
public class ModifyAddressRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyAddressRequest> {

    /**
     * 弹性IP的ID
     */
    private String AllocationId;

    /**
     * 弹性IP的带宽
     */
    private Integer BandWidth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyAddressRequest that = (ModifyAddressRequest) o;

        if (AllocationId != null ? !AllocationId.equals(that.AllocationId) : that.AllocationId != null) return false;
        return BandWidth != null ? BandWidth.equals(that.BandWidth) : that.BandWidth == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (AllocationId != null ? AllocationId.hashCode() : 0);
        result = 31 * result + (BandWidth != null ? BandWidth.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyAddressRequest clone() {
        return (ModifyAddressRequest) super.clone();
    }

    @Override
    public Request<ModifyAddressRequest> getDryRunRequest() {
        Request<ModifyAddressRequest> request = new ModifyAddressRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
