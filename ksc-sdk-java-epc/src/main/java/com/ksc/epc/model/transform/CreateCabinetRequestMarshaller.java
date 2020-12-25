package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateCabinetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateCabinetRequestMarshaller implements
        Marshaller<Request<CreateCabinetRequest>, CreateCabinetRequest> {

    @Override
    public Request<CreateCabinetRequest> marshall(CreateCabinetRequest createCabinetRequest) {
        if (createCabinetRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCabinetRequest> request = new DefaultRequest<CreateCabinetRequest>(
                createCabinetRequest, "epc");
        request.addParameter("Action", "CreateCabinet");
        String version = createCabinetRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createCabinetRequest.getChargeType())) {
            request.addParameter("ChargeType", createCabinetRequest.getChargeType());
        }
        if (!StringUtils.isNullOrEmpty(createCabinetRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", createCabinetRequest.getAvailabilityZone());
        }
        if (createCabinetRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime", String.valueOf(createCabinetRequest.getPurchaseTime()));
        }
        if (!StringUtils.isNullOrEmpty(createCabinetRequest.getCabinetType())) {
            request.addParameter("CabinetType", createCabinetRequest.getCabinetType());
        }
        if (!StringUtils.isNullOrEmpty(createCabinetRequest.getProjectId())) {
            request.addParameter("ProjectId", createCabinetRequest.getProjectId());
        }

        return request;
    }
}