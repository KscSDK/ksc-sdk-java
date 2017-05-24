package com.ksc.network.eip;

<<<<<<< HEAD
import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.network.eip.model.AllocateAddressRequest;
import com.ksc.network.eip.model.AllocateAddressResult;
import com.ksc.network.eip.model.AssociateAddressRequest;
import com.ksc.network.eip.model.AssociateAddressResult;
import com.ksc.network.eip.model.DescribeAddressesRequest;
import com.ksc.network.eip.model.DescribeAddressesResult;
import com.ksc.network.eip.model.DisassociateAddressRequest;
import com.ksc.network.eip.model.DisassociateAddressResult;
import com.ksc.network.eip.model.GetLinesResult;
import com.ksc.network.eip.model.ReleaseAddressRequest;
import com.ksc.network.eip.model.ReleaseAddressResult;
import com.ksc.network.vpc.KSCVPCClient;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
=======
import com.ksc.network.eip.model.*;
>>>>>>> v4.0.0
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;
import org.apache.log4j.Logger;
import org.junit.Test;

public class KSCEIPClientTest {
	private static final Logger log = Logger.getLogger(KSCEIPClientTest.class);
<<<<<<< HEAD
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
	
=======

>>>>>>> v4.0.0
    @Test
    public void allocateAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        AllocateAddressRequest request= new AllocateAddressRequest();
<<<<<<< HEAD
        request.setLineId("7930673c-46e1-4144-9e5e-2b9c9664a2e1");
        request.setBandWidth(20);
        request.setChargeType("Monthly");
        request.setPurchaseTime(20);
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
=======
        request.setLineId("111765e4-f55f-4822-9ed6-b2464252fab2");
        request.setBandWidth(20);
        request.setChargeType("Peak");
//        request.setPurchaseTime(20);
>>>>>>> v4.0.0
        AllocateAddressResult result=client.allocateAddress(request);
        log.info(result);
    }
    
    @Test
    public void releaseAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        ReleaseAddressRequest request= new ReleaseAddressRequest();
<<<<<<< HEAD
        request.setAllocationId("b9d03159-56dc-46d6-a716-37a09979cfed");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
=======
        request.setAllocationId("03b6ff1a-bd7d-4fca-8575-5091c16a7902");
>>>>>>> v4.0.0
        ReleaseAddressResult result=client.releaseAddress(request);
        log.info(result);
    }
    
    @Test
    public void associateAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        AssociateAddressRequest request= new AssociateAddressRequest();
<<<<<<< HEAD
        request.setAllocationId("01efc4ea-a657-4e44-9257-e050b971c16d");
        request.setInstanceType("Slb");
        request.setInstanceId("b8a9d823-6c10-4293-9064-fd6669f5b2bb");
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
=======
        request.setAllocationId("196a94be-1823-44c2-bd00-bc5cc40e9fa6");
        request.setInstanceType("Ipfwd");
        request.setInstanceId("40312a38-2fad-4557-a3e0-d93dad83b92a");
        request.setNetworkInterfaceId("40312a38-2fad-4557-a3e0-d93dad83b92a");
>>>>>>> v4.0.0
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
<<<<<<< HEAD
		/*Filter filter=new Filter();
		filter.setName("vpc-id");
		filter.withValues("147d81eb-f780-434d-8355-dc125013520e");
		request.withFilters(filter);*/
        DisassociateAddressResult result=client.disassociateAddress(request);
        log.info(result);
    }
=======
        DisassociateAddressResult result=client.disassociateAddress(request);
        log.info(result);
    }

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

>>>>>>> v4.0.0
}
