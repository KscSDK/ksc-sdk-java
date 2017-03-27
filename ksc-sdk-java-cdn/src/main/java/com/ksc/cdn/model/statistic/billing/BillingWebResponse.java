package com.ksc.cdn.model.statistic.billing;

import com.ksc.cdn.model.statistic.CommonFieldResult;
import lombok.Data;

import java.util.List;

/**
 * Created by JIANGYANG1 on 2017/3/21.
 */

@Data
public class BillingWebResponse extends CommonFieldResult {
    /**
     * 区域名称， 取值为CN:中国大陆，HK：香港，TW：台湾，AS：亚洲其他，NA：北美洲，SA：南美洲，EU：欧洲，AU：大洋洲，AF：非洲，支持多区域查询，多个区域用逗号（半角）分隔，每个区域的值单独返回，缺省为 CN
     * */
    private String Regions;
    /**
     * 计费方式， 取值为 peakbw:峰值计费;peak95bw:95峰值计费;averagebw：日峰值平均值计费；monthflow：流量按月，只允许输入一种计费方式，缺省为 peakbw ；
     * */
    private String BillingMode;
    /**
     * 计费数据
     * */
    private List<BillingData> Datas;

    public BillingWebResponse() {
    }

    public BillingWebResponse(List<BillingData> Datas) {
        this.Datas = Datas;
    }
}
