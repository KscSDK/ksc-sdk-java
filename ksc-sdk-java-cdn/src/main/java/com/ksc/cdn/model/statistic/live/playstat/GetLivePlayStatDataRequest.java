package com.ksc.cdn.model.statistic.live.playstat;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * GetLivePlayStatDataRequest
 * 本接口用于获取某个时间点的播放统计信息，包括带宽、流量、在线人数，包括流维度和域名维度的数据。单位：带宽bps，流量：byte，在线人数：个
 * 只设置起始时间，代表起始时间这5分钟的数据。
 * 支持批量域名过滤查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近62天内的数据
 * 时效性：5-10分钟延迟
 * 接口性能：接口最大吞吐量为10000，即所有DomainId下的流总数<= 10000。
 * 只支持直播业务
 * 使用场景：
 * <p>
 * 客户查询一个单位时间（5分钟）内的直播总量数据、流维度数据，进行数据保存及数据分析
 * 说明：
 * <p>
 * 本接口的流维度数据仅支持HDL、RTMP协议，不支持HLS协议。如果输入中含有HLS协议的域名，HLS协议的域名仅返回域名级数据，不包含流维度数据。
 * 仅能返回在线人数Top 1万的流记录。如果您的单域名下同时存在的流数量超过1万个，建议在应用场景上分域名处理，保障每个域名下同时存在的流数小于1万个。
 * 由于域名维度的数据与流维度的数据计算方式不同，域名维度的数据，与流维度的数据的加和，二者会有一定偏差。
 */
public class GetLivePlayStatDataRequest implements GeneralRequest {

    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    @FieldValidate
    private String StartTime;

    /**
     * 域名ID，缺省为当前产品类型下的全部域名，可输入需要查询的域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔
     */
    private String DomainIds;
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    @FieldValidate
    private String ResultType;

    /**
     * Top条数，取值为1-10000，最大10000，默认100
     */
    private String LimitN;

    /**
     * 计费区域名称
     *
     * @see com.ksc.cdn.model.enums.RegionsEnum
     */
    private String Regions;

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    public Map<String, String> buildParams() throws KscClientException, ParseException {

        CommonValidUtil.check(this);

        Map<String, String> params = new HashMap<String, String>();

        params.put("StartTime", this.getStartTime());

        if (StringUtils.isNotBlank(this.getDomainIds()))
            params.put("DomainIds", this.getDomainIds());

        if (StringUtils.isNotBlank(this.getRegions()))
            params.put("Regions", this.getRegions());

        params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getLimitN()))
            params.put("LimitN", this.getLimitN());

        return params;
    }

    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetLivePlayStatData", "2016-09-01", "/");
    }
}
