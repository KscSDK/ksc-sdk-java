package com.ksc.cdn;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.junit.Before;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.cdn.model.content.CreatePreloadRequest;
import com.ksc.cdn.model.content.CreatePreloadResult;
import com.ksc.cdn.model.content.Paths;
import com.ksc.cdn.model.content.PreloadBatch;

public class KscCdnTest {
	
	private KscCdnClient client;

	@Before
	public void setUp() throws Exception {
		AWSCredentials credentials = null;
		credentials = new BasicAWSCredentials("AKLTcI-Ek8zhT-mWMBhNYN_xkg111234",
				"OD0g8h/czdeVy+z/oCOk031yKpVWbAFJVddvFHd87D/L9Tb/tmia8tRJiaAmdyqy4w==");
		KscCdnClient client = new KscCdnClient(credentials);
		client.setEndpoint("http://cdn.api.ksyun.com");
	}

	/**
	 * 预加载
	 *
	 * @throws UnsupportedEncodingException
	 */
	@Test
	public void testCreatePreload() throws UnsupportedEncodingException {
		// 1. 设置预加载的域名
		String domain = "dxz02.test.ksyun.8686c.com";
		// String domain = "dl3.caohua.com";
		// String domain = "dxz02.test.ksyun.8686c.com";
		String distributionId = new String(Base64.encodeBase64(domain.getBytes("UTF-8")), "UTF-8");
		System.out.println("distributionId: " + distributionId);

		// 2. 设置预加载的路径
		Paths paths = new Paths();
		paths.withItems("/info_01.html");
		// paths.withItems("/info_02.html");
		// paths.withItems("/info_03.html");
		paths.setQuantity(1);

		String callerReference = "10002";

		PreloadBatch batch = new PreloadBatch(paths, callerReference);
		batch.setUserId("73400332");
		// 3. 创建预加载的请求
		CreatePreloadRequest request = new CreatePreloadRequest(distributionId, batch);
		// 4. 发送预加载的请求
		CreatePreloadResult result = client.createPreload(request);
		System.out.println(result.toString());
	}

}
