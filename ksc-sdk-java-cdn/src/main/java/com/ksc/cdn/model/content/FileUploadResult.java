package com.ksc.cdn.model.content;

/**
 * description：
 * author：YANGXUEYI
 * date: 2017/11/28
 */
public class FileUploadResult {
    private String code;
    private String message;
    private String taskId;
    private String platFormId;
    private String playUrl;
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getPlatFormId() {
        return platFormId;
    }

    public void setPlatFormId(String platFormId) {
        this.platFormId = platFormId;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
