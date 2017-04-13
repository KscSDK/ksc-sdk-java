package com.ksc.cdn.model.content;

/**
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class Url {

    /**
     * 需要提交刷新的Url，单条
     */
    private String Url;

    public Url() {

    }

    public Url(String url) {
        Url = url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
