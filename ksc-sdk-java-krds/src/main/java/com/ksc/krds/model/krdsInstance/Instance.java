package com.ksc.krds.model.krdsInstance;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Instance {

    private DBInstanceClass DBInstanceClass;
    private String DBInstanceIdentifier;
    private String DBInstanceName;
    private String DBInstanceStatus;
    private String DBInstanceType;
    private String GroupId;
    private String Vip;
    private Integer Port;
    private String Engine;
    private String EngineVersion;
    private String InstanceCreateTime;
    private String MasterUserName;
    private String BillType;
    private String ProjectName;
    private String VpcId;
    private String SubnetId;

    @Getter
    @Setter
    public class DBInstanceClass {
        private Integer Ram;
        private Integer Disk;
    }

    public String toString(){
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            return  objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e){
            return null;
        }
    }
}
