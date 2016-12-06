package com.ksc.cdn.model.domain.domaindetail;

/**
 * BackOriginConfig
 *
 * range回源功能设置
 * 注意： 需要源站支持range请求,即对于http请求头中包含 Range 字段,源站能够响应正确的206文件分片
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class BackOriginConfig{
    /**
     * 配置range回源功能的开启或关闭
     * @see com.ksc.cdn.model.enums.SwitchEnum
     */
    private String Enable;

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }
}