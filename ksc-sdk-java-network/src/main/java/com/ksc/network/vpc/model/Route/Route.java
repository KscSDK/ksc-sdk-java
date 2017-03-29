package com.ksc.network.vpc.model.Route;

import lombok.ToString;

@ToString
public class Route {
	private String CreateTime;
	
	private String VpcId;
	
	private String RouteId;
	
	private String DestinationCidrBlock;
	
	private String RouteType;
	
	private com.ksc.internal.SdkInternalList<NextHop> NextHopSet;

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getRouteId() {
		return RouteId; 
	}

	public void setRouteId(String routeId) {
		RouteId = routeId;
	}

	public String getDestinationCidrBlock() {
		return DestinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		DestinationCidrBlock = destinationCidrBlock;
	}

	public String getRouteType() {
		return RouteType;
	}

	public void setRouteType(String routeType) {
		RouteType = routeType;
	}

	public com.ksc.internal.SdkInternalList<NextHop> getNextHopSet() {
		return NextHopSet;
	}

	public void setNextHopSet(com.ksc.internal.SdkInternalList<NextHop> nextHopSet) {
		NextHopSet = nextHopSet;
	}
	
	public void addNextHopSet(NextHop... hops) {
		if (NextHopSet == null) {
			NextHopSet = new com.ksc.internal.SdkInternalList<NextHop>();
		}
		for (NextHop hop : hops) {
			NextHopSet.add(hop);
		}
	}

}
