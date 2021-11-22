package com.ksc.network.vpc.model.NetworkInterface;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkInterface.AssignPrivateIpAddressRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AssignPrivateIpAddress.
 * </p>
 */
@Data
public class AssignPrivateIpAddressRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssignPrivateIpAddressRequest> {

    /**
     * 弹性网卡的id
     */
    private String networkInterfaceId;
    /**
     * 指定分配的私网IP
     */
    private com.ksc.internal.SdkInternalList<String> privateIpAddressList;
    /**
     * 自动分配的私网IP个数
     */
    private Integer secondaryPrivateIpAddressCount;


    public void addPrivateIpAddressList(String... privateIpAddressList){
        if (this.privateIpAddressList == null) {
            this.privateIpAddressList = new com.ksc.internal.SdkInternalList<String>();
        }
        for(String value : privateIpAddressList){
            this.privateIpAddressList.add(value);
        }
    }

    @Override
    public AssignPrivateIpAddressRequest clone() {
        return (AssignPrivateIpAddressRequest) super.clone();
    }

    @Override
    public Request<AssignPrivateIpAddressRequest> getDryRunRequest() {
        Request<AssignPrivateIpAddressRequest> request = new AssignPrivateIpAddressRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}