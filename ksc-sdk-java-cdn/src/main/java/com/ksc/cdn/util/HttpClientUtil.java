package com.ksc.cdn.util;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



/**
 * HttpClientUtil
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public class HttpClientUtil {

    private static String proxHost;

    private static int proxPort;

    static String proxyArg = System.getProperty("http.proxyHost");

    static String portArg = System.getProperty("http.proxyPort");

    private static final RequestConfig requestConfig;


    private static final int REQUEST_TIMEOUT = 60 * 1000;//连接超时时间

    private static final int SOCKET_TIMEOUT = 60 * 1000;//数据传输超时时间

    private static PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();

    private static Logger log= LoggerFactory.getLogger(HttpClientUtil.class);

    static {
        cm.setMaxTotal(10); // 设置连接池线程最大数量
        cm.setDefaultMaxPerRoute(5); // 设置单个路由最大的连接数
        if (StringUtils.isNotBlank(proxyArg) && StringUtils.isNotBlank(portArg) && StringUtils.isNumeric(portArg)) {
            proxHost = proxyArg;
            proxPort = Integer.valueOf(portArg);
        }

        if (proxHost != null) {
            HttpHost proxy = new HttpHost(proxHost, proxPort);
            requestConfig = RequestConfig.custom().setConnectionRequestTimeout(REQUEST_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).setProxy(proxy).build();
        } else {
            requestConfig = RequestConfig.custom().setConnectionRequestTimeout(REQUEST_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
        }
    }

    /**
     * 使用get的方式提交数据<br>
     *
     * @param url     请求地址
     * @param headers 请求头
     * @param params  要提交的数据
     * @return
     * @throws IOException
     */
    public static <T> T get(final String url, final Map<String, String> headers, final Map<String, String> params, HttpResponseCallback<T> responseCallback)
            throws Exception {
        CloseableHttpResponse response = basicGet(url, headers, params);
        T t = responseCallback.doResult(response);
        closeCloseableHttpResponse(response);
        return t;
    }

    /**
     * 使用post提交请求<br>
     *
     * @param url     请求地址
     * @param headers 请求头
     * @param params  要提交的数据
     * @return
     * @throws IOException
     */
    public static <T> T delete(final String url, final Map<String, String> headers, final Map<String, String> params, HttpResponseCallback<T> responseCallback)
            throws Exception {
        CloseableHttpResponse response = basicDelete(url, headers, params);
        T t = responseCallback.doResult(response);
        closeCloseableHttpResponse(response);
        return t;
    }

    /**
     * 使用delete的方式提交数据<br>
     *
     * @param url     请求地址
     * @param headers 请求头
     * @param params  要提交的数据
     * @return
     * @throws IOException
     */
    public static <T> T post(final String url, final Map<String, String> headers, final Object params, HttpResponseCallback<T> responseCallback)
            throws Exception {
        CloseableHttpResponse response = basicPost(url, headers, params);
        T t = responseCallback.doResult(response);
        closeCloseableHttpResponse(response);
        return t;
    }


    /**
     * 使用get的方式提交数据<br>
     *
     * @param url     请求地址
     * @param headers 请求头
     * @param params  要提交的数据
     * @return
     * @throws IOException
     */
    public static CloseableHttpResponse basicGet(String url, Map<String, String> headers, Map<String, String> params)
            throws Exception {
        CloseableHttpResponse response;
        try {
            CloseableHttpClient httpClient = createCloseableHttpClient(url);

            URIBuilder builder = new URIBuilder(url);
            //填入查询参数
            if (params != null && params.size() > 0) {
                builder.setParameters(paramsConverter(params));
                log.info("params: " + params);
            }

            HttpGet httpGet = new HttpGet(builder.build());
            log.info("HTTP GET URL: {}", builder.toString());

            // 设置代理
            setProxy(httpGet, url);

            // 设置请求头
            httpGet.setHeaders(headerConverter(headers));

            response = httpClient.execute(httpGet);
        } catch (Exception e) {
            log.error("get url:{}, throw exception;{}", url, getTrace(e));
            throw e;
        }
        return response;
    }

    /**
     * 使用post提交请求<br>
     *
     * @param url     请求地址
     * @param headers 请求头
     * @param params  要提交的数据
     * @return
     * @throws IOException
     */
    public static CloseableHttpResponse basicPost(String url, Map<String, String> headers, Object params)
            throws Exception {
        CloseableHttpResponse response;
        try {
            CloseableHttpClient httpClient = createCloseableHttpClient(url);

            HttpPost httpPost = new HttpPost(url);

            // 设置请求头
            httpPost.setHeaders(headerConverter(headers));
            AbstractHttpEntity param;
            if (headers.get("content-type") != null && headers.get("content-type").equals(ContentType.APPLICATION_JSON.getMimeType())) {
                Gson gson = new Gson();
                param = new StringEntity(gson.toJson(params), ContentType.APPLICATION_JSON);
                param.setContentEncoding("UTF-8");
            } else if (headers.get("content-type") != null && headers.get("content-type").equals(ContentType.TEXT_XML.getMimeType())) {
                param = new StringEntity((String) ((Map<String, Object>) params).get("body"), ContentType.TEXT_XML);
                param.setContentEncoding("UTF-8");
            } else {
                param = new UrlEncodedFormEntity(paramsConverter((Map<String, String>) params), "UTF-8");
            }
            httpPost.setEntity(param);

            // 设置代理
            setProxy(httpPost, url);
            log.info("HTTP POST URL: {}", url);

            // request and response
            response = httpClient.execute(httpPost);
        } catch (Exception e) {
            log.error("post url:{}, throw exception:{}", url, getTrace(e));
            throw e;
        }
        return response;
    }

    /**
     * 使用delete的方式提交数据<br>
     *
     * @param url     请求地址
     * @param headers 请求头
     * @param params  要提交的数据
     * @return
     * @throws IOException
     */
    public static CloseableHttpResponse basicDelete(String url, Map<String, String> headers, Map<String, String> params)
            throws Exception {
        CloseableHttpResponse response = null;
        try {
            CloseableHttpClient httpClient = createCloseableHttpClient(url);

            URIBuilder builder = new URIBuilder(url);
            //填入查询参数
            if (params != null && params.size() > 0) {
                builder.setParameters(paramsConverter(params));
                log.info("params: " + params);
            }

            HttpDelete httpDelete = new HttpDelete(builder.build());
            log.info("HTTP DELETE URL: {}", builder.toString());

            // 设置代理
            setProxy(httpDelete, url);

            // 设置请求头
            httpDelete.setHeaders(headerConverter(headers));

            response = httpClient.execute(httpDelete);
            return response;
        } catch (Exception e) {
            log.error("delete url:{}, throw exception:{}", url, getTrace(e));
            throw e;
        }
    }

    /**
     * 关闭Response
     *
     * @param closeableHttpResponse
     */
    public static void closeCloseableHttpResponse(CloseableHttpResponse closeableHttpResponse) {
        if (closeableHttpResponse != null) {
            try {
                closeableHttpResponse.close();
            } catch (IOException e) {
                e.printStackTrace();
                log.error(e.getMessage(), e.getCause());
            }
        }
    }

    /**
     * 根据url判断是否使用代理
     *
     * @param url
     * @return
     */
    public static CloseableHttpClient createCloseableHttpClient(String url) {
        CloseableHttpClient closeableHttpClient = null;
        if (closeableHttpClient == null) {
            closeableHttpClient = HttpClients.custom().setConnectionManager(cm).setDefaultRequestConfig(requestConfig).build();
            log.info("use proxy url {}", url);
        }
        return closeableHttpClient;
    }

    /**
     * 设置代理
     *
     * @param request
     * @return
     */
    public static HttpRequestBase setProxy(HttpRequestBase request, String url) {

        if (proxHost != null) {
            HttpHost proxy = new HttpHost(proxHost, proxPort);
            RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
            request.setConfig(config);
        }

        return request;
    }

    /**
     * 转换请求参数列表
     *
     * @param params
     * @return
     */
    private static List<NameValuePair> paramsConverter(Map<String, String> params) {
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        Set<Entry<String, String>> paramsSet = params.entrySet();
        for (Entry<String, String> paramEntry : paramsSet) {
            if(paramEntry.getValue()!=null){
                nvps.add(new BasicNameValuePair(paramEntry.getKey(), paramEntry.getValue()));
                log.info("request param: \"{}\": \"{}\"", paramEntry.getKey(), paramEntry.getValue());
            }
        }
        return nvps;
    }

    /**
     * 转换header列表
     *
     * @param headers
     * @return
     */
    private static BasicHeader[] headerConverter(Map<String, String> headers) {
        if (headers != null && headers.size() > 0) {
            List<Header> headerList = new ArrayList<Header>(headers.size());
            for (Entry<String, String> entry : headers.entrySet()) {
                String key = entry.getKey();
                String val = entry.getValue();
                headerList.add(new BasicHeader(key, val));
                log.info("request header: \"{}\": \"{}\"", key, val);
            }
            return headerList.toArray(new BasicHeader[0]);
        } else {
            return null;
        }
    }

    /**
     * 获取请求参数的UrlEncode值
     *
     * @param params
     * @return
     */
    public static String getUrlEncodedString(Map<String, String> params) {
        List<NameValuePair> nameValuePairs = paramsConverter(params);
        String urlEncodedString = URLEncodedUtils.format(nameValuePairs, "utf-8");
        return urlEncodedString;
    }

    /**
     * 获取异常堆栈
     *
     * @param t
     * @return
     */
    private static String getTrace(Throwable t) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        t.printStackTrace(writer);
        StringBuffer buffer = new StringBuffer();
        buffer.append(stringWriter.getBuffer());
        return buffer.toString();
    }

}
