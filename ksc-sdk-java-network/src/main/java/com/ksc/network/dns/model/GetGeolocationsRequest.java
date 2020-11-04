package com.ksc.network.dns.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.dns.model.transform.GetGeolocationsRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for GetGeolocations.
 * </p>
 */
@Data
public class GetGeolocationsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<GetGeolocationsRequest> {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GetGeolocationsRequest that = (GetGeolocationsRequest) o;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        return result;
    }


    @Override
    public Request<GetGeolocationsRequest> getDryRunRequest() {
        Request<GetGeolocationsRequest> request = new GetGeolocationsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public GetGeolocationsRequest clone() {
        return (GetGeolocationsRequest) super.clone();
    }
}

