package com.ksc.network.vpc.model.NetworkInterface;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkInterface.CreateNetworkInterfaceRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateNetworkInterface.
 * </p>
 */
@Data
public class CreateNetworkInterfaceRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateNetworkInterfaceRequest> {

    /**
     * 子网的ID
     */
    private String subnetId;
    /**
     * IP地址
     */
    private String privateIpAddress;
    /**
     * 安全组的ID
     */
    private com.ksc.internal.SdkInternalList<String> securityGroupIds;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateNetworkInterfaceRequest that = (CreateNetworkInterfaceRequest) o;
        if (subnetId != null ? !subnetId.equals(that.subnetId) : that.subnetId != null)
            return false;
        if (privateIpAddress != null ? !privateIpAddress.equals(that.privateIpAddress) : that.privateIpAddress != null)
            return false;
        if (securityGroupIds != null ? !securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (subnetId != null ? subnetId.hashCode() : 0);
        result = 31 * result + (privateIpAddress != null ? privateIpAddress.hashCode() : 0);
        result = 31 * result + (securityGroupIds != null ? securityGroupIds.hashCode() : 0);
        return result;
    }

        public void addSecurityGroupIds(String... securityGroupIds){
            if (this.securityGroupIds == null) {
                this.securityGroupIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : securityGroupIds){
                this.securityGroupIds.add(value);
            }
        }

    @Override
    public Request<CreateNetworkInterfaceRequest> getDryRunRequest() {
        Request<CreateNetworkInterfaceRequest> request = new CreateNetworkInterfaceRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateNetworkInterfaceRequest clone() {
        return (CreateNetworkInterfaceRequest) super.clone();
    }
}

