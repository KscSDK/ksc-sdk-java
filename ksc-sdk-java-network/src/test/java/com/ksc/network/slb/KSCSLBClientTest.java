package com.ksc.network.slb;

import com.ksc.network.slb.model.*;
import com.ksc.network.vpc.KSCVPCClient;
import com.ksc.network.vpc.model.vpc.DeleteVpcRequest;
import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import org.apache.log4j.Logger;
import org.junit.Test;

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

	@Test
    public void createLoadBalancer(){
	    KSCSLBClient client = new KSCSLBClient();
	    client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
	    client.setServiceNameIntern("slb");
        CreateLoadBalancerRequest request = new CreateLoadBalancerRequest();
        request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        //request.setLoadBalancerName("iiii");
        //request.setSubnetId("73447731-8071-4a2c-b405-38dcb3b88544");
        //request.setType("internal");
        CreateLoadBalancerResult result = client.createLoadBalancer(request);
        log.info(result);
    }

    @Test
    public void deleteLoadBalancer() {
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        DeleteLoadBalancerRequest request = new DeleteLoadBalancerRequest();
        request.setLoadBalancerId("acc3fdeb-f3d6-4dfb-9e33-27a632fb9463");
        DeleteLoadBalancerResult result = client.deleteLoadBalancer(request);
        log.info(result);
    }

    @Test
    public void modifyLoadBalancer() {
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        ModifyLoadBalancerRequest request = new ModifyLoadBalancerRequest();
        request.setLoadBalancerId("10d7f195-e905-4ca1-973b-1a31d37cdd1a");
//        request.setLoadBalancerName("mmd");
        request.setLoadBalancerState("stop");
        ModifyLoadBalancerResult result = client.modifyLoadBalancer(request);
        log.info(result);
    }

    @Test
    public void createListeners(){
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        CreateListenersRequest request = new CreateListenersRequest();
        request.setLoadBalancerId("10d7f195-e905-4ca1-973b-1a31d37cdd1a");
        request.setListenerState("start");
        request.setListenerName("qnm");
        request.setListenerProtocol("TCP");
//        request.setCertificateId("TCP ");
        request.setListenerPort("820");
        request.setMethod("RoundRobin");
        request.setSessionState("start");
//        request.setSessionPersistencePeriod((long) 3600);
//        request.setCookieType("lll");
//        request.setCookieName("lll");
        CreateListenersResult result = client.createListeners(request);
        log.info(result);
    }
}
