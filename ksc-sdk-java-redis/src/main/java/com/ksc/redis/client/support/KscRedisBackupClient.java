package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.backup.*;
import com.ksc.redis.transform.backup.*;

public class KscRedisBackupClient extends KscRedisClient {
    public KscRedisBackupClient() {
        super();
    }

    public KscRedisBackupClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscRedisBackupClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscRedisBackupClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscRedisBackupClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }

    public RedisResponse createSnapshot(CreateSnapshotRequest req) {
        return doAction(new CreateSnapshotMarshaller().marshall(super.beforeMarshalling(req)), new CreateSnapshotUnmarshaller()).getKscResponse();
    }

    public RedisResponse deleteSnapshot(DeleteSnapshotRequest req) {
        return doAction(new DeleteSnapshotMarshaller().marshall(super.beforeMarshalling(req)), new DeleteSnapshotUnmarshaller()).getKscResponse();
    }

    public RedisResponse restoreSnapshot(RestoreSnapshotRequest req) {
        return doAction(new RestoreSnapshotMarshaller().marshall(super.beforeMarshalling(req)), new RestoreSnapshotUnmarshaller()).getKscResponse();
    }

    public RedisResponse<DescribeSnapshotResponse[]> describeSnapshot(DescribeSnapshotRequest req) {
        return doAction(new DescribeSnapshotMarshaller().marshall(super.beforeMarshalling(req)), new DescribeSnapshotUnmarshaller()).getKscResponse();
    }

    public RedisResponse<DownloadSnapshotResponse> downloadSnapshot(DownloadSnapshotRequest req) {
        return doAction(new DownloadSnapshotMarshaller().marshall(super.beforeMarshalling(req)), new DownloadSnapshotUnmarshaller()).getKscResponse();
    }

    public RedisResponse exportSnapshot(ExportSnapshotRequest req) {
        return doAction(new ExportSnapshotMarshaller().marshall(super.beforeMarshalling(req)), new ExportSnapshotUnmarshaller()).getKscResponse();
    }

    public RedisResponse setTimingSnapshot(SetTimingSnapshotRequest req) {
        return doAction(new SetTimingSnapshotMarshaller().marshall(super.beforeMarshalling(req)), new SetTimingSnapshotUnmarshaller()).getKscResponse();
    }
}