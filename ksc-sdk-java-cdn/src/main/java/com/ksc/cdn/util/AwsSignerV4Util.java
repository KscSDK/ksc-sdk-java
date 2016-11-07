package com.ksc.cdn.util;

import com.ksc.DefaultRequest;
import com.ksc.Request;
import com.ksc.auth.AWS4Signer;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.auth.internal.SignerConstants;
import com.ksc.http.HttpMethodName;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.*;
import java.util.Map.Entry;

/**
 * AwsSignerV4Util
 * kop 签名工具类
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public class AwsSignerV4Util {

    /**
     * 计算GET请求的签名信息，并将签名信息放到HTTP Header中发送给服务器端，该方法即返回包含签名信息的HTTP Header
     *
     * @param uri        请求地址, ex: http://quota.inner.ksyun.com/service/createService
     * @param parameters GET请求时，请求参数
     * @param headers    GET请求时，不包含签名的原有HTTP Header，可以为null
     * @param service 需要调用的OpenAPI的服务，如：cdn,iam 等
     * @param ak         计算签名使用的AccessKey的值
     * @param sk         计算签名使用的SecretAccessKey的值
     * @return 包含签名信息的HTTP Header. 包含参数headers的内容
     * @throws Exception
     */
    public static Map<String, String> getAuthHeaderForGet(URI uri, Map<String, String> parameters, Map<String, String> headers, String service, String region,
                                                          String ak, String sk) throws Exception {

        Map<String, List<String>> _parameters = new HashMap<String, List<String>>();
        filterEmptyParams(_parameters,parameters);


        Request<String> request = new DefaultRequest<String>(service);
        request.setHttpMethod(HttpMethodName.GET);

        String scheme = uri.getScheme();
        String beforeAuthority = scheme == null ? "" : scheme + "://";
        String authority = uri.getAuthority();
        String path = uri.getPath();
        request.setEndpoint(URI.create(beforeAuthority + authority));
        request.setResourcePath(path);

        headers = headers == null ? new HashMap<String, String>() : headers;
        if (headers.containsKey("X-Amz-Date")) {
            headers.remove("X-Amz-Date");
        }
        if (headers.containsKey("X-KSC-SERVICE")) {
            headers.remove("X-KSC-SERVICE");
        }
        if (headers.containsKey("X-KSC-REGION")) {
            headers.remove("X-KSC-REGION");
        }
        if (headers.containsKey("Authorization")) {
            headers.remove("Authorization");
        }
        request.setHeaders(headers);
        request.setParameters(_parameters);
        request.setContent(null);

        AWSCredentials credentials = new BasicAWSCredentials(ak, sk);
        AWS4Signer aws4Signer = new AWS4Signer();
        aws4Signer.setServiceName(service);
        aws4Signer.setRegionName(region);
        aws4Signer.sign(request, credentials);


        headers.put("Authorization", request.getHeaders().get(SignerConstants.AUTHORIZATION));
        headers.put("X-Amz-Date", request.getHeaders().get(SignerConstants.X_AMZ_DATE));
        headers.put("X-KSC-SERVICE", service);
        headers.put("X-KSC-REGION", region);
        return headers;
    }

    /**
     * 计算POST请求的签名信息，并将签名信息放到HTTP Header中发送给服务器端，该方法即返回包含签名信息的HTTP Header
     *
     * @param uri     请求地址, ex: http://quota.inner.ksyun.com/service/createService
     * @param body    POST请求时，HTTP body的内容, ex: accountId=sdfs&region=cn-beijing-1&id=1231
     * @param headers POST请求时，不包含签名的原有HTTP Header
     * @param service 需要调用的OpenAPI的服务，如：cdn,iam 等
     * @param ak      计算签名使用的AccessKey的值
     * @param sk      计算签名使用的SecretAccessKey的值
     * @return 包含签名信息的HTTP Header. 包含参数headers的内容
     * @throws Exception
     */
    public static Map<String, String> getAuthHeaderForPost(URI uri, String body, Map<String, String> headers, String service, String region, String ak, String sk)
            throws Exception {
        Request<String> request = new DefaultRequest<String>(service);
        request.setHttpMethod(HttpMethodName.POST);

        String scheme = uri.getScheme();
        String beforeAuthority = scheme == null ? "" : scheme + "://";
        String authority = uri.getAuthority();
        String path = uri.getPath();
        request.setEndpoint(URI.create(beforeAuthority + authority));
        request.setResourcePath(path);

        headers = headers == null ? new HashMap<String, String>() : headers;
        if (headers.containsKey("X-Amz-Date")) {
            headers.remove("X-Amz-Date");
        }
        if (headers.containsKey("X-KSC-SERVICE")) {
            headers.remove("X-KSC-SERVICE");
        }
        if (headers.containsKey("X-KSC-REGION")) {
            headers.remove("X-KSC-REGION");
        }
        if (headers.containsKey("Authorization")) {
            headers.remove("Authorization");
        }
        request.setHeaders(headers);

        if (body == null) {
            request.setContent(null);
        } else {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(body.getBytes("UTF-8"));
            request.setContent(inputStream);
        }

        AWSCredentials credentials = new BasicAWSCredentials(ak, sk);
        AWS4Signer aws4Signer = new AWS4Signer();
        aws4Signer.setServiceName(service);
        aws4Signer.setRegionName(region);
        aws4Signer.sign(request, credentials);

        headers.put("Authorization", request.getHeaders().get(SignerConstants.AUTHORIZATION));
        headers.put("X-Amz-Date", request.getHeaders().get(SignerConstants.X_AMZ_DATE));
        headers.put("X-KSC-SERVICE", service);
        headers.put("X-KSC-REGION", region);

        return headers;
    }

    /**
     * Post请求签名。
     * 该方法支持既传输K-V参数，又传输body的请求。
     *
     * @param uri     不带参数的uri。如：http://iam.cn-beijing-1.api.ksyun.com/xxx/xxx
     * @param params  参数
     * @param body    post请求的body
     * @param headers head信息
     * @param service 需要调用的OpenAPI的服务，如：cdn,iam 等
     * @param region  数据中心名称，如：cn-beijing-1,cn-shanghai-2 等
     * @param ak      AccessKey
     * @param sk      SecretKey
     * @return 签过名的head头信息，需要追加到原始的request中
     * @throws Exception
     */
    public static List<Header> getAuthHeaderForPost(URI uri, Map<String, String> params, InputStream body, Map<String, String> headers, String service,
                                                    String region, String ak, String sk) throws Exception {
        Request<String> request = new DefaultRequest<String>(service);
        request.setHttpMethod(HttpMethodName.POST);

        String scheme = uri.getScheme();
        String beforeAuthority = scheme == null ? "" : scheme + "://";
        String authority = uri.getAuthority();
        String path = uri.getPath();
        request.setEndpoint(URI.create(beforeAuthority + authority));
        request.setResourcePath(path);

        headers = headers == null ? new HashMap<String, String>() : headers;
        if (headers.containsKey("X-Amz-Date")) {
            headers.remove("X-Amz-Date");
        }
        if (headers.containsKey("X-KSC-SERVICE")) {
            headers.remove("X-KSC-SERVICE");
        }
        if (headers.containsKey("X-KSC-REGION")) {
            headers.remove("X-KSC-REGION");
        }
        if (headers.containsKey("Authorization")) {
            headers.remove("Authorization");
        }
        request.setHeaders(headers);
        request.setContent(body);

        Map<String, List<String>> _parameters = new HashMap<String, List<String>>();
        filterEmptyParams(_parameters,params);

        request.setParameters(_parameters);

        AWSCredentials credentials = new BasicAWSCredentials(ak, sk);
        AWS4Signer aws4Signer = new AWS4Signer();
        aws4Signer.setServiceName(service);
        aws4Signer.setRegionName(region);
        aws4Signer.sign(request, credentials);

        List<Header> headers2 = new ArrayList<Header>();
        headers2.add(new Header("Authorization", request.getHeaders().get(SignerConstants.AUTHORIZATION)));
        headers2.add(new Header("X-Amz-Date", request.getHeaders().get(SignerConstants.X_AMZ_DATE)));
        headers2.add(new Header("X-KSC-SERVICE", service));
        headers2.add(new Header("X-KSC-REGION", region));
        for (Entry<String, String> entry : headers.entrySet()) {
            headers2.add(new Header(entry.getKey(), entry.getValue()));
        }
        return headers2;
    }

    /**
     * 计算DELETE请求的签名信息，并将签名信息放到HTTP Header中发送给服务器端，该方法即返回包含签名信息的HTTP Header
     *
     * @param uri        请求地址, ex: http://quota.inner.ksyun.com/service/createService
     * @param parameters DELETE请求时，请求参数
     * @param headers    DELETE请求时，不包含签名的原有HTTP Header，可以为null
     * @param service 需要调用的OpenAPI的服务，如：cdn,iam 等
     * @param ak         计算签名使用的AccessKey的值
     * @param sk         计算签名使用的SecretAccessKey的值
     * @return 包含签名信息的HTTP Header. 包含参数headers的内容
     * @throws Exception
     */
    public static Map<String, String> getAuthHeaderForDelete(URI uri, Map<String, String> parameters, Map<String, String> headers, String service, String region,
                                                             String ak, String sk) throws Exception {

        Map<String, List<String>> _parameters = new HashMap<String, List<String>>();
        filterEmptyParams(_parameters,parameters);

        Request<String> request = new DefaultRequest<String>(service);
        request.setHttpMethod(HttpMethodName.DELETE);

        String scheme = uri.getScheme();
        String beforeAuthority = scheme == null ? "" : scheme + "://";
        String authority = uri.getAuthority();
        String path = uri.getPath();
        request.setEndpoint(URI.create(beforeAuthority + authority));
        request.setResourcePath(path);

        headers = headers == null ? new HashMap<String, String>() : headers;
        if (headers.containsKey("X-Amz-Date")) {
            headers.remove("X-Amz-Date");
        }
        if (headers.containsKey("X-KSC-SERVICE")) {
            headers.remove("X-KSC-SERVICE");
        }
        if (headers.containsKey("X-KSC-REGION")) {
            headers.remove("X-KSC-REGION");
        }
        if (headers.containsKey("Authorization")) {
            headers.remove("Authorization");
        }
        request.setHeaders(headers);
        request.setParameters(_parameters);
        request.setContent(null);

        AWSCredentials credentials = new BasicAWSCredentials(ak, sk);
        AWS4Signer aws4Signer = new AWS4Signer();
        aws4Signer.setServiceName(service);
        aws4Signer.setRegionName(region);
        aws4Signer.sign(request, credentials);

        headers.put("Authorization", request.getHeaders().get(SignerConstants.AUTHORIZATION));
        headers.put("X-Amz-Date", request.getHeaders().get(SignerConstants.X_AMZ_DATE));
        headers.put("X-KSC-SERVICE", service);
        headers.put("X-KSC-REGION", region);

        return headers;
    }

    /**
     * 计算PUT请求的签名信息，并将签名信息放到HTTP Header中发送给服务器端，该方法即返回包含签名信息的HTTP Header
     *
     * @param uri     请求地址, ex: http://quota.inner.ksyun.com/service/createService
     * @param body    PUT请求时，HTTP body的内容, ex: accountId=sdfs&region=cn-beijing-1&id=1231
     * @param headers PUT请求时，不包含签名的原有HTTP Header
     * @param service 需要调用的OpenAPI的服务，如：cdn,iam 等
     * @param ak      计算签名使用的AccessKey的值
     * @param sk      计算签名使用的SecretAccessKey的值
     * @return 包含签名信息的HTTP Header. 包含参数headers的内容
     * @throws Exception
     */
    public static List<Header> getAuthHeaderForPut(URI uri, String body, Map<String, String> headers, String service, String region, String ak, String sk)
            throws Exception {
        Request<String> request = new DefaultRequest<String>(service);
        request.setHttpMethod(HttpMethodName.PUT);

        String scheme = uri.getScheme();
        String beforeAuthority = scheme == null ? "" : scheme + "://";
        String authority = uri.getAuthority();
        String path = uri.getPath();
        request.setEndpoint(URI.create(beforeAuthority + authority));
        request.setResourcePath(path);

        headers = headers == null ? new HashMap<String, String>() : headers;
        if (headers.containsKey("X-Amz-Date")) {
            headers.remove("X-Amz-Date");
        }
        if (headers.containsKey("X-KSC-SERVICE")) {
            headers.remove("X-KSC-SERVICE");
        }
        if (headers.containsKey("X-KSC-REGION")) {
            headers.remove("X-KSC-REGION");
        }
        if (headers.containsKey("Authorization")) {
            headers.remove("Authorization");
        }
        request.setHeaders(headers);

        if (body == null) {
            request.setContent(null);
        } else {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(body.getBytes("UTF-8"));
            request.setContent(inputStream);
        }

        AWSCredentials credentials = new BasicAWSCredentials(ak, sk);
        AWS4Signer aws4Signer = new AWS4Signer();
        aws4Signer.setServiceName(service);
        aws4Signer.setRegionName(region);
        aws4Signer.sign(request, credentials);

        List<Header> headers2 = new ArrayList<Header>();
        headers2.add(new Header("Authorization", request.getHeaders().get(SignerConstants.AUTHORIZATION)));
        headers2.add(new Header("X-Amz-Date", request.getHeaders().get(SignerConstants.X_AMZ_DATE)));
        headers2.add(new Header("X-KSC-SERVICE", service));
        headers2.add(new Header("X-KSC-REGION", region));
        for (Entry<String, String> entry : headers.entrySet()) {
            headers2.add(new Header(entry.getKey(), entry.getValue()));
        }
        return headers2;
    }

    /**
     * 过滤请求中空参数例如value=
     * @param newParameters
     * @param parameters
     */
    private static void filterEmptyParams(Map<String, List<String>> newParameters,Map<String, String> parameters){
        for (Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                newParameters.put(key, Arrays.asList(value));
            }
        }
    }

}
