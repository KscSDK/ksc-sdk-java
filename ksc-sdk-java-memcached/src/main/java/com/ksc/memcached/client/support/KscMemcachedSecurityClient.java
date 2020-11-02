package com.ksc.memcached.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.security.DeleteMemcachedSecurityRuleRequest;
import com.ksc.memcached.model.security.ListMemcachedSecurityRulesRequest;
import com.ksc.memcached.model.security.ListMemcachedSecurityRulesResponse;
import com.ksc.memcached.model.security.SetMemcachedSecurityRulesRequest;
import com.ksc.memcached.transform.security.*;
import com.ksc.metrics.RequestMetricCollector;


public class KscMemcachedSecurityClient extends KscMemcachedClient {
    public KscMemcachedSecurityClient() {
        super();
    }

    public KscMemcachedSecurityClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscMemcachedSecurityClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscMemcachedSecurityClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscMemcachedSecurityClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }

    public MemcachedResponse setMemcachedSecurityRules(SetMemcachedSecurityRulesRequest setMemcachedSecurityRulesRequest) {
        return doAction(new SetMemcachedSecurityRulesMarshaller().marshall(super.beforeMarshalling(setMemcachedSecurityRulesRequest)),
                new SetMemcachedSecurityRulesUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse<ListMemcachedSecurityRulesResponse[]> listMemcachedSecurityRules(ListMemcachedSecurityRulesRequest listMemcachedSecurityRulesRequest) {
        return doAction(new ListMemcachedSecurityRulesMarshaller().marshall(super.beforeMarshalling(listMemcachedSecurityRulesRequest)),
                new ListMemcachedSecurityRulesUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse deleteMemcachedSecurityRule(DeleteMemcachedSecurityRuleRequest deleteMemcachedSecurityRuleRequest) {
        return doAction(new DeleteMemcachedSecurityRuleMarshaller().marshall(super.beforeMarshalling(deleteMemcachedSecurityRuleRequest)),
                new DeleteMemcachedSecurityRuleUnmarshaller()).getKscResponse();
    }
}
