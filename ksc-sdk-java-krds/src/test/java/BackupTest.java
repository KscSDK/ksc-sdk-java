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
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBBackupName("lzs-backup-1");
        RdsResponse<CreateDBBackupResponse> response = client.createDBBackup(request);
        log.info("",response.getData());
    }

    //TODO failure
    @Test
    public void testModify() {
        ModifyDBInstanceRequest request = new ModifyDBInstanceRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBInstanceName("lzs-mysql-01");
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
