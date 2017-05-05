package com.ksc.network.slb;

import com.ksc.network.slb.model.*;
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
        request.setListenerName("qnmd");
        request.setListenerProtocol("TCP");
//        request.setCertificateId("TCP ");
        request.setListenerPort("610");
        request.setMethod("RoundRobin");
        request.setSessionState("start");
//        request.setSessionPersistencePeriod((long) 3600);
//        request.setCookieType("lll");
//        request.setCookieName("lll");
        CreateListenersResult result = client.createListeners(request);
        log.info(result);
    }

    @Test
    public void modifyListeners() {
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        ModifyListenersRequest request = new ModifyListenersRequest();
        request.setListenerId("a413d3d4-29f5-4cb3-9c26-136be2681255");
        request.setListenerName("ahf");
        request.setListenerState("start");
        request.setSessionState("start");
        request.setMethod("RoundRobin");
        request.setSessionPersistencePeriod(Long.valueOf("3600"));
//        request.setCookieType("start");
//        request.setCookieName("start");
        ModifyListenersResult result = client.modifyListeners(request);
        log.info(result);
    }

    @Test
    public void deleteListeners() {
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        DeleteListenersRequest request = new DeleteListenersRequest();
        request.setListenerId("1a143cd8-44f9-4481-881d-a9c096856bdc");
        DeleteListenersResult result = client.deleteListeners(request);
        log.info(result);
    }

    @Test
    public void describeListeners(){
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        DescribeListenersRequest request=new DescribeListenersRequest();
//		request.addListenerIds("521a2e79-89f8-4a26-9e86-6ea9878d00eb");
        //request.withLoadBalancerIds("ec605c5c-ac74-419b-9138-2c3bf06af47e");
        DescribeListenersResult result=client.describeListeners(request);
        log.info(result);
    }

    @Test
    public void configureHealthCheck(){
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        ConfigureHealthCheckRequest request = new ConfigureHealthCheckRequest();
        request.setListenerId("a413d3d4-29f5-4cb3-9c26-136be2681255");
        request.setHealthCheckState("start");
        request.setHealthyThreshold(10);
        request.setInterval(20);
        request.setTimeout(9);
        request.setUnhealthyThreshold(8);
//        request.setUrlPath("\");
//        request.setIsDefaultHostName("lll");
//        request.setHostName("lll");
        ConfigureHealthCheckResult result = client.configureHealthCheck(request);
        log.info(result);
    }

    @Test
    public void modifyHealthCheck(){
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        ModifyHealthCheckRequest request = new ModifyHealthCheckRequest();
        request.setHealthCheckId("794c1d06-4818-46a4-b288-321e7837ed00");
        request.setHealthCheckState("start");
        request.setHealthyThreshold(10);
        request.setInterval(20);
        request.setTimeout(9);
        request.setUnhealthyThreshold(8);
//        request.setUrlPath("\");
//        request.setIsDefaultHostName("lll");
//        request.setHostName("lll");
        ModifyHealthCheckResult result = client.modifyHealthCheck(request);
        log.info(result);
    }

    @Test
    public void deleteHealthCheck() {
        KSCSLBClient client = new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        DeleteHealthCheckRequest request = new DeleteHealthCheckRequest();
        request.setHealthCheckId("794c1d06-4818-46a4-b288-321e7837ed00");
        DeleteHealthCheckResult result = client.deleteHealthCheck(request);
        log.info(result);
    }

    @Test
    public void describeHealthChecks(){
        KSCSLBClient client=new KSCSLBClient();
        client.setEndpoint("http://slb.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("slb");
        DescribeHealthChecksRequest request=new DescribeHealthChecksRequest();
//		request.addLoadBalancerIds("521a2e79-89f8-4a26-9e86-6ea9878d00eb");
//		request.setState("associate");
        //request.withVpcIds("147d81eb-f780-434d-8355-dc125013520e");
        DescribeHealthChecksResult result=client.describeHealthChecks(request);
        log.info(result);
    }
}
