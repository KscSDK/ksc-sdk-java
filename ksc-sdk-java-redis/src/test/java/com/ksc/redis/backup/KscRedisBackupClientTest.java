package com.ksc.redis.backup;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.redis.client.support.KscRedisBackupClient;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.backup.*;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class KscRedisBackupClientTest {
    private static final Logger log = Logger.getLogger(KscRedisBackupClientTest.class);
    KscRedisBackupClient kscRedisBackupClient;

    @Before
    public void setup() {
        kscRedisBackupClient = new KscRedisBackupClient(new BasicAWSCredentials("ak", "sk"), "az");
        kscRedisBackupClient.setRegion(RegionUtils.getRegion("region"));
    }

    @Test
    public void createSnapshot() {
        CreateSnapshotRequest request = new CreateSnapshotRequest();
        request.setCacheId("cacheId");
        request.setName("swdswd");
        log.debug(RedisResponseConversion.toJson(kscRedisBackupClient.createSnapshot(request)));
    }

    @Test
    public void deleteSnapshot() {
        DeleteSnapshotRequest request = new DeleteSnapshotRequest();
        request.setSnapshotId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisBackupClient.deleteSnapshot(request)));
    }

    @Test
    public void restoreSnapshot() {
        RestoreSnapshotRequest request = new RestoreSnapshotRequest();
        request.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisBackupClient.restoreSnapshot(request)));
    }

    @Test
    public void describeSnapshot() {
        DescribeSnapshotRequest request = new DescribeSnapshotRequest();
        request.setCacheId("CacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisBackupClient.describeSnapshot(request)));
    }

    @Test
    public void downloadSnapshot() {
        DownloadSnapshotRequest request = new DownloadSnapshotRequest();
        log.debug(RedisResponseConversion.toJson(kscRedisBackupClient.downloadSnapshot(request)));
    }

    @Test
    public void exportSnapshot() {
        ExportSnapshotRequest request = new ExportSnapshotRequest();
        request.setSnapshotId("56cbe74c-3845-42ea-b2ad-301c88cae168");
        request.setObjectName("testFile1");
        request.setBucketName("dts");
        log.debug(RedisResponseConversion.toJson(kscRedisBackupClient.exportSnapshot(request)));
    }

    @Test
    public void setTimingSnapshot() {
        SetTimingSnapshotRequest request = new SetTimingSnapshotRequest();
        request.setCacheId("CacheId");
        request.setTimingSwitch("On");
        request.setTimezone("00:00-01:00");
        log.debug(RedisResponseConversion.toJson(kscRedisBackupClient.setTimingSnapshot(request)));
    }
}