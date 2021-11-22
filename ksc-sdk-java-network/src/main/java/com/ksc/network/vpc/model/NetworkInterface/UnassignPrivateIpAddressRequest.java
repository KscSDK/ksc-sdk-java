package com.ksc.network.vpc.model.NetworkInterface;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkInterface.UnassignPrivateIpAddressRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for UnassignPrivateIpAddress.
 * </p>
 */
@Data
public class UnassignPrivateIpAddressRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<UnassignPrivateIpAddressRequest> {

    /**
     * 弹性网卡的id
     */
    private String networkInterfaceId;
    /**
     * 私网IP
     */
    private com.ksc.internal.SdkInternalList<String> privateIpAddressList;


    public void addPrivateIpAddressList(String... privateIpAddressList){
        if (this.privateIpAddressList == null) {
            this.privateIpAddressList = new com.ksc.internal.SdkInternalList<String>();
        }
        for(String value : privateIpAddressList){
            this.privateIpAddressList.add(value);
        }
    }

    @Override
    public UnassignPrivateIpAddressRequest clone() {
        return (UnassignPrivateIpAddressRequest) super.clone();
    }

    @Override
    public Request<UnassignPrivateIpAddressRequest> getDryRunRequest() {
        Request<UnassignPrivateIpAddressRequest> request = new UnassignPrivateIpAddressRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}