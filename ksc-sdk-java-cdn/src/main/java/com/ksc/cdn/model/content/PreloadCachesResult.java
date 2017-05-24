package com.ksc.cdn.model.content;

/**
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class PreloadCachesResult {

    /***
     * 预热返回的任务ID
     */
    private String PreloadTaskId;

    public String getPreloadTaskId() {
        return PreloadTaskId;
    }

    public void setPreloadTaskId(String preloadTaskId) {
        PreloadTaskId = preloadTaskId;
    }
}
