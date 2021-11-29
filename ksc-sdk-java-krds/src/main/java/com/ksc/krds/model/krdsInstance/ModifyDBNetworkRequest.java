package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.ModifyDBNetworkMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import java.io.Serializable;

public class ModifyDBNetworkRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<ModifyDBNetworkRequest> {

    private String DBInstanceIdentifier;
    private String VpcId;
    private String SubnetId;
    private String Vip;
    private Integer Port;


    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

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

    @Override
    public Request<ModifyDBNetworkRequest> getDryRunRequest() {
        Request<ModifyDBNetworkRequest> request = new ModifyDBNetworkMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
