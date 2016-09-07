## 金山云OpenAPI示例工程 ##

### KSC OpenAPI环境信息

这些信息在接入OpenAPI的过程中可能会需要

#### URL
* http://kec.{region}.api.ksyun.com
* http://vpc.{region}.api.ksyun.com
* http://eip.{region}.api.ksyun.com
* http://slb.{region}.api.ksyun.com

#### REGION
* cn-beijing-6
* cn-shanghai-2

#### ServiceName
* kec
* vpc
* eip
* slb

### 运行示例代码

到eclipse工程ksc-sdk-java/ksc-sdk-java-kec工程中，运行 /src/test/java/com/ksc/services/kec/KSCOpenAPISample.java 文件


### OpenAPI实现流程

#### 概要信息 

金山云OpenAPI目前仅支持cn-beijing-6/cn-shanghai-2两个region。

实现流程我们以实现DescribeInstances为示例
实现过程中需要依据最新的OpenAPI定于来实现

* KEC OpenAPI http://www.ksyun.com/doc/art/id/1660
* VPC OpenAPI http://www.ksyun.com/doc/art/id/1661
* EIP OpenAPI http://www.ksyun.com/doc/cat/id/561
* SLB OpenAPI http://www.ksyun.com/doc/art/id/1662

#### 创建KscWebServiceClient实现类

```
每个服务只需创建一个KscWebServiceClient的实现类,类名定义格式**(Ksyun|KSC)XXX(Client|JavaClient)** XXX是服务名称(KEC|EIP),示例参考(KEC Service的KSCKECClient)

```

#### describeInstances 方法实现

	在KSECClient对应接口和实现中完成describeInstances的方法,这部分实现比较简单，定义方法的参数/返回值即可，对应的DescribeInstancesRequest/DescribeInstancesResult需要继承一些依赖。
	
##### DescribeInstancesRequest 实现

DescribeInstancesRequest 结构体定义需要依据 KEC OpenAPI 文档 ： http://www.ksyun.com/doc/art/id/1660
该类作为request的请求对象

```
public class DescribeInstancesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInstancesRequest> {
	// ... ...
}
```

##### DescribeInstancesResult 实现

DescribeInstancesResult 结构体定义需要依据 KEC OpenAPI 文档 ： http://www.ksyun.com/doc/art/id/1660
该类作为response的结果对象

```
public class DescribeInstancesResult implements Serializable, Cloneable {
  // ... ...
}
```

##### DescribeInstancesRequestMarshaller 实现

DescribeInstancesRequestMarshaller 结构体定义需要依据 KEC OpenAPI 文档 ： http://www.ksyun.com/doc/art/id/1660
该类主要完成DescribeInstancesRequest里面的属性转换openapi的request的参数

```
public class DescribeInstancesRequestMarshaller implements
        Marshaller<Request<DescribeInstancesRequest>, DescribeInstancesRequest> {

    public Request<DescribeInstancesRequest> marshall(
            DescribeInstancesRequest describeInstancesRequest) {

        if (describeInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstancesRequest> request = new DefaultRequest<DescribeInstancesRequest>(
                describeInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInstances");
        request.addParameter("Version", "2016-03-04");
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) describeInstancesRequest
                .getInstanceIds();
        if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String instanceIdsListValue : instanceIdsList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex,
                            StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeInstancesRequest
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

        if (describeInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeInstancesRequest.getNextToken()));
        }

        if (describeInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeInstancesRequest.getMaxResults()));
        }

        return request;
    }

}
```

##### DescribeInstancesResultStaxUnmarshaller 实现

DescribeInstancesResultStaxUnmarshaller 结构体定义需要依据 KEC OpenAPI 文档 ： http://www.ksyun.com/doc/art/id/1660
该类主要负责把openapi xml的response结果赋值DescribeInstancesResult的属性

```
public class DescribeInstancesResultStaxUnmarshaller implements
		Unmarshaller<DescribeInstancesResult, StaxUnmarshallerContext> {

	public DescribeInstancesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeInstancesResult describeInstancesResult = new DescribeInstancesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeInstancesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("InstancesSet/Item", targetDepth)) {
					describeInstancesResult
							.withInstancesSet(InstanceDetailStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Marker", targetDepth)) {
					describeInstancesResult.setMarker(IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceCount", targetDepth)) {
					describeInstancesResult
							.setInstanceCount(IntegerStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					describeInstancesResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeInstancesResult;
				}
			}
		}
	}

	private static DescribeInstancesResultStaxUnmarshaller instance;

	public static DescribeInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeInstancesResultStaxUnmarshaller();
		return instance;
	}
}
```

### 构建 KSCKECClient 

* 初始化 AWSCredentials
* 初始化 KSCKECClient
* 初始化 Region
* 初始化 Endpoint
* 初始化 ServiceName

```
		/*
		 * The ProfileCredentialsProvider will return your [default] credential
		 * profile by reading from the credentials file located at
		 * (~/.aws/credentials).
		 */
		AWSCredentials credentials = null;
		try {
			credentials = new ProfileCredentialsProvider().getCredentials();
		} catch (Exception e) {
			throw new AmazonClientException(
					"Cannot load the credentials from the credential profiles file. "
							+ "Please make sure that your credentials file is at the correct "
							+ "location (~/.aws/credentials), and is in valid format.",
					e);
		}

		// Create the AmazonEC2Client object so we can call various APIs.
		// DescribeInstances sample
		KSCKECClient kec_client = new KSCKECClient(credentials);
		kec_client.setRegion("cn_beijing_6");
		kec_client.setEndpoint("http://kec.cn-beijing-6.api.ksyun.com");
		kec_client.setServiceNameIntern("kec");
```

### 构建 DescribeInstancesRequest

```
DescribeInstancesRequest describe_instances_request = new DescribeInstancesRequest();
		describe_instances_request
				.withInstanceIds("6fd68-3406-43b2-bb0c-c5506d71a");
```

### 调用 describeInstances

```
DescribeInstancesResult describe_instances_result = kec_client
				.describeInstances(describe_instances_request);
```
