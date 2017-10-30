import com.ksc.auth.AWSCredentials;
import com.ksc.kls.KSCKSLClient;
import com.ksc.kls.model.*;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by yangfan on 2017/6/12.
 */
public class KLSAPISample {

    private static final Logger log = Logger.getLogger(KLSAPISample.class);

    KSCKSLClient kls_client = null;
    private String version = "2017-01-01";
    private String uniquename = "you unique name";
//    private String action = "CancelRecordTask";
    private String action = "KillStreamCache";
    private String app = "live";
    private String pubdomain = "live.moxiulive.com";
    private int recID = 2;
    private String stream = "test.api.com";
    private String[] nodeIPS = new String[1];
    private int startUnixTime = 1500687528;
    private int endUnixTime = 1500687528;
    private String ks3FileNameM3U8 = "";
    private String ks3FullPathMP4 = "";
    private int mp4VodEnable = 1;
    private int limit = 10;
    private int recType = 1;
    private int marker = 2;
    private int ordertime = 2;
    private int recStatusType = 1;
    private int forbidTillUnixTime = 0;




    @Before
    public void setup() {
        AWSCredentials aws = new AWSCredentials() {
            @Override
            public String getAWSAccessKeyId() {
                return "AKLTNZ4r_XpvSOSdAnAmfWEUsg";
            }


            @Override
            public String getAWSSecretKey() {
                return "OKtoHRyb5Em3oFgTFhFN7ypvjot0SRoqTzbQB8eSD2BpUrBgwy3MlHoJC637BhVF1g";
            }

        };
        kls_client = new KSCKSLClient(aws);

        kls_client.setEndpoint("http://kls.api.ksyun.com");

    }

    /**
     * 定时录制取消接口(CancelRecordTask)
     */
    @Test
    public void testCancelRecord() {
        CancelRecordRequest request = new CancelRecordRequest();
        request.setVersion(this.version);
        request.setAction(this.action);
        request.setApp(this.app);
        request.setUniqueName(this.uniquename);
        request.setPubdomain(this.pubdomain);
        request.setRecID(this.recID);
        request.setStream(this.stream);
        CancelRecordResult result = kls_client.cancelRecordTask(request);
        System.out.println("=============================");
        log.info(result.getData());
        System.out.println("=============================");
    }

    /**
     * 踢拉流接口
     */
    @Test
    public void testKillStreamCache() {
        KillStreamCacheRequest request = new KillStreamCacheRequest();
        request.setVersion(this.version);
        request.setAction(this.action);
        request.setApp(this.app);
        this.nodeIPS[0] = "127.0.0.1";
        request.setNodeIPs(this.nodeIPS);
        request.setPullDomain(this.pubdomain);
        request.setStream(this.stream);
        KillStreamCacheResult result = new KillStreamCacheResult();
        System.out.println("=============================");
        log.info(result.getData());
        System.out.println("=============================");
    }

    /**
     * 定时录制接口(CreateRecordTask)
     */
    @Test
    public void testcreateRecordTask() {
        CreateRecordRequest request = new CreateRecordRequest();
        request.setVersion(this.version);
        request.setAction(this.action);
        request.setApp(this.app);
        request.setUniqueName(this.uniquename);
        request.setStartUnixTime(this.startUnixTime);
        request.setStartUnixTime(this.startUnixTime);
        request.setEndUnixTime(this.endUnixTime);
        request.setKs3FileNameM3U8(this.ks3FileNameM3U8);
        request.setKs3FullPathMP4(this.ks3FullPathMP4);
        request.setPubdomain(this.pubdomain);
        request.setMp4VodEnable(this.mp4VodEnable);
        request.setStream(this.stream);
        CreateRecordResult result =  new CreateRecordResult();
        System.out.println("===============================");
        log.info(result.getData());
        System.out.println("================================");
    }


