package com.ksc.cdn;

import com.ksc.cdn.model.logsetting.*;


/**
 * KscCdnLogSetting
 * 日志管理
 * @author jiangran@kingsoft.com
 * @date 2016/11/28
 */
public interface KscCdnLogSetting {
    /**
     * 查询日志列表
     * @param request
     * @return
     * @throws Exception
     */
    ListLogSettingsResult getLogsetting(ListLogSettingsRequest request) throws Exception;

    /**
     * 日志更新（创建、开启、关闭）
     * @param request
     * @return
     * @throws Exception
     */
    UpdateLogSettingResult updateLogsetting(UpdateLogSettingRequest request) throws Exception;

    /**
     * 删除日志
     * @throws Exception
     */
    void deleteLogsetting(DeleteLogSettingRequest request) throws Exception;

    /**
     * 日志下载
     * @param request
     * @return
     * @throws Exception
     */
    DownloadLogSettingResult downloadLogsetting(DownloadLogSettingRequest request) throws Exception;
}
