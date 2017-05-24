package com.ksc.network.vpc;

<<<<<<< HEAD
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryResult;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.DescribeSecurityGroupsRequest;
import com.ksc.network.vpc.model.SecurityGroups.DescribeSecurityGroupsResult;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.model.subnet.CreateSubnetResult;
import com.ksc.network.vpc.model.subnet.DeleteSubnetRequest;
import com.ksc.network.vpc.model.subnet.DeleteSubnetResult;
import com.ksc.network.vpc.model.subnet.DescribeSubnetsRequest;
import com.ksc.network.vpc.model.subnet.DescribeSubnetsResult;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.network.vpc.model.vpc.CreateVpcResult;
import com.ksc.network.vpc.model.vpc.DeleteVpcRequest;
import com.ksc.network.vpc.model.vpc.DeleteVpcResult;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

=======
>>>>>>> v4.0.0
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesRequest;
import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesResult;
import com.ksc.network.vpc.model.InternetGateways.DescribeInternetGatewaysRequest;
import com.ksc.network.vpc.model.InternetGateways.DescribeInternetGatewaysResult;
import com.ksc.network.vpc.model.Nat.*;
import com.ksc.network.vpc.model.NetworkAcl.*;
import com.ksc.network.vpc.model.NetworkInterface.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.NetworkInterface.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.Route.*;
import com.ksc.network.vpc.model.SecurityGroups.*;
import com.ksc.network.vpc.model.subnet.*;
import com.ksc.network.vpc.model.vpc.*;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class KSCVPCClientTest {
	private static final Logger log = Logger.getLogger(KSCVPCClientTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials(
			"AKLTcI-Ek8zhT-mWMBhNYN_xkg111111",
			"OD0g8h/czdeVy+z/oCOk031yKpVWbAFJVddvFHd87D/L9Tb/tmia8tRJiaAmdyqy4w==");;

	/*
	 * @BeforeClass public void before() {
	 * 
	 * }
	 */

	@Test
	public void DescribeAvailabilityZones() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeAvailabilityZonesRequest request = new DescribeAvailabilityZonesRequest();
		DescribeAvailabilityZonesResult result = client.describeAvailabilityZones(request);
		Assert.assertNotNull(result.getAvailabilityZoneInfo());
		log.debug(result);
	}

	@Test
	public void createVpc() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		CreateVpcRequest request = new CreateVpcRequest();
		request.setVpcName("hhh-test");
		request.setCidrBlock("10.1.0.0/20");
		request.setDefault(false);
		CreateVpcResult result = client.createVpc(request);
		log.info(result);
	}

	@Test
	public void deleteVpc() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DeleteVpcRequest request = new DeleteVpcRequest();
		request.setVpcId("ec16633d-1d8d-4d65-bee1-2aada6b3d27f");
		DeleteVpcResult result = client.deleteVpc(request);
		log.info(result);
	}

	@Test
	public void DescribeVpcs() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeVpcsRequest request = new DescribeVpcsRequest();
//		request.withVpcIds("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		DescribeVpcsResult result = client.describeVpcs(request);
		Assert.assertNotNull(result.getVpcSet());
		log.debug(result);
	}

    @Test
    public void DescribeNetworkInterfaces() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeNetworkInterfacesRequest request = new DescribeNetworkInterfacesRequest();
        // request.withNetworkInterfaceIds("7d42bbef-3e37-4b2f-a091-3e566b50de52");
        // request.withVpcIds("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        DescribeNetworkInterfacesResult result = client
                .describeNetworkInterfaces(request);
        log.info(result);
    }

	@Test
	public void createSubnet() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		CreateSubnetRequest request = new CreateSubnetRequest();
		request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		request.setCidrBlock("10.0.200.0/24");
		request.setSubnetType("Normal");
		request.setDhcpIpFrom("10.0.200.2");
		request.setDhcpIpTo("10.0.200.253");
		request.setGatewayIp("10.0.200.1");
		request.setDns1("198.18.224.10");
		request.setDns2("198.18.224.11");
		request.setSubnetName("aymy");
		CreateSubnetResult result = client.createSubnet(request);
		log.info(result);
	}

	@Test
	public void deleteSubnet() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DeleteSubnetRequest request = new DeleteSubnetRequest();
		request.setSubnetId("5d016578-d741-4ba7-b73d-5b6ad4a83bea");
		DeleteSubnetResult result = client.deleteSubnet(request);
		log.info(result);
	}

    @Test
    public void modifySubnet() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        ModifySubnetRequest request = new ModifySubnetRequest();
        request.setSubnetId("09b304f3-fcbf-4434-933d-267a5b5ed24c");
        request.setSubnetName("aymy");
