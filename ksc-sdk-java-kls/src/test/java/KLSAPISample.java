import com.ksc.auth.AWSCredentials;
import com.ksc.kls.KSCKSLClient;
import com.ksc.kls.model.CancelRecordRequest;
import com.ksc.kls.model.CancelRecordResult;
import com.ksc.kls.model.KillStreamCacheRequest;
import com.ksc.kls.model.KillStreamCacheResult;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yangfan on 2017/6/12.
 */
public class KLSAPISample {

    private static final Logger log = Logger.getLogger(KLSAPISample.class);

    KSCKSLClient kls_client = null;
    private String version = "2017-01-01";
    private String uniquename = "you unique name";
//    private String action = "CancelRecordTask";
    private String action = "KillStreamCache";
    private String app = "live";
    private String pubdomain = "live.moxiulive.com";
    private int recID = 2;
    private String stream = "test.api.com";
    private String[] nodeIPS = new String[1];


    @Before
    public void setup() {
        AWSCredentials aws = new AWSCredentials() {
            @Override
            public String getAWSAccessKeyId() {
                return "AKLTNZ4r_XpvSOSdAnAmfWEUsg";
            }


            @Override
            public String getAWSSecretKey() {
                return "OKtoHRyb5Em3oFgTFhFN7ypvjot0SRoqTzbQB8eSD2BpUrBgwy3MlHoJC637BhVF1g";
            }

        };
        kls_client = new KSCKSLClient(aws);

        kls_client.setEndpoint("http://kls.api.ksyun.com");

    }

    @Test
    public void testCancelRecord() {
        CancelRecordRequest request = new CancelRecordRequest();
        request.setVersion(this.version);
        request.setAction(this.action);
        request.setApp(this.app);
        request.setUniqueName(this.uniquename);
        request.setPubdomain(this.pubdomain);
        request.setRecID(this.recID);
        request.setStream(this.stream);
        CancelRecordResult result = kls_client.cancelRecordTask(request);
        System.out.println("=============================");
        log.info(result.getData());
        System.out.println("=============================");
    }

    @Test
    public void testKillStreamCache() {
        KillStreamCacheRequest request = new KillStreamCacheRequest();
        request.setVersion(this.version);
        request.setAction(this.action);
        request.setApp(this.app);
        this.nodeIPS[0] = "127.0.0.1";
        request.setNodeIPs(this.nodeIPS);
        request.setPullDomain(this.pubdomain);
        request.setStream(this.stream);
        KillStreamCacheResult result = new KillStreamCacheResult();
        System.out.println("=============================");
        log.info(result.getData());
        System.out.println("=============================");
    }

}
