package com.ksc.network.vpc;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.DescribeInternetGatewaysRequest;
import com.ksc.network.vpc.model.DescribeInternetGatewaysResult;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.DescribeSecurityGroupsRequest;
import com.ksc.network.vpc.model.DescribeSecurityGroupsResult;
import com.ksc.network.vpc.model.DescribeSubnetsRequest;
import com.ksc.network.vpc.model.DescribeSubnetsResult;
import com.ksc.network.vpc.model.DescribeVpcsRequest;
import com.ksc.network.vpc.model.DescribeVpcsResult;


public class KSCVPCClientTest {
	private static final Logger log = Logger.getLogger(KSCVPCClientTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLTcI-Ek8zhT-mWMBhNYN_xkg111111",
			"OD0g8h/czdeVy+z/oCOk031yKpVWbAFJVddvFHd87D/L9Tb/tmia8tRJiaAmdyqy4w==");;
	/*@BeforeClass
	public void before() {
		
	}*/
	@Test
	public void DescribeVpcs(){
		KSCVPCClient client=new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeVpcsRequest request=new DescribeVpcsRequest();
		//request.withVpcIds("147d81eb-f780-434d-8355-dc125013520e");
		DescribeVpcsResult result=client.describeVpcs(request);
		Assert.assertNotNull(result.getVpcSet());
		log.debug(result);
	}
	@Test
	public void DescribeNetworkInterfaces(){
		KSCVPCClient client=new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeNetworkInterfacesRequest request=new DescribeNetworkInterfacesRequest();
		request.withNetworkInterfaceIds("65a5a408-2fad-46cb-8718-ee043add87a2");
		//request.withVpcIds("147d81eb-f780-434d-8355-dc125013520e");
		DescribeNetworkInterfacesResult result=client.describeNetworkInterfaces(request);
		log.info(result);
	}
	@Test
	public void DescribeSubnets(){
		KSCVPCClient client=new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeSubnetsRequest request=new DescribeSubnetsRequest();
		request.withSubnetIds("b05b8331-1b45-4c98-822f-718c8ea08e54");
		Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);
		DescribeSubnetsResult result=client.describeSubnets(request);
		log.info(result);
	}
	@Test
	public void DescribeSecurityGroups(){
		KSCVPCClient client=new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeSecurityGroupsRequest request=new DescribeSecurityGroupsRequest();
		request.withSecurityGroupIds("9ba12977-5fd0-4211-877b-03d3e550f64e");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
		DescribeSecurityGroupsResult result=client.describeSecurityGroups(request);
		log.info(result);
	}
	@Test
	public void DescribeInternetGateways(){
		KSCVPCClient client=new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeInternetGatewaysRequest request=new DescribeInternetGatewaysRequest();
		request.withInternetGatewayIds("d22fdf17-56ba-4af6-b269-dc060ea98133");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
		DescribeInternetGatewaysResult result=client.describeInternetGateways(request);
		log.info(result);
	}
}
