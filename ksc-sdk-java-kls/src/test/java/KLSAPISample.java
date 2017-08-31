import com.ksc.auth.AWSCredentials;
import com.ksc.kls.KSCKSLClient;
import com.ksc.kls.model.*;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by yangfan on 2017/6/12.
 */
public class KLSAPISample {

    private static final Logger log = Logger.getLogger(KLSAPISample.class);

    KSCKSLClient kls_client = null;
    private String version = "2017-01-01";
    private String uniquename = "uniquename";
    private String action = "CreateRecordTask";
    private String app = "app";
    private String pubdomain = "pubdomain";
    private String pulldomain = "pulldomain";
    private int recID = 560;
    private String stream = "stream";
    private String[] nodeIPS = new String[1];
    private int startUnixTime = 1504231200;
    private int endUnixTime = 1504317600;
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
                return "your ak";
            }


            @Override
            public String getAWSSecretKey() {
                return "your sk";
            }

        };
        kls_client = new KSCKSLClient(aws);

        kls_client.setEndpoint("http://kls.api.ksyun.com");

    }





    /**
     * 定时录制接口(CreateRecordTask)
     */
    @Test
    public void testcreateRecordTask() {
        CreateRecordRequest request = new CreateRecordRequest();
        String data = PreparedData(this.startUnixTime,this.endUnixTime);
        request.setData(data);
        CreateRecordResult result =  kls_client.createRecordTask(request);
        System.out.println("===============================");
        log.info(result.getData().getApp());
        System.out.println("================================");
    }

    //组织定时录制需要的参数
    private String PreparedData(int startUnixTime,int endUnixTime) {
        JSONObject data = new JSONObject();
        data.put("UniqueName", this.uniquename);
        data.put("App", this.app);
        data.put("Pubdomain", this.pubdomain);
        data.put("Stream", this.stream);
        data.put("StartUnixTime", startUnixTime);
        data.put("EndUnixTime", endUnixTime);
        if (this.mp4VodEnable != 0 ) {
            data.put("Mp4VodEnable", this.mp4VodEnable);
        }

        /**
         * 根据自己业务写入参数，请务必写入必传参数
         * 其余参数请参见https://docs.ksyun.com/read/latest/116/_book/KLSAPI/CreateRecordTask.html
         */
        return data.toString();
    }

    /**
     * 定时录制取消接口(CancelRecordTask)
     */
    @Test
    public void testCancelRecord() {
        CancelRecordRequest request = new CancelRecordRequest();
        String data = PreparedCancelRecordData(this.recID);
        request.setData(data);
        CancelRecordResult result = kls_client.cancelRecordTask(request);
        System.out.println("=============================");
        log.info(result.getData());
        System.out.println("=============================");
    }

    //组织取消定时录制任务需要的数据
    private String PreparedCancelRecordData(int recID) {
        JSONObject data = new JSONObject();
        data.put("UniqueName", this.uniquename);
        data.put("App", this.app);
        data.put("Pubdomain", this.pubdomain);
        data.put("Stream", this.stream);
        data.put("RecID", recID);

        /**
         * 以上参数全部为必选参数 https://docs.ksyun.com/read/latest/116/_book/KLSAPI/CancelRecordTask.html
         */
        return data.toString();
    }

    /**
     * 短视频开始录制接口(StartStreamRecord)
     */
    @Test
    public void testStartStreamRecord() {
        StartStreamRecordRequest request = new StartStreamRecordRequest();
        String data = PreparedStartStreamRecordData();
        request.setData(data);
        StartStreamRecordResult result = kls_client.startStreamRecord(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    //组织开始录制需要的数据
    private String PreparedStartStreamRecordData() {
        JSONObject data = new JSONObject();
        data.put("UniqueName", this.uniquename);
        data.put("App", this.app);
        data.put("Pubdomain", this.pubdomain);
        data.put("Stream", this.stream);

        /**
         * 以上参数全部为必选参数
         * 请根据业务需求 写入可选参数 参见https://docs.ksyun.com/read/latest/116/_book/KLSAPI/StartStreamRecord.html
         */
        return data.toString();
    }


    /**
     * 短视频结束录制接口(StopStreamRecord)
     */
    @Test
    public void testStopStreamRecord() {
        StopStreamRecordRequest request = new StopStreamRecordRequest();
        String data = PreparedStopStreamRecordData();
        request.setData(data);
        StopStreamRecordResult result = kls_client.stopStreamRecord(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    //组织结束录制任务需要的数据
    private String PreparedStopStreamRecordData() {
        JSONObject data = new JSONObject();
        data.put("UniqueName", this.uniquename);
        data.put("App", this.app);
        data.put("Pubdomain", this.pubdomain);
        data.put("Stream", this.stream);
        data.put("RecID", recID);

        /**
         * 以上参数全部为必选参数 https://docs.ksyun.com/read/latest/116/_book/KLSAPI/StopStreamRecord.html
         */
        return data.toString();
    }

    /**
     * 查询在线录制任务接口(ListRecordingTasks)
     */
    @Test
    public void testListRecordingTasks() {
        ListRecordingTasksRequest request = new ListRecordingTasksRequest();
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        ListRecordingTasksResult result = kls_client.listRecordingTasks(request);
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
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        request.setUniqueName(this.uniquename);
        ListHistoryRecordTasksResult result = kls_client.listHistoryRecordTasks(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
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
        GetRecordTaskResult result = kls_client.getRecordTask(request);
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
        String data = PreparedForbidStreamData();
        request.setData(data);
        ForbidStreamResult result = kls_client.forbidStream(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    // 组织禁流数据
    private String PreparedForbidStreamData() {
        JSONObject data = new JSONObject();
        data.put("UniqueName", this.uniquename);
        data.put("App", this.app);
        data.put("Pubdomain", this.pubdomain);
        data.put("Stream", this.stream);

        /**
         * 以上参数全部为必选参数 https://docs.ksyun.com/read/latest/116/_book/KLSAPI/ForbidStream.html
         */
        return data.toString();
    }

    /**
     * 恢复单路直播流推送（ResumeStream）
     */
    @Test
    public void testResumeStream() {
        ResumeStreamRequest request = new ResumeStreamRequest();
        String data = PreparedResumeStreamData();
        request.setData(data);
        ResumeStreamResult result = kls_client.resumeStream(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    //组织恢复禁流的数据
    private String PreparedResumeStreamData() {
        JSONObject data = new JSONObject();
        data.put("UniqueName", this.uniquename);
        data.put("App", this.app);
        data.put("Pubdomain", this.pubdomain);
        data.put("Stream", this.stream);

        /**
         * 以上参数全部为必选参数 https://docs.ksyun.com/read/latest/116/_book/KLSAPI/ResumeStream.html
         */
        return data.toString();
    }

    /**
     * 查询黑名单列表（GetBlacklist）
     *
     *
     */
//    @Test
//    public void testGetBlacklist() {
//        GetBlacklistRequest request = new GetBlacklistRequest();
//        request.setUniqueName(this.uniquename);
//        request.setApp(this.app);
//        request.setPubdomain(this.pubdomain);
//        GetBlacklistResult result = kls_client.getBlacklist(request);
//        System.out.println("==============================");
//        log.info(result);
//        System.out.println("==============================");
//    }

    /**
     * 检查流是否在黑名单内（CheckBlacklist）
     *
     *
     */
//    @Test
//    public void testCheckBlacklist() {
//        CheckBlacklistRequest request = new CheckBlacklistRequest();
//        request.setUniqueName(this.uniquename);
//        request.setApp(this.app);
//        request.setPubdomain(this.pubdomain);
//        request.setStream(this.stream);
//        CheckBlacklistsResult result = kls_client.checkBlacklist(request);
//        System.out.println("==============================");
//        log.info(result.getData());
//        System.out.println("==============================");
//    }

    /**
     * 查询推流实时信息接口  ListRealtimePubStreamsInfo
     */
    @Test
    public void testListRealtimePubStreamsInfo() {
        ListRealtimePubStreamsInfoRequest request = new ListRealtimePubStreamsInfoRequest();
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        ListRealtimePubStreamsInfoResult result = kls_client.listRealtimePubStreamsInfo(request);
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
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        ListHistoryPubStreamsInfoResult result = kls_client.listHistoryPubStreamsInfo(request);
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
        request.setUniqueName(this.uniquename);
        request.setApp(this.app);
        request.setPubdomain(this.pubdomain);
        ListHistoryPubStreamsErrInfoResult result = kls_client.listHistoryPubStreamsErrInfo(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     *
     *
     * 转推实时信息查询接口（listRelayStreamsInfo）
     */

    /**
     *
     *
     *
     * 转推历史错误统计接口（listRelayErrInfo）
     */




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
        ListStreamDurationsResult result = kls_client.listStreamDurations(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }

    /**
     * 踢拉流接口
     */
    @Test
    public void testKillStreamCache() {
        KillStreamCacheRequest request = new KillStreamCacheRequest();
        String data = PreparedKillStreamData();
        request.setData(data);
        KillStreamCacheResult result = kls_client.killStreamCache(request);
        System.out.println("==============================");
        log.info(result.getData());
        System.out.println("==============================");
    }


    //组织踢拉流的数据
    private String PreparedKillStreamData() {
        JSONObject data = new JSONObject();
        data.put("App", this.app);
        data.put("Stream", this.stream);
        data.put("Pubdomain", this.pubdomain);
        data.put("DeviceOrNode", 0);
        data.put("PullDomain", this.pulldomain);
        data.put("NodeIPs", this.nodeIPS);
        /**
         * 以上参数全部为必选参数
         */
        return data.toString();
    }



}
