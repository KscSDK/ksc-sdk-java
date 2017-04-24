package com.ksc.network.slb;

import com.ksc.network.slb.model.CreateLoadBalancerRequest;
import com.ksc.network.slb.model.CreateLoadBalancerResult;
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
//		request.addLoadBalancerIds("521a2e79-89f8-4a26-9e86-6ea9878d00eb");
//		request.setState("associate");
		//request.withVpcIds("147d81eb-f780-434d-8355-dc125013520e");
		DescribeLoadBalancersResult result=client.describeLoadBalancers(request);
		log.info(result);
	}

//	@Test
//    public void createLoadBalancer(){
//	    KSCSLBClient client = new KSCSLBClient();
//	    client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
//	    client.setServiceNameIntern("slb");
//        CreateLoadBalancerRequest request = new CreateLoadBalancerRequest();
//        request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
//        request.setLoadBalancerName("iiii");
//        request.setSubnetId("73447731-8071-4a2c-b405-38dcb3b88544");
//        request.setType("internal");
//        CreateLoadBalancerResult result = client.createLoadBalancer(request);
//        log.info(result);
//    }
}
