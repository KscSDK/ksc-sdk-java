package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.parameter.ListRedisParametersRequest;
import com.ksc.redis.model.parameter.ListRedisParametersResponse;
import com.ksc.redis.model.parameter.SetRedisParametersRequest;
import com.ksc.redis.transform.parameter.ListRedisParametersMarshaller;
import com.ksc.redis.transform.parameter.ListRedisParametersUnmarshaller;
import com.ksc.redis.transform.parameter.SetRedisParametersMarshaller;
import com.ksc.redis.transform.parameter.SetRedisParametersUnmarshaller;

public class KscRedisParameterClient extends KscRedisClient {
    public KscRedisParameterClient() {
        super();
    }

    public KscRedisParameterClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscRedisParameterClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscRedisParameterClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscRedisParameterClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }

    public RedisResponse<ListRedisParametersResponse[]> listRedisParameters(ListRedisParametersRequest listRedisParametersRequest) {
        return doAction(new ListRedisParametersMarshaller().marshall(super.beforeMarshalling(listRedisParametersRequest)),
                new ListRedisParametersUnmarshaller()).getKscResponse();
    }

    public RedisResponse setRedisParameters(SetRedisParametersRequest setRedisParametersRequest) {
        return doAction(new SetRedisParametersMarshaller().marshall(super.beforeMarshalling(setRedisParametersRequest)),
                new SetRedisParametersUnmarshaller()).getKscResponse();
    }
}
