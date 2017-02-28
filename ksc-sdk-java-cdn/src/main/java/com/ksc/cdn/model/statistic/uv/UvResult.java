package com.ksc.cdn.model.statistic.uv;

import com.ksc.cdn.model.statistic.CommonFieldResult;
import lombok.Data;

/**
 * 获取域名独立请求的IP个数，单位：个
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class UvResult extends CommonFieldResult {

    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    private String ResultType;

    /**
     * 非必须
     * 统计粒度,单位分钟,缺省为5
     * 粒度均取该粒度时间段的峰值
     */
    private String Granularity;

    /**
     * 每个时间粒度的独立请求的IP数据
     */
    private UvDataByTime[] Datas;
}
