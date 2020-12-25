package com.ksc.network.bws;

import com.ksc.network.bws.model.*;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;
import org.apache.log4j.Logger;
import org.junit.Test;

public class KSCBWSClientTest {

    private static final Logger log = Logger.getLogger(KSCBWSClient.class);
    @Test
    public void createBandWidthShare(){
        KSCBWSClient client = new KSCBWSClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("bws");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateBandWidthShareRequest request = new CreateBandWidthShareRequest();
        request.setBandWidth(1);
        request.setBandWidthShareName("sdk-bws11");
        request.setLineId("111765e4-f55f-4822-9ed6-b2464252fab2");
        request.setProjectId("0");
        request.setChargeType("PostPaidByDay");
        CreateBandWidthShareResult result = client.createBandWidthShare(request);
        log.info(result);
    }

    @Test
    public void modifyBandWidthShare(){
        KSCBWSClient client = new KSCBWSClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("bws");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyBandWidthShareRequest request = new ModifyBandWidthShareRequest();
        request.setBandWidth(3);
        request.setBandWidthShareId("72f329e1-8880-4895-8152-587f30947120");
        ModifyBandWidthShareResult result = client.modifyBandWidthShare(request);
        log.info(result);
    }

    @Test
    public void deleteBandWidthShare(){
        KSCBWSClient client = new KSCBWSClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("bws");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteBandWidthShareRequest request = new DeleteBandWidthShareRequest();
        request.setBandWidthShareId("72f329e1-8880-4895-8152-587f30947120");
        DeleteBandWidthShareResult result = client.deleteBandWidthShare(request);
        log.info(result);
    }

    @Test
    public void describeBandWidthShares(){
        KSCBWSClient client = new KSCBWSClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("bws");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeBandWidthSharesRequest request = new DescribeBandWidthSharesRequest();
        request.addBandWidthShareIds("16230f91-e94b-4147-861d-aa4f3dd45d19");
        request.addProjectIds("0");
        DescribeBandWidthSharesResult result = client.describeBandWidthShares(request);
        log.info(result);
    }

    @Test
    public void associateBandWidthShare(){
        KSCBWSClient client = new KSCBWSClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("bws");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        AssociateBandWidthShareRequest request = new AssociateBandWidthShareRequest();
        request.setBandWidthShareId("72f329e1-8880-4895-8152-587f30947120");
        request.setAllocationId("90120a49-cbb7-4029-b9ca-f2a20e5b5013");
        AssociateBandWidthShareResult result = client.associateBandWidthShare(request);
        log.info(result);
    }

    @Test
    public void disassociateBandWidthShare(){
        KSCBWSClient client = new KSCBWSClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("bws");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DisassociateBandWidthShareRequest request = new DisassociateBandWidthShareRequest();
        request.setBandWidthShareId("72f329e1-8880-4895-8152-587f30947120");
        request.setAllocationId("90120a49-cbb7-4029-b9ca-f2a20e5b5013");
        request.setBandWidth(3);
        DisassociateBandWidthShareResult result = client.disassociateBandWidthShare(request);
        log.info(result);
    }

}
