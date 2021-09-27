package com.ksc.redis.model.cache;

import java.util.Date;
import java.util.List;

/***
 * @ClassName: DescribeHotKeysResponse
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeHotKeysResponse {
    private String count;
    private String total;
    private Date Update;
    private String task_status;
    private List<String> hotkeys;
    private String created;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Date getUpdate() {
        return Update;
    }

    public void setUpdate(Date update) {
        Update = update;
    }

    public String getTask_status() {
        return task_status;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<String> getHotkeys() {
        return hotkeys;
    }

    public void setHotkeys(List<String> hotkeys) {
        this.hotkeys = hotkeys;
    }
}
