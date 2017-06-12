package com.ksc.cdn.model.content;

/**
 * 刷新节点上的文件内容。刷新指定URL内容至Cache节点，支持URL、目录批量刷新。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class RefreshCachesResult {

    /**
     * 刷新返回的任务ID
     */
    private String RefreshTaskId;

    public String getRefreshTaskId() {
        return RefreshTaskId;
    }

    public void setRefreshTaskId(String refreshTaskId) {
        RefreshTaskId = refreshTaskId;
    }
}
