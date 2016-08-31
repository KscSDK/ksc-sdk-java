# KSC SDK for Java 

## API Docs ##


* [KEC OpenAPI][KECOpenAPI]
* [VPC OpenAPI][VPCOpenAPI]
* [EIP OpenAPI][EIPOpenAPI]
* [SLB OpenAPI][SLBOpenAPI]

## Getting Started

#### 使用要求 ####

运行 SDK需要jdk **Java 1.6+**. 你可以下载最新的版本： http://developers.sun.com/downloads/.


#### Install the SDK ####
在 GitHub 获取SDK : [KSC SDK for Java (GitHub)][ksc-sdk-java-github].

在工程根目录下执行:
```sh
 mvn clean install
 ```
 
##### 工程使用sdk #####

建议使用Maven构建自己的项目，导入[ksc-sdk-java][ksc-sdk-java-github],添加需要的相应模块的依赖，示例如下：

##### Importing the pom #####

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.ksc</groupId>
	  <artifactId>ksc-sdk-java-bom</artifactId>
	  <version>0.1.0</version>
	  <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>
```


##### Using the SDK Maven modules #####

```xml
<dependencies>
  <dependency>
    <groupId>com.ksc</groupId>
	<artifactId>ksc-sdk-java-kec</artifactId>
  </dependency>
</dependencies>
```

#### Credentials 配置 ####

**本地文件配置**:
```
 ~/.aws/credentials on Linux, OS X or unix
 C:\Users\USERNAME\.aws\credentials on Windows
```
该文件包含下述内容：

```
[default]
aws_access_key_id = your_access_key_id
aws_secret_access_key = your_secret_access_key
```

**如不通过本地文件读入ak和sk信息，则需要在执行的类文件中增加以下代码**：
```
AWSCredentials credentials = new BasicAWSCredentials(aws_access_key_id, aws_secret_access_key);
```



## Features

* Provides easy-to-use HTTP clients for all supported KSC services, regions, and authentication
    protocols.

* And more!
[KECOpenAPI]: http://www.ksyun.com/doc/art/id/1660
[VPCOpenAPI]: http://www.ksyun.com/doc/art/id/1661
[EIPOpenAPI]: http://www.ksyun.com/doc/cat/id/561
[SLBOpenAPI]: http://www.ksyun.com/doc/art/id/1662
[ksc-sdk-java-github]: https://github.com/ZXM0228/ksc-sdk-java
