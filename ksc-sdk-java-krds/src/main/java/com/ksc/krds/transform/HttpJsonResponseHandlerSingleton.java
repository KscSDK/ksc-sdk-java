package com.ksc.krds.transform;

public class HttpJsonResponseHandlerSingleton {
    private static HttpJsonResponseHandler httpJsonResponseHandler;
    private HttpJsonResponseHandlerSingleton() {};
    public static HttpJsonResponseHandler gethttpJsonResponseHandler() {
        if (null == httpJsonResponseHandler) {
            synchronized (HttpJsonResponseHandler.class) {
                if (null == httpJsonResponseHandler)
                    httpJsonResponseHandler = new HttpJsonResponseHandler();
            }
        }
        return httpJsonResponseHandler;
    }
}
