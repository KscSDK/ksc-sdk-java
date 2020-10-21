package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeRulesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeRulesRequestMarshaller implements
        Marshaller<Request<DescribeRulesRequest>, DescribeRulesRequest> {

    @Override
    public Request<DescribeRulesRequest> marshall(DescribeRulesRequest describeRulesRequest) {
        if (describeRulesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeRulesRequest> request = new DefaultRequest<DescribeRulesRequest>(
                describeRulesRequest, "slb");
        request.addParameter("Action", "DescribeRules");
        String version = describeRulesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeRulesRequest.getFilters();
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
        com.ksc.internal.SdkInternalList<String> ruleIds = (com.ksc.internal.SdkInternalList<String>) describeRulesRequest
                .getRuleIds();
        if (ruleIds != null && (!ruleIds.isEmpty() || !ruleIds.isAutoConstruct())) {
            int index = 1;

            for (String value : ruleIds) {
                if (value != null) {
                    request.addParameter("RuleId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (!StringUtils.isNullOrEmpty(describeRulesRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeRulesRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeRulesRequest.getNextToken())) {
            request.addParameter("NextToken", describeRulesRequest.getNextToken());
        }

        return request;
    }
}