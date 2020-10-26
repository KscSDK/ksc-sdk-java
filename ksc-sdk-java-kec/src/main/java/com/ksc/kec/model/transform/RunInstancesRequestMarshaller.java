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
        String version = runInstancesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        //AddParameter
        if (runInstancesRequest.getImageId() != null) {
            request.addParameter("ImageId",
                    StringUtils.fromString(runInstancesRequest.getImageId()));
        }
        if (runInstancesRequest.getInstanceType() != null) {
            request.addParameter("InstanceType",
                    StringUtils.fromString(runInstancesRequest.getInstanceType()));
        }
        if (runInstancesRequest.getDataDiskGb() != null) {
            request.addParameter("DataDiskGb",
                    StringUtils.fromInteger(runInstancesRequest.getDataDiskGb()));
        }
        if (runInstancesRequest.getMaxCount() != null) {
            request.addParameter("MaxCount",
                    StringUtils.fromInteger(runInstancesRequest.getMaxCount()));
        }
        if (runInstancesRequest.getMinCount() != null) {
            request.addParameter("MinCount",
                    StringUtils.fromInteger(runInstancesRequest.getMinCount()));
        }
        if (runInstancesRequest.getSubnetId() != null) {
            request.addParameter("SubnetId",
                    StringUtils.fromString(runInstancesRequest.getSubnetId()));
        }
        if (runInstancesRequest.getLocalVolumeSnapshotId() != null) {
            request.addParameter("LocalVolumeSnapshotId",
                    StringUtils.fromString(runInstancesRequest.getLocalVolumeSnapshotId()));
        }
        if (runInstancesRequest.getInstancePassword() != null) {
            request.addParameter("InstancePassword",
                    StringUtils.fromString(runInstancesRequest.getInstancePassword()));
        }
        if (runInstancesRequest.getKeepImageLogin() != null) {
            request.addParameter("KeepImageLogin",
                    StringUtils.fromBoolean(runInstancesRequest.getKeepImageLogin()));
        }
        if (runInstancesRequest.getChargeType() != null) {
            request.addParameter("ChargeType",
                    StringUtils.fromString(runInstancesRequest.getChargeType()));
        }
        if (runInstancesRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime",
                    StringUtils.fromInteger(runInstancesRequest.getPurchaseTime()));
        }
        if (runInstancesRequest.getSecurityGroupId() != null) {
            request.addParameter("SecurityGroupId",
                    StringUtils.fromString(runInstancesRequest.getSecurityGroupId()));
        }
        if (runInstancesRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress",
                    StringUtils.fromString(runInstancesRequest.getPrivateIpAddress()));
        }
        if (runInstancesRequest.getInstanceName() != null) {
            request.addParameter("InstanceName",
                    StringUtils.fromString(runInstancesRequest.getInstanceName()));
        }
        if (runInstancesRequest.getInstanceNameSuffix() != null) {
            request.addParameter("InstanceNameSuffix",
                    StringUtils.fromString(runInstancesRequest.getInstanceNameSuffix()));
        }
        if (runInstancesRequest.getSriovNetSupport() != null) {
            request.addParameter("SriovNetSupport",
                    StringUtils.fromBoolean(runInstancesRequest.getSriovNetSupport()));
        }
        if (runInstancesRequest.getProjectId() != null) {
            request.addParameter("ProjectId",
                    StringUtils.fromLong(runInstancesRequest.getProjectId()));
        }
        if (runInstancesRequest.getDataGuardId() != null) {
            request.addParameter("DataGuardId",
                    StringUtils.fromString(runInstancesRequest.getDataGuardId()));
        }
        if (runInstancesRequest.getSpotStrategy() != null) {
            request.addParameter("SpotStrategy",
                    StringUtils.fromString(runInstancesRequest.getSpotStrategy()));
        }
        if (runInstancesRequest.getSpotPriceLimit() != null) {
            request.addParameter("SpotPriceLimit",
                    StringUtils.fromDouble(runInstancesRequest.getSpotPriceLimit()));
        }
        if (runInstancesRequest.getAddressBandWidth() != null) {
            request.addParameter("AddressBandWidth",
                    StringUtils.fromInteger(runInstancesRequest.getAddressBandWidth()));
        }
        if (runInstancesRequest.getLineId() != null) {
            request.addParameter("LineId",
                    StringUtils.fromString(runInstancesRequest.getLineId()));
        }
        if (runInstancesRequest.getAddressChargeType() != null) {
            request.addParameter("AddressChargeType",
                    StringUtils.fromString(runInstancesRequest.getAddressChargeType()));
        }
        if (runInstancesRequest.getAddressPurchaseTime() != null) {
            request.addParameter("AddressPurchaseTime",
                    StringUtils.fromInteger(runInstancesRequest.getAddressPurchaseTime()));
        }
        if (runInstancesRequest.getAddressProjectId() != null) {
            request.addParameter("AddressProjectId",
                    StringUtils.fromString(runInstancesRequest.getAddressProjectId()));
        }
        if (runInstancesRequest.getModelId() != null) {
            request.addParameter("ModelId",
                    StringUtils.fromString(runInstancesRequest.getModelId()));
        }
        if (runInstancesRequest.getAutoDeleteTime() != null) {
            request.addParameter("AutoDeleteTime",
                    StringUtils.fromString(runInstancesRequest.getAutoDeleteTime()));
        }
        if (runInstancesRequest.getHostName() != null) {
            request.addParameter("HostName",
                    StringUtils.fromString(runInstancesRequest.getHostName()));
        }
        if (runInstancesRequest.getHostNameSuffix() != null) {
            request.addParameter("HostNameSuffix",
                    StringUtils.fromString(runInstancesRequest.getHostNameSuffix()));
        }
        if (runInstancesRequest.getUserData() != null) {
            request.addParameter("UserData",
                    StringUtils.fromString(runInstancesRequest.getUserData()));
        }
        if (runInstancesRequest.getDataDisk() != null && runInstancesRequest.getDataDisk().size() > 0) {
            for (int i = 0; i < runInstancesRequest.getDataDisk().size(); i++) {
                request.addParameter("DataDisk." + (i + 1) + ".Type",
                        StringUtils.fromString(runInstancesRequest.getDataDisk().get(i).getType()));
                request.addParameter("DataDisk." + (i + 1) + ".Size",
                        StringUtils.fromInteger(runInstancesRequest.getDataDisk().get(i).getSize()));
                request.addParameter("DataDisk." + (i + 1) + ".DeleteWithInstance",
                        StringUtils.fromBoolean(runInstancesRequest.getDataDisk().get(i).getDeleteWithInstance()));
                request.addParameter("DataDisk." + (i + 1) + ".SnapshotId",
                        StringUtils.fromString(runInstancesRequest.getDataDisk().get(i).getSnapshotId()));
            }
        }
        if (runInstancesRequest.getKeyIds() != null && runInstancesRequest.getKeyIds().size() > 0) {
            for (int i = 0; i < runInstancesRequest.getKeyIds().size(); i++) {
                request.addParameter("KeyId." + (i + 1),
                        StringUtils.fromString(runInstancesRequest.getKeyIds().get(i)));
            }
        }
        if (runInstancesRequest.getSystemDisk() != null) {
            request.addParameter("SystemDisk.DiskType",
                    StringUtils.fromString(runInstancesRequest.getSystemDisk().getDiskType()));
            request.addParameter("SystemDisk.DiskSize",
                    StringUtils.fromInteger(runInstancesRequest.getSystemDisk().getDiskSize()));
        }

        return request;
    }

}
