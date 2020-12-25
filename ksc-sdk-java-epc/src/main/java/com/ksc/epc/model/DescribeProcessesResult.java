package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeProcesses.
 * </p>
 */
@Data
public class DescribeProcessesResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Process> ProcessSet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeProcessesResult that = (DescribeProcessesResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (ProcessSet != null ? !ProcessSet.equals(that.ProcessSet) : that.ProcessSet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (ProcessSet != null ? ProcessSet.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void addProcessSet(Process... processs) {
		if (this.ProcessSet == null) {
			this.ProcessSet = new SdkInternalList<Process>();
		}
		for (Process process : processs) {
			this.ProcessSet.add(process);
		}
	}

    public void setProcessSet(List<Process> processs) {
        this.ProcessSet = new SdkInternalList<Process>(processs);
    }

    @Override
    public DescribeProcessesResult clone() {
        try {
            return (DescribeProcessesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
