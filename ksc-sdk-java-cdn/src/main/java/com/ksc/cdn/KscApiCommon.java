package com.ksc.cdn;

import com.google.gson.Gson;
import com.ksc.cdn.util.AwsSignerV4Util;
import com.ksc.cdn.util.DateUtils;
import com.ksc.cdn.util.HttpClientUtil;
import com.ksc.cdn.util.HttpResponseCallback;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ksc.HttpMethod;

/**
 * KscApiCommon
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public class KscApiCommon {

    private String endPoint;

    private String apiRegion;

    private String accessKey;

    private String secretAccessKey;

    private String apiServiceName;

    public KscApiCommon(){
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getApiRegion() {
        return apiRegion;
    }

    public void setApiRegion(String apiRegion) {
        this.apiRegion = apiRegion;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public String getApiServiceName() {
        return apiServiceName;
    }

    public void setApiServiceName(String apiServiceName) {
        this.apiServiceName = apiServiceName;
    }

    private static Logger log = LoggerFactory.getLogger(KscApiCommon.class);

    /**
     * 统计分析根据起始时间返回不同的时间粒度
     *
     * @param startTime
     * @param endTime
     * @return
     */
    public String getGranularity(String startTime, String endTime) {
        try {
            Date startDate = DateUtils.timestamp2Datetime(Long.parseLong(startTime) * 1000l);
            Date endDate = DateUtils.timestamp2Datetime(Long.parseLong(endTime) * 1000l);
            int days = DateUtils.getDayDiff(startDate, endDate);
            if (days == 0) {
                return "5";
            } else if (days < 2) {
                return "10";
            } else if (days < 5) {
                return "20";
            } else if (days < 15) {
                return "60";
            } else if (days < 62) {
                return "240";
            } else if (days <= 93) {
                return "480";
            } else {
                return "";
            }
        } catch (ParseException e) {
            log.error("DateUtils timestamp2Datetime error, throw exception:{}", e);
        }
        return null;
    }

    /**
     * 构建openAPI headers
     *
     * @param version
     * @param action
     * @return
     */
    public Map<String, String> buildHeaders(String version, String action) {
        return buildHeaders(version, action, false);
    }

    /**
     * 构建openAPI headers
     *
     * @param version
     * @param action
     * @param contentTypeIsJson
     * @return
     */
    public Map<String, String> buildHeaders(String version, String action, boolean contentTypeIsJson) {
        Map<String, String> headers = new HashMap();
        headers.put("X-Version", version);
        headers.put("X-Action", action);
        if (contentTypeIsJson) {
            headers.put("content-type", ContentType.APPLICATION_JSON.getMimeType());
        }
        return headers;
    }

    /**
     * @param method
     * @param url
     * @param requestHeaders
     * @param <T>
     * @return
     * @author cuichengrui add at 2016/8/23
     * 返回泛型实例
     */
    public <T> T httpExecute(HttpMethod method, String url, Object requestContent, Map<String, String> requestHeaders, final Class<T> clazz) throws Exception {

        final String requestUrl = this.endPoint + url;
        URI uri = URI.create(requestUrl);

        Map<String, String> awsHeaders = new HashMap<String, String>();

        T t;

        switch (method) {
            case GET:
                awsHeaders = AwsSignerV4Util.getAuthHeaderForGet(uri, (Map<String, String>) requestContent, requestHeaders, apiServiceName, apiRegion, accessKey, secretAccessKey);
                t = HttpClientUtil.get(requestUrl, awsHeaders, (Map<String, String>) requestContent, new HttpResponseCallback<T>() {

                    @Override
                    public T doResult(CloseableHttpResponse response) throws Exception {
                        return handleResponse(requestUrl, response, clazz);
                    }

                });
                break;
            case POST:
                String requestBody;
                String contentType = requestHeaders.get("content-type");
                if (StringUtils.isNotBlank(contentType) && StringUtils.equals(contentType, ContentType.APPLICATION_JSON.getMimeType())) {
                    requestBody = new Gson().toJson(requestContent);
                    awsHeaders.put("content-type", ContentType.APPLICATION_JSON.getMimeType());
                } else {
                    requestBody = HttpClientUtil.getUrlEncodedString((Map<String, String>) requestContent);
                }
                awsHeaders = AwsSignerV4Util.getAuthHeaderForPost(uri, requestBody, requestHeaders, apiServiceName, apiRegion, accessKey, secretAccessKey);
                t = HttpClientUtil.post(requestUrl, awsHeaders, requestContent, new HttpResponseCallback<T>() {
                    @Override
                    public T doResult(CloseableHttpResponse response) throws Exception {
                        return handleResponse(requestUrl, response, clazz);
                    }
                });
                break;
            case DELETE:
                awsHeaders = AwsSignerV4Util.getAuthHeaderForDelete(uri, (Map<String, String>) requestContent, requestHeaders, apiServiceName, apiRegion, accessKey, secretAccessKey);
                t = HttpClientUtil.delete(requestUrl, awsHeaders, (Map<String, String>) requestContent, new HttpResponseCallback<T>() {

                    @Override
                    public T doResult(CloseableHttpResponse response) throws Exception {
                        return handleResponse(requestUrl, response, clazz);
                    }

                });
                break;
            default:
                throw new KscClientException("Http execute method error. It must be GET or POST or DELETE.");
        }
        return t;

    }

    /**
     * 处理响应结果
     *
     * @param url
     * @param response
     * @param clazz
     * @param <T>
     * @return
     * @throws Exception
     */
    private <T> T handleResponse(String url, CloseableHttpResponse response, Class<T> clazz) throws Exception {
        String responseString = EntityUtils.toString(response.getEntity(), Charset.forName("UTF-8"));
        int statusCode = response.getStatusLine().getStatusCode();
        log.info("openAPI url:{}, response code:{}, response content:{}", url, statusCode, responseString);
        T t = new Gson().fromJson(responseString, clazz);
        if (statusCode == HttpStatus.SC_OK) {
            return t;
        } else {
            throw new KscClientException(responseString);
        }
    }

}
