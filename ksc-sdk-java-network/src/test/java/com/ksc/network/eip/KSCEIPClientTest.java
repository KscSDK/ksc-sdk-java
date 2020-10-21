package com.ksc.network.eip;

import com.ksc.network.eip.model.*;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;
import org.apache.log4j.Logger;
import org.junit.Test;

public class KSCEIPClientTest {
	private static final Logger log = Logger.getLogger(KSCEIPClientTest.class);

    @Test
    public void allocateAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        AllocateAddressRequest request= new AllocateAddressRequest();
        request.setLineId("111765e4-f55f-4822-9ed6-b2464252fab2");
        request.setBandWidth(20);
        request.setChargeType("Peak");
        request.setProjectId("472");
        AllocateAddressResult result=client.allocateAddress(request);
        log.info(result);
    }

    @Test
    public void releaseAddress(){
        KSCEIPClient client=new KSCEIPClient();
        client.setEndpoint("http://eip.cn-shanghai-3.api.ksyun.com");
        client.setServiceNameIntern("eip");
        ReleaseAddressRequest request= new ReleaseAddressRequest();
        request.setAllocationId("03b6ff1a-bd7d-4fca-8575-5091c16a7902");
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

    @Test
    public void modifyAddress() {
        KSCEIPClient client = new KSCEIPClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("eip");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyAddressRequest request = new ModifyAddressRequest();
        request.setAllocationId("804d4bbf-8c25-4996-aacf-ebe9a7d0552f");
        request.setBandWidth(2);
        ModifyAddressResult result = client.modifyAddress(request);
        log.info(result);
    }

}
