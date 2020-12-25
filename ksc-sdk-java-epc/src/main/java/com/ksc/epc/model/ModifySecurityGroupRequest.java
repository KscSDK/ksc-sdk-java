package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifySecurityGroupRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifySecurityGroup.
 * </p>
 */
@Data
public class ModifySecurityGroupRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifySecurityGroupRequest> {

    /**
     * 网卡ID
     */
    private String networkInterfaceId;
    /**
     * 安全组ID
     */
    private com.ksc.internal.SdkInternalList<String> securityGroupIds;
    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifySecurityGroupRequest that = (ModifySecurityGroupRequest) o;
        if (networkInterfaceId != null ? !networkInterfaceId.equals(that.networkInterfaceId) : that.networkInterfaceId != null)
            return false;
        if (securityGroupIds != null ? !securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null)
            return false;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (networkInterfaceId != null ? networkInterfaceId.hashCode() : 0);
        result = 31 * result + (securityGroupIds != null ? securityGroupIds.hashCode() : 0);
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
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
    public Request<ModifySecurityGroupRequest> getDryRunRequest() {
        Request<ModifySecurityGroupRequest> request = new ModifySecurityGroupRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifySecurityGroupRequest clone() {
        return (ModifySecurityGroupRequest) super.clone();
    }
}

