package com.ksc.sts;

import org.junit.Test;

import com.ksc.sts.model.AssumeRoleRequest;
import com.ksc.sts.model.AssumeRoleResult;

public class KSCSTSClientTest {

    @Test
    public void assumeRole() {
        KSCSTSClient client = new KSCSTSClient();
        client.setEndpoint("http://sts.cn-beijing-6.api.ksyun.com");

        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest();

        assumeRoleRequest.setRoleKrn("krn:ksc:iam::2000007181:role/role1");
        assumeRoleRequest.setDurationSeconds(900);
        assumeRoleRequest.setRoleSessionName("sntest");

        AssumeRoleResult assumeRole = client.assumeRole(assumeRoleRequest);
        System.out.println(assumeRole);
    }
}
