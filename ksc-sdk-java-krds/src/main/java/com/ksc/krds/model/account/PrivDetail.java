package com.ksc.krds.model.account;

import java.util.List;

public class PrivDetail {

    private String Db;

    private String Tb;

    private String Col;

    private List<String> Priv;

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

    public List<String> getPriv() {
        return Priv;
    }

    public void setPriv(List<String> priv) {
        Priv = priv;
    }
}
