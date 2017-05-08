package com.ksc.network.vpc.model.Nat;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Nat.ModifyNatRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyNat.
 * </p>
 */
public class ModifyNatRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyNatRequest> {


    /**r
     * Nat的ID
     */
    private String NatId;

    /**
     * Nat的带宽
     */
    private Integer BandWidth;

    /**
     * Nat的名称
     */
    private String NatName;

    public String getNatId() {
        return NatId;
    }

    public void setNatId(String natId) {
        NatId = natId;
    }

    public Integer getBandWidth() {
        return BandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        BandWidth = bandWidth;
    }

    public String getNatName() {
        return NatName;
    }

    public void setNatName(String natName) {
        NatName = natName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyNatRequest that = (ModifyNatRequest) o;

        if (!NatId.equals(that.NatId)) return false;
        if (!BandWidth.equals(that.BandWidth)) return false;
        return NatName.equals(that.NatName);
    }

    @Override
    public int hashCode() {
        int result = NatId.hashCode();
        result = 31 * result + BandWidth.hashCode();
        result = 31 * result + NatName.hashCode();
        return result;
    }

    @Override
    public ModifyNatRequest clone() {
        return (ModifyNatRequest) super.clone();
    }
	
    @Override
    public Request<ModifyNatRequest> getDryRunRequest() {
        Request<ModifyNatRequest> request = new ModifyNatRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}