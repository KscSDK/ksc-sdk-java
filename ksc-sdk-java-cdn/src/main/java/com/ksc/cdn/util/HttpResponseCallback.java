package com.ksc.cdn.util;

import org.apache.http.client.methods.CloseableHttpResponse;

/**
 * HttpResponseCallback
 *
 * response 响应结果处理
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public interface HttpResponseCallback<T> {

    T doResult(CloseableHttpResponse response) throws Exception;

}
