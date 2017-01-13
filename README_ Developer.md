## 如何使用sdk请求openAPI ##
### 使用sdk请求openAPI只需处理3个对象
* KscWebServiceRequest
* KscWebServiceClient
* Response

以下都以Vpc openAPI DescribeSubnets 为例介绍
===
#### KscWebServiceRequest
Request包含两部分
* sdk接受参数，这一部分业务线自己根据openapi包装成一个自己的参数类  
1. 命名格式**XXXRequest 'XXX'为openAPI的action**  
2. extends KscWebServiceRequest 和 implements
         DryRunSupportedRequest<X extends KscWebServiceRequest>  

```java
 public class DescribeSubnetsRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeSubnetsRequest> {
	/**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> subnetIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * 
     * @return One or more Subnet IDs.</p>
     *         <p>
     *         Default: Describes all your Subnets.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
        	subnetIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * 
     * @param subnetIds
     *        One or more Subnet IDs.</p>
     *        <p>
     *        Default: Describes all your Subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.ksc.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or
     * {@link #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param subnetIds
     *        One or more Subnet IDs.</p>
     *        <p>
     *        Default: Describes all your Subnets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubnetsRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.ksc.internal.SdkInternalList<String>(
            		subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your Subnets.
     * </p>
     * 
     * @param subnetIds
     *        One or more Subnet IDs.</p>
     *        <p>
     *        Default: Describes all your Subnets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubnetsRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.ksc.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.ksc.internal.SdkInternalList<Filter>(
                filters);
    }

    public DescribeSubnetsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeSubnetsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeSubnetsRequest> getDryRunRequest() {
       Request<DescribeSubnetsRequest> request = new DescribeSubnetsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
   
}
```

 **注意：**
 1. 使用集合不要直接使用jdk的List,使用com.ksc.internal.SdkInternalList
 2. 如果openAPI存在Filter.N的Parameter,使用com.ksc.model.Filter
 
* 把sdk接收到的参数转换core需要的Request(com.ksc.Request)
  规范:  
  1. 命名格式**XXXMarshaller 'XXX'上面定义的名字(如:DescribeSubnetsRequest)**
  2. implements com.ksc.transform.Marshaller<T, R>
  
```java
package com.ksc.network.vpc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.DescribeInternetGatewaysRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeInternetGatewaysRequest Marshaller
 */

public class DescribeInternetGatewaysRequestMarshaller implements
		Marshaller<Request<DescribeInternetGatewaysRequest>, DescribeInternetGatewaysRequest> {

	public Request<DescribeInternetGatewaysRequest> marshall(
			DescribeInternetGatewaysRequest describeInternetGatewaysRequest) {

		if (describeInternetGatewaysRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<DescribeInternetGatewaysRequest> request = new DefaultRequest<DescribeInternetGatewaysRequest>(
				describeInternetGatewaysRequest, "vpc");
		request.addParameter("Action", "DescribeInternetGateways");
		String version=describeInternetGatewaysRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<String> list = (com.ksc.internal.SdkInternalList<String>) describeInternetGatewaysRequest
				.getInternetGatewayIds();
		if (!list.isEmpty() || !list.isAutoConstruct()) {
			int index = 1;

			for (String value : list) {
				if (value != null) {
					request.addParameter("InternetGatewayId." + index,
							StringUtils.fromString(value));
				}
				index++;
			}
		}

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeInternetGatewaysRequest
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
```
#### KscWebServiceClient
1. 每个服务只需创建一个KscWebServiceClient实现类
2. 类名定义格式**(Ksyun|KSC)XXX(Client|JavaClient)** XXX是服务名称(KEC|EIP|VPC),示例参考(KEC Service的KSCVPCClient)
3. 目前已经存在**KEC|EIP|VPC|SLB|EPC|monitor的KscWebServiceClient**,只需要添加对应的action 方法,具体内容详看每个模块的KscWebServiceClient

```java
public class KSCVPCClient extends KscWebServiceClient implements KSCVPC{
	....

	/**
	 * Normal invoke with authentication. Credentials are required and may be
	 * overriden at the request level.
	 **/
	private <X, Y extends KscWebServiceRequest> Response<X> invoke(
			Request<Y> request,
			HttpResponseHandler<KscWebServiceResponse<X>> responseHandler,
			ExecutionContext executionContext) {

		executionContext.setCredentialsProvider(CredentialUtils
				.getCredentialsProvider(request.getOriginalRequest(),
						kscCredentialsProvider));

		return doInvoke(request, responseHandler, executionContext);
	}

	/**
	 * Invoke the request using the http client. Assumes credentials (or lack
	 * thereof) have been configured in the ExecutionContext beforehand.
	 **/
	private <X, Y extends KscWebServiceRequest> Response<X> doInvoke(
			Request<Y> request,
			HttpResponseHandler<KscWebServiceResponse<X>> responseHandler,
			ExecutionContext executionContext) {
		request.setEndpoint(endpoint);
		request.setTimeOffset(timeOffset);

		DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
				exceptionUnmarshallers);

		return client.execute(request, responseHandler, errorResponseHandler,
				executionContext);
	}

	@Override
	public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeSubnetsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeSubnetsRequest> request = null;
		Response<DescribeSubnetsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeSubnetsRequestMarshaller().marshall(super
						.beforeMarshalling(describeSubnetsRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeSubnetsResult> responseHandler = new StaxResponseHandler<DescribeSubnetsResult>(
					new DescribeSubnetsResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	....
}
```

#### Response
Response也分为两部分
* sdk的输出对象
  1. 命名格式**XXXResult 'XXX'为openAPI的action**  
  2. 建议属性名字和openAPI的字段一致

```java
package com.ksc.network.vpc.model;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSubnets.
 * </p>
 */
@ToString
public class DescribeSubnetsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more Subnets.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Subnet> SubnetSet;
    
    ....
}
```
* openAPI的Response转换成上面定义的对象(DescribeSubnetsResult)
  1. 命名格式**XXXStaxUnmarshaller 'XXX'为上面定义对象的名字 'Stax'意思是解析的xml** 
  2. implements com.ksc.transform.Unmarshaller<T, StaxUnmarshallerContext> T表示需要转换成的对象

```java
  package com.ksc.network.vpc.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.DescribeSubnetsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeSubnetsResult StAX Unmarshaller
 */
public class DescribeSubnetsResultStaxUnmarshaller
		implements Unmarshaller<DescribeSubnetsResult, StaxUnmarshallerContext> {

	public DescribeSubnetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeSubnetsResult describeSubnetsResult = new DescribeSubnetsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeSubnetsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SubnetSet/item", targetDepth)) {
					describeSubnetsResult.withSubnets(SubnetStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeSubnetsResult
							.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeSubnetsResult;
				}
			}
		}
	}

	private static DescribeSubnetsResultStaxUnmarshaller instance;

	public static DescribeSubnetsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeSubnetsResultStaxUnmarshaller();
		return instance;
	}
}

```

说明
===
**上面介绍的是每个模块需要添加一个新的action的sdk时所需要实现的代码部分**  
**目前已经实现了KEC|EIP|VPC|SLB|EPC|monitor|VCS的一些action,具体细节可参考各模块的实现**
