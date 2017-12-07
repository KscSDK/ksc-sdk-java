package com.ksc.kvs.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;
import java.util.List;
import java.util.Map;
import java.nio.charset.Charset;

@SuppressWarnings("deprecation")
public class HttpClientHelper {
	/**
	 * 向指定URL发送GET方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return URL 所代表远程资源的响应结果
	 */
	public static String sendGet(String url, String param, Map<String, String> headers) {
		HttpGet get = null;
		String content = "";
		try {
			@SuppressWarnings("resource")
			HttpClient httpClient = new DefaultHttpClient();
			// 设置超时时间
			httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
			httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);
			String urlNameString = url + "?" + param;
			get = new HttpGet(urlNameString);
			// 构造消息头
			get.setHeader("Connection", "Keep-Alive");
			get.setHeader("Accept", "application/json");
			for (String key : headers.keySet()) {
				String value = headers.get(key);
				get.setHeader(key, value);
			}
			HttpResponse response = httpClient.execute(get);
			//获取请求返回的数据
			HttpEntity entity = response.getEntity();
			content = EntityUtils.toString(entity);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (get != null) {
				try {
					get.releaseConnection();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return content;
	}	
	/**
	 * 向指定 URL 发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的 URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return 所代表远程资源的响应结果
	 */
	public static String sendPost(String url, String param, List<com.ksc.kvs.util.Header> header2) {
		HttpPost post = null;
		String content = "";
		try {
			@SuppressWarnings("resource")
			HttpClient httpClient = new DefaultHttpClient();
			// 设置超时时间
			httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
			httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);
			post = new HttpPost(url);
			// 构造消息头
			post.setHeader("Content-type", "application/json; charset=utf-8");
			post.setHeader("Connection", "Keep-Alive");
			post.setHeader("Accept", "application/json");
			for (com.ksc.kvs.util.Header header : header2) {
				post.setHeader(header.getName(), header.getValue());
			}
			// 构建消息实体
			StringEntity entity = new StringEntity(param, Charset.forName("UTF-8"));
			entity.setContentEncoding("UTF-8");
			// 发送Json格式的数据请求
			entity.setContentType("application/json");
			post.setEntity(entity);
			HttpResponse response = httpClient.execute(post);
			//获取请求返回的数据
			HttpEntity entity2 = response.getEntity();
			content = EntityUtils.toString(entity2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (post != null) {
				try {
					post.releaseConnection();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return content;
	}
}