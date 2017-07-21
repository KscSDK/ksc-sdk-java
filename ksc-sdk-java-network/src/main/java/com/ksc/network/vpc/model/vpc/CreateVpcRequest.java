package com.ksc.network.vpc.model.vpc;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpc.CreateVpcRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateVpc.
 * </p>
 */
public class CreateVpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateVpcRequest> {

    /**
     * Vpc的名称
     */
    private String vpcName;
    /**
     * Vpc的网络范围，例如：10.0.0.0/16
     */
    private String cidrBlock;
    /**
     * 是否为默认Vpc
     */
    private Boolean isDefault = false;


    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getCidrBlock() {
        return cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVpcRequest that = (CreateVpcRequest) o;

        if (vpcName != null ? !vpcName.equals(that.vpcName) : that.vpcName != null) return false;
        if (cidrBlock != null ? !cidrBlock.equals(that.cidrBlock) : that.cidrBlock != null) return false;
        return isDefault != null ? isDefault.equals(that.isDefault) : that.isDefault == null;
    }

    @Override
    public int hashCode() {
        int result = vpcName != null ? vpcName.hashCode() : 0;
        result = 31 * result + (cidrBlock != null ? cidrBlock.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        return result;
    }

    @Override
    public CreateVpcRequest clone() {
        return (CreateVpcRequest) super.clone();
    }

    @Override
    public Request<CreateVpcRequest> getDryRunRequest() {
        Request<CreateVpcRequest> request = new CreateVpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}