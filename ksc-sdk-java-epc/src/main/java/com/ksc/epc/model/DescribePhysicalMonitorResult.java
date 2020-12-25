package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribePhysicalMonitor.
 * </p>
 */
@Data
public class DescribePhysicalMonitorResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Item> CPUInfo;
    private SdkInternalList<Item> MemoryInfo;
    private SdkInternalList<Item> DiskInfo;
    private SdkInternalList<Item> FanInfo;
    private SdkInternalList<Item> PowerInfo;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribePhysicalMonitorResult that = (DescribePhysicalMonitorResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (CPUInfo != null ? !CPUInfo.equals(that.CPUInfo) : that.CPUInfo != null) return false;
        if (MemoryInfo != null ? !MemoryInfo.equals(that.MemoryInfo) : that.MemoryInfo != null) return false;
        if (DiskInfo != null ? !DiskInfo.equals(that.DiskInfo) : that.DiskInfo != null) return false;
        if (FanInfo != null ? !FanInfo.equals(that.FanInfo) : that.FanInfo != null) return false;
        if (PowerInfo != null ? !PowerInfo.equals(that.PowerInfo) : that.PowerInfo != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (CPUInfo != null ? CPUInfo.hashCode() : 0);
        result = 31 * result + (MemoryInfo != null ? MemoryInfo.hashCode() : 0);
        result = 31 * result + (DiskInfo != null ? DiskInfo.hashCode() : 0);
        result = 31 * result + (FanInfo != null ? FanInfo.hashCode() : 0);
        result = 31 * result + (PowerInfo != null ? PowerInfo.hashCode() : 0);
        return result;
    }

    public void addCPUInfo(Item... items) {
		if (this.CPUInfo == null) {
			this.CPUInfo = new SdkInternalList<Item>();
		}
		for (Item item : items) {
			this.CPUInfo.add(item);
		}
	}

    public void setCPUInfo(List<Item> items) {
        this.CPUInfo = new SdkInternalList<Item>(items);
    }
    public void addMemoryInfo(Item... items) {
		if (this.MemoryInfo == null) {
			this.MemoryInfo = new SdkInternalList<Item>();
		}
		for (Item item : items) {
			this.MemoryInfo.add(item);
		}
	}

    public void setMemoryInfo(List<Item> items) {
        this.MemoryInfo = new SdkInternalList<Item>(items);
    }
    public void addDiskInfo(Item... items) {
		if (this.DiskInfo == null) {
			this.DiskInfo = new SdkInternalList<Item>();
		}
		for (Item item : items) {
			this.DiskInfo.add(item);
		}
	}

    public void setDiskInfo(List<Item> items) {
        this.DiskInfo = new SdkInternalList<Item>(items);
    }
    public void addFanInfo(Item... items) {
		if (this.FanInfo == null) {
			this.FanInfo = new SdkInternalList<Item>();
		}
		for (Item item : items) {
			this.FanInfo.add(item);
		}
	}

    public void setFanInfo(List<Item> items) {
        this.FanInfo = new SdkInternalList<Item>(items);
    }
    public void addPowerInfo(Item... items) {
		if (this.PowerInfo == null) {
			this.PowerInfo = new SdkInternalList<Item>();
		}
		for (Item item : items) {
			this.PowerInfo.add(item);
		}
	}

    public void setPowerInfo(List<Item> items) {
        this.PowerInfo = new SdkInternalList<Item>(items);
    }

    @Override
    public DescribePhysicalMonitorResult clone() {
        try {
            return (DescribePhysicalMonitorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
