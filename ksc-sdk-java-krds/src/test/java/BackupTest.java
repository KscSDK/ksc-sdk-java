import com.google.gson.JsonObject;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.BackupClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsBackup.CreateDBBackupRequest;
import com.ksc.krds.model.krdsBackup.CreateDBBackupResponse;
import com.ksc.krds.model.krdsBackup.DeleteDBBackupRequest;
import com.ksc.krds.model.krdsBackup.ModifyDBInstanceRequest;
import org.junit.Before;
import org.junit.Test;

public class BackupTest extends BaseTest {

    private BackupClient client;

    @Before
    public void init() {
        client = new BackupClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testCreate() {
        CreateDBBackupRequest request = new CreateDBBackupRequest();
        request.setDBInstanceIdentifier("91ea5165-7ed9-427a-9fc4-b48402612980");
        request.setDBBackupName("北京");
        RdsResponse<CreateDBBackupResponse> response = client.createDBBackup(request);
        log.info("",response.getData());
    }

    //TODO failure
    @Test
    public void testModify() {
        ModifyDBInstanceRequest request = new ModifyDBInstanceRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        request.setPreferredBackupTime("03:00-04:00");
        RdsResponse response = client.modifyDBBackupPolicy(request);
        log.info("%s", response.getData());
    }

    @Test
    public void testDelete() {
        DeleteDBBackupRequest request = new DeleteDBBackupRequest();
        request.setDBBackupIdentifier("0a14ec2b-08ef-4eb7-aa4b-304716913669");
        RdsResponse response = client.deleteDBBackup(request);
        log.info("%s",response.getData());
    }

}
