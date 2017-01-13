package com.ksc.vcs.model.transform;

import com.ksc.KscServiceException;
import com.ksc.http.HttpResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.vcs.model.BaseResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 抽象基本BaseJsonUnmarshaller,对非2xx状态码进行异常处理及2xx状态码进行正常处理
 *
 * @param <T>
 * @param <R>
 */
public abstract class BaseJsonUnmarshaller<T, R> implements Unmarshaller<T, R> {

    public abstract T handleException(Exception e);

    public void handleKscServiceException(BaseResult baseResult, KscServiceException e) {
        if (baseResult == null) {
            baseResult = new BaseResult();
        }
        baseResult.setStatusCode(e.getStatusCode());
        baseResult.setRequestId(e.getRequestId());
        baseResult.setCode(e.getErrorCode());
        baseResult.setMessage(e.getErrorMessage());
    }

    public void handleSuccess(T t, R r) {
        if (t != null && r != null && t instanceof BaseResult && r instanceof JsonUnmarshallerContext) {
            HttpResponse httpResponse = ((JsonUnmarshallerContext) r).getHttpResponse();
            if (httpResponse != null) {
                ((BaseResult) t).setStatusCode(httpResponse.getStatusCode());
                String requestId = httpResponse.getHeaders().get("x-live-request-id");
                ((BaseResult) t).setRequestId(requestId);
                ((BaseResult) t).setCode(httpResponse.getStatusText());

                InputStream content = httpResponse.getContent();
                if (content != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content));
                    StringBuilder sb = new StringBuilder();
                    String line = "";
                    try {
                        while ((line = bufferedReader.readLine()) != null) {
                            sb.append(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ((BaseResult) t).setMessage(sb.toString());
                } else {
                    ((BaseResult) t).setMessage("");
                }
            }
        }
    }
}
