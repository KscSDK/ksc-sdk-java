package com.ksc.services.vcs;

import com.ksc.vcs.KSCVCSClient;
import com.ksc.vcs.model.*;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KSCVCSOpenAPISample {

    private static final Logger log = Logger.getLogger(KSCVCSOpenAPISample.class);

    KSCVCSClient vcs_client = null;
    private String version = "2016-10-18";

    @Before
    public void setup() {
        vcs_client = new KSCVCSClient();
        vcs_client.setEndpoint("http://vcs.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testListUniqueNames() {
        ListUniqueNamesRequest request = new ListUniqueNamesRequest();
        request.setVersion(version);
        ListUniqueNamesResult result = vcs_client.listUniqueNames(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());
    }

    @Test
    public void testListApps() {
        ListAppsRequest request = new ListAppsRequest();
        request.setVersion(version);
        request.setUniqueName("test");
        ListAppsResult result = vcs_client.listApps(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());
    }

    @Test
    public void testCreateConfiguration() {
        CreateConfigurationRequest request = new CreateConfigurationRequest();
        request.setUniqueName("test");
        request.setApp("live");
        request.setBucket("ksbucket");
        request.setUrl("http://test123.abc.com");

        CreateConfigurationResult result = vcs_client.createConfiguration(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testListConfigurations() {
        ListConfigurationsRequest request = new ListConfigurationsRequest();

        ListConfigurationsResult result = vcs_client.listConfigurations(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testGetConfiguration() {
        GetConfigurationRequest request = new GetConfigurationRequest();
        request.setUniqueName("test");
        request.setApp("live");

        GetConfigurationResult result = vcs_client.getConfiguration(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testDeleteConfiguration() {
        DeleteConfigurationRequest request = new DeleteConfigurationRequest();
        request.setUniqueName("test");
        request.setApp("live");

        DeleteConfigurationResult result = vcs_client.deleteConfiguration(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testGetRecogCfg() {
        GetRecogCfgRequest request = new GetRecogCfgRequest();
        request.setUniqueName("test");
        request.setApp("live");
        GetRecogCfgResult result = vcs_client.getRecogCfg(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());
    }

    @Test
    public void testUpdateRecogCfg() {
        UpdateRecogCfgRequest request = new UpdateRecogCfgRequest();
        request.setUniqueName("test");
        request.setApp("live");
        List<AppRecog> recogList = new ArrayList<AppRecog>();

        AppRecog pornRecog = new AppRecog();
        pornRecog.setRecogType(AppRecog.ScreenShotMonitor.PORN);
        pornRecog.setEnable(true);
        List<Double> pornThreshold = new ArrayList<Double>();
        pornThreshold.add(0.9);
        pornThreshold.add(0.9);
        pornRecog.setThreshold(pornThreshold);
        recogList.add(pornRecog);

        AppRecog terrorismRecog = new AppRecog();
        terrorismRecog.setRecogType(AppRecog.ScreenShotMonitor.TERRORISM);
        terrorismRecog.setEnable(true);
        List<Double> terrorismServiceThreshold = new ArrayList<Double>();
        terrorismServiceThreshold.add(0.9);
        terrorismRecog.setThreshold(terrorismServiceThreshold);
        recogList.add(terrorismRecog);

        AppRecog groupRecog = new AppRecog();
        groupRecog.setRecogType(AppRecog.ScreenShotMonitor.GROUP);
        groupRecog.setEnable(true);
        List<Double> groupServiceThreshold = new ArrayList<Double>();
        groupServiceThreshold.add(0.9);
        groupRecog.setThreshold(groupServiceThreshold);
        recogList.add(groupRecog);

        request.setRecogList(recogList);


        UpdateRecogCfgResult result = vcs_client.updateRecogCfg(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testGetNotifyCfg() {
        GetNotifyCfgRequest request = new GetNotifyCfgRequest();
        request.setUniqueName("test");
        request.setApp("live");

        GetNotifyCfgResult result = vcs_client.getNotifyCfg(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testUpdateNotifyCfg() {
        UpdateNotifyCfgRequest request = new UpdateNotifyCfgRequest();
        request.setUniqueName("test");
        request.setApp("live");

        AppNotify notifyCfg = new AppNotify();
        notifyCfg.setUrl("http://test.abc.com/paasRecall");
        List<String> notifyType = new ArrayList<String>();
        notifyType.add("PORN");
        notifyType.add("TERRORISM");
        notifyType.add("GROUP");
        notifyCfg.setNotifyType(notifyType);
        request.setNotifyCfg(notifyCfg);

        UpdateNotifyCfgResult result = vcs_client.updateNotifyCfg(request);

        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testGetArchiveCfg() {
        GetArchiveCfgRequest request = new GetArchiveCfgRequest();
        request.setUniqueName("test");
        request.setApp("live");

        GetArchiveCfgResult result = vcs_client.getArchiveCfg(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testUpdateArchiveCfg() {
        UpdateArchiveCfgRequest request = new UpdateArchiveCfgRequest();
        request.setUniqueName("test");
        request.setApp("live");
        ScreenshotArchive screenshotArchive = new ScreenshotArchive();
        screenshotArchive.setBucket("testbucket");
        screenshotArchive.setAlarmObject("archived_warning");
        screenshotArchive.setBlockObject("archived_blockedstream");
        request.setScreenshotArchive(screenshotArchive);

        UpdateArchiveCfgResult result = vcs_client.updateArchiveCfg(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testGetBlockedStreams() {
        GetBlockedStreamsRequest request = new GetBlockedStreamsRequest();
        request.setUniqueName("test");
        request.setApp("live");
        request.setStartTime(1472000000L);
        request.setEndTime(1473000000L);

        GetBlockedStreamsResult result = vcs_client.getBlockedStreams(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testBlockStream() {
        BlockStreamRequest request = new BlockStreamRequest();
        request.setUniqueName("test");
        request.setApp("live");
        request.setStream("KSYLIVETEST122");

        BlockStreamResult result = vcs_client.blockStream(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testRecoverStream() {
        RecoverStreamRequest request = new RecoverStreamRequest();
        request.setUniqueName("test");
        request.setApp("live");
        request.setStream("KSYLIVETEST122");

        RecoverStreamResult result = vcs_client.recoverStream(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testListWarningStreams() {
        ListWarningStreamsRequest request = new ListWarningStreamsRequest();
        request.setUniqueName("test");
        request.setApp("live");

        ListWarningStreamsResult result = vcs_client.listWarningStreams(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }

    @Test
    public void testGetWarningScreenshots() {
        GetWarningScreenshotsRequest request = new GetWarningScreenshotsRequest();
        request.setUniqueName("test");
        request.setApp("live");
        request.setStream("33333_256");
        request.setStartTime(1470176209L);
        request.setEndTime(1483000000L);

        GetWarningScreenshotsResult result = vcs_client.getWarningScreenshots(request);
        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
        log.info(result);
        log.info(result.toJsonString());

    }


}
