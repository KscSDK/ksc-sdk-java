package com.ksc.services.kec;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.KscClientException;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.kec.KSCKECClient;
import com.ksc.kec.model.DescribeImagesRequest;
import com.ksc.kec.model.DescribeImagesResult;
import com.ksc.kec.model.DescribeInstancesRequest;
import com.ksc.kec.model.DescribeInstancesResult;
import com.ksc.kec.model.ModifyInstanceAttributeRequest;
import com.ksc.kec.model.ModifyInstanceAttributeResult;
import com.ksc.kec.model.MonitorInstancesRequest;
import com.ksc.kec.model.MonitorInstancesResult;
import com.ksc.kec.model.RebootInstancesRequest;
import com.ksc.kec.model.RebootInstancesResult;
import com.ksc.kec.model.RunInstancesRequest;
import com.ksc.kec.model.RunInstancesResult;
import com.ksc.kec.model.StartInstancesRequest;
import com.ksc.kec.model.StartInstancesResult;
import com.ksc.kec.model.StopInstancesRequest;
import com.ksc.kec.model.StopInstancesResult;
import com.ksc.kec.model.TerminateInstancesRequest;
import com.ksc.kec.model.TerminateInstancesResult;
import com.ksc.kec.model.UnmonitorInstancesRequest;
import com.ksc.kec.model.UnmonitorInstancesResult;

public class KSCOpenAPISample {

	private static final Logger log = Logger.getLogger(KSCOpenAPISample.class);
	public static final String AWS_AK = "";
	public static final String AWS_SK = "";
	@Test
	public void startInstances(){
		StartInstancesRequest request=new StartInstancesRequest();
		request.withInstanceIds("f9a732d4-4d3f-448c-a5d1-cef402474f9b");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		StartInstancesResult result=kec_client.startInstances(request);
		Gson gson = new Gson();
		log.info("startInstance Result: "+gson.toJson(result));
	}
	@Test
	public void stopInstances(){
		StopInstancesRequest request=new StopInstancesRequest();
		request.withInstanceIds("4b86fffa-e874-48dc-a5fc-4ec17348a11b");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		StopInstancesResult result=kec_client.stopInstances(request);
		Gson gson = new Gson();
		log.info("stopInstance Result: "+gson.toJson(result));
	}
	@Test
	public void rebootInstances(){
		RebootInstancesRequest request=new RebootInstancesRequest();
		request.withInstanceIds("9e53b71e-f49f-4ec8-9718-3aad3465a303");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		RebootInstancesResult result=kec_client.rebootInstances(request);
		Gson gson = new Gson();
		log.info("rebootInstances Result: "+gson.toJson(result));
	}
	@Test
	public void describeInstances() {
		//BasicConfigurator.configure();

		log.info("===========================================");
		log.info("Welcome to the KSC Java SDK!");
		log.info("===========================================");
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
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);

		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");

		DescribeInstancesRequest describe_instances_request = new DescribeInstancesRequest();
		describe_instances_request.withInstanceIds("f9a732d4-4d3f-448c-a5d1-cef402474f9b");
//		describe_instances_request.setSearch("csg_test_SriovNet-11");
		DescribeInstancesResult result = kec_client
				.describeInstances(describe_instances_request);
		Gson gson = new Gson();
		log.info("describeInstances Result: "+gson.toJson(result));
	}
	@Test
	public void DescribeImages(){
		DescribeImagesRequest request=new DescribeImagesRequest();
		request.setImageId("0a7b5f5a-13c7-447b-8df0-97bd90c5a8f8");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		//Region region=new Region(new InMemoryRegionImpl("cn-shanghai-3",null,true));
		//kec_client.setRegion(region);
		DescribeImagesResult result=kec_client.describeImages(request);
		Gson gson = new Gson();
		log.info("DescribeImages Result: "+gson.toJson(result));
	}

	@Test
	public void runInstances(){
		RunInstancesRequest request=new RunInstancesRequest();
		request.setImageId("cce6789c-83a1-4d51-94b4-74b59c60e39d");
		request.setInstanceType("I1.1A");
		request.setDataDiskGb(50);
		request.setMaxCount(1);
		request.setMinCount(1);
		request.setSubnetId("0773c3e5-f2ec-4d3e-82b3-91102915e19a");
		request.setInstancePassword("Qwer@1234");
		request.setChargeType("Monthly");
		request.setPurchaseTime(1);
		request.setSecurityGroupId("f467f1b9-26e4-4b9f-8901-ee260bde9869");
		request.setInstanceName("sdk-test");
		request.setInstanceNameSuffix("1");
		request.setSriovNetSupport(false);

		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		RunInstancesResult result=kec_client.runInstances(request);
		Gson gson = new Gson();
		log.info("runInstances Result: "+gson.toJson(result));
	}

	@Test
	public void terminateInstances(){
		TerminateInstancesRequest request=new TerminateInstancesRequest();
		request.withInstanceIds("f1184ae3-accd-432e-bc0a-659d45b9ccd8");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		TerminateInstancesResult result=kec_client.terminateInstances(request);
		Gson gson = new Gson();
		log.info("terminateInstances Result: "+gson.toJson(result));
	}

	@Test
	public void modifyInstanceAttribute(){
		ModifyInstanceAttributeRequest request=new ModifyInstanceAttributeRequest();
		request.setInstanceId("f9a732d4-4d3f-448c-a5d1-cef402474f9b");
//		request.setInstanceName("sdk-test-2");
		request.setInstancePassword("Qwer#1234");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		ModifyInstanceAttributeResult result=kec_client.modifyInstanceAttribute(request);
		Gson gson = new Gson();
		log.info("modifyInstanceAttribute Result: "+gson.toJson(result));
	}

	@Test
	public void monitorInstances(){
		MonitorInstancesRequest request=new MonitorInstancesRequest();
		request.withInstanceIds("f9a732d4-4d3f-448c-a5d1-cef402474f9b");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		MonitorInstancesResult result=kec_client.monitorInstances(request);
		Gson gson = new Gson();
		log.info("monitorInstances Result: "+gson.toJson(result));
	}

	@Test
	public void unmonitorInstances(){
		UnmonitorInstancesRequest request=new UnmonitorInstancesRequest();
		request.withInstanceIds("f9a732d4-4d3f-448c-a5d1-cef402474f9b");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		UnmonitorInstancesResult result=kec_client.unmonitorInstances(request);
		Gson gson = new Gson();
		log.info("unmonitorInstances Result: "+gson.toJson(result));
	}

}
