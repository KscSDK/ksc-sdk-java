package com.ksc.network.vpc.model.havip;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeHaVip.
 * </p>
 */
@ToString
@EqualsAndHashCode
public class DescribeHaVipResult {
	
	private String RequestId;

    private com.ksc.internal.SdkInternalList<HaVip> HaVipSet;

    /**
     * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
     */
    private String NextToken;

    public String getNextToken() {
        return NextToken;
    }

    public void setNextToken(String nextToken) {
        NextToken = nextToken;
    }

    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

    public java.util.List<HaVip> getHaVipSet() {
        if (HaVipSet == null) {
            HaVipSet = new com.ksc.internal.SdkInternalList<HaVip>();
        }
        return HaVipSet;
    }

    public void setHaVipSet(java.util.Collection<HaVip> haVips) {
        if (haVips == null) {
            this.HaVipSet = null;
            return;
        }

        this.HaVipSet = new com.ksc.internal.SdkInternalList<HaVip>(haVips);
    }

    public DescribeHaVipResult withHaVips(HaVip... haVips) {
        if (this.HaVipSet == null) {
            setHaVipSet(new com.ksc.internal.SdkInternalList<HaVip>(haVips.length));
        }
        for (HaVip ele : haVips) {
            this.HaVipSet.add(ele);
        }
        return this;
    }

    public DescribeHaVipResult withHaVips(java.util.Collection<HaVip> haVips) {
        setHaVipSet(haVips);
        return this;
    }
}