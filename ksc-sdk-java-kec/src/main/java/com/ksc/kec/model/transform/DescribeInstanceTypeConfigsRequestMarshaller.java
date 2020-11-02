package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeInstanceTypeConfigsRequest;
import com.ksc.model.Filter;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class DescribeInstanceTypeConfigsRequestMarshaller implements
        Marshaller<Request<DescribeInstanceTypeConfigsRequest>, DescribeInstanceTypeConfigsRequest> {

    public Request<DescribeInstanceTypeConfigsRequest> marshall(
    		DescribeInstanceTypeConfigsRequest describeInstanceTypeConfigsRequest) {

        if (describeInstanceTypeConfigsRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceTypeConfigsRequest> request = new DefaultRequest<DescribeInstanceTypeConfigsRequest>(
        		describeInstanceTypeConfigsRequest, "kec");
        request.addParameter("Action", "DescribeInstanceTypeConfigs");
        String version=describeInstanceTypeConfigsRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        
        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeInstanceTypeConfigsRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter(
                            "Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }


        return request;
    }

}
