package com.ksc.network.vpc.model.Nat;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeNats.
 * </p>
 */
@ToString
public class DescribeNatsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Nat> NatSet;
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

    public java.util.List<Nat> getNatSet() {
        if (NatSet == null) {
            NatSet = new com.ksc.internal.SdkInternalList<Nat>();
        }
        return NatSet;
    }



    public void setNatSet(java.util.Collection<Nat> nats) {
        if (nats == null) {
            this.NatSet = null;
            return;
        }

        this.NatSet = new com.ksc.internal.SdkInternalList<Nat>(nats);
    }

    public DescribeNatsResult withNats(Nat... nats) {
        if (this.NatSet == null) {
            setNatSet(new com.ksc.internal.SdkInternalList<Nat>(nats.length));
        }
        for (Nat ele : nats) {
            this.NatSet.add(ele);
        }
        return this;
    }


    public DescribeNatsResult withNats(java.util.Collection<Nat> nats) {
        setNatSet(nats);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeNatsResult that = (DescribeNatsResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return NatSet.equals(that.NatSet);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + NatSet.hashCode();
        return result;
    }
}