package com.ksc.krds.model.krdsInstance;

import com.ksc.internal.StaticCredentialsProvider;
import jdk.internal.dynalink.beans.StaticClass;

import java.util.Date;
import java.util.List;

public class OverrideDBInstanceResponse {
    private List<Instance> Instances;

    public List<Instance> getInstances() {
        return Instances;
    }

    public void setInstances(List<Instance> instances) {
        Instances = instances;
    }

    /*private List<DBInstance> DBInstance;
    public static class DBInstance{
        private List<DBInstanceClass> DBInstanceClass;
            public static class DBInstanceClass{
                public String getId() {
                    return Id;
                }

                public void setId(String id) {
                    Id = id;
                }

                private String Id;

            }
        private String DBInstanceIdentifier;
            private List<RetInstance.DBSource> DBSource;
                public static class DBSource{
                   private String DBInstanceIdentifier;
                   private  String DBInstanceName;
                   private Date PointInTime;

                    public String getDBInstanceIdentifier() {
                        return DBInstanceIdentifier;
                    }

                    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
                        this.DBInstanceIdentifier = DBInstanceIdentifier;
                    }

                    public String getDBInstanceName() {
                        return DBInstanceName;
                    }

                    public void setDBInstanceName(String DBInstanceName) {
                        this.DBInstanceName = DBInstanceName;
                    }

                    public Date getPointInTime() {
                        return PointInTime;
                    }

                    public void setPointInTime(Date pointInTime) {
                        PointInTime = pointInTime;
                    }
                }
            private String DBInstanceName;
            private String DBInstanceStatus;
            private String DBInstanceType;
            private String DBParameterGroupId;
            private String GroupId;
            private String DBSecurityGroupId;
            private String Vip;
            private Integer Port;
            private String Engine;
            private Date InstanceCreateTime;

        public List<OverrideDBInstanceResponse.DBInstance.DBInstanceClass> getDBInstanceClass() {
            return DBInstanceClass;
        }

        public void setDBInstanceClass(List<OverrideDBInstanceResponse.DBInstance.DBInstanceClass> DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
        }

        public String getDBInstanceIdentifier() {
            return DBInstanceIdentifier;
        }

        public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
            this.DBInstanceIdentifier = DBInstanceIdentifier;
        }

        public List<RetInstance.DBSource> getDBSource() {
            return DBSource;
        }

        public void setDBSource(List<RetInstance.DBSource> DBSource) {
            this.DBSource = DBSource;
        }

        public String getDBInstanceName() {
            return DBInstanceName;
        }

        public void setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
        }

        public String getDBInstanceStatus() {
            return DBInstanceStatus;
        }

        public void setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
        }

        public String getDBInstanceType() {
            return DBInstanceType;
        }

        public void setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
        }

        public String getDBParameterGroupId() {
            return DBParameterGroupId;
        }

        public void setDBParameterGroupId(String DBParameterGroupId) {
            this.DBParameterGroupId = DBParameterGroupId;
        }

        public String getGroupId() {
            return GroupId;
        }

        public void setGroupId(String groupId) {
            GroupId = groupId;
        }

        public String getDBSecurityGroupId() {
            return DBSecurityGroupId;
        }

        public void setDBSecurityGroupId(String DBSecurityGroupId) {
            this.DBSecurityGroupId = DBSecurityGroupId;
        }

        public String getVip() {
            return Vip;
        }

        public void setVip(String vip) {
            Vip = vip;
        }

        public Integer getPort() {
            return Port;
        }

        public void setPort(Integer port) {
            Port = port;
        }

        public String getEngine() {
            return Engine;
        }

        public void setEngine(String engine) {
            Engine = engine;
        }

        public Date getInstanceCreateTime() {
            return InstanceCreateTime;
        }

        public void setInstanceCreateTime(Date instanceCreateTime) {
            InstanceCreateTime = instanceCreateTime;
        }

        public String getMasterUserName() {
            return MasterUserName;
        }

        public void setMasterUserName(String masterUserName) {
            MasterUserName = masterUserName;
        }

        public String getPubliclyAccessible() {
            return PubliclyAccessible;
        }

        public void setPubliclyAccessible(String publiclyAccessible) {
            PubliclyAccessible = publiclyAccessible;
        }

        public List<ReadReplicaDBInstanceIdentifiers> getReadReplicaDBInstanceIdentifiers() {
            return readReplicaDBInstanceIdentifiers;
        }

        public void setReadReplicaDBInstanceIdentifiers(List<ReadReplicaDBInstanceIdentifiers> readReplicaDBInstanceIdentifiers) {
            this.readReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiers;
        }

        private String MasterUserName;
            private String  PubliclyAccessible;
            private List<ReadReplicaDBInstanceIdentifiers> readReplicaDBInstanceIdentifiers;
            public static class  ReadReplicaDBInstanceIdentifiers{
                private Integer DiskUsed;
            }

    }*/



}
