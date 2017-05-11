package com.ksc.network.vpc;

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
import com.ksc.network.vpc.model.Tunnels.*;
import com.ksc.network.vpc.model.VpcPeeringConnection.*;
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
	public void DescribeVpcs() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeVpcsRequest request = new DescribeVpcsRequest();
		request.withVpcIds("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		DescribeVpcsResult result = client.describeVpcs(request);
		Assert.assertNotNull(result.getVpcSet());
		log.debug(result);
	}

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
		DescribeSecurityGroupsResult result = client
				.describeSecurityGroups(request);
		log.info(result);
	}

	@Test
	public void DescribeInternetGateways() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeInternetGatewaysRequest request = new DescribeInternetGatewaysRequest();
		// request.withInternetGatewayIds("c8bfc2a5-6335-4a05-a87a-4b08e4a4a81c");
		/*
		 * Filter filter=new Filter(); filter.setName("vpc-id");
		 * filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		 * request.withFilters(filter);
		 */
		DescribeInternetGatewaysResult result = client
				.describeInternetGateways(request);
		log.info(result);
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
		request.setVpcId("19e435f8-1b37-49f0-b2a4-c9b65e8cd00b");
		DeleteVpcResult result = client.deleteVpc(request);
		log.info(result);
	}

	@Test
	public void modifyVpc() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		ModifyVpcRequest request = new ModifyVpcRequest();
		request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		request.setVpcName("sdk-test");
		ModifyVpcResult result = client.modifyVpc(request);
		log.info(result);
	}

	@Test
	public void createSubnet() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		CreateSubnetRequest request = new CreateSubnetRequest();
		request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		request.setCidrBlock("10.0.5.0/24");
		request.setSubnetType("Normal");
		request.setDhcpIpFrom("10.0.5.2");
		request.setDhcpIpTo("10.0.5.253");
		request.setGatewayIp("10.0.5.1");
		request.setDns1("198.18.224.10");
		request.setDns2("198.18.224.11");
		request.setSubnetName("mmmm");
		CreateSubnetResult result = client.createSubnet(request);
		log.info(result);
	}

	@Test
	public void deleteSubnet() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DeleteSubnetRequest request = new DeleteSubnetRequest();
		request.setSubnetId("304f131d-ef9e-4ee8-b655-71e573d8ed8e");
		DeleteSubnetResult result = client.deleteSubnet(request);
		log.info(result);
	}

	@Test
	public void createSecurityGroup() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
		request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		request.setSecurityGroupName("hhh_SecurityGroup");
        request.setDescription("mmd");
		CreateSecurityGroupResult result = client.createSecurityGroup(request);
		log.info(result);
	}

	@Test
	public void deleteSecurityGroup() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DeleteSecurityGroupRequest request = new DeleteSecurityGroupRequest();
		request.setSecurityGroupId("3a8ac5c9-c14672-a15b-5fe29e7aa7ac");
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
//		request.setSecurityGroupName("abc_SecurityGroup");
		ModifySecurityGroupResult result = client.modifySecurityGroup(request);
		log.info(result);
	}

	@Test
	public void authorizeSecurityGroupEntry() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		AuthorizeSecurityGroupEntryRequest request = new AuthorizeSecurityGroupEntryRequest();
		request.setSecurityGroupId("2e369115-171a-45f4-92f4-c860190ba539");
		request.setCidrBlock("20.20.20.0/26");
		request.setDirection("out");
		request.setProtocol("icmp");
		request.setIcmpType(9);
		request.setIcmpCode(22);
		AuthorizeSecurityGroupEntryResult result = client
				.authorizeSecurityGroupEntry(request);
		log.info(result);
	}

	@Test
	public void revokeSecurityGroupEntry() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		RevokeSecurityGroupEntryRequest request = new RevokeSecurityGroupEntryRequest();
		request.setSecurityGroupId("2e369115-171a-45f4-92f4-c860190ba539");
		request.setSecurityGroupEntryId("a652d9e8-174f-4f9a-8f67-42826290506c");
		RevokeSecurityGroupEntryResult result = client
				.revokeSecurityGroupEntry(request);
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
		request.setRouteId("0540d37e-fb42-45cd-bd62-4bee86706319");
		DeleteRouteResult result = client.deleteRoute(request);
		log.info(result);
	}

	@Test
	public void describeRoutes() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeRoutesRequest request = new DescribeRoutesRequest();
		// request.withSubnetIds("cba50622-7aa6-481c-872b-341fd25ff81b");
		Filter filter = new Filter();
		filter.setName("vpc-id");
		filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		request.withFilters(filter);
		DescribeRoutesResult result = client.describeRoutes(request);
		log.info(result);
	}

	@Test
	public void modifySubnet() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		ModifySubnetRequest request = new ModifySubnetRequest();
		request.setSubnetId("2b7d174c-5716-48d7-8e6b-96473836cae2");
		// request.setSecurityGroupName("abc_SecurityGroup");
		ModifySubnetResult result = client.modifySubnet(request);
		log.info(result);
	}

	@Test
	public void createNetworkAcl() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		CreateNetworkAclRequest request = new CreateNetworkAclRequest();
		request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		request.setNetworkAclName("mya");
		CreateNetworkAclResult result = client.createNetworkAcl(request);
		log.info(result);
	}

	@Test
	public void deleteNetworkAcl() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DeleteNetworkAclRequest request = new DeleteNetworkAclRequest();
		request.setNetworkAclId("692e3ce8-4315-4bed-858e-e116d31c35f1");
		DeleteNetworkAclResult result = client.deleteNetworkAcl(request);
		log.info(result);
	}

	@Test
	public void modifyNetworkAcl() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		ModifyNetworkAclRequest request = new ModifyNetworkAclRequest();
		request.setNetworkAclId("ac777893-6b9d-46ad-be3c-4eed2edadf56");
		// request.setSecurityGroupName("abc_SecurityGroup");
		ModifyNetworkAclResult result = client.modifyNetworkAcl(request);
		log.info(result);
	}

    @Test
    public void createNetworkAclEntry() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        CreateNetworkAclEntryRequest request = new CreateNetworkAclEntryRequest();
        request.setNetworkAclId("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        request.setCidrBlock("172.31.0.0/16");
        request.setRuleNumber(2);
        request.setDirection("in");
        request.setProtocol("icmp");
        request.setIcmpType(9);
        request.setIcmpCode(22);
        request.setRuleAction("allow");
        CreateNetworkAclEntryResult result = client
                .createNetworkAclEntry(request);
        log.info(result);
    }

    @Test
    public void deleteNetworkAclEntry() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DeleteNetworkAclEntryRequest request = new DeleteNetworkAclEntryRequest();
        request.setNetworkAclId("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        request.setNetworkAclEntryId("8f0165ca-da50-4602-86b5-141dc7ec16cb");
        DeleteNetworkAclEntryResult result = client.deleteNetworkAclEntry(request);
        log.info(result);
    }

	@Test
	public void modifyNetworkAclEntry() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		ModifyNetworkAclEntryRequest request = new ModifyNetworkAclEntryRequest();
		request.setNetworkAclEntryId("e3e48163-e6f3-4de4-a621-b7b10207da21");
        request.setDescription("yyy");
        // request.setSecurityGroupName("abc_SecurityGroup");
		ModifyNetworkAclEntryResult result = client.modifyNetworkAclEntry(request);
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

        DescribeNetworkAclsResult result = client
                .describeNetworkAcls(request);
        log.info(result);
    }

    @Test
    public void associateNetworkAcl() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        AssociateNetworkAclRequest request = new AssociateNetworkAclRequest();
        request.setNetworkAclId("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        request.setSubnetId("cba50622-7aa6-481c-872b-341fd25ff81b");
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
        request.setNetworkAclId("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        request.setSubnetId("cba50622-7aa6-481c-872b-341fd25ff81b");
        // request.setSecurityGroupName("abc_SecurityGroup");
        DisassociateNetworkAclResult result = client.disassociateNetworkAcl(request);
        log.info(result);
    }

    @Test
    public void describeSubnetAvailableAddresses() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeSubnetAvailableAddressesRequest request = new DescribeSubnetAvailableAddressesRequest();
        // request.withSubnetIds("cba50622-7aa6-481c-872b-341fd25ff81b");
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
    public void modifySecurityGroupEntry() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        ModifySecurityGroupEntryRequest request = new ModifySecurityGroupEntryRequest();
        request.setSecurityGroupEntryId("1aa29807-e0e6-48f9-b68b-ea3f6e66378a");
        request.setDescription("123");
        // request.setSecurityGroupName("abc_SecurityGroup");
        ModifySecurityGroupEntryResult result = client.modifySecurityGroupEntry(request);
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
		request.setNatIpNumber(3);
		request.setBandWidth(20);
        request.setNatName("xyy");
		CreateNatResult result = client.createNat(request);
		log.info(result);
	}

    @Test
    public void deleteNat() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DeleteNatRequest request = new DeleteNatRequest();
        request.setNatId("c1357446-0e33-4e1c-ac47-48fff845ef3c");
        DeleteNatResult result = client.deleteNat(request);
        log.info(result);
    }

    @Test
    public void modifyNat() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        ModifyNatRequest request = new ModifyNatRequest();
        request.setNatId("2068b687-1926-4e7d-b76f-36bcc6316457");