//        request.setDns1("198.18.224.10");
//        request.setDns2("198.18.224.11");
        ModifySubnetResult result = client.modifySubnet(request);
        log.info(result);
    }

    @Test
    public void DescribeSubnets() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeSubnetsRequest request = new DescribeSubnetsRequest();
//		request.withSubnetIds("cba50622-7aa6-481c-872b-341fd25ff81b");
        Filter filter = new Filter();
        filter.setName("vpc-id");
        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.withFilters(filter);
        DescribeSubnetsResult result = client.describeSubnets(request);
        log.info(result);
    }

    @Test
    public void associateNetworkAcl() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        AssociateNetworkAclRequest request = new AssociateNetworkAclRequest();
        request.setNetworkAclId("8ef595bb-afc9-4142-8d3d-01338bfdaf9b");
        request.setSubnetId("09b304f3-fcbf-4434-933d-267a5b5ed24c");
        // request.setSecurityGroupName("abc_SecurityGroup");
        AssociateNetworkAclResult result = client.associateNetworkAcl(request);
        log.info(result);
    }

    @Test
    public void disassociateNetworkAcl() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DisassociateNetworkAclRequest request = new DisassociateNetworkAclRequest();
        request.setNetworkAclId("8ef595bb-afc9-4142-8d3d-01338bfdaf9b");
        request.setSubnetId("09b304f3-fcbf-4434-933d-267a5b5ed24c");
        DisassociateNetworkAclResult result = client.disassociateNetworkAcl(request);
        log.info(result);
    }

    @Test
    public void describeSubnetAvailableAddresses() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeSubnetAvailableAddressesRequest request = new DescribeSubnetAvailableAddressesRequest();
        Filter filter = new Filter();
        filter.setName("subnet-id");
        filter.withValues("2b7d174c-5716-48d7-8e6b-96473836cae2");
        request.withFilters(filter);
//        request.setMaxResults(50);
//        request.setNextToken("1");
        DescribeSubnetAvailableAddressesResult result = client.describeSubnetAvailableAddresses(request);
        log.info(result);
    }

    @Test
    public void createRoute() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        CreateRouteRequest request = new CreateRouteRequest();
        request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.setRouteType("InternetGateway");
        request.setDestinationCidrBlock("0.0.0.0/0");
        CreateRouteResult result = client.createRoute(request);
        log.info(result);
    }

    @Test
    public void deleteRoute() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DeleteRouteRequest request = new DeleteRouteRequest();
        request.setRouteId("04d46442-4d0d-4f0c-ab34-2ac2308307fc");
        DeleteRouteResult result = client.deleteRoute(request);
        log.info(result);
    }

    @Test
    public void describeRoutes() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeRoutesRequest request = new DescribeRoutesRequest();
