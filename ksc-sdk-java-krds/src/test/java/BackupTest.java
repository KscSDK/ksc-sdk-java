import com.ksc.krds.BackupClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsBackup.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

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



    //search backup list
    @Test
    public void testListKrdsBackup(){
        ListKrdsBackupRequest request = new ListKrdsBackupRequest();
        request.setDBInatanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        ListKrdsBackupResponse listKrdsBackupResponse = client.listKrdsBackup(request);
        print(listKrdsBackupResponse);
    }


    //search backup list new
    @Test
    public void testDescribeDBBackups(){
        ListKrdsBackupRequest request = new ListKrdsBackupRequest();
        request.setDBInatanceIdentifier("3cc79b94-a363-4f0b-9941-0ac2e847688f");
        request.setBackupType(BackupType.Snapshot);
        request.setKeyword("mao");
        request.setMarker(0);
        request.setMaxRecords(10);
        ListKrdsBackupResponse listKrdsBackupResponse = client.describeDBBackups(request);
        print(request);
        print(listKrdsBackupResponse);
    }


    //GetHistoryDatabaseInfo
    @Test
    public void testGetHistoryDatabaseInfo() throws IOException {
        GetHistoryDatabaseInfoRequest request = new GetHistoryDatabaseInfoRequest();
        request.setDBInstanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        request.setDBBackupIdentifier("c502a62b-adf5-4d07-beaf-b756070bc2c2");
        Object response = client.getHistoryDatabaseInfo(request);
        print(response);
    }

    //GetTableRestorableTime
    @Test
    public void testGetTableRestorableTime() {
        GetTableRestorableTimeRequest request = new GetTableRestorableTimeRequest();
        request.setDBInstanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        Object response = client.getTableRestorableTime(request);
        print(response);
    }

}
