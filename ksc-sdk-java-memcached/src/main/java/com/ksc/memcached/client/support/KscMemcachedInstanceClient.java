package com.ksc.memcached.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.instance.*;
import com.ksc.memcached.transform.instance.*;
import com.ksc.metrics.RequestMetricCollector;


public class KscMemcachedInstanceClient extends KscMemcachedClient {
    public KscMemcachedInstanceClient() {
        super();
    }

    public KscMemcachedInstanceClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscMemcachedInstanceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscMemcachedInstanceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscMemcachedInstanceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }

    public MemcachedResponse<CreateMemcachedResponse> createMemcached(CreateMemcachedRequest createMemcachedRequest) {
        return doAction(new CreateMemcachedMarshaller().marshall(super.beforeMarshalling(createMemcachedRequest)),
                new CreateMemcachedUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse<ListMemcachedResponse> listMemcached(ListMemcachedRequest listMemcachedRequest) {
        return doAction(new ListMemcachedMarshaller().marshall(super.beforeMarshalling(listMemcachedRequest)),
                new ListMemcachedUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse<DescribeMemcachedResponse> describeMemcached(DescribeMemcachedRequest describeMemcachedRequest) {
        return doAction(new DescribeMemcachedMarshaller().marshall(super.beforeMarshalling(describeMemcachedRequest)),
                new DescribeMemcachedUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse deleteMemcached(DeleteMemcachedRequest deleteMemcachedRequest) {
        return doAction(new DeleteMemcachedMarshaller().marshall(super.beforeMarshalling(deleteMemcachedRequest)),
                new DeleteMemcachedUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse resizeMemcached(ResizeMemcachedRequest resizeMemcachedRequest) {
        return doAction(new ResizeMemcachedMarshaller().marshall(super.beforeMarshalling(resizeMemcachedRequest)),
                new ResizeMemcachedUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse flushMemcached(FlushMemcachedRequest flushMemcachedRequest) {
        return doAction(new FlushMemcachedMarshaller().marshall(super.beforeMarshalling(flushMemcachedRequest)),
                new FlushMemcachedUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse renameMemcached(RenameMemcachedRequest renameMemcachedRequest) {
        return doAction(new RenameMemcachedMarshaller().marshall(super.beforeMarshalling(renameMemcachedRequest)),
                new RenameMemcachedUnmarshaller()).getKscResponse();
    }

    public MemcachedResponse UpdateMemcachedPassword(UpdateMemcachedPassWordRequest updateMemcachedPassWordRequest) {
        return doAction(new UpdateMemcachedPassWordMarshaller().marshall(super.beforeMarshalling(updateMemcachedPassWordRequest)),
                new UpdateMemcachedPassWordUnmarshaller()).getKscResponse();
    }
}
