package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateProcessRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateProcess.
 * </p>
 */
@Data
public class CreateProcessRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateProcessRequest> {

    /**
     * 客户自定义的工单ID
     */
    private String processId;
    /**
     * 实例SN
     */
    private String sn;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 确认是否可以重启
     */
    private String confirm;
    /**
     * 操作类型
     */
    private String type;
    /**
     * 标题
     */
    private String title;
    /**
     * 服务器数
     */
    private String machineCount;
    /**
     * 内容
     */
    private String content;
    /**
     * 问题属性
     */
    private String attribute;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateProcessRequest that = (CreateProcessRequest) o;
        if (processId != null ? !processId.equals(that.processId) : that.processId != null)
            return false;
        if (sn != null ? !sn.equals(that.sn) : that.sn != null)
            return false;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (confirm != null ? !confirm.equals(that.confirm) : that.confirm != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null)
            return false;
        if (machineCount != null ? !machineCount.equals(that.machineCount) : that.machineCount != null)
            return false;
        if (content != null ? !content.equals(that.content) : that.content != null)
            return false;
        if (attribute != null ? !attribute.equals(that.attribute) : that.attribute != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (processId != null ? processId.hashCode() : 0);
        result = 31 * result + (sn != null ? sn.hashCode() : 0);
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (confirm != null ? confirm.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (machineCount != null ? machineCount.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (attribute != null ? attribute.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateProcessRequest> getDryRunRequest() {
        Request<CreateProcessRequest> request = new CreateProcessRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateProcessRequest clone() {
        return (CreateProcessRequest) super.clone();
    }
}

