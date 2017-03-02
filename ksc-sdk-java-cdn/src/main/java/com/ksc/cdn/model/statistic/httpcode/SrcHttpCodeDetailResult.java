package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.model.statistic.CommonFieldResult;
import lombok.Data;

/**
 * SrcHttpCodeDetailResult
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class SrcHttpCodeDetailResult extends CommonFieldResult {

    /**
     * 取值为0：多域名多区域数据做合并返回；1：每个域名每个区域的数据分别返回。
     */
    private String ResultType;
    /**
     * 统计粒度，取值为 5：5分钟粒度；
     * 10：10分钟粒度；
     * 20：20分钟粒度；
     * 60：1小时粒度；
     * 240：4小时粒度；
     * 480：8小时粒度；
     * 1440：1天粒度；
     * 以上粒度的带宽值均取该粒度时间段的峰值
     */
    private String Granularity;

    /**
     * 每个时间粒度的各种回源Http状态码数据及占比
     */
    private SrcHttpCodeDataByTime[] Datas;
}
