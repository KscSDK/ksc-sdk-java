package com.ksc.krds.model.krdsInstance;

/***
 * @ClassName: ModifyDBNetworkRequest
 * @Description:TODO
 * @version : V1.0
 */
public class ModifyDBNetworkRequest extends BaseRequest<ModifyDBNetworkRequest>{

    private String DBInstanceIdentifier;
    private String VpcId;
    private String SubnetId;
    private String Vip;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    public String getVip() {
        return Vip;
    }

    public void setVip(String vip) {
        Vip = vip;
    }
}
