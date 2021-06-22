package com.ksc.krds.model.account;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class ModifyAccountRequest extends BaseRequest<ModifyAccountRequest> {

    private String DBInstanceIdentifier;

    private String User;

    private String Host;

    private String Password;

    private List<PrivDetail> ColPriv;

    private List<PrivDetail> DbPriv;

    private List<PrivDetail> TbPriv;

    private List<String> GlobalPriv;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public List<PrivDetail> getColPriv() {
        return ColPriv;
    }

    public void setColPriv(List<PrivDetail> colPriv) {
        ColPriv = colPriv;
    }

    public List<PrivDetail> getDbPriv() {
        return DbPriv;
    }

    public void setDbPriv(List<PrivDetail> dbPriv) {
        DbPriv = dbPriv;
    }

    public List<PrivDetail> getTbPriv() {
        return TbPriv;
    }

    public void setTbPriv(List<PrivDetail> tbPriv) {
        TbPriv = tbPriv;
    }

    public List<String> getGlobalPriv() {
        return GlobalPriv;
    }

    public void setGlobalPriv(List<String> globalPriv) {
        GlobalPriv = globalPriv;
    }

    public static class PrivDetail{

        private String Db;

        private String Tb;

        private String Col;

        private String Priv;

        public String getDb() {
            return Db;
        }

        public void setDb(String db) {
            Db = db;
        }

        public String getTb() {
            return Tb;
        }

        public void setTb(String tb) {
            Tb = tb;
        }

        public String getCol() {
            return Col;
        }

        public void setCol(String col) {
            Col = col;
        }

        public String getPriv() {
            return Priv;
        }

        public void setPriv(String priv) {
            Priv = priv;
        }
    }
}
