package com.ksc.memcached.instance;


import com.ksc.auth.BasicAWSCredentials;
import com.ksc.memcached.client.support.KscMemcachedInstanceClient;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.memcached.model.instance.*;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class KscMemcachedInstanceClientTest {
    private static final Logger log = Logger.getLogger(KscMemcachedInstanceClientTest.class);
    KscMemcachedInstanceClient kscMemcachedInstanceClient;

    @Before
    public void setup() {
        kscMemcachedInstanceClient = new KscMemcachedInstanceClient(new BasicAWSCredentials("ak", "sk"), "az");
        kscMemcachedInstanceClient.setRegion(RegionUtils.getRegion("region"));
    }

    @Test
    public void createMemcached(){
        CreateMemcachedRequest createMemcachedRequest = new CreateMemcachedRequest();
        createMemcachedRequest.setName("MyMemcached");
        createMemcachedRequest.setMode(new Byte("2"));
        createMemcachedRequest.setCapacity(1);
        createMemcachedRequest.setBillType(5);
        createMemcachedRequest.setVnetId("vnetId");
        createMemcachedRequest.setVpcId("vpcId");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.createMemcached(createMemcachedRequest)));
    }

    @Test
    public void deleteMemcached(){
        DeleteMemcachedRequest deleteMemcachedRequest = new DeleteMemcachedRequest();
        deleteMemcachedRequest.setCacheId("cacheId");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.deleteMemcached(deleteMemcachedRequest)));
    }

    @Test
    public void resizeMemcached(){
        ResizeMemcachedRequest resizeMemcachedRequest = new ResizeMemcachedRequest();
        resizeMemcachedRequest.setCapacity(2);
        resizeMemcachedRequest.setCacheId("cacheId");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.resizeMemcached(resizeMemcachedRequest)));
    }

    @Test
    public void listMemcached(){
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.listMemcached(new ListMemcachedRequest())));
    }

    @Test
    public void describeMemcached(){
        DescribeMemcachedRequest describeMemcachedRequest = new DescribeMemcachedRequest();
        describeMemcachedRequest.setCacheId("cacheId");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.describeMemcached(describeMemcachedRequest)));
    }

    @Test
    public void flushMemcached(){
        FlushMemcachedRequest flushMemcachedRequest = new FlushMemcachedRequest();
        flushMemcachedRequest.setCacheId("cacheId");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.flushMemcached(flushMemcachedRequest)));
    }

    @Test
    public void renameMemcached(){
        RenameMemcachedRequest renameMemcachedRequest = new RenameMemcachedRequest();
        renameMemcachedRequest.setCacheId("cacheId");
        renameMemcachedRequest.setName("name1101");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.renameMemcached(renameMemcachedRequest)));
    }

    @Test
    public void UpdateMemcachedPassword(){
        UpdateMemcachedPassWordRequest updateMemcachedPassWordRequest = new UpdateMemcachedPassWordRequest();
        updateMemcachedPassWordRequest.setCacheId("cacheId");
        updateMemcachedPassWordRequest.setPassword("1321231");
        updateMemcachedPassWordRequest.setMode(new Byte("2"));
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedInstanceClient.UpdateMemcachedPassword(updateMemcachedPassWordRequest)));
    }
}
