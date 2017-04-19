package com.ksc.live.model.transform;

import com.ksc.KscServiceException;
import com.ksc.http.HttpResponse;
import com.ksc.live.model.LiveResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
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

    public LiveResult handleKscServiceException(LiveResult liveResult, KscServiceException e) {
        if (liveResult == null) {
            liveResult = new LiveResult();
        }
        return liveResult;
    }

    public void handleSuccess(T t, R r) {
        if (t != null && r != null && t instanceof LiveResult && r instanceof JsonUnmarshallerContext) {
            HttpResponse httpResponse = ((JsonUnmarshallerContext) r).getHttpResponse();
            if (httpResponse != null) {
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
                    ((LiveResult) t).setErrmsg(sb.toString());
                } else {
                    ((LiveResult) t).setErrmsg("");
                }
            }
        }
    }
}
