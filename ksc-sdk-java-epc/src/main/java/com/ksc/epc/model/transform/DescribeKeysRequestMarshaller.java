package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeKeysRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeKeysRequestMarshaller implements
        Marshaller<Request<DescribeKeysRequest>, DescribeKeysRequest> {

    @Override
    public Request<DescribeKeysRequest> marshall(DescribeKeysRequest describeKeysRequest) {
        if (describeKeysRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeKeysRequest> request = new DefaultRequest<DescribeKeysRequest>(
                describeKeysRequest, "epc");
        request.addParameter("Action", "DescribeKeys");
        String version = describeKeysRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeKeysRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> keyIds = (com.ksc.internal.SdkInternalList<String>) describeKeysRequest
				.getKeyIds();
		    if (keyIds != null && (!keyIds.isEmpty() || !keyIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : keyIds) {
				if (value != null) {
					request.addParameter("KeyId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeKeysRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeKeysRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeKeysRequest.getNextToken())) {
            request.addParameter("NextToken", describeKeysRequest.getNextToken());
        }

        return request;
    }
}