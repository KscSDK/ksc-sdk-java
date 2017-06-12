package com.ksc.cdn.model.content;

/**
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class UrlData {

    /**
     * 任务类别，取值为：refresh，刷新任务；取值为:preload,预热任务
     */
    private String Type;

    /**
     * 刷新或预热的Url地址
     */
    private String Url;

    /**
     * 刷新或预热任务进度百分比数值
     */
    private String Progress;

    /**
     * 刷新或预热状态信息，取值分别是success(成功)、 Progressing(进行中)、Failed(刷新失败)
     */
    private String Status;

    /**
     * 任务ID，按照任务ID查询刷新或预热任务进度百分比及状态信息
     */
    private String TaskId;

    /**
     * 任务创建时间
     */
    private String CreateTime;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getProgress() {
        return Progress;
    }

    public void setProgress(String progress) {
        Progress = progress;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTaskId() {
        return TaskId;
    }

    public void setTaskId(String taskId) {
        TaskId = taskId;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }
}
