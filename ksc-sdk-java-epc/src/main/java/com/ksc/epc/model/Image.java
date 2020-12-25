package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Image {

    /**
     * 镜像ID
     */
    private String imageId;
    /**
     * 镜像名称
     */
    private String imageName;
    /**
     * 镜像类别
     */
    private String imageType;
    /**
     * 操作系统名称
     */
    private String osName;
    /**
     * 操作系统类型
     */
    private String osType;
    /**
     * 是否支持容器
     */
    private Boolean enableContainer;
    /**
     * 创建时间
     */
    private String createTime;


}
