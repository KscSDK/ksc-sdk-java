package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeImagesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeImagesRequestMarshaller implements
        Marshaller<Request<DescribeImagesRequest>, DescribeImagesRequest> {

    @Override
    public Request<DescribeImagesRequest> marshall(DescribeImagesRequest describeImagesRequest) {
        if (describeImagesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeImagesRequest> request = new DefaultRequest<DescribeImagesRequest>(
                describeImagesRequest, "epc");
        request.addParameter("Action", "DescribeImages");
        String version = describeImagesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeImagesRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> imageIds = (com.ksc.internal.SdkInternalList<String>) describeImagesRequest
				.getImageIds();
		    if (imageIds != null && (!imageIds.isEmpty() || !imageIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : imageIds) {
				if (value != null) {
					request.addParameter("ImageId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeImagesRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeImagesRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeImagesRequest.getNextToken())) {
            request.addParameter("NextToken", describeImagesRequest.getNextToken());
        }

        return request;
    }
}