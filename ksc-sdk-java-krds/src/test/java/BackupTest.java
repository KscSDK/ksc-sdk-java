import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.BackupClient;
import com.ksc.krds.InstanceClient;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsBackup.CreateDBBackupRequest;
import com.sun.jmx.remote.internal.ClientListenerInfo;
import org.junit.Before;
import org.junit.Test;

public class BackupTest {

    private BackupClient client;

    @Before
    public void init() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        client = new BackupClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testCreate() {
        CreateDBBackupRequest request = new CreateDBBackupRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        request.setDBBackupName("lzs-backup-1");
        KrdsResponse response = client.createDBBackup(request);
        System.out.println(response);
    }

}
