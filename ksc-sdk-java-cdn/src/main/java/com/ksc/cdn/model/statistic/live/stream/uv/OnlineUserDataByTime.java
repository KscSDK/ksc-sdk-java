package com.ksc.cdn.model.statistic.live.stream.uv;

/**
 * OnlineUserDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class OnlineUserDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 在线人数总和
     */
    private Long OnlineUser;
    /**
     * 每个流名的详细请求数数据 (仅当ResultType取值为1时返回此数据)
     */
    private OnlineUserDataByStream[] Streams;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Long getOnlineUser() {
        return OnlineUser;
    }

    public void setOnlineUser(Long onlineUser) {
        OnlineUser = onlineUser;
    }

    public OnlineUserDataByStream[] getStreams() {
        return Streams;
    }

    public void setStreams(OnlineUserDataByStream[] streams) {
        Streams = streams;
    }
}
