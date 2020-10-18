package com.ksc.kec;

import com.ksc.auth.AWSCredentials;


/**
 * @author xuyaming
 * @date 2020/10/18 5:16 下午
 */
public class Test {
    // 采用log4j来完成调试时的日志功能
//    public Logger log = Logger.getLogger(this.getClass());
    public KSCKECClient kls_client = null;
    private String uniquename = "fkhongdan";
    private String app = "fkhongdan";
    private String pubdomain = "push.donggeqiu.com";


    public void setup() {
        AWSCredentials aws = new AWSCredentials() {
            @Override
            public String getAWSAccessKeyId() {
                return "AKLTXa1JwpxUT9GeM-DVdNSfmw";
            }
            @Override
            public String getAWSSecretKey() {
                return "OHWm2dLn45LV3qwV8ZfTldoUQ1z9zFl7UEmsiZ4JwlX59CCjIjos3nJchoX3O+wFYg==";
            }
        };
        kls_client = new KSCKECClient(aws);
        //可传入AWSCredentials参数 如:KSCKSLClient kls_client = new KSCKSLClient(credentials);
        kls_client.setEndpoint("http://kec.api.ksyun.com/");
    }

    public String forbidStream(String stream) {
        try {
            setup();
            kls_client.describeInstances();
//            log.info(result.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        Test forbidStream = new Test();
        System.out.println(forbidStream.forbidStream("992382ed4219e505"));
    }
}

