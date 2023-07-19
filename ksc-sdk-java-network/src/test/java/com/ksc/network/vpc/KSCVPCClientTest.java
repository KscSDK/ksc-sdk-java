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
import com.ksc.network.vpc.model.NetworkInterface.*;
import com.ksc.network.vpc.model.Route.*;
import com.ksc.network.vpc.model.SecurityGroups.*;
import com.ksc.network.vpc.model.havip.*;
import com.ksc.network.vpc.model.subnet.*;
import com.ksc.network.vpc.model.vpc.*;
import com.ksc.network.vpc.model.peering.*;
import com.ksc.network.vpc.model.vpn.*;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class KSCVPCClientTest {
	private static final Logger log = Logger.getLogger(KSCVPCClientTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials(
			"ak",
			"sk");;

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
        request.setVpcId("9f0cd9aa-6a14-4a0d-88c4-530f559b13b2");
        request.setNatMode("Subnet");
        request.setNatType("public");
        request.setNatIpNumber(1);
        request.setBandWidth(1);
        request.setNatName("gdg");
        request.setChargeType("DailyPaidByTransfer");
        request.setProjectId("472");
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
       /* Filter filter = new Filter();
        filter.setName("vpc-id");
        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.withFilters(filter);*/
       request.addProjectIds("472");
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

    @Test
    public void createVpcPeeringConnection(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateVpcPeeringConnectionRequest request = new CreateVpcPeeringConnectionRequest();
        request.setBandWidth(1000);
        request.setPeerAccountId("73404680");
        request.setPeeringName("sdk-test");
        request.setPeerRegion("cn-shanghai-3");
        request.setPeerVpcId("f908be08-58f0-48e2-b7fa-e438d057a94d");
        request.setProjectId("472");
        request.setRegion("cn-shanghai-3");
        request.setVpcId("9cd0989a-a584-45d1-8b61-c09566d9cd83");
        CreateVpcPeeringConnectionResult result = client.createVpcPeeringConnection(request);
        log.info(result);
    }

    @Test
    public void modifyVpcPeeringConnection(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyVpcPeeringConnectionRequest request = new ModifyVpcPeeringConnectionRequest();
        request.setBandWidth(1001);
        request.setVpcPeeringConnectionId("59df1a74-03de-4de5-bb0f-da6ae9fc6ede");
        request.setPeeringName("fsdsdf");
        ModifyVpcPeeringConnectionResult result = client.modifyVpcPeeringConnection(request);log.info(result);
    }

    @Test
    public void deleteVpcPeeringConnection(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteVpcPeeringConnectionRequest request = new DeleteVpcPeeringConnectionRequest();
        request.setVpcPeeringConnectionId("7e65ca33-fad7-45e1-9c88-6b74e7b85df7");
        DeleteVpcPeeringConnectionResult result = client.deleteVpcPeeringConnection(request);
        log.info(result);
    }

    @Test
    public void describeVpcPeeringConnections(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeVpcPeeringConnectionsRequest request = new DescribeVpcPeeringConnectionsRequest();
        request.addProjectIds("0");
        /*Filter filter=new Filter(); filter.setName("vpc-id");
        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
        request.addFilters(filter);*/
        DescribeVpcPeeringConnectionsResult result = client.describeVpcPeeringConnections(request);
        log.info(result);
    }

    @Test
    public void acceptVpcPeeringConnection(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        AcceptVpcPeeringConnectionRequest request = new AcceptVpcPeeringConnectionRequest();
        request.setVpcPeeringConnectionId("a2eefce4-a664-432a-a6a3-d3f426ef5263");
        AcceptVpcPeeringConnectionResult result = client.acceptVpcPeeringConnection(request);
        log.info(result);
    }

    @Test
    public void rejectVpcPeeringConnection(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        RejectVpcPeeringConnectionRequest request = new RejectVpcPeeringConnectionRequest();
        request.setVpcPeeringConnectionId("2b38b6d1-4e62-4b12-a2ac-4b016f0394ce");
        RejectVpcPeeringConnectionResult result = client.rejectVpcPeeringConnection(request);
        log.info(result);
    }
    
    @Test
    public void createVpnGateway(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateVpnGatewayRequest request = new CreateVpnGatewayRequest();
        request.setBandWidth(5);
        request.setProjectId("472");
        request.setVpcId("9cd0989a-a584-45d1-8b61-c09566d9cd83");
        request.setVpnGatewayName("sdk-test-1");
        request.setChargeType("Daily");
        CreateVpnGatewayResult result = client.createVpnGateway(request);
        log.info(result);
    }

    @Test
    public void modifyVpnGateway(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyVpnGatewayRequest request = new ModifyVpnGatewayRequest();
        request.setBandWidth(10);
        request.setVpnGatewayId("90f009e2-138f-4b0f-9412-78e8988faf2a");
        request.setVpnGatewayName("sdk-test");
        ModifyVpnGatewayResult result = client.modifyVpnGateway(request);
        log.info(result);
    }

    @Test
    public void deleteVpnGateway(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteVpnGatewayRequest request = new DeleteVpnGatewayRequest();
        request.setVpnGatewayId("f919d207-59e5-460e-a4dc-ebd5ed7e6903");
        DeleteVpnGatewayResult result = client.deleteVpnGateway(request);
        log.info(result);
    }

    @Test
    public void describeVpnGateways(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeVpnGatewaysRequest request = new DescribeVpnGatewaysRequest();
        request.addProjectIds("472");
        //request.addVpnGatewayIds("90f009e2-138f-4b0f-9412-78e8988faf2a");
        DescribeVpnGatewaysResult result = client.describeVpnGateways(request);
        log.info(result);
    }

    @Test
    public void createNetworkInterface(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateNetworkInterfaceRequest request = new CreateNetworkInterfaceRequest();
        //request.setPrivateIpAddress("");
        request.setSubnetId("1c83a7ee-5dd9-4080-8fd7-07822b9b69cb");
        request.addSecurityGroupIds("876255b8-2341-41f9-bcc6-e3520b79d570");
        CreateNetworkInterfaceResult result = client.createNetworkInterface(request);
        log.info(result);
    }

    @Test
    public void deleteNetworkInterface(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteNetworkInterfaceRequest request = new DeleteNetworkInterfaceRequest();
        request.setNetworkInterfaceId("4eebc5af-6a6b-44ba-9cd1-3a7ac439bace");
        DeleteNetworkInterfaceResult result = client.deleteNetworkInterface(request);
        log.info(result);
    }

    @Test
    public void createCustomerGateway(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateCustomerGatewayRequest request = new CreateCustomerGatewayRequest();
        request.setCustomerGatewayName("sdk-test1");
        request.setCustomerGatewayAddress("8.8.8.8");
        request.setHaCustomerGatewayAddress("9.9.9.9");
        CreateCustomerGatewayResult result = client.createCustomerGateway(request);
        log.info(result);
    }

    @Test
    public void deleteCustomerGateway(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteCustomerGatewayRequest request = new DeleteCustomerGatewayRequest();
        request.setCustomerGatewayId("411baf47-b927-4bf4-86e2-1303c94bbd12");
        DeleteCustomerGatewayResult result = client.deleteCustomerGateway(request);
        log.info(result);
    }

    @Test
    public void modifyCustomerGateway(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyCustomerGatewayRequest request = new ModifyCustomerGatewayRequest();
        request.setCustomerGatewayId("65000661-5360-42fc-88f1-115821a32309");
        request.setCustomerGatewayName("sdk-test");
        request.setCustomerGatewayAddress("110.43.131.186");
        request.setHaCustomerGatewayAddress("110.43.131.186");
        ModifyCustomerGatewayResult result = client.modifyCustomerGateway(request);
        log.info(result);
    }

    @Test
    public void describeCustomerGateways(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeCustomerGatewaysRequest request = new DescribeCustomerGatewaysRequest();
        request.addCustomerGatewayIds("65000661-5360-42fc-88f1-115821a32309");
        DescribeCustomerGatewaysResult result = client.describeCustomerGateways(request);
        log.info(result);
    }

    @Test
    public void createVpnTunnel(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateVpnTunnelRequest request = new CreateVpnTunnelRequest();
        request.setVpnTunnelName("zhy_sdk_test");
        request.setVpnGatewayId("bbaa0c7c-7854-4c72-82ba-6dc44198adfc");
        request.setCustomerGatewayId("65000661-5360-42fc-88f1-115821a32309");
        request.setType("Ipsec");
        request.setPreSharedKey("sdsfsdf");
        request.setVpnGreIp("5.5.5.1/30");
        request.setHaVpnGreIp("6.6.6.1/30");
        request.setCustomerGreIp("5.5.5.2/30");
        request.setHaCustomerGreIp("6.6.6.2/30");
        request.setIkeAuthenAlgorithm("md5");
        request.setIkeEncryAlgorithm("3des");
        request.setIkeDHGroup("2");
        request.setIpsecAuthenAlgorithm("esp-sha-hmac");
        request.setIpsecEncryAlgorithm("esp-3des");
        request.setIpsecLifetimeSecond(3600);
        request.setIpsecLifetimeTraffic(3600);
        CreateVpnTunnelResult result = client.createVpnTunnel(request);
        log.info(result);
    }

    @Test
    public void deleteVpnTunnel(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteVpnTunnelRequest request = new DeleteVpnTunnelRequest();
        request.setVpnTunnelId("a7c5b8cd-3fc3-4992-8dd3-a4b5bcd06c56");
        DeleteVpnTunnelResult result = client.deleteVpnTunnel(request);
        log.info(result);
    }

    @Test
    public void modifyVpnTunnel(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyVpnTunnelRequest request = new ModifyVpnTunnelRequest();
        request.setVpnTunnelId("da852437-7971-4891-b49c-e3117a58e131");
        request.setVpnTunnelName("sdk-test");
        ModifyVpnTunnelResult result = client.modifyVpnTunnel(request);
        log.info(result);
    }

    @Test
    public void describeVpnTunnels(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeVpnTunnelsRequest request = new DescribeVpnTunnelsRequest();
        /*request.addVpnTunnelIds("da852437-7971-4891-b49c-e3117a58e131");
        Filter filter = new Filter();
        filter.setName("vpn-gateway-id");
        filter.withValues("d3b2d66d-0051-4d6a-9412-1fbd24728a4c");
        request.addFilters(filter);*/
        DescribeVpnTunnelsResult result = client.describeVpnTunnels(request);
        log.info(result);
    }


    @Test
    public void addSecondaryCidrBlock(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        AddSecondaryCidrBlockRequest request = new AddSecondaryCidrBlockRequest();
        request.setVpcId("8c4d9b5c-f627-4052-9523-b2efed238ff3");
        request.setCidrBlock("10.20.0.0/16");

        AddSecondaryCidrBlockResult result = client.addSecondaryCidrBlock(request);
        log.info(result);
    }

    @Test
    public void deleteSecondaryCidrBlock(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteSecondaryCidrBlockRequest request = new DeleteSecondaryCidrBlockRequest();
        request.setVpcId("8c4d9b5c-f627-4052-9523-b2efed238ff3");
        request.setSecondaryCidrId("a72c9b48-78fd-4fdb-9883-879e6146e819");
        DeleteSecondaryCidrBlockResult result = client.deleteSecondaryCidrBlock(request);
        log.info(result);
    }


    @Test
    public void createHaVip(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateHaVipRequest request = new CreateHaVipRequest();
        request.setSubnetId("1e52c20a-43df-45ff-9a3e-b1160f6ba5a7");
        request.setIpAddress("10.0.0.200");

        CreateHaVipResult result = client.createHaVip(request);
        log.info(result);
    }

    @Test
    public void deleteHaVip(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteHaVipRequest request = new DeleteHaVipRequest();
        request.setHaVipId("1658ec9f-6e92-4907-9688-06c652cfc89f");
        DeleteHaVipResult result = client.deleteHaVip(request);
        log.info(result);
    }

    @Test
    public void describeHaVip() {
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        DescribeHaVipRequest request = new DescribeHaVipRequest();
//        Filter filter = new Filter();
//        filter.setName("vpc-id");
//        filter.withValues("3f8737a9-31d8-45b1-afe8-e4d87af24d0f");
//        request.withFilters(filter);
//        request.withHaVipIds("ac777893-6b9d-46ad-be3c-4eed2edadf56");
        DescribeHaVipResult result = client.describeHaVip(request);
        log.info(result);
    }

    @Test
    public void associateHaVip(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        AssociateHaVipRequest request = new AssociateHaVipRequest();
        request.setHaVipId("72f9b1c4-da29-4a96-bacb-74c390d60801");
        request.setNetworkInterfaceId("2662302d-f3e2-4a0f-8011-d67603695d38");

        AssociateHaVipResult result = client.associateHaVip(request);
        log.info(result);
    }

    @Test
    public void unAssociateHaVip(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        UnAssociateHaVipRequest request = new UnAssociateHaVipRequest();
        request.setHaVipId("72f9b1c4-da29-4a96-bacb-74c390d60801");
        request.setNetworkInterfaceId("2662302d-f3e2-4a0f-8011-d67603695d38");
        UnAssociateHaVipResult result = client.unAssociateHaVip(request);
        log.info(result);
    }

    @Test
    public void assignPrivateIpAddress(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        AssignPrivateIpAddressRequest request = new AssignPrivateIpAddressRequest();
        request.setNetworkInterfaceId("72e5ea6f-fc21-4cef-83c5-ffb831ae0c5b");
        request.addPrivateIpAddressList("87.36.0.234");
        request.setSecondaryPrivateIpAddressCount(2);

        AssignPrivateIpAddressResult result = client.assignPrivateIpAddress(request);
        log.info(result);
    }

    @Test
    public void unassignPrivateIpAddress(){
        KSCVPCClient client = new KSCVPCClient();
        client.setEndpoint("http://vpc.inner.api.ksyun.com");
        client.setServiceNameIntern("vpc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        UnassignPrivateIpAddressRequest request = new UnassignPrivateIpAddressRequest();
        request.setNetworkInterfaceId("72e5ea6f-fc21-4cef-83c5-ffb831ae0c5b");
        request.addPrivateIpAddressList("87.36.0.149");
        request.addPrivateIpAddressList("87.36.0.252");
        request.addPrivateIpAddressList("87.36.0.104");
        UnassignPrivateIpAddressResult result = client.unassignPrivateIpAddress(request);
        log.info(result);
    }

}
