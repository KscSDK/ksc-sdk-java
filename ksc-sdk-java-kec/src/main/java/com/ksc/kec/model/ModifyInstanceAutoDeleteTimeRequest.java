package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ModifyInstanceAutoDeleteTimeRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyInstanceAutoDeleteTime.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
@Data
public class ModifyInstanceAutoDeleteTimeRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<ModifyInstanceAutoDeleteTimeRequest> {

    private static final long serialVersionUID = 1L;

    /**
     * 待重启实例ID列表
     * 类型: String 列表
     * 是否可缺省: 否
     */
    private com.ksc.internal.SdkInternalList<String> InstanceIds;

    /**
     *自动删除时间
     * 类型：String
     * 是否可缺省：是
     * 说明：格式：2019-07-16 18:56;该时间必须至少大于当前时间30分钟。如果不传入此参数，启动此接口则是关闭自动删除功能；此参数同时可以用于修改自动删除时间。
     */
    private String AutoDeleteTime;

    /**
     * 随主机定时删除绑定的弹性IP
     * 类型：Boolean
     * 是否可缺省：是
     * 默认值：false
     * 注：包年包月的弹性IP只解绑，不删除；只有AutoDeleteTime有效值生效时，该参数才生效
     */
    private Boolean AutoDeleteEip;

    public java.util.List<String> getInstanceIds() {
        if (InstanceIds == null) {
            InstanceIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return InstanceIds;
    }

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.InstanceIds = null;
            return;
        }

        this.InstanceIds = new com.ksc.internal.SdkInternalList<String>(
                instanceIds);
    }


    public ModifyInstanceAutoDeleteTimeRequest withInstanceIds(String... instanceIds) {
        if (this.InstanceIds == null) {
            setInstanceIds(new com.ksc.internal.SdkInternalList<String>(
                    instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.InstanceIds.add(ele);
        }
        return this;
    }

    public ModifyInstanceAutoDeleteTimeRequest withInstanceIds(
            java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    @Override
    public Request<ModifyInstanceAutoDeleteTimeRequest> getDryRunRequest() {
        Request<ModifyInstanceAutoDeleteTimeRequest> request = new ModifyInstanceAutoDeleteTimeRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
