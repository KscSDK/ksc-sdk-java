package com.ksc.network.kcm;

import com.ksc.network.kcm.model.*;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;
import org.apache.log4j.Logger;
import org.junit.Test;


public class KSCKCMClientTest {

    private static final Logger log = Logger.getLogger(KSCKCMClientTest.class);
    private static final String privateKey = "" ;
    private static final String publicKey = "";

    @Test
    public void createCertificate(){
        KSCKCMClient client = new KSCKCMClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("kcm");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateCertificateRequest request = new CreateCertificateRequest();
        request.setCertificateName("sdk-test1111");
        request.setPrivateKey( privateKey);
        request.setPublicKey( publicKey);
        CreateCertificateResult result = client.createCertificate(request);
        log.info(result);
    }

    @Test
    public void deleteCertificate() {
        KSCKCMClient client = new KSCKCMClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("kcm");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteCertificateRequest request = new DeleteCertificateRequest();
        request.setCertificateId("99f17921-861e-4ee3-82f7-3d63f37cd445");
        DeleteCertificateResult result = client.deleteCertificate(request);
        log.info(result);
    }

    @Test
    public void modifyCertificate() {
        KSCKCMClient client = new KSCKCMClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("kcm");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyCertificateRequest request = new ModifyCertificateRequest();
        request.setCertificateId("e86fc407-c23c-4d93-9e85-6b52815b48b2");
        request.setCertificateName("cccc");
        ModifyCertificateResult result = client.modifyCertificate(request);
        log.info(result);
    }

    @Test
    public void describeCertificate() {
        KSCKCMClient client = new KSCKCMClient();
        client.setEndpoint("http://eip.inner.api.ksyun.com");
        client.setServiceNameIntern("kcm");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeCertificatesRequest request = new DescribeCertificatesRequest();
        DescribeCertificatesResult result = client.describeCertificates(request);
        log.info(result);
    }
}
