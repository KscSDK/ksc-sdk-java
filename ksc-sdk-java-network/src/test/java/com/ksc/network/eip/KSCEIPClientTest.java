package com.ksc.network.eip;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.network.eip.model.DescribeAddressesRequest;
import com.ksc.network.eip.model.DescribeAddressesResult;
import com.ksc.network.eip.model.GetLinesResult;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;

public class KSCEIPClientTest {
	private static final Logger log = Logger.getLogger(KSCEIPClientTest.class);
	@Test
	public void describeAddresses(){
		DescribeAddressesRequest request=new DescribeAddressesRequest();
		request.setMaxResults(1);
		KSCEIPClient client=new KSCEIPClient();
		client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
		//client.setServiceNameIntern("eip");
		DescribeAddressesResult result=client.describeAddresses(request);
		log.info(result);
	}
	@Test
	public void describeAddresses1(){
		DescribeAddressesRequest request=new DescribeAddressesRequest();
		request.setMaxResults(1);
		KSCEIPJsonClient client=new KSCEIPJsonClient();
		client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
		//client.setServiceNameIntern("eip");
		DescribeAddressesResult result=client.describeAddresses(request);
		log.info(result);
	}
	@Test
	public void getLines(){
		KSCEIPClient client=new KSCEIPClient();
		Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
		client.setRegion(region);
		GetLinesResult result=client.getLines();
		log.info(result);
	}
}
