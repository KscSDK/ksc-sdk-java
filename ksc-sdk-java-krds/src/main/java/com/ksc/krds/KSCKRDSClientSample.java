package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.model.*;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupRequest;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupResponse;
import com.ksc.krds.model.krdsInstance.*;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupRequest;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupResponse;

import java.util.ArrayList;

public class KSCKRDSClientSample {
    public ListKrdsResponse listKRDS(){
        AWSCredentials credentials = new BasicAWSCredentials("AK",
                "SK");
        ListKrdsRequest request=new ListKrdsRequest();
        KSCKRDSClient client=new KSCKRDSClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        return client.listkrds(request);
    }

    public ListKrdsResponse listAllKrds(){
        AWSCredentials credentials = new BasicAWSCredentials("AK",
                "SK");
        ListKrdsRequest request=new ListKrdsRequest();
        KSCKRDSClient client=new KSCKRDSClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        ListKrdsResponse allResponse = new ListKrdsResponse();
        if (allResponse.getData().getInstances() == null){
            allResponse.getData().setInstances(new ArrayList<Instance>());
        }
        while (true){
            ListKrdsResponse response = client.listkrds(request);
            allResponse.getData().getInstances().addAll(response.getData().getInstances());
            if (response.getData().getMarker() >= response.getData().getTotalCount()){
                allResponse.getData().setTotalCount(response.getData().getTotalCount());
                allResponse.getData().setMarker(response.getData().getMarker());
                allResponse.getData().setMaxRecords(response.getData().getMaxRecords());
                allResponse.setRequestId(response.getRequestId());
                break;
            }
            request.setMarker(response.getData().getMarker());
        }
        return allResponse;
    }



    public CreateKrdsResponse createKRDS() {
        AWSCredentials credentials = new BasicAWSCredentials("AK",
                "SK");
        CreateKrdsRequest request=new CreateKrdsRequest();
        request.setDBInstanceName("testKRDSInstance");
        request.setDBInstanceType("HRDS");
        request.setMem(1);
        request.setDisk(10);
        request.setEngine("MySQL");
        request.setEngineVersion("5.6");
        request.setMasterUserName("admin");
        request.setMasterUserPassword("testAA123");
        request.setVpcId("214a1292-108e-45d1-8b9c-b45d2ab41c0c");
        request.setSubnetId("f80ce68d-eca2-475e-938b-666d90308212");
        request.setBillType("DAY");
        request.setProjectId(103800);

        KSCKRDSClient client=new KSCKRDSClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        return client.createKRDS(request);
    }

    public KrdsResponse deleteKRDS(){
        AWSCredentials credentials = new BasicAWSCredentials("AK",
                "SK");
        DeleteKrdsRequest request = new DeleteKrdsRequest();
        request.setDBInstanceIdentifier("97cb0cb2-87f5-4809-9bf3-73fc954d19e2");
        KSCKRDSClient client=new KSCKRDSClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        return client.deleteKRDS(request);
    }

    public DescribeSecurityGroupResponse describeSecurityGroup(){
        AWSCredentials credentials = new BasicAWSCredentials("AK",
                "SK");
        DescribeSecurityGroupRequest request = new DescribeSecurityGroupRequest();
        KSCKRDSClient client=new KSCKRDSClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        return client.describeSecurityGroup(request);
    }

    public ListKrdsBackupResponse listKrdsBackup(){
        AWSCredentials credentials = new BasicAWSCredentials("AK",
                "SK");
        ListKrdsBackupRequest request = new ListKrdsBackupRequest();
        request.setDBInatanceIdentifier("a7e9d977-5819-4c57-bb38-e9a804011039");
        KSCKRDSClient client=new KSCKRDSClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        return client.listKrdsBackup(request);
    }

    public static void main(String[] args){
        KSCKRDSClientSample ksckrdsClientSample = new KSCKRDSClientSample();
//        System.out.println(ksckrdsClientSample.createKRDS().getData().getDBInstance());
        ListKrdsResponse listKrdsResponse = ksckrdsClientSample.listAllKrds();
//        System.out.println(listKrdsResponse.getData().getInstances());
//        ksckrdsClientSample.deleteKRDS();
//        System.out.println(ksckrdsClientSample.describeSecurityGroup().getData().getSecurityGroups());
//        System.out.println(ksckrdsClientSample.listKrdsBackup().getData().getDBBackup());

    }
}
