## 金山云OpenAPI示例工程 ##
* KSC OpenAPI环境信息
* Usage

### KSC OpenAPI环境信息

这些信息在接入OpenAPI的过程中可能会需要

#### Endpoint
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


### Usage
以调用DescribeInstances为例

```java
public void describeInstances() {
	// Create the KSCKECClient object so we can call various APIs.
	KSCKECClient kec_client =null;
	/*	如果使用KSCKECClient的默认构造方法
	* The ProfileCredentialsProvider will return your [default] credential
	* profile by reading from the credentials file located at
	* (~/.aws/credentials).
	*/
	kec_client = new KSCKECClient();
	/*
	*如果不使用默认的credential,需要创建创建credentials
	*创建credentials
	*/
	AWSCredentials credentials = new BasicAWSCredentials(ak,sk);
	kec_client = new KSCKECClient(credentials);
	//设置endpoint
	kec_client.setEndpoint("http://kec.cn-shanghai-2.api.ksyun.com");
	//设置Region(和设置endpoint二选一)
	Region region = new Region(new InMemoryRegionImpl("cn-shanghai-2", null));
	client.setRegion(region);
	//设置ServiceName
	kec_client.setServiceNameIntern("kec");
	//创建requset
	DescribeInstancesRequest describe_instances_request = new DescribeInstancesRequest();
	//调用DescribeInstances
	DescribeInstancesResult describe_instances_result = kec_client.describeInstances(describe_instances_request);
}
```
#### 调用sdk方法步骤
* 构建 AWSCredentials(根据需要)
* 构建 KSCKECClient
* 设置 Endpoint|ServiceName(或者设置Region 二选一)
* 构建 DescribeInstancesRequest
* 调用 describeInstances方法

##### 构建 AWSCredentials(根据需要)
```java
AWSCredentials credentials = new BasicAWSCredentials(ak,sk);
```
##### 构建 KSCKECClient
```java
KSCKECClient kec_client = new KSCKECClient();
```
or 

```java
KSCKECClient kec_client = new KSCKECClient(credentials);
```
##### 设置 Endpoint|ServiceName(或者设置Region 二选一)

```java
//设置endpoint
kec_client.setEndpoint("http://kec.cn-shanghai-2.api.ksyun.com");
//设置ServiceName
kec_client.setServiceNameIntern("kec");

```
or

```java
//设置Region(和设置endpoint二选一)
Region region = new Region(new InMemoryRegionImpl("cn-shanghai-2", null));
client.setRegion(region);

```

#### 构建 DescribeInstancesRequest

```java
DescribeInstancesRequest describe_instances_request = new DescribeInstancesRequest();
describe_instances_request.withInstanceIds(instanceIds);
```

#### 调用 describeInstances

```java
DescribeInstancesResult describe_instances_result = kec_client.describeInstances(describe_instances_request);
```
