package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class DeviceAttribute {

    /**
     * 设备属性ID
     */
    private String deviceAttributeId;
    /**
     * 主机机型
     */
    private String hostType;
    /**
     * 主机机型名称
     */
    private String hostTypeName;
    /**
     * 内存
     */
    private String memory;
    /**
     * 网卡
     */
    private String networkCard;
    /**
     * CPU信息
     */
    private List<CpuDevice> cpuDeviceSet;
    /**
     * GPU信息
     */
    private List<GpuDevice> gpuDeviceSet;
    /**
     * 物理磁盘
     */
    private List<PhysicalDiskDevice> physicalDiskDeviceSet;
    /**
     * 价格信息
     */
    private List<MonthlyPrice> priceSet;

    public void addCpuDeviceSet(CpuDevice... cpuDeviceSet) {
        if (this.cpuDeviceSet == null) {
            this.cpuDeviceSet = new com.ksc.internal.SdkInternalList<CpuDevice>();
        }
        for (CpuDevice value : cpuDeviceSet) {
            this.cpuDeviceSet.add(value);
        }
    }
    public void setCpuDeviceSet(List<CpuDevice> cpuDeviceSet) {
        this.cpuDeviceSet = new com.ksc.internal.SdkInternalList<CpuDevice>(cpuDeviceSet);
    }
    public void addGpuDeviceSet(GpuDevice... gpuDeviceSet) {
        if (this.gpuDeviceSet == null) {
            this.gpuDeviceSet = new com.ksc.internal.SdkInternalList<GpuDevice>();
        }
        for (GpuDevice value : gpuDeviceSet) {
            this.gpuDeviceSet.add(value);
        }
    }
    public void setGpuDeviceSet(List<GpuDevice> gpuDeviceSet) {
        this.gpuDeviceSet = new com.ksc.internal.SdkInternalList<GpuDevice>(gpuDeviceSet);
    }
    public void addPhysicalDiskDeviceSet(PhysicalDiskDevice... physicalDiskDeviceSet) {
        if (this.physicalDiskDeviceSet == null) {
            this.physicalDiskDeviceSet = new com.ksc.internal.SdkInternalList<PhysicalDiskDevice>();
        }
        for (PhysicalDiskDevice value : physicalDiskDeviceSet) {
            this.physicalDiskDeviceSet.add(value);
        }
    }
    public void setPhysicalDiskDeviceSet(List<PhysicalDiskDevice> physicalDiskDeviceSet) {
        this.physicalDiskDeviceSet = new com.ksc.internal.SdkInternalList<PhysicalDiskDevice>(physicalDiskDeviceSet);
    }
    public void addPriceSet(MonthlyPrice... priceSet) {
        if (this.priceSet == null) {
            this.priceSet = new com.ksc.internal.SdkInternalList<MonthlyPrice>();
        }
        for (MonthlyPrice value : priceSet) {
            this.priceSet.add(value);
        }
    }
    public void setPriceSet(List<MonthlyPrice> priceSet) {
        this.priceSet = new com.ksc.internal.SdkInternalList<MonthlyPrice>(priceSet);
    }

}
