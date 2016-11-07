package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.model.domain.DomainStatus;
import com.ksc.cdn.model.domain.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.GetCdnDomainsResult;
import org.junit.Assert;
import org.junit.Test;

/**
 * DomainTest
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class DomainTest {
    @Test
    public void testGetCdnDomains(){
        KscCdnClient cdnClient=new KscCdnClient();
        GetCdnDomainsRequest request=new GetCdnDomainsRequest();
        request.setPageNumber(1);
        request.setPageSize(20);
        request.setCdnType("download");
        request.setDomainStatus(DomainStatus.ONLINE.getCode());
        request.setDomainName("");
        request.setFuzzyMatch("");
        try {
            GetCdnDomainsResult cdnDomains = cdnClient.getCdnDomains(request);
            Assert.assertNotNull(cdnDomains);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
