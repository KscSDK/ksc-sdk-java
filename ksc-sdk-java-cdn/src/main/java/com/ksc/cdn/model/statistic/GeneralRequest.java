package com.ksc.cdn.model.statistic;

import com.ksc.cdn.KscClientException;

import java.text.ParseException;
import java.util.Map;

/**
 * GeneralRequest
 * 定义统计分析请求通用方法
 * @author jiangran@kingsoft.com
 * @date 2016/11/22
 */
public interface GeneralRequest {
    /**
     * 获取访问api,公用请求参数对象
     * @return
     */
    GeneralRequestParam getGeneralRequestParam();

    /**
     * 生成get请求的请求参数
     * @return
     * @throws KscClientException
     * @throws ParseException
     */
    Map<String,String> buildParams() throws KscClientException, ParseException;
}
