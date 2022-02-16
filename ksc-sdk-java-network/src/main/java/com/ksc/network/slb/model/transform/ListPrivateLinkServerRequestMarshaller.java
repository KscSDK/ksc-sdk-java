package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.ListPrivateLinkServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author: hueason
 * @date: 2021/6/7 18:03
 * @description:
 */
public class ListPrivateLinkServerRequestMarshaller  implements
        Marshaller<Request<ListPrivateLinkServerRequest>, ListPrivateLinkServerRequest> {

    @Override
    public Request<ListPrivateLinkServerRequest> marshall(ListPrivateLinkServerRequest listPrivateLinkServerRequest) {
        if (listPrivateLinkServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPrivateLinkServerRequest> request = new DefaultRequest<ListPrivateLinkServerRequest>(
                listPrivateLinkServerRequest, "slb");
        request.addParameter("Action", "ListPrivateLinkServer");
        String version = listPrivateLinkServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(listPrivateLinkServerRequest.getPrivateLinkServerId())) {
            request.addParameter("PrivateLinkServerId", listPrivateLinkServerRequest.getPrivateLinkServerId());
        }
        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) listPrivateLinkServerRequest.getFilters();
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
        if (!StringUtils.isNullOrEmpty(listPrivateLinkServerRequest.getMaxResults())) {
            request.addParameter("MaxResults", listPrivateLinkServerRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(listPrivateLinkServerRequest.getNextToken())) {
            request.addParameter("NextToken", listPrivateLinkServerRequest.getNextToken());
        }

        return request;
    }
}
