package com.ksc.kls;

import com.ksc.kls.model.*;
import com.ksc.regions.Region;
/**
 * Created by yangfan on 2017/4/24.
 */
public interface KSCKLS {
    void setEndpoint(String endpoint);

    void setRegion(Region region);

    //创建定时任务
    public CreateRecordResult createRecordTask(
            CreateRecordRequest createRecordRequest);

    //取消定时任务
    public CancelRecordResult cancelRecordTask(
            CancelRecordRequest cancleRecordRequest);

    //查询录像任务状态
    public GetRecordTaskResult getRecordTask(
            GetRecordTaskRequest getRecordTaskRequest);

    //查询历史录制任务
    public ListHistoryRecordTasksResult listHistoryRecordTasks(
            ListHistoryRecordTasksRequest listHistoryRecordTasksRequest);
    //短视频开始录制
    public StartStreamRecordResult startStreamRecord(
            StartStreamRecordRequest startStreamRecordRequest);
    //结束短视频录制
    public StopStreamRecordResult stopStreamRecord(
            StopStreamRecordRequest stopStreamRecordRequest);

    public ListRecordingTasksResult listRecordingTasks(
            ListRecordingTasksRequest listRecordingTasksRequest);

    //主播流时长统计
    public ListStreamDurationsResult listStreamDurations(
            ListStreamDurationsRequest listStreamDurationsRequest);

    //CDN 踢拉流
    public KillStreamCacheResult killStreamCache(
            KillStreamCacheRequest killStreamCacheRequest);

    //查询流历史错误信息
    public ListHistoryPubStreamsErrInfoResult listHistoryPubStreamsErrInfo(
            ListHistoryPubStreamsErrInfoRequest listHistoryPubStreamsErrInfoRequest);

    //查询流历史信息
    public ListHistoryPubStreamsInfoResult listHistoryPubStreamsInfo(
            ListHistoryPubStreamsInfoRequest listHistoryPubStreamsInfoRequest);

    //查询流实时信息接口
    public ListRealtimePubStreamsInfoResult listRealtimePubStreamsInfo(
            ListRealtimePubStreamsInfoRequest listRealtimePubStreamsInfoRequest);

    //禁止单路直播流推送
    public ForbidStreamResult forbidStream(ForbidStreamRequest forbidStreamRequest);

    //恢复单路直播流推送
    public ResumeStreamResult resumeStream(ResumeStreamRequest resumeStreamRequest);

    //查询黑名单列表
    public GetBlacklistResult getBlacklist(GetBlacklistRequest getBlacklistRequest);

    //检查流是否在黑名单内
    public CheckBlacklistsResult checkBlacklist(CheckBlacklistRequest checkBlacklistRequest);

    //转推实时信息查询接口
    public ListRelayStreamsInfoResult listRelayStreamsInfo(ListRelayStreamsInfoRequest listRelayStreamsInfoRequest);

    //转推历史错误统计接口
    public ListRelayErrInfoResult listRelayErrInfo(ListRelayErrInfoRequest listRelayErrInfoRequest);

}
