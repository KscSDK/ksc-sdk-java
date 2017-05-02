package com.ksc.network.eip;

import com.ksc.network.eip.model.*;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.network.vpc.KSCVPCClient;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;

public class KSCEIPClientTest {
	private static final Logger log = Logger.getLogger(KSCEIPClientTest.class);
	@Test
	public void describeAddresses(){
		DescribeAddressesRequest request=new DescribeAddressesRequest();
		request.setMaxResults(10);
		KSCEIPClient client=new KSCEIPClient();
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
	
    @Test
    public void allocateAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        AllocateAddressRequest request= new AllocateAddressRequest();
        request.setLineId("111765e4-f55f-4822-9ed6-b2464252fab2");
        request.setBandWidth(20);
        request.setChargeType("Peak");
//        request.setPurchaseTime(20);
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        AllocateAddressResult result=client.allocateAddress(request);
        log.info(result);
    }
    
    @Test
    public void releaseAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        ReleaseAddressRequest request= new ReleaseAddressRequest();
        request.setAllocationId("35836afa-b3f1-49c6-a8da-eb6f87321ade");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        ReleaseAddressResult result=client.releaseAddress(request);
        log.info(result);
    }
    
    @Test
    public void associateAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        AssociateAddressRequest request= new AssociateAddressRequest();
        request.setAllocationId("196a94be-1823-44c2-bd00-bc5cc40e9fa6");
        request.setInstanceType("Ipfwd");
        request.setInstanceId("40312a38-2fad-4557-a3e0-d93dad83b92a");
        request.setNetworkInterfaceId("40312a38-2fad-4557-a3e0-d93dad83b92a");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        AssociateAddressResult result=client.associateAddress(request);
        log.info(result);
    }
    
    @Test
    public void disassociateAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        DisassociateAddressRequest request= new DisassociateAddressRequest();
        request.setAllocationId("01efc4ea-a657-4e44-9257-e050b971c16d");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        DisassociateAddressResult result=client.disassociateAddress(request);
        log.info(result);
    }

    @Test
    public void modifyAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        ModifyAddressRequest request= new ModifyAddressRequest();
        request.setAllocationId("4c98a621-e536-4ac3-9e6c-182a61f425c4");
        request.setBandWidth(2);
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        ModifyAddressResult result=client.modifyAddress(request);
        log.info(result);
    }

    @Test
    public void alterAddressState(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        AlterAddressStateRequest request= new AlterAddressStateRequest();
        request.setAllocationId("2726625e-6a78-48a5-aab7-2527d6eca870");
        request.setState("stop");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        AlterAddressStateResult result=client.alterAddressState(request);
        log.info(result);
    }
}