    /**
     * 查询录像任务状态接口(GetRecordTask)
     */
    @Test
    public void testGetRecordTask() {
        GetRecordTaskRequest request = new GetRecordTaskRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setRecID(this.recID);
        GetRecordTaskResult result = new GetRecordTaskResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 查询历史录制任务接口(ListHistoryRecord)
     */
    @Test
    public void testListHistoryRecordTasks() {
        ListHistoryRecordTasksRequest request = new ListHistoryRecordTasksRequest();
        request.setAction(this.action);
        request.setApp(this.app);
        request.setEndUnixTime(this.endUnixTime);
        request.setStartUnixTime(this.startUnixTime);
        request.setLimit(this.limit);
        request.setPubdomain(this.pubdomain);
        request.setUniqueName(this.uniquename);
        request.setStream(this.stream);
        request.setRecType(this.recType);
        request.setMarker(this.marker);
        request.setOrderTime(this.ordertime);
        ListHistoryRecordTasksResult result = new ListHistoryRecordTasksResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 短视频开始录制接口(StartStreamRecord)
     */
    @Test
    public void testStartStreamRecord() {
        StartStreamRecordRequest request = new StartStreamRecordRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setKs3FileNameM3u8(this.ks3FileNameM3U8);
        request.setKs3FullPathMP4(this.ks3FullPathMP4);
        request.setMp4VodEnable(this.mp4VodEnable);
        StartStreamRecordResult result = new StartStreamRecordResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 短视频结束录制接口(StopStreamRecord)
     */
    @Test
    public void testStopStreamRecord() {
        StopStreamRecordRequest request = new StopStreamRecordRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setRecID(this.recID);
        StopStreamRecordResult result = new StopStreamRecordResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 查询在线录制任务接口(ListRecordingTasks)
     */
    @Test
    public void testListRecordingTasks() {
        ListRecordingTasksRequest request = new ListRecordingTasksRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setLimit(this.limit);
        request.setRecType(this.recType);
        request.setMarker(this.marker);
        request.setOrderTime(this.ordertime);
        request.setRecStatusType(this.recStatusType);
        ListRecordingTasksResult result = new ListRecordingTasksResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 查询主播流时长接口(ListStreamDurations )
     */
    @Test
    public void testListStreamDurations() {
        ListStreamDurationsRequest request = new ListStreamDurationsRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setStartUnixTime(this.startUnixTime);
        request.setEndUnixTime(this.endUnixTime);
        ListStreamDurationsResult result = new ListStreamDurationsResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 查询流历史错误信息接口(ListHistoryPubStreamsErrInfo)
     */
    @Test
    public void testListHistoryPubStreamsErrInfo() {
        ListHistoryPubStreamsErrInfoRequest request = new ListHistoryPubStreamsErrInfoRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setLimit(this.limit);
        request.setMarker(this.marker);
        request.setOrderTime(this.ordertime);
        request.setStartUnixTime(this.startUnixTime);
        request.setEndUnixTime(this.endUnixTime);
        ListHistoryPubStreamsErrInfoResult result = new ListHistoryPubStreamsErrInfoResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 查询流历史信息接口(ListHistoryPubStreamsInfo）
     */
    @Test
    public void testListHistoryPubStreamsInfo() {
        ListHistoryPubStreamsInfoRequest request = new ListHistoryPubStreamsInfoRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setLimit(this.limit);
        request.setMarker(this.marker);
        request.setOrderTime(this.ordertime);
        request.setStartUnixTime(this.startUnixTime);
        request.setEndUnixTime(this.endUnixTime);
        ListHistoryPubStreamsErrInfoResult result = new ListHistoryPubStreamsErrInfoResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 查询推流实时信息接口（ListRealtimePubStreamsInfo）
     */
    @Test
    public void testListRealtimePubStreamsInfo() {
        ListRealtimePubStreamsInfoRequest request = new ListRealtimePubStreamsInfoRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setLimit(this.limit);
        request.setMarker(this.marker);
        request.setOrderTime(this.ordertime);
        ListRealtimePubStreamsInfoResult result = new ListRealtimePubStreamsInfoResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }


    /**
     * 禁止单路直播流推送（ForbidStream）
     */
    @Test
    public void testForbidStream() {
        ForbidStreamRequest request = new ForbidStreamRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        request.setForbidTillUnixTime(this.forbidTillUnixTime);
        ForbidStreamResult result = new ForbidStreamResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 恢复单路直播流推送（ResumeStream）
     */
    @Test
    public void testResumeStream() {
        ResumeStreamRequest request = new ResumeStreamRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        ResumeStreamResult result = new ResumeStreamResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 查询黑名单列表（GetBlacklist）
     */
    @Test
    public void testGetBlacklist() {
        GetBlacklistRequest request = new GetBlacklistRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        GetBlacklistResult result = new GetBlacklistResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 检查流是否在黑名单内（CheckBlacklist）
     */
    @Test
    public void testCheckBlacklist() {
        CheckBlacklistRequest request = new CheckBlacklistRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setStream(this.stream);
        CheckBlacklistsResult result = new CheckBlacklistsResult();
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 转推实时信息查询接口（listRelayStreamsInfo）
     */
    @Test
    public void testListRelayStreamsInfo() {
        ListRelayStreamsInfoRequest request = new ListRelayStreamsInfoRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setLimit(this.limit);
        request.setMarker(this.marker);
        ListRelayStreamsInfoResult result = new ListRelayStreamsInfoResult();
        System.out.println("==============================");
        log.info(result);
        System.out.println("==============================");
    }

    /**
     * 转推历史错误统计接口（listRelayErrInfo）
     */
    @Test
    public void testListRelayErrInfo() {
        ListRelayErrInfoRequest request = new ListRelayErrInfoRequest();
        request.setAction(this.action);
        request.setVersion(this.version);
        request.setLimit(this.limit);
        request.setMarker(this.marker);
        request.setStarttime(this.startUnixTime);
        ListRelayErrInfoResult result = new ListRelayErrInfoResult();
        System.out.println("==============================");
        log.info(result);
        System.out.println("==============================");
    }

}
