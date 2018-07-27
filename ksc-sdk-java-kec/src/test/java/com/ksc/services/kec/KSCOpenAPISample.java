package com.ksc.services.kec;

import com.google.gson.Gson;
import com.ksc.KscClientException;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.kec.KSCKECClient;
import com.ksc.kec.model.*;
import com.ksc.model.Filter;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

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
		describe_instances_request.withInstanceIds("7ac7faf8-1c39-4479-bf65-db3489d850e4");
		describe_instances_request.withProjectIds("208");
//		describe_instances_request.setSearch("csg_test_SriovNet-11");
		DescribeInstancesResult result = kec_client
				.describeInstances(describe_instances_request);
		Gson gson = new Gson();
		log.info("describeInstances Result: "+gson.toJson(result));
	}
	@Test
	public void DescribeImages(){
		DescribeImagesRequest request=new DescribeImagesRequest();
		request.setImageId("28adde6a-f33f-43a3-b1bd-09b81f6f2167");
//		request.setImageType("share");
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
		request.setImageId("b2e78146-58f1-4298-9397-ebf942246a2b");
		request.setInstanceType("I1.1A");
		request.setDataDiskGb(50);
		request.setMaxCount(1);
		request.setMinCount(1);
		request.setSubnetId("9fd83a5e-33cf-4196-b8df-59fc57478488");
		request.setInstancePassword("Qwer@1234");
		request.setChargeType("Daily");
		request.setPurchaseTime(1);
		request.setSecurityGroupId("31a5484d-8077-4aca-8f79-e093f9d4bbc1");
		request.setInstanceName("sdk-test");
		request.setInstanceNameSuffix("1");
		request.setSriovNetSupport(false);
		request.setProjectId(208L);

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

	@Test
	public void createImage(){
		CreateImageRequest request=new CreateImageRequest();
		request.setInstanceId("6e6b4cbe-9b4f-4ce2-bd9c-1bf2bbf9bdf4");
		request.setName("MyTestImage");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		CreateImageResult result=kec_client.createImage(request);
		Gson gson = new Gson();
		log.info("createImage Result: "+gson.toJson(result));
	}

	@Test
	public void modifyImageAttribute(){
		ModifyImageAttributeRequest request=new ModifyImageAttributeRequest();
		request.setImageId("cfc62034-e544-4da7-814b-024c9ac3f03f");
		request.setName("MyTestImage1");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		ModifyImageAttributeResult result=kec_client.modifyImageAttribute(request);
		Gson gson = new Gson();
		log.info("modifyImageAttribute Result: "+gson.toJson(result));
	}

	@Test
	public void removeImages(){
		RemoveImagesRequest request=new RemoveImagesRequest();
		request.setImageId("0c6db359-ca34-4b35-8e02-efc143468764");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		RemoveImagesResult result=kec_client.removeImages(request);
		Gson gson = new Gson();
		log.info("removeImages Result: "+gson.toJson(result));
	}

	@Test
	public void createLocalVolumeSnapshot(){
		CreateLocalVolumeSnapshotRequest request=new CreateLocalVolumeSnapshotRequest();
		request.setLocalVolumeId("52bda9d2-14be-4f0f-b4f9-ee6ad006ae47-a");
		request.setLocalVolumeSnapshotName("MyTestSnapshot");
		request.setLocalVolumeSnapshotDesc("MyTestSnapshot");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		CreateLocalVolumeSnapshotResult result=kec_client.createLocalVolumeSnapshot(request);
		Gson gson = new Gson();
		log.info("createLocalVolumeSnapshot Result: "+gson.toJson(result));
	}

	@Test
	public void rollbackLocalVolume(){
		RollbackLocalVolumeRequest request=new RollbackLocalVolumeRequest();
		request.setLocalVolumeId("52bda9d2-14be-4f0f-b4f9-ee6ad006ae47-a");
		request.setLocalVolumeSnapshotId("644b5d64-3f74-43ed-b1ad-7a5fa8ed7102");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		RollbackLocalVolumeResult result=kec_client.rollbackLocalVolume(request);
		Gson gson = new Gson();
		log.info("rollbackLocalVolume Result: "+gson.toJson(result));
	}

	@Test
	public void deleteLocalVolumeSnapshot(){
		DeleteLocalVolumeSnapshotRequest request=new DeleteLocalVolumeSnapshotRequest();
		request.withLocalVolumeSnapshotIds("644b5d64-3f74-43ed-b1ad-7a5fa8ed7102");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DeleteLocalVolumeSnapshotResult result=kec_client.deleteLocalVolumeSnapshot(request);
		Gson gson = new Gson();
		log.info("deleteLocalVolumeSnapshot Result: "+gson.toJson(result));
	}

	@Test
	public void describeLocalVolumes(){
		DescribeLocalVolumesRequest request=new DescribeLocalVolumesRequest();
//		request.setInstanceName("KSC170518204032_");
		request.setMarker(0);
		request.setMaxResults(5);
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribeLocalVolumesResult result=kec_client.describeLocalVolumes(request);
		Gson gson = new Gson();
		log.info("describeLocalVolumes Result: "+gson.toJson(result));
	}

	@Test
	public void describeLocalVolumeSnapshots(){
		DescribeLocalVolumeSnapshotsRequest request=new DescribeLocalVolumeSnapshotsRequest();
		request.setLocalInstanceName("KSC170518204037_");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribeLocalVolumeSnapshotsResult result=kec_client.describeLocalVolumeSnapshots(request);
		Gson gson = new Gson();
		log.info("describeLocalVolumeSnapshots Result: "+gson.toJson(result));
	}

	@Test
	public void modifyInstanceType(){
		ModifyInstanceTypeRequest request=new ModifyInstanceTypeRequest();
		request.setInstanceId("28aa5ae4-f995-490f-a53d-d645af47f357");
		request.setInstanceType("I1.1B");
		request.setDataDiskGb(50);
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		ModifyInstanceTypeResult result=kec_client.modifyInstanceType(request);
		Gson gson = new Gson();
		log.info("modifyInstanceType Result: "+gson.toJson(result));
	}

	@Test
	public void modifyInstanceImage(){
		ModifyInstanceImageRequest request=new ModifyInstanceImageRequest();
		request.setInstanceId("28aa5ae4-f995-490f-a53d-d645af47f357");
		request.setImageId("e6664c07-39e4-4d6b-9d44-1d3721143584");
		request.setInstancePassword("ABCD123abcd");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		ModifyInstanceImageResult result=kec_client.modifyInstanceImage(request);
		Gson gson = new Gson();
		log.info("modifyInstanceImage Result: "+gson.toJson(result));
	}

	@Test
	public void describeInstanceVnc(){
		DescribeInstanceVncRequest request=new DescribeInstanceVncRequest();
		request.setInstanceId("28aa5ae4-f995-490f-a53d-d645af47f357");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribeInstanceVncResult result=kec_client.describeInstanceVnc(request);
		Gson gson = new Gson();
		log.info("describeInstanceVnc Result: "+gson.toJson(result));
	}

	@Test
	public void attachNetworkInterface(){
		AttachNetworkInterfaceRequest request=new AttachNetworkInterfaceRequest();
		request.setInstanceId("28aa5ae4-f995-490f-a53d-d645af47f357");
		request.withSecurityGroupIds("40b50dbd-2bb9-4c4e-840f-cc2d6b2e72f9");
		request.setSubnetId("81ae2693-583c-4dfe-8f82-7b1d930c7b1e");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		AttachNetworkInterfaceResult result=kec_client.attachNetworkInterface(request);
		Gson gson = new Gson();
		log.info("attachNetworkInterface Result: "+gson.toJson(result));
	}

	@Test
	public void modifyNetworkInterfaceAttribute(){
		ModifyNetworkInterfaceAttributeRequest request=new ModifyNetworkInterfaceAttributeRequest();
		request.setInstanceId("28aa5ae4-f995-490f-a53d-d645af47f357");
		request.setNetworkInterfaceId("8bb78d2d-7c88-49b1-a4b6-ddb3da084bda");
		request.withSecurityGroupIds("40b50dbd-2bb9-4c4e-840f-cc2d6b2e72f9");
		request.setSubnetId("81ae2693-583c-4dfe-8f82-7b1d930c7b1e");
		request.setPrivateIpAddress("10.0.2.6");

		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		ModifyNetworkInterfaceAttributeResult result=kec_client.modifyNetworkInterfaceAttribute(request);
		Gson gson = new Gson();
		log.info("modifyNetworkInterfaceAttribute Result: "+gson.toJson(result));
	}

	@Test
	public void detachNetworkInterface(){
		DetachNetworkInterfaceRequest request=new DetachNetworkInterfaceRequest();
		request.setInstanceId("28aa5ae4-f995-490f-a53d-d645af47f357");
		request.setNetworkInterfaceId("8bb78d2d-7c88-49b1-a4b6-ddb3da084bda");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DetachNetworkInterfaceResult result=kec_client.detachNetworkInterface(request);
		Gson gson = new Gson();
		log.info("detachNetworkInterface Result: "+gson.toJson(result));
	}

	@Test
	public void describeRegions(){
		DescribeRegionsRequest request = new DescribeRegionsRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribeRegionsResult result=kec_client.describeRegions(request);
		Gson gson = new Gson();
		log.info("describeRegions Result: "+gson.toJson(result));
	}
	
	@Test
	public void describeAvailabilityZones(){
		DescribeAvailabilityZonesRequest request = new DescribeAvailabilityZonesRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribeAvailabilityZonesResult result=kec_client.describeAvailabilityZones(request);
		Gson gson = new Gson();
		log.info("describeAvailabilityZones Result: "+gson.toJson(result));
	}
	
	@Test
	public void describeInstanceTypeConfigs(){
		DescribeInstanceTypeConfigsRequest request = new DescribeInstanceTypeConfigsRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		com.ksc.internal.SdkInternalList<Filter> filters = new com.ksc.internal.SdkInternalList<Filter>();
		
		Filter filter = new Filter();
		filter.setName("availability-zone");
		filter.setValues(Arrays.asList("cn-shanghai-3a"));
		filters.add(filter);
		
		Filter filter1 = new Filter();
		filter1.setName("instance-family");
		filter1.setValues(Arrays.asList("I1"));
		filters.add(filter1);
		
		request.setFilters(filters);
		DescribeInstanceTypeConfigsResult result=kec_client.describeInstanceTypeConfigs(request);
		Gson gson = new Gson();
		log.info("DescribeInstanceTypeConfigs Result: "+gson.toJson(result));
	}
	
	@Test
	public void describeInstanceFamilys(){
		DescribeInstanceFamilysRequest request = new DescribeInstanceFamilysRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribeInstanceFamilysResult result=kec_client.describeInstanceFamilys(request);
		Gson gson = new Gson();
		log.info("describeInstanceFamilys Result: "+gson.toJson(result));
	}
}
