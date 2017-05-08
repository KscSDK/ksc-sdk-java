package com.ksc.network.vpc.model.Route;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Route {
	/**
	 * 路由创建时间
	 */
	private String CreateTime;
	/**
	 * Vpc的ID
	 */
	private String VpcId;
	/**
	 * 路由的ID
	 */
	private String RouteId;
	/**
	 * 目标网段
	 */
	private String DestinationCidrBlock;
	/**
	 * 路由的类型，Tunnel为隧道网关，InternetGateway为互联网网关
	 */
	private String RouteType;
	/**
	 * 路由的下一跳
	 */
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
