package com.ksc.sts.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.sts.model.transform.AssumeRoleRequestMarshaller;

public class AssumeRoleRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssumeRoleRequest> {

    private static final long serialVersionUID = -7398805080976119108L;

    @Override
    public Request<AssumeRoleRequest> getDryRunRequest() {
        Request<AssumeRoleRequest> request = new AssumeRoleRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * <p>
     * role在ksyun中的krn.请求中需要完整的role的krn标识字符串。
     * </p>
     */
    private String roleKrn;

    /**
     * <p>
     * 用户自定义参数,此参数区分不同的临时证书。
     * </p>
     */
    private String roleSessionName;

    // private String policy;
    /**
     * <p>
     * 指定临时证书的持续有效时间。单位是秒。有效值为900秒（15分钟）至3600秒（1小时）。默认为3600秒。
     * </p>
     */
    private Integer durationSeconds;

    public void setRoleKrn(String roleKrn) {
        this.roleKrn = roleKrn;
    }

    public String getRoleKrn() {
        return this.roleKrn;
    }

    public AssumeRoleRequest withRoleKrn(String RoleKrn) {
        setRoleKrn(RoleKrn);
        return this;
    }

    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public AssumeRoleRequest withRoleSessionName(String roleSessionName) {
        setRoleSessionName(roleSessionName);
        return this;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeRoleRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleKrn() != null)
            sb.append("RoleKrn: ").append(getRoleKrn()).append(",");
        if (getRoleSessionName() != null)
            sb.append("RoleSessionName: ").append(getRoleSessionName())
                    .append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds())
                    .append(",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleRequest == false)
            return false;
        AssumeRoleRequest other = (AssumeRoleRequest) obj;
        if (other.getRoleKrn() == null ^ this.getRoleKrn() == null)
            return false;
        if (other.getRoleKrn() != null
                && other.getRoleKrn().equals(this.getRoleKrn()) == false)
            return false;
        if (other.getRoleSessionName() == null
                ^ this.getRoleSessionName() == null)
            return false;
        if (other.getRoleSessionName() != null && other.getRoleSessionName()
                .equals(this.getRoleSessionName()) == false)
            return false;
        if (other.getDurationSeconds() == null
                ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds()
                .equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 47;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleKrn() == null) ? 0 : getRoleKrn().hashCode());
        hashCode = prime * hashCode + ((getRoleSessionName() == null) ? 0
                : getRoleSessionName().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0
                : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleRequest clone() {
        return (AssumeRoleRequest) super.clone();
    }

}