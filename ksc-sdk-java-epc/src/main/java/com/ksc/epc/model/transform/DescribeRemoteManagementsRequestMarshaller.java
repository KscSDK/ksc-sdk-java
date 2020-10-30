package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeRemoteManagementsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeRemoteManagementsRequestMarshaller implements
        Marshaller<Request<DescribeRemoteManagementsRequest>, DescribeRemoteManagementsRequest> {

    @Override
    public Request<DescribeRemoteManagementsRequest> marshall(DescribeRemoteManagementsRequest describeRemoteManagementsRequest) {
        if (describeRemoteManagementsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeRemoteManagementsRequest> request = new DefaultRequest<DescribeRemoteManagementsRequest>(
                describeRemoteManagementsRequest, "epc");
        request.addParameter("Action", "DescribeRemoteManagements");
        String version = describeRemoteManagementsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeRemoteManagementsRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> remoteManagementIds = (com.ksc.internal.SdkInternalList<String>) describeRemoteManagementsRequest
				.getRemoteManagementIds();
		    if (remoteManagementIds != null && (!remoteManagementIds.isEmpty() || !remoteManagementIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : remoteManagementIds) {
				if (value != null) {
					request.addParameter("RemoteManagementId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }

        return request;
    }
}