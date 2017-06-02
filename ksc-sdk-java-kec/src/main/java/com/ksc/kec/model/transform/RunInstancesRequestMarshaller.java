package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.RunInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * RunInstancesRequest Marshaller
 */

public class RunInstancesRequestMarshaller implements
        Marshaller<Request<RunInstancesRequest>, RunInstancesRequest> {

    public Request<RunInstancesRequest> marshall(
    		RunInstancesRequest runInstancesRequest) {

        if (runInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RunInstancesRequest> request = new DefaultRequest<RunInstancesRequest>(
                runInstancesRequest, "kec");
        request.addParameter("Action", "RunInstances");
        String version=runInstancesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        //AddParameter
        if(runInstancesRequest.getImageId()!=null) {
            request.addParameter("ImageId",
                    StringUtils.fromString(runInstancesRequest.getImageId()));
        }
        if(runInstancesRequest.getInstanceType()!=null) {
            request.addParameter("InstanceType",
                    StringUtils.fromString(runInstancesRequest.getInstanceType()));
        }
        if(runInstancesRequest.getDataDiskGb()!=null){
            request.addParameter("DataDiskGb",
                    StringUtils.fromInteger(runInstancesRequest.getDataDiskGb()));
        }
        if(runInstancesRequest.getMaxCount()!=null) {
            request.addParameter("MaxCount",
                    StringUtils.fromInteger(runInstancesRequest.getMaxCount()));
        }
        if(runInstancesRequest.getMinCount()!=null) {
            request.addParameter("MinCount",
                    StringUtils.fromInteger(runInstancesRequest.getMinCount()));
        }
        if(runInstancesRequest.getSubnetId()!=null) {
            request.addParameter("SubnetId",
                    StringUtils.fromString(runInstancesRequest.getSubnetId()));
        }
        if(runInstancesRequest.getInstancePassword()!=null) {
            request.addParameter("InstancePassword",
                    StringUtils.fromString(runInstancesRequest.getInstancePassword()));
        }
        if(runInstancesRequest.getChargeType()!=null) {
            request.addParameter("ChargeType",
                    StringUtils.fromString(runInstancesRequest.getChargeType()));
        }
        if(runInstancesRequest.getPurchaseTime()!=null) {
            request.addParameter("PurchaseTime",
                    StringUtils.fromInteger(runInstancesRequest.getPurchaseTime()));
        }
        if(runInstancesRequest.getSecurityGroupId()!=null) {
            request.addParameter("SecurityGroupId",
                    StringUtils.fromString(runInstancesRequest.getSecurityGroupId()));
        }
        if(runInstancesRequest.getPrivateIpAddress()!=null) {
            request.addParameter("PrivateIpAddress",
                    StringUtils.fromString(runInstancesRequest.getPrivateIpAddress()));
        }
        if(runInstancesRequest.getInstanceName()!=null) {
            request.addParameter("InstanceName",
                    StringUtils.fromString(runInstancesRequest.getInstanceName()));
        }
        if(runInstancesRequest.getInstanceNameSuffix()!=null) {
            request.addParameter("InstanceNameSuffix",
                    StringUtils.fromString(runInstancesRequest.getInstanceNameSuffix()));
        }
        if(runInstancesRequest.getSriovNetSupport()!=null) {
            request.addParameter("SriovNetSupport",
                    StringUtils.fromBoolean(runInstancesRequest.getSriovNetSupport()));
        }
        return request;
    }

}
