package com.ksc.network.vpc.model.Tunnels;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeTunnels.
 * </p>
 */
@ToString
public class DescribeTunnelsResult {
	
	private String RequestId;
	/**
     * <p>
     * 隧道网关的信息
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Tunnel> TunnelSet;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

    public java.util.List<Tunnel> getTunnelSet() {
        if (TunnelSet == null) {
            TunnelSet = new com.ksc.internal.SdkInternalList<Tunnel>();
        }
        return TunnelSet;
    }



    public void setTunnelSet(java.util.Collection<Tunnel> tunnels) {
        if (tunnels == null) {
            this.TunnelSet = null;
            return;
        }

        this.TunnelSet = new com.ksc.internal.SdkInternalList<Tunnel>(tunnels);
    }

    public DescribeTunnelsResult withTunnels(Tunnel... tunnels) {
        if (this.TunnelSet == null) {
            setTunnelSet(new com.ksc.internal.SdkInternalList<Tunnel>(tunnels.length));
        }
        for (Tunnel ele : tunnels) {
            this.TunnelSet.add(ele);
        }
        return this;
    }


    public DescribeTunnelsResult withTunnels(java.util.Collection<Tunnel> tunnels) {
        setTunnelSet(tunnels);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeTunnelsResult that = (DescribeTunnelsResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return TunnelSet.equals(that.TunnelSet);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + TunnelSet.hashCode();
        return result;
    }
}