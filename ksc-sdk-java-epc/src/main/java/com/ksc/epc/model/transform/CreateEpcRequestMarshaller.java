package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateEpcRequestMarshaller implements
        Marshaller<Request<CreateEpcRequest>, CreateEpcRequest> {

    @Override
    public Request<CreateEpcRequest> marshall(CreateEpcRequest createEpcRequest) {
        if (createEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateEpcRequest> request = new DefaultRequest<CreateEpcRequest>(
                createEpcRequest, "epc");
        request.addParameter("Action", "CreateEpc");
        String version = createEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createEpcRequest.getHostType())) {
            request.addParameter("HostType", createEpcRequest.getHostType());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", createEpcRequest.getAvailabilityZone());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getRaid())) {
            request.addParameter("Raid", createEpcRequest.getRaid());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getImageId())) {
            request.addParameter("ImageId", createEpcRequest.getImageId());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getNetworkInterfaceMode())) {
            request.addParameter("NetworkInterfaceMode", createEpcRequest.getNetworkInterfaceMode());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getSubnetId())) {
            request.addParameter("SubnetId", createEpcRequest.getSubnetId());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getPrivateIpAddress())) {
            request.addParameter("PrivateIpAddress", createEpcRequest.getPrivateIpAddress());
        }
            com.ksc.internal.SdkInternalList<String> securityGroupIds = (com.ksc.internal.SdkInternalList<String>) createEpcRequest
				.getSecurityGroupIds();
		    if (securityGroupIds != null && (!securityGroupIds.isEmpty() || !securityGroupIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : securityGroupIds) {
				if (value != null) {
					request.addParameter("SecurityGroupId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getDNS1())) {
            request.addParameter("DNS1", createEpcRequest.getDNS1());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getDNS2())) {
            request.addParameter("DNS2", createEpcRequest.getDNS2());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getKeyId())) {
            request.addParameter("KeyId", createEpcRequest.getKeyId());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getHostName())) {
            request.addParameter("HostName", createEpcRequest.getHostName());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getChargeType())) {
            request.addParameter("ChargeType", createEpcRequest.getChargeType());
        }
        if (createEpcRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime", String.valueOf(createEpcRequest.getPurchaseTime()));
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getPassword())) {
            request.addParameter("Password", createEpcRequest.getPassword());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getSecurityAgent())) {
            request.addParameter("SecurityAgent", createEpcRequest.getSecurityAgent());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getCloudMonitorAgent())) {
            request.addParameter("CloudMonitorAgent", createEpcRequest.getCloudMonitorAgent());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getExtensionSubnetId())) {
            request.addParameter("ExtensionSubnetId", createEpcRequest.getExtensionSubnetId());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getExtensionPrivateIpAddress())) {
            request.addParameter("ExtensionPrivateIpAddress", createEpcRequest.getExtensionPrivateIpAddress());
        }
            com.ksc.internal.SdkInternalList<String> extensionSecurityGroupIds = (com.ksc.internal.SdkInternalList<String>) createEpcRequest
				.getExtensionSecurityGroupIds();
		    if (extensionSecurityGroupIds != null && (!extensionSecurityGroupIds.isEmpty() || !extensionSecurityGroupIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : extensionSecurityGroupIds) {
				if (value != null) {
					request.addParameter("ExtensionSecurityGroupId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getExtensionDNS1())) {
            request.addParameter("ExtensionDNS1", createEpcRequest.getExtensionDNS1());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getExtensionDNS2())) {
            request.addParameter("ExtensionDNS2", createEpcRequest.getExtensionDNS2());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getProjectId())) {
            request.addParameter("ProjectId", createEpcRequest.getProjectId());
        }
        if (createEpcRequest.getAddressBandWidth() != null) {
            request.addParameter("AddressBandWidth", String.valueOf(createEpcRequest.getAddressBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getLineId())) {
            request.addParameter("LineId", createEpcRequest.getLineId());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getAddressChargeType())) {
            request.addParameter("AddressChargeType", createEpcRequest.getAddressChargeType());
        }
        if (createEpcRequest.getAddressPurchaseTime() != null) {
            request.addParameter("AddressPurchaseTime", String.valueOf(createEpcRequest.getAddressPurchaseTime()));
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getAddressProjectId())) {
            request.addParameter("AddressProjectId", createEpcRequest.getAddressProjectId());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getSystemFileType())) {
            request.addParameter("SystemFileType", createEpcRequest.getSystemFileType());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getDataFileType())) {
            request.addParameter("DataFileType", createEpcRequest.getDataFileType());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getDataDiskCatalogue())) {
            request.addParameter("DataDiskCatalogue", createEpcRequest.getDataDiskCatalogue());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getDataDiskCatalogueSuffix())) {
            request.addParameter("DataDiskCatalogueSuffix", createEpcRequest.getDataDiskCatalogueSuffix());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getHyperThreading())) {
            request.addParameter("HyperThreading", createEpcRequest.getHyperThreading());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getNvmeDataFileType())) {
            request.addParameter("NvmeDataFileType", createEpcRequest.getNvmeDataFileType());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getNvmeDataDiskCatalogue())) {
            request.addParameter("NvmeDataDiskCatalogue", createEpcRequest.getNvmeDataDiskCatalogue());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getNvmeDataDiskCatalogueSuffix())) {
            request.addParameter("NvmeDataDiskCatalogueSuffix", createEpcRequest.getNvmeDataDiskCatalogueSuffix());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getBondAttribute())) {
            request.addParameter("BondAttribute", createEpcRequest.getBondAttribute());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getContainerAgent())) {
            request.addParameter("ContainerAgent", createEpcRequest.getContainerAgent());
        }
        if (!StringUtils.isNullOrEmpty(createEpcRequest.getKesAgent())) {
            request.addParameter("KesAgent", createEpcRequest.getKesAgent());
        }

        return request;
    }
}