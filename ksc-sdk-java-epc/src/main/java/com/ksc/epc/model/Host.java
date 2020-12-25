package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class Host {

    /**
     * 裸金属服务器的创建时间
     */
    private String createTime;
    /**
     * 裸金属服务器的ID
     */
    private String hostId;
    /**
     * 云物理主机机型
     */
    private String hostType;
    /**
     * 允许开启关闭超线程
     */
    private String allowModifyHyperThreading;
    /**
     * 裸金属服务器的名称
     */
    private String hostName;
    /**
     * 可释放的时间
     */
    private String releasableTime;
    /**
     * 上联交换机信息
     */
    private String torName;
    /**
     * 机柜信息
     */
    private String cabinetName;
    /**
     * 机架位
     */
    private String rackName;
    /**
     * 机架位的ID
     */
    private String rackId;
    /**
     * 云物理主机序列号
     */
    private String sn;
    /**
     * 托管机柜ID
     */
    private String cabinetId;
    /**
     * 可用区的名称
     */
    private String availabilityZone;
    /**
     * 数据盘Raid级别,枚举值为：Raid0, Raid10, Raid5, Raid1，单盘raid0
     */
    private String raid;
    /**
     * 镜像资源ID
     */
    private String imageId;
    /**
     * 用户密钥对的资源ID
     */
    private String keyId;
    /**
     * 网卡的模式
     */
    private String networkInterfaceMode;
    /**
     * 网卡bond的属性，只有在bond4的模式下才生效
     */
    private String bondAttribute;
    /**
     * 是否支持
     */
    private Boolean enableBond;
    /**
     * 安全组件类型
     */
    private String securityAgent;
    /**
     * 监控组件类型
     */
    private String cloudMonitorAgent;
    /**
     * 是否支持EBS
     */
    private String supportEbs;
    /**
     * 查询的云物理主机产品服务类型，租赁(lease)、客户托管（customer）
     */
    private String productType;
    /**
     * 操作系统名称
     */
    private String osName;
    /**
     * 内存大小，单位：G。
     */
    private String memory;
    /**
     * 云物理主机状态
     */
    private String hostStatus;
    /**
     * 容器ID
     */
    private String clusterId;
    /**
     * 是否支持容器
     */
    private Boolean enableContainer;
    /**
     * 系统盘文件格式
     */
    private String systemFileType;
    /**
     * 数据盘文件格式
     */
    private String dataFileType;
    /**
     * 数据盘目录
     */
    private String dataDiskCatalogue;
    /**
     * 数据盘目录后缀属性
     */
    private String dataDiskCatalogueSuffix;
    /**
     * KES组件类型
     */
    private String kesAgent;
    /**
     * KPL组件类型
     */
    private String kplAgent;
    /**
     * KMR组件类型
     */
    private String kmrAgent;
    /**
     * 项目ID
     */
    private String projectId;
    /**
     * CPU信息
     */
    private Cpu cpu;
    /**
     * GPU信息
     */
    private Gpu gpu;
    /**
     * 磁盘信息
     */
    private List<Disk> diskSet;
    /**
     * 关联的网卡信息
     */
    private List<NetworkInterfaceAttribute> networkInterfaceAttributeSet;

    public void addDiskSet(Disk... diskSet) {
        if (this.diskSet == null) {
            this.diskSet = new com.ksc.internal.SdkInternalList<Disk>();
        }
        for (Disk value : diskSet) {
            this.diskSet.add(value);
        }
    }
    public void setDiskSet(List<Disk> diskSet) {
        this.diskSet = new com.ksc.internal.SdkInternalList<Disk>(diskSet);
    }
    public void addNetworkInterfaceAttributeSet(NetworkInterfaceAttribute... networkInterfaceAttributeSet) {
        if (this.networkInterfaceAttributeSet == null) {
            this.networkInterfaceAttributeSet = new com.ksc.internal.SdkInternalList<NetworkInterfaceAttribute>();
        }
        for (NetworkInterfaceAttribute value : networkInterfaceAttributeSet) {
            this.networkInterfaceAttributeSet.add(value);
        }
    }
    public void setNetworkInterfaceAttributeSet(List<NetworkInterfaceAttribute> networkInterfaceAttributeSet) {
        this.networkInterfaceAttributeSet = new com.ksc.internal.SdkInternalList<NetworkInterfaceAttribute>(networkInterfaceAttributeSet);
    }

}
