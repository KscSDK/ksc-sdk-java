package com.ksc.cdn.model.domain.domaindetail;

/**
 * Created by CHENYIWEN on 2018/1/2.
 */
public class HttpHeadersList {
    private HttpHeaderRule[]  HttpHeadList;

    public HttpHeaderRule[] getHttpHeadList() {
        return HttpHeadList;
    }

    public void setHttpHeadList(HttpHeaderRule[] httpHeadList) {
        HttpHeadList = httpHeadList;
    }
}
