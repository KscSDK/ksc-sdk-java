package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ReinstallEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ReinstallEpcRequestMarshaller implements
        Marshaller<Request<ReinstallEpcRequest>, ReinstallEpcRequest> {

    @Override
    public Request<ReinstallEpcRequest> marshall(ReinstallEpcRequest reinstallEpcRequest) {
        if (reinstallEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReinstallEpcRequest> request = new DefaultRequest<ReinstallEpcRequest>(
                reinstallEpcRequest, "epc");
        request.addParameter("Action", "ReinstallEpc");
        String version = reinstallEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getHostId())) {
            request.addParameter("HostId", reinstallEpcRequest.getHostId());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getImageId())) {
            request.addParameter("ImageId", reinstallEpcRequest.getImageId());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getKeyId())) {
            request.addParameter("KeyId", reinstallEpcRequest.getKeyId());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getPassword())) {
            request.addParameter("Password", reinstallEpcRequest.getPassword());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getNetworkInterfaceMode())) {
            request.addParameter("NetworkInterfaceMode", reinstallEpcRequest.getNetworkInterfaceMode());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getSecurityAgent())) {
            request.addParameter("SecurityAgent", reinstallEpcRequest.getSecurityAgent());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getCloudMonitorAgent())) {
            request.addParameter("CloudMonitorAgent", reinstallEpcRequest.getCloudMonitorAgent());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getRaid())) {
            request.addParameter("Raid", reinstallEpcRequest.getRaid());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getHostName())) {
            request.addParameter("HostName", reinstallEpcRequest.getHostName());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getSystemFileType())) {
            request.addParameter("SystemFileType", reinstallEpcRequest.getSystemFileType());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getDataFileType())) {
            request.addParameter("DataFileType", reinstallEpcRequest.getDataFileType());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getDataDiskCatalogue())) {
            request.addParameter("DataDiskCatalogue", reinstallEpcRequest.getDataDiskCatalogue());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getDataDiskCatalogueSuffix())) {
            request.addParameter("DataDiskCatalogueSuffix", reinstallEpcRequest.getDataDiskCatalogueSuffix());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getHyperThreading())) {
            request.addParameter("HyperThreading", reinstallEpcRequest.getHyperThreading());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getNvmeDataFileType())) {
            request.addParameter("NvmeDataFileType", reinstallEpcRequest.getNvmeDataFileType());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getNvmeDataDiskCatalogue())) {
            request.addParameter("NvmeDataDiskCatalogue", reinstallEpcRequest.getNvmeDataDiskCatalogue());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getNvmeDataDiskCatalogueSuffix())) {
            request.addParameter("NvmeDataDiskCatalogueSuffix", reinstallEpcRequest.getNvmeDataDiskCatalogueSuffix());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getBondAttribute())) {
            request.addParameter("BondAttribute", reinstallEpcRequest.getBondAttribute());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getContainerAgent())) {
            request.addParameter("ContainerAgent", reinstallEpcRequest.getContainerAgent());
        }
        if (!StringUtils.isNullOrEmpty(reinstallEpcRequest.getKesAgent())) {
            request.addParameter("KesAgent", reinstallEpcRequest.getKesAgent());
        }

        return request;
    }
}