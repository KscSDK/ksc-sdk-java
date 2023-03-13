package com.ksc.services.kec;

import java.util.Arrays;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ksc.kec.model.*;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.google.gson.Gson;
import com.ksc.KscClientException;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.kec.KSCKECClient;
import com.ksc.model.Filter;

public class KSCOpenAPISample {

	private static final Logger log = Logger.getLogger(KSCOpenAPISample.class);
	public static final String AWS_AK = "AKLTdp0vMEzAQdihsE8eb5ABGg";
	public static final String AWS_SK = "OLz41dJ7nGeKG4qXDxo3nX4A7TZ6MVrruyAXN8lrOcRmoeLXENJQHWfJOCFNWw";

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
		/*Gson gson = new Gson();
		log.info("rebootInstances Result: "+gson.toJson(result));*/
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
//		describe_instances_request.withInstanceIds("3313990b-22d9-4ca7-b58c-eb75559a1b6f");
		Sort sort = new Sort();
		sort.setName("CreationDate");
		sort.setValue("DESC");
		describe_instances_request.setSort(sort);
		describe_instances_request.withProjectIds("515");
//		describe_instances_request.setSearch("csg_test_SriovNet-11");
		DescribeInstancesResult result = kec_client
				.describeInstances(describe_instances_request);
		/*JSONPObject gson = new Gson();
		log.info("describeInstances Result: "+gson.toJson(result));*/
	}

	@Test
	public void DescribeImages(){
		DescribeImagesRequest request=new DescribeImagesRequest();
		request.setImageId("2b1d9503-0772-4291-800f-2eb07058f7ae");
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
		request.setImageId("e22d048a-e0b8-465e-a692-d3358981eeff");
		request.setInstanceType("E1.2B");

		SystemDisk systemDisk = new SystemDisk();
		systemDisk.setDiskType("Local_SSD");
		systemDisk.setDiskSize(25);
		request.setSystemDisk(systemDisk);

		request.setDataDiskGb(25);

		request.setMaxCount(1);
		request.setMinCount(1);
		request.setSubnetId("afa859fc-65ea-410d-99f2-d686cf9da1d9");
//		request.setInstancePassword("Qwer@1234");
		request.setChargeType("HourlyInstantSettlement");

//		request.setLocalVolumeSnapshotId("969829eb-8945-474c-a14e-70a7f09ae552");

		request.setChargeType("Spot");
//		request.setSpotStrategy("SpotWithPriceLimit");
//		request.setSpotPriceLimit(0.51334);

		request.setPurchaseTime(1);
		request.setSecurityGroupId("18523073-c6c0-44ba-9858-1c0f92cb453d");
		request.setInstanceName("sdktest-1020");
		request.setInstanceNameSuffix("1");
		request.setSriovNetSupport(false);
		request.setProjectId(515L);
//		request.setModelId("5ae8bc0f-cdf2-416d-ab60-f2a2a69ce695");
		
		DataDisk dataDisk = new DataDisk();
		dataDisk.setType("EHDD");
		dataDisk.setSize(10);
		dataDisk.setDeleteWithInstance(true);
		request.withDataDisks(dataDisk);

//		request.setAddressBandWidth(1);
//		request.setAddressChargeType("PrePaidByMonth");
//		request.setLineId("111765e4-f55f-4822-9ed6-b2464252fab2");
//		request.setAddressPurchaseTime(1);
//		request.setAddressProjectId("515");

		request.withKeyIds("c079a41f-beb4-4b73-a68c-69f25b9c8819");

		request.setHostName("host-sdktest-1016");
		request.setHostNameSuffix("1");

		request.setDataGuardId("42832fe7-8d68-473f-b113-f0912de1622d");

		request.setAutoDeleteTime("2020-10-20 17:00:00");

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
		request.withInstanceIds("7bb13875-fe64-4697-af5a-fe446e6bf1dd");
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
		request.setInstanceId("b163dfc1-cd37-4cc7-a6bb-b4c45ecfa359");
		request.withDataDiskIds("e8a2ecf9-00ec-43e7-a95c-fb32d05bad84");
		request.setName("sdk-test-1125-2");
//		request.withSnapshotIds("1bf81c33-85dd-4909-94b8-3e3f1e4abf0d","6657fa67-65a1-43ee-b74d-dcfdb0df8a95");
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
		request.setInstanceName("openapi_test_server_1603256998446");
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
//		request.setLocalVolumeSnapshotId("a5646fd6-cb18-45b3-8014-8d8c2ccc575b");
//		request.setSourceLocalVolumeId("596a89ea-99cc-45e4-a31c-cdaef2f546ba-b");
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-beijing-6.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		DescribePriceRequest request=new DescribePriceRequest();
		request.setInstanceType("N3.4B");
		request.setImageId("641a7f08-c8dc-543a-8931-7448eeba0e5f");
		request.setMaxCount(10);

		kec_client.describePrice(request);
		Gson gson = new Gson();
		log.info("describeLocalVolumeSnapshots Result: "+gson.toJson(kec_client.describePrice(request)));
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
		kec_client.setEndpoint("http://kec.cn-beijing-6.api.ksyun.com");
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

	@Test
	public void imageImport(){
		ImageImportRequest request = new ImageImportRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		request.setImageName("中文2");
		request.setImageUrl("http://ks3-cn-shanghai.ksyun.com/my-test/centos_6.5.img.base");
		request.setPlatform("centos-6");
		request.setArchitecture("x86_64");
		request.setImageFormat("qcow2");
		request.withDataImageUrl("http://ks3-cn-shanghai.ksyun.com/my-test/centos_6.5.img.base");
		request.withDataImageSize("20");
		request.withDataImageFormat("raw");
		ImageImportResult result=kec_client.imageImport(request);
		Gson gson = new Gson();
		log.info("imageImport Result: "+gson.toJson(result));
	}

	@Test
	public void imageCopy(){
		ImageCopyRequest request = new ImageCopyRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		request.setDestinationImageName("copy_test");
		request.withImageIds("13ef6101-a4a0-4dfe-89f9-036a63d06151");
		request.withDestinationRegions("cn-shanghai-3");
		ImageCopyResult result=kec_client.imageCopy(request);
		Gson gson = new Gson();
		log.info("imageCopy Result: "+gson.toJson(result));
	}

	@Test
	public void modifyImageSharePermission(){
		ModifyImageSharePermissionRequest request = new ModifyImageSharePermissionRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		request.setImageId("13ef6101-a4a0-4dfe-89f9-036a63d06151");
		request.setPermission("share");
		request.withAccountIds("2000001278");
		ModifyImageSharePermissionResult result=kec_client.modifyImageSharePermission(request);
		Gson gson = new Gson();
		log.info("modifyImageSharePermission Result: "+gson.toJson(result));
	}

	@Test
	public void describeImageSharePermission(){
        DescribeImageSharePermissionRequest request = new DescribeImageSharePermissionRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		request.setImageId("13ef6101-a4a0-4dfe-89f9-036a63d06151");
        DescribeImageSharePermissionResult result=kec_client.describeImageSharePermission(request);
		Gson gson = new Gson();
		log.info("describeImageSharePermission Result: "+gson.toJson(result));
	}
	@Test
	public void attachKey(){
		AttachKeyRequest request = new AttachKeyRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		request.withInstanceIds("714d8943-552e-4c17-b1bd-3c023bf7b0b4");
		request.withKeyIds("c079a41f-beb4-4b73-a68c-69f25b9c8819");
		AttachKeyResult result=kec_client.attachKey(request);
		Gson gson = new Gson();
		log.info("attachKey Result: "+gson.toJson(result));
	}

	@Test
	public void detachKey(){
		DetachKeyRequest request = new DetachKeyRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		request.withInstanceIds("714d8943-552e-4c17-b1bd-3c023bf7b0b4");
		request.withKeyIds("c079a41f-beb4-4b73-a68c-69f25b9c8819");
		DetachKeyResult result=kec_client.detachKey(request);
		Gson gson = new Gson();
		log.info("detachKey Result: "+gson.toJson(result));
	}

	@Test
	public void modifyInstanceAutoDeleteTime(){
		ModifyInstanceAutoDeleteTimeRequest request = new ModifyInstanceAutoDeleteTimeRequest();
		AWSCredentials credentials = new BasicAWSCredentials(AWS_AK, AWS_SK);
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setEndpoint("http://kec.cn-shanghai-3.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
		request.withInstanceIds("b416944f-6980-4709-ab0b-c9c1458211b6");
		request.setAutoDeleteTime("2021-01-26 10:45");
		request.setAutoDeleteEip(true);
		ModifyInstanceAutoDeleteTimeResult result=kec_client.modifyInstanceAutoDeleteTime(request);
		Gson gson = new Gson();
		log.info("modifyInstanceAutoDeleteTime Result: "+gson.toJson(result));
	}
}
