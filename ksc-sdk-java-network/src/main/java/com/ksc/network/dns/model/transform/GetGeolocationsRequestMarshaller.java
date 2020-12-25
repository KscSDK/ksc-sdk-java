package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.dns.model.GetGeolocationsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetGeolocationsRequestMarshaller implements
        Marshaller<Request<GetGeolocationsRequest>, GetGeolocationsRequest> {

    @Override
    public Request<GetGeolocationsRequest> marshall(GetGeolocationsRequest getGeolocationsRequest) {
        if (getGeolocationsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetGeolocationsRequest> request = new DefaultRequest<GetGeolocationsRequest>(
                getGeolocationsRequest, "dns");
        request.addParameter("Action", "GetGeolocations");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);


        return request;
    }
}