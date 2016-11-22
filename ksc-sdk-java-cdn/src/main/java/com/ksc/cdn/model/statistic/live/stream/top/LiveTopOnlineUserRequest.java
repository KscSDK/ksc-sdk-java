package com.ksc.cdn.model.statistic.live.stream.top;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * LiveTopOnlineUserRequest
 * 获取按流维度的直播在线人数排行
 * @author jiangran@kingsoft.com
 * @date 2016/11/22
 */
public class LiveTopOnlineUserRequest {
    /**
     * 获取数据起始时间点,日期格式按ISO8601表示法，
     * 北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    @FieldValidate
    private String StartTime;
    /**
     * 域名ID，缺省为当前产品类型下的全部域名，可输入需要查询的域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔
     */
    private String DomainIds;
    /**
     * 计费区域名称
     * @see com.ksc.cdn.model.enums.RegionsEnum
     */
    private String Regions;
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    @FieldValidate
    private String ResultType;
    /**
     * Top条数，取值为1-200，最大200，默认100
     */
    private String LimitN;

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    public Map<String,String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);
        Map<String,String> params=new HashMap<String, String>();

        params.put("StartTime", this.getStartTime());
        if(StringUtils.isNotBlank(this.getDomainIds()))
            params.put("DomainIds", this.getDomainIds());
        if (StringUtils.isNotBlank(this.getRegions()))
            params.put("Regions",this.getRegions());
        params.put("ResultType",this.getResultType());
        if(StringUtils.isNotBlank(this.getLimitN()))
            params.put("LimitN",this.getLimitN());
        return params;
    }
}
