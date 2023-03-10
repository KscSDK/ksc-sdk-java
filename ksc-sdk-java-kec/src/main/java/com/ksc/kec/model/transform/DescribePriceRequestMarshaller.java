package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribePriceRequest;
import com.ksc.kec.model.RunInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * RunInstancesRequest Marshaller
 */
public class DescribePriceRequestMarshaller implements
        Marshaller<Request<DescribePriceRequest>, DescribePriceRequest> {

    public Request<DescribePriceRequest> marshall(
            DescribePriceRequest describePriceRequest) {

        if (describePriceRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribePriceRequest> request = new DefaultRequest<DescribePriceRequest>(
                describePriceRequest, "kec");
        request.addParameter("Action", "RunInstances");
        String version = describePriceRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        //AddParameter
        if (describePriceRequest.getImageId() != null) {
            request.addParameter("ImageId",
                    StringUtils.fromString(describePriceRequest.getImageId()));
        }
        if (describePriceRequest.getInstanceType() != null) {
            request.addParameter("InstanceType",
                    StringUtils.fromString(describePriceRequest.getInstanceType()));
        }
        if (describePriceRequest.getDataDiskGb() != null) {
            request.addParameter("DataDiskGb",
                    StringUtils.fromInteger(describePriceRequest.getDataDiskGb()));
        }
        if (describePriceRequest.getMaxCount() != null) {
            request.addParameter("MaxCount",
                    StringUtils.fromInteger(describePriceRequest.getMaxCount()));
        }

        if (describePriceRequest.getChargeType() != null) {
            request.addParameter("ChargeType",
                    StringUtils.fromString(describePriceRequest.getChargeType()));
        }
        if (describePriceRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime",
                    StringUtils.fromInteger(describePriceRequest.getPurchaseTime()));
        }

        if (describePriceRequest.getDataDisk() != null && describePriceRequest.getDataDisk().size() > 0) {
            for (int i = 0; i < describePriceRequest.getDataDisk().size(); i++) {
                request.addParameter("DataDisk." + (i + 1) + ".Type",
                        StringUtils.fromString(describePriceRequest.getDataDisk().get(i).getType()));
                request.addParameter("DataDisk." + (i + 1) + ".Size",
                        StringUtils.fromInteger(describePriceRequest.getDataDisk().get(i).getSize()));
            }
        }

        if (describePriceRequest.getSystemDisk() != null) {
            request.addParameter("SystemDisk.DiskType",
                    StringUtils.fromString(describePriceRequest.getSystemDisk().getDiskType()));
            request.addParameter("SystemDisk.DiskSize",
                    StringUtils.fromInteger(describePriceRequest.getSystemDisk().getDiskSize()));
        }

        return request;
    }

}