//        request.setDescription("123");
        // request.setSecurityGroupName("abc_SecurityGroup");
        ModifyNatResult result = client.modifyNat(request);
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
		// request.setSecurityGroupName("abc_SecurityGroup");
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
        // request.setSecurityGroupName("abc_SecurityGroup");
        DisassociateNatResult result = client.disassociateNat(request);
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
//        request.withNetworkAclIds("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        DescribeNatsResult result = client.describeNats(request);
        log.info(result);
    }

	@Test
	public void createVpcPeeringConnection() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		CreateVpcPeeringConnectionRequest request = new CreateVpcPeeringConnectionRequest();
		request.setVpcId("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
		request.setPeeringName("hhh");
		request.setPeerVpcId("e81effbe-1dd2-4f07-9f3e-6dfc58293a3c");
		request.setPeerRegion("cn-shanghai-3");
		CreateVpcPeeringConnectionResult result = client.createVpcPeeringConnection(request);
		log.info(result);
	}

    @Test
    public void acceptVpcPeeringConnection() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        AcceptVpcPeeringConnectionRequest request = new AcceptVpcPeeringConnectionRequest();
        request.setVpcPeeringConnectionId("f27e28ef-2b21-4956-a769-acb7462fe5a2");
        AcceptVpcPeeringConnectionResult result = client.acceptVpcPeeringConnection(request);
        log.info(result);
    }

    @Test
    public void rejectVpcPeeringConnection() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        RejectVpcPeeringConnectionRequest request = new RejectVpcPeeringConnectionRequest();
        request.setVpcPeeringConnectionId("935be322-e185-4714-b7a0-3941914e959d");
        RejectVpcPeeringConnectionResult result = client.rejectVpcPeeringConnection(request);
        log.info(result);
    }

    @Test
    public void deleteVpcPeeringConnection() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DeleteVpcPeeringConnectionRequest request = new DeleteVpcPeeringConnectionRequest();
        request.setVpcPeeringConnectionId("fec53a24-418f-4b1a-8398-79e964957009");
        DeleteVpcPeeringConnectionResult result = client.deleteVpcPeeringConnection(request);
        log.info(result);
    }

    @Test
    public void describeVpcPeeringConnections() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeVpcPeeringConnectionsRequest request = new DescribeVpcPeeringConnectionsRequest();
