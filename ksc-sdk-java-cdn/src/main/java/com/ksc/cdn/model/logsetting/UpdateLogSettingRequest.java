package com.ksc.cdn.model.logsetting;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;

import java.text.ParseException;
import java.util.Map;

/**
 * UpdateLogSettingRequest
 * 日志更新（创建、开启、关闭）
 * @author jiangran@kingsoft.com
 * @date 2016/11/30
 */
@Deprecated
public class UpdateLogSettingRequest implements GeneralRequest{
    /**
     * 需要更新的域名
     */
    @FieldValidate
    private String domain;
    /**
     * 存储空间（可选，若不传自动检测用户之前配置的bucket是否有效，否则新建一个）
     */
    private String bucket;
    /**
     * 粒度（可选，默认为0，小时）（若传值，只能是0和1）
     * 0:小时，1:天, 2:5分钟
     */
    private String granularity;
    /**
     * 日志开启状态（可选，默认为1，开启）（若传值，只能是0和1）
     * 0 关闭，1 开启
     */
    private String status;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("UpdateLogSetting","2016-05-20","/2016-05-20/log/logSetting");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
