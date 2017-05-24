package com.ksc.epc;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.epc.model.ListEpcsRequest;
import com.ksc.epc.model.ListEpcsResult;

public class KSCEPCClientTest {
	private static final Logger log = Logger.getLogger(KSCEPCClientTest.class);
	@Test
	public void listEpcs(){
		AWSCredentials credentials = null;
			credentials = new BasicAWSCredentials("AKLTcI-Ek8zhT-mWMBhNYN_xkg111234",
					"OD0g8h/czdeVy+z/oCOk031yKpVWbAFJVddvFHd87D/L9Tb/tmia8tRJiaAmdyqy4w==");
		ListEpcsRequest request=new ListEpcsRequest();
		KSCEPCClient client=new KSCEPCClient(credentials);
		client.setEndpoint("http://epc.cn-shanghai-3.api.ksyun.com");
		//client.setServiceNameIntern("eip");
		ListEpcsResult result=client.listEpcs(request);
		log.info(result);
	}
}
