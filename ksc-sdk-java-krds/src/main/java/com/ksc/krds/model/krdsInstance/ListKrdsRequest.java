package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.ListKrdsMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class ListKrdsRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<ListKrdsRequest> {

    private Integer Marker=0;
    private Integer MaxRecords=10;

    public Integer getMarker() {
        return Marker;
    }

    public void setMarker(Integer marker) {
        Marker = marker;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }

    public Request<ListKrdsRequest> getDryRunRequest() {
        Request<ListKrdsRequest> request = new ListKrdsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
