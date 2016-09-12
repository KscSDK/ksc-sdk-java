package com.ksc.services.kec;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.KscClientException;
import com.ksc.auth.AWSCredentials;
import com.ksc.kec.KSCKECClient;
import com.ksc.kec.model.DescribeImagesRequest;
import com.ksc.kec.model.DescribeImagesResult;
import com.ksc.kec.model.DescribeInstancesRequest;
import com.ksc.kec.model.DescribeInstancesResult;
import com.ksc.kec.model.RebootInstancesRequest;
import com.ksc.kec.model.RebootInstancesResult;
import com.ksc.kec.model.StartInstancesRequest;
import com.ksc.kec.model.StartInstancesResult;
import com.ksc.kec.model.StopInstancesRequest;
import com.ksc.kec.model.StopInstancesResult;

public class KSCOpenAPISample {

	private static final Logger log = Logger.getLogger(KSCOpenAPISample.class);
	@Test
	public void startInstances(){
		StartInstancesRequest request=new StartInstancesRequest();
		request.withInstanceIds("9e53b71e-f49f-4ec8-9718-3aad3465a303");
		KSCKECClient kec_client = new KSCKECClient();
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		StartInstancesResult result=kec_client.startInstances(request);
		log.info(result);
	}
	@Test
	public void stopInstances(){
		StopInstancesRequest request=new StopInstancesRequest();
		request.withInstanceIds("9e53b71e-f49f-4ec8-9718-3aad3465a303");
		KSCKECClient kec_client = new KSCKECClient();
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		StopInstancesResult result=kec_client.stopInstances(request);
		log.info(result);
	}
	@Test
	public void rebootInstances(){
		RebootInstancesRequest request=new RebootInstancesRequest();
		request.withInstanceIds("9e53b71e-f49f-4ec8-9718-3aad3465a303");
		KSCKECClient kec_client = new KSCKECClient();
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		RebootInstancesResult result=kec_client.rebootInstances(request);
		log.info(result);
	}
	@Test
	public void describeInstances() {
		//BasicConfigurator.configure();

		log.info("===========================================");
		log.info("Welcome to the KSC Java SDK!");
		log.info("===========================================");
		AWSCredentials credentials = null;
		try {
		/*	credentials = new BasicAWSCredentials("AKLTeIj3GT9LT5yYrtGPw6U_CA",
					"OGPZPr4RvfuiDFCEgKUpo9LTsy0BTA0IMGE8c/pUChUrTJMelyeg1KKshiPvGE0NfA==");*/
			/*credentials = new BasicAWSCredentials("AKLTcI-Ek8zhT-mWMBhNYN_xkg111",
					"OD0g8h/czdeVy+z/oCOk031yKpVWbAFJVddvFHd87D/L9Tb/tmia8tRJiaAmdyqy4w==");*/
		} catch (Exception e) {
			throw new KscClientException(
					"Cannot load the credentials from the credential profiles file. "
							+ "Please make sure that your credentials file is at the correct "
							+ "location (~/.aws/credentials), and is in valid format.",
					e);
		}
		/*
		 * The ProfileCredentialsProvider will return your [default] credential
		 * profile by reading from the credentials file located at
		 * (~/.aws/credentials).
		 */
		// Create the KSCKECClient object so we can call various APIs.
		// DescribeInstances sample
		KSCKECClient kec_client = new KSCKECClient();

		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");

		DescribeInstancesRequest describe_instances_request = new DescribeInstancesRequest();
		//describe_instances_request.withInstanceIds("9e53b71e-f49f-4ec8-9718-3aad3465a303");
		describe_instances_request.setSearch("csg_test_SriovNet-11");
		DescribeInstancesResult describe_instances_result = kec_client
				.describeInstances(describe_instances_request);
		log.info(describe_instances_result);
	}
	@Test
	public void DescribeImages(){
		DescribeImagesRequest request=new DescribeImagesRequest();
		request.setImageId("0a7b5f5a-13c7-447b-8df0-97bd90c5a8f8");
		KSCKECClient kec_client = new KSCKECClient();
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribeImagesResult result=kec_client.describeImages(request);
		log.info(result);
	}
}