//        Filter filter = new Filter();
//        filter.setName("vpc-id");
//        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
//        request.withFilters(filter);
//        request.withNetworkAclIds("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        DescribeVpcPeeringConnectionsResult result = client.describeVpcPeeringConnections(request);
        log.info(result);
    }

	@Test
	public void modifyVpcPeeringConnection() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		ModifyVpcPeeringConnectionRequest request = new ModifyVpcPeeringConnectionRequest();
		request.setVpcPeeringConnectionId("64c1fed3-1c97-4f79-9cf0-ad1c45d503bf");
//        request.setDescription("123");
		// request.setSecurityGroupName("abc_SecurityGroup");
		ModifyVpcPeeringConnectionResult result = client.modifyVpcPeeringConnection(request);
		log.info(result);
	}

	@Test
	public void describeTunnels() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		DescribeTunnelsRequest request = new DescribeTunnelsRequest();
//        Filter filter = new Filter();
//        filter.setName("vpc-id");
//        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
//        request.withFilters(filter);
//        request.withNetworkAclIds("ac777893-6b9d-46ad-be3c-4eed2edadf56");
		DescribeTunnelsResult result = client.describeTunnels(request);
		log.info(result);
	}

    @Test
    public void modifyTunnel() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        ModifyTunnelRequest request = new ModifyTunnelRequest();
        request.setTunnelId("");
//        request.setDescription("123");
        // request.setSecurityGroupName("abc_SecurityGroup");
        ModifyTunnelResult result = client.modifyTunnel(request);
        log.info(result);
    }

    @Test
    public void associateSubnet() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        AssociateSubnetRequest request = new AssociateSubnetRequest();
        request.setTunnelId("");
        request.setSubnetId("cba50622-7aa6-481c-872b-341fd25ff81b");
        // request.setSecurityGroupName("abc_SecurityGroup");
        AssociateSubnetResult result = client.associateSubnet(request);
        log.info(result);
    }

    @Test
    public void disassociateSubnet() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DisassociateSubnetRequest request = new DisassociateSubnetRequest();
        request.setTunnelId("");
        request.setSubnetId("cba50622-7aa6-481c-872b-341fd25ff81b");
        // request.setSecurityGroupName("abc_SecurityGroup");
        DisassociateSubnetResult result = client.disassociateSubnet(request);
        log.info(result);
    }

	@Test
	public void associateRemoteCidr() {
		KSCVPCClient client = new KSCVPCClient();
		client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
		client.setServiceNameIntern("vpc");
		AssociateRemoteCidrRequest request = new AssociateRemoteCidrRequest();
		request.setTunnelId("");
		request.setCidrBlock("");
		// request.setSecurityGroupName("abc_SecurityGroup");
		AssociateRemoteCidrResult result = client.associateRemoteCidr(request);
		log.info(result);
	}

    @Test
    public void disassociateRemoteCidr() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DisassociateRemoteCidrRequest request = new DisassociateRemoteCidrRequest();
        request.setTunnelId("");
        request.setCidrBlock("");
        // request.setSecurityGroupName("abc_SecurityGroup");
        DisassociateRemoteCidrResult result = client.disassociateRemoteCidr(request);
        log.info(result);
    }
}