//        request.withRouteIds("cba50622-7aa6-481c-872b-341fd25ff81b");
        Filter filter = new Filter();
        filter.setName("vpc-id");
        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.withFilters(filter);
        DescribeRoutesResult result = client.describeRoutes(request);
        log.info(result);
    }

    @Test
    public void createNetworkAcl() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        CreateNetworkAclRequest request = new CreateNetworkAclRequest();
        request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.setNetworkAclName("faf");
        CreateNetworkAclResult result = client.createNetworkAcl(request);
        log.info(result);
    }

    @Test
    public void deleteNetworkAcl() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DeleteNetworkAclRequest request = new DeleteNetworkAclRequest();
        request.setNetworkAclId("6a4792ab-1e92-4698-a1dc-527b6b22325b");
        DeleteNetworkAclResult result = client.deleteNetworkAcl(request);
        log.info(result);
    }

    @Test
    public void modifyNetworkAcl() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        ModifyNetworkAclRequest request = new ModifyNetworkAclRequest();
        request.setNetworkAclId("8ef595bb-afc9-4142-8d3d-01338bfdaf9b");
        request.setNetworkAclName("stmf");
        ModifyNetworkAclResult result = client.modifyNetworkAcl(request);
        log.info(result);
    }

    @Test
    public void createNetworkAclEntry() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        CreateNetworkAclEntryRequest request = new CreateNetworkAclEntryRequest();
        request.setNetworkAclId("8ef595bb-afc9-4142-8d3d-01338bfdaf9b");
        request.setCidrBlock("172.31.0.0/16");
        request.setRuleNumber(2);
        request.setDirection("in");
        request.setProtocol("icmp");
        request.setIcmpType(9);
        request.setIcmpCode(22);
        request.setRuleAction("allow");
        CreateNetworkAclEntryResult result = client.createNetworkAclEntry(request);
        log.info(result);
    }

    @Test
    public void deleteNetworkAclEntry() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DeleteNetworkAclEntryRequest request = new DeleteNetworkAclEntryRequest();
        request.setNetworkAclId("8ef595bb-afc9-4142-8d3d-01338bfdaf9b");
        request.setNetworkAclEntryId("11e94bad-d85d-4625-a1a6-8e76e23d46cc");
        DeleteNetworkAclEntryResult result = client.deleteNetworkAclEntry(request);
        log.info(result);
    }

    @Test
    public void describeNetworkAcls() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeNetworkAclsRequest request = new DescribeNetworkAclsRequest();
        Filter filter = new Filter();
        filter.setName("vpc-id");
        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.withFilters(filter);
//        request.withNetworkAclIds("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        DescribeNetworkAclsResult result = client.describeNetworkAcls(request);
        log.info(result);
    }
<<<<<<< HEAD
    
    @Test
    public void authorizeSecurityGroupEntry(){
        KSCVPCClient client=new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        AuthorizeSecurityGroupEntryRequest request= new AuthorizeSecurityGroupEntryRequest();
        request.setSecurityGroupId("2e369115-171a-45f4-92f4-c860190ba539");
        request.setCidrBlock("20.20.20.0/26");
        request.setDirection("out");
        request.setProtocol("icmp");
        request.setIcmpType(9);
        request.setIcmpCode(22);
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        AuthorizeSecurityGroupEntryResult result=client.authorizeSecurityGroupEntry(request);
        log.info(result);
    }
    
    @Test
    public void revokeSecurityGroupEntry(){
        KSCVPCClient client=new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        RevokeSecurityGroupEntryRequest request= new RevokeSecurityGroupEntryRequest();
        request.setSecurityGroupId("2e369115-171a-45f4-92f4-c860190ba539");
        request.setSecurityGroupEntryId("a652d9e8-174f-4f9a-8f67-42826290506c");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        RevokeSecurityGroupEntryResult result=client.revokeSecurityGroupEntry(request);
        log.info(result);
    }
