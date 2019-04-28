package com.ksc.krds.model.krdsBackup;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListKrdsBackupResponse {
    private Data Data = new Data();
    private String RequestId;

    @Getter
    @Setter
    public class Data{
        List<DBBackup> DBBackup;
    }

    @Getter
    @Setter
    public class DBBackup{

        private String DBBackupIdentifier;
        private String DBBackupName;
        private String BackupCreateTime;
        private String BackupUpdatedTime;
        private String Status;
        private Double BackupSize;
        private String RemotePath;
        private String BackupMode;
        private String BackupType;
        private String ParentId;

        private String DBInstanceIdentifier;
        private String Engine;
        private String EngineVersion;

        public String toString(){
            ObjectMapper objectMapper=new ObjectMapper();
            try {
                return  objectMapper.writeValueAsString(this);
            } catch (JsonProcessingException e){
                return null;
            }
        }
    }
}
