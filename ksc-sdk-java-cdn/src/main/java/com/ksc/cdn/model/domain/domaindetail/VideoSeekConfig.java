package com.ksc.cdn.model.domain.domaindetail;

/**
 * VideoSeekConfig
 * 拖拽播放功能设置
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class VideoSeekConfig{

    /**
     * 配置拖拽播放功能的开启或关闭
     * 取值
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
