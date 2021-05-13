package com.ksc.krds.model.krdsBackup;

import com.ksc.krds.annotations.Unmarshaller;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.transform.BaseData;
import com.ksc.krds.transform.krdsBackup.KrdsBackupJsonUnmarshaller;

public class CreateDBBackupResponse extends KrdsResponse {

    private Data data;

    public CreateDBBackupResponse() {
        this.data = new Data();
    }

    @Override
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data extends BaseData {

        @Unmarshaller(clazz = KrdsBackupJsonUnmarshaller.class)
        private ListKrdsBackupResponse.DBBackup DBBackup;

        public ListKrdsBackupResponse.DBBackup getDBBackup() {
            return DBBackup;
        }

        public void setDBBackup(ListKrdsBackupResponse.DBBackup DBBackup) {
            this.DBBackup = DBBackup;
        }
    }

}
