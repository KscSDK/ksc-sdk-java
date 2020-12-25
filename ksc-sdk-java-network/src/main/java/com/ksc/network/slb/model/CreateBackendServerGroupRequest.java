package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreateBackendServerGroupRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateBackendServerGroup.
 * </p>
 */
@Data
public class CreateBackendServerGroupRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateBackendServerGroupRequest> {

    /**
     * 后端服务组的名称
     */
    private String backendServerGroupName;
    /**
     * Vpc的ID
     */
    private String vpcId;
    /**
     * 后端服务组类型
     */
    private String backendServerGroupType;
    /**
     * 健康检查响应超时时间
     */
    private Integer timeout;
    /**
     * 健康检查时间间隔
     */
    private Integer interval;
    /**
     * 健康阈值
     */
    private Integer healthyThreshold;
    /**
     * 不健康阈值
     */
    private Integer unhealthyThreshold;
    /**
     * 健康检查URI
     */
    private String urlPath;
    /**
     * 健康检查域名
     */
    private String hostName;
    /**
     * 健康检查的状态
     */
    private String healthCheckState;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateBackendServerGroupRequest that = (CreateBackendServerGroupRequest) o;
        if (backendServerGroupName != null ? !backendServerGroupName.equals(that.backendServerGroupName) : that.backendServerGroupName != null)
            return false;
        if (vpcId != null ? !vpcId.equals(that.vpcId) : that.vpcId != null)
            return false;
        if (backendServerGroupType != null ? !backendServerGroupType.equals(that.backendServerGroupType) : that.backendServerGroupType != null)
            return false;
        if (timeout != null ? !timeout.equals(that.timeout) : that.timeout != null)
            return false;
        if (interval != null ? !interval.equals(that.interval) : that.interval != null)
            return false;
        if (healthyThreshold != null ? !healthyThreshold.equals(that.healthyThreshold) : that.healthyThreshold != null)
            return false;
        if (unhealthyThreshold != null ? !unhealthyThreshold.equals(that.unhealthyThreshold) : that.unhealthyThreshold != null)
            return false;
        if (urlPath != null ? !urlPath.equals(that.urlPath) : that.urlPath != null)
            return false;
        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null)
            return false;
        if (healthCheckState != null ? !healthCheckState.equals(that.healthCheckState) : that.healthCheckState != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (backendServerGroupName != null ? backendServerGroupName.hashCode() : 0);
        result = 31 * result + (vpcId != null ? vpcId.hashCode() : 0);
        result = 31 * result + (backendServerGroupType != null ? backendServerGroupType.hashCode() : 0);
        result = 31 * result + (timeout != null ? timeout.hashCode() : 0);
        result = 31 * result + (interval != null ? interval.hashCode() : 0);
        result = 31 * result + (healthyThreshold != null ? healthyThreshold.hashCode() : 0);
        result = 31 * result + (unhealthyThreshold != null ? unhealthyThreshold.hashCode() : 0);
        result = 31 * result + (urlPath != null ? urlPath.hashCode() : 0);
        result = 31 * result + (hostName != null ? hostName.hashCode() : 0);
        result = 31 * result + (healthCheckState != null ? healthCheckState.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateBackendServerGroupRequest> getDryRunRequest() {
        Request<CreateBackendServerGroupRequest> request = new CreateBackendServerGroupRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateBackendServerGroupRequest clone() {
        return (CreateBackendServerGroupRequest) super.clone();
    }
}

