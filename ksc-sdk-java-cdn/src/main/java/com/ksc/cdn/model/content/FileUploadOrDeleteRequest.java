package com.ksc.cdn.model.content;

import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;

/**
 * description：未来电视文件请求
 * author：YANGXUEYI
 * date: 2017/11/28
 */
public class FileUploadOrDeleteRequest {
    /**
     * 任务id
     */
    @FieldValidate
    private String taskId;
    /**
     * 下载url
     */
    @FieldValidate
    private String sourceUrl;
    /**
     * 文件md5
     */
    @FieldValidate
    private String MD5;

    /**
     * 平台id
     */
    @FieldValidate
    private Integer platFormId;

    /**
     * 优先级
     */
    private String priority;

    public GeneralRequestParam getUploadGeneralRequestParam() {
        return new GeneralRequestParam("IcntvFileUpload", "2016-09-01", "/v1/cntv/file_upload");
    }

    public GeneralRequestParam getDeleteGeneralRequestParam() {
        return new GeneralRequestParam("IcntvFileDelete", "2016-09-01", "/v1/cntv/file_delete");
    }

    public GeneralRequestParam getPublishStatusRequestParam() {
        return new GeneralRequestParam("IcntvPublishStatus", "2016-09-01", "/v1/cntv/publish_status");
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getMD5() {
        return MD5;
    }

    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    public Integer getPlatFormId() {
        return platFormId;
    }

    public void setPlatFormId(Integer platFormId) {
        this.platFormId = platFormId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
