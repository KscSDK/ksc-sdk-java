package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.model.statistic.CommonFieldResult;
import lombok.Data;

/**
 * SrcHttpCodeResult
 * 获取域名一段时间内的回源Http状态码访问次数及占比数据
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class SrcHttpCodeResult extends CommonFieldResult {

    /**
     * 所选时间段内的各种回源Http状态码求和数据、各种回源状态码及占比
     */
    private SrcHttpCodeData[] Datas;

}
