package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.CreateVpnTunnelRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateVpnTunnel.
 * </p>
 */
@Data
public class CreateVpnTunnelRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateVpnTunnelRequest> {

    /**
     * 客户网关的类型
     */
    private String type;
    /**
     * VPN通道的名称
     */
    private String vpnTunnelName;
    /**
     * GRE模式VPN的IP
     */
    private String vpnGreIp;
    /**
     * GRE模式客户的IP
     */
    private String customerGreIp;
    /**
     * GRE模式开启HA模式VPN的IP
     */
    private String haVpnGreIp;
    /**
     * GRE模式开启HA模式客户的IP
     */
    private String haCustomerGreIp;
    /**
     * VPN网关的ID
     */
    private String vpnGatewayId;
    /**
     * 客户网关的ID
     */
    private String customerGatewayId;
    /**
     * 对称加密的KEY，VPN端和客户端统一，用户自行填写
     */
    private String preSharedKey;
    /**
     * 认证算法
     */
    private String ikeAuthenAlgorithm;
    /**
     * 密钥加密算法的类型
     */
    private String ikeDHGroup;
    /**
     * ikey的加密算法
     */
    private String ikeEncryAlgorithm;
    /**
     * ipsec的加密算法
     */
    private String ipsecEncryAlgorithm;
    /**
     * ipsec算法
     */
    private String ipsecAuthenAlgorithm;
    /**
     * 生存周期，单位KB
     */
    private Integer ipsecLifetimeTraffic;
    /**
     * 生存周期，单位秒
     */
    private Integer ipsecLifetimeSecond;
    /**
     * 是否野蛮模式
     */
    private Boolean enableNatTraversal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateVpnTunnelRequest that = (CreateVpnTunnelRequest) o;
        if (type != null ? !type.equals(that.type) : that.type != null)
            return false;
        if (vpnTunnelName != null ? !vpnTunnelName.equals(that.vpnTunnelName) : that.vpnTunnelName != null)
            return false;
        if (vpnGreIp != null ? !vpnGreIp.equals(that.vpnGreIp) : that.vpnGreIp != null)
            return false;
        if (customerGreIp != null ? !customerGreIp.equals(that.customerGreIp) : that.customerGreIp != null)
            return false;
        if (haVpnGreIp != null ? !haVpnGreIp.equals(that.haVpnGreIp) : that.haVpnGreIp != null)
            return false;
        if (haCustomerGreIp != null ? !haCustomerGreIp.equals(that.haCustomerGreIp) : that.haCustomerGreIp != null)
            return false;
        if (vpnGatewayId != null ? !vpnGatewayId.equals(that.vpnGatewayId) : that.vpnGatewayId != null)
            return false;
        if (customerGatewayId != null ? !customerGatewayId.equals(that.customerGatewayId) : that.customerGatewayId != null)
            return false;
        if (preSharedKey != null ? !preSharedKey.equals(that.preSharedKey) : that.preSharedKey != null)
            return false;
        if (ikeAuthenAlgorithm != null ? !ikeAuthenAlgorithm.equals(that.ikeAuthenAlgorithm) : that.ikeAuthenAlgorithm != null)
            return false;
        if (ikeDHGroup != null ? !ikeDHGroup.equals(that.ikeDHGroup) : that.ikeDHGroup != null)
            return false;
        if (ikeEncryAlgorithm != null ? !ikeEncryAlgorithm.equals(that.ikeEncryAlgorithm) : that.ikeEncryAlgorithm != null)
            return false;
        if (ipsecEncryAlgorithm != null ? !ipsecEncryAlgorithm.equals(that.ipsecEncryAlgorithm) : that.ipsecEncryAlgorithm != null)
            return false;
        if (ipsecAuthenAlgorithm != null ? !ipsecAuthenAlgorithm.equals(that.ipsecAuthenAlgorithm) : that.ipsecAuthenAlgorithm != null)
            return false;
        if (ipsecLifetimeTraffic != null ? !ipsecLifetimeTraffic.equals(that.ipsecLifetimeTraffic) : that.ipsecLifetimeTraffic != null)
            return false;
        if (ipsecLifetimeSecond != null ? !ipsecLifetimeSecond.equals(that.ipsecLifetimeSecond) : that.ipsecLifetimeSecond != null)
            return false;
        if (enableNatTraversal != null ? !enableNatTraversal.equals(that.enableNatTraversal) : that.enableNatTraversal != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (vpnTunnelName != null ? vpnTunnelName.hashCode() : 0);
        result = 31 * result + (vpnGreIp != null ? vpnGreIp.hashCode() : 0);
        result = 31 * result + (customerGreIp != null ? customerGreIp.hashCode() : 0);
        result = 31 * result + (haVpnGreIp != null ? haVpnGreIp.hashCode() : 0);
        result = 31 * result + (haCustomerGreIp != null ? haCustomerGreIp.hashCode() : 0);
        result = 31 * result + (vpnGatewayId != null ? vpnGatewayId.hashCode() : 0);
        result = 31 * result + (customerGatewayId != null ? customerGatewayId.hashCode() : 0);
        result = 31 * result + (preSharedKey != null ? preSharedKey.hashCode() : 0);
        result = 31 * result + (ikeAuthenAlgorithm != null ? ikeAuthenAlgorithm.hashCode() : 0);
        result = 31 * result + (ikeDHGroup != null ? ikeDHGroup.hashCode() : 0);
        result = 31 * result + (ikeEncryAlgorithm != null ? ikeEncryAlgorithm.hashCode() : 0);
        result = 31 * result + (ipsecEncryAlgorithm != null ? ipsecEncryAlgorithm.hashCode() : 0);
        result = 31 * result + (ipsecAuthenAlgorithm != null ? ipsecAuthenAlgorithm.hashCode() : 0);
        result = 31 * result + (ipsecLifetimeTraffic != null ? ipsecLifetimeTraffic.hashCode() : 0);
        result = 31 * result + (ipsecLifetimeSecond != null ? ipsecLifetimeSecond.hashCode() : 0);
        result = 31 * result + (enableNatTraversal != null ? enableNatTraversal.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateVpnTunnelRequest> getDryRunRequest() {
        Request<CreateVpnTunnelRequest> request = new CreateVpnTunnelRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateVpnTunnelRequest clone() {
        return (CreateVpnTunnelRequest) super.clone();
    }
}