=======

    @Test
    public void createSecurityGroup() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.setSecurityGroupName("wxqxbdx");
        request.setDescription("aaa");
        CreateSecurityGroupResult result = client.createSecurityGroup(request);
        log.info(result);
    }

    @Test
	public void deleteSecurityGroup() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DeleteSecurityGroupRequest request = new DeleteSecurityGroupRequest();
		request.setSecurityGroupId("6a2b9057-b42a-4371-9f7e-32e62e9cc003");
		DeleteSecurityGroupResult result = client.deleteSecurityGroup(request);
		log.info(result);
	}

	@Test
	public void modifySecurityGroup() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		ModifySecurityGroupRequest request = new ModifySecurityGroupRequest();
		request.setSecurityGroupId("98f1e07b-3d22-49e9-a2e8-629f114b6a79");
		request.setSecurityGroupName("aqzcs");
		ModifySecurityGroupResult result = client.modifySecurityGroup(request);
		log.info(result);
	}

    @Test
    public void authorizeSecurityGroupEntry() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        AuthorizeSecurityGroupEntryRequest request = new AuthorizeSecurityGroupEntryRequest();
        request.setSecurityGroupId("98f1e07b-3d22-49e9-a2e8-629f114b6a79");
        request.setCidrBlock("20.20.20.0/26");
        request.setDirection("in");
        request.setProtocol("icmp");
        request.setIcmpType(9);
        request.setIcmpCode(22);
        AuthorizeSecurityGroupEntryResult result = client.authorizeSecurityGroupEntry(request);
        log.info(result);
    }

    @Test
    public void revokeSecurityGroupEntry() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        RevokeSecurityGroupEntryRequest request = new RevokeSecurityGroupEntryRequest();
        request.setSecurityGroupId("98f1e07b-3d22-49e9-a2e8-629f114b6a79");
        request.setSecurityGroupEntryId("6343affe-f733-44c4-8d2b-a5194fea3b7d");
        RevokeSecurityGroupEntryResult result = client.revokeSecurityGroupEntry(request);
        log.info(result);
    }

    @Test
    public void DescribeSecurityGroups() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeSecurityGroupsRequest request = new DescribeSecurityGroupsRequest();
//		request.withSecurityGroupIds("9ba12977-5fd0-4211-877b-03d3e550f64e");
        Filter filter = new Filter();
        filter.setName("vpc-id");
        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.withFilters(filter);
        DescribeSecurityGroupsResult result = client.describeSecurityGroups(request);
        log.info(result);
    }

    @Test
    public void createNat() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        CreateNatRequest request = new CreateNatRequest();
        request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.setNatMode("Subnet");
        request.setNatType("private");
        request.setNatIpNumber(5);
        request.setBandWidth(100);
        request.setNatName("gdg");
        CreateNatResult result = client.createNat(request);
        log.info(result);
    }

    @Test
    public void deleteNat() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DeleteNatRequest request = new DeleteNatRequest();
        request.setNatId("1cccf533-23f0-4764-a853-2f7265aab949");
        DeleteNatResult result = client.deleteNat(request);
        log.info(result);
    }

    @Test
    public void modifyNat() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        ModifyNatRequest request = new ModifyNatRequest();
        request.setNatId("7baf16f1-a0f4-4bb4-b6ba-476bbffa18fe");
        request.setBandWidth(6);
        request.setNatName("wayy");
        ModifyNatResult result = client.modifyNat(request);
        log.info(result);
    }

    @Test
    public void describeNats() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeNatsRequest request = new DescribeNatsRequest();
        Filter filter = new Filter();
        filter.setName("vpc-id");
        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.withFilters(filter);
//        request.withNatIds("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        DescribeNatsResult result = client.describeNats(request);
        log.info(result);
    }

    @Test
    public void associateNat() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        AssociateNatRequest request = new AssociateNatRequest();
        request.setNatId("2068b687-1926-4e7d-b76f-36bcc6316457");
        request.setSubnetId("cba50622-7aa6-481c-872b-341fd25ff81b");
        AssociateNatResult result = client.associateNat(request);
        log.info(result);
    }

    @Test
    public void disassociateNat() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DisassociateNatRequest request = new DisassociateNatRequest();
        request.setNatId("2068b687-1926-4e7d-b76f-36bcc6316457");
        request.setSubnetId("cba50622-7aa6-481c-872b-341fd25ff81b");
        DisassociateNatResult result = client.disassociateNat(request);
        log.info(result);
    }

    @Test
    public void DescribeInternetGateways() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeInternetGatewaysRequest request = new DescribeInternetGatewaysRequest();
//        request.withInternetGatewayIds("c8bfc2a5-6335-4a05-a87a-4b08e4a4a81c");
//		Filter filter=new Filter(); filter.setName("vpc-id");
//        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
//        request.withFilters(filter);
        DescribeInternetGatewaysResult result = client.describeInternetGateways(request);
        log.info(result);
    }

>>>>>>> v4.0.0
}
