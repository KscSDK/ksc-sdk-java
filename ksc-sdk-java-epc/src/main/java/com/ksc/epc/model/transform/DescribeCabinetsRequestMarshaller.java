package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeCabinetsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeCabinetsRequestMarshaller implements
        Marshaller<Request<DescribeCabinetsRequest>, DescribeCabinetsRequest> {

    @Override
    public Request<DescribeCabinetsRequest> marshall(DescribeCabinetsRequest describeCabinetsRequest) {
        if (describeCabinetsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCabinetsRequest> request = new DefaultRequest<DescribeCabinetsRequest>(
                describeCabinetsRequest, "epc");
        request.addParameter("Action", "DescribeCabinets");
        String version = describeCabinetsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeCabinetsRequest.getFilters();
            if (filtersList != null && (!filtersList.isEmpty() || !filtersList.isAutoConstruct())) {
			    int filtersListIndex = 1;
			    for (Filter filtersListValue : filtersList) {
				    if (filtersListValue.getName() != null) {
					    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
				    }

				    com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue .getValues();
				    if (valuesList != null && (!valuesList.isEmpty() || !valuesList.isAutoConstruct())) {
					    int valuesListIndex = 1;
					    for (String valuesListValue : valuesList) {
						    if (valuesListValue != null) {
							    request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
						    }
						    valuesListIndex++;
					    }
				    }
				    filtersListIndex++;
			    }
		    }
            com.ksc.internal.SdkInternalList<String> cabinetIds = (com.ksc.internal.SdkInternalList<String>) describeCabinetsRequest
				.getCabinetIds();
		    if (cabinetIds != null && (!cabinetIds.isEmpty() || !cabinetIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : cabinetIds) {
				if (value != null) {
					request.addParameter("CabinetId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeCabinetsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeCabinetsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeCabinetsRequest.getNextToken())) {
            request.addParameter("NextToken", describeCabinetsRequest.getNextToken());
        }

        return request;
    }
}