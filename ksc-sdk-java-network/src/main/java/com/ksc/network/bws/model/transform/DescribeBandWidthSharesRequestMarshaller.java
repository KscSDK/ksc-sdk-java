package com.ksc.network.bws.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.bws.model.DescribeBandWidthSharesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeBandWidthSharesRequestMarshaller implements
        Marshaller<Request<DescribeBandWidthSharesRequest>, DescribeBandWidthSharesRequest> {

    @Override
    public Request<DescribeBandWidthSharesRequest> marshall(DescribeBandWidthSharesRequest describeBandWidthSharesRequest) {
        if (describeBandWidthSharesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeBandWidthSharesRequest> request = new DefaultRequest<DescribeBandWidthSharesRequest>(
                describeBandWidthSharesRequest, "bws");
        request.addParameter("Action", "DescribeBandWidthShares");
        String version = describeBandWidthSharesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeBandWidthSharesRequest.getFilters();
        if (filtersList != null && (!filtersList.isEmpty() || !filtersList.isAutoConstruct())) {
            int filtersListIndex = 1;
            for (Filter filtersListValue : filtersList) {
                if (filtersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue.getValues();
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
        com.ksc.internal.SdkInternalList<String> bandWidthShareIds = (com.ksc.internal.SdkInternalList<String>) describeBandWidthSharesRequest
                .getBandWidthShareIds();
        if (bandWidthShareIds != null && (!bandWidthShareIds.isEmpty() || !bandWidthShareIds.isAutoConstruct())) {
            int index = 1;

            for (String value : bandWidthShareIds) {
                if (value != null) {
                    request.addParameter("BandWidthShareId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        com.ksc.internal.SdkInternalList<String> projectIds = (com.ksc.internal.SdkInternalList<String>) describeBandWidthSharesRequest
                .getProjectIds();
        if (projectIds != null && (!projectIds.isEmpty() || !projectIds.isAutoConstruct())) {
            int index = 1;

            for (String value : projectIds) {
                if (value != null) {
                    request.addParameter("ProjectId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (!StringUtils.isNullOrEmpty(describeBandWidthSharesRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeBandWidthSharesRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeBandWidthSharesRequest.getNextToken())) {
            request.addParameter("NextToken", describeBandWidthSharesRequest.getNextToken());
        }

        return request;
    }
}