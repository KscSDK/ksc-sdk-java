package com.ksc.network.slb;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.network.slb.model.DescribeLoadBalancersRequest;
import com.ksc.network.slb.model.DescribeLoadBalancersResult;

public class KSCSLBClientTest {
	private static final Logger log = Logger.getLogger(KSCSLBClientTest.class);
	@Test
	public void describeLoadBalancers(){
		KSCSLBClient client=new KSCSLBClient();
		client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("slb");
		DescribeLoadBalancersRequest request=new DescribeLoadBalancersRequest();
		request.addLoadBalancerIds("521a2e79-89f8-4a26-9e86-6ea9878d00eb");
		request.setState("associate");
		//request.withVpcIds("147d81eb-f780-434d-8355-dc125013520e");
		DescribeLoadBalancersResult result=client.describeLoadBalancers(request);
		log.info(result);
	}
}
