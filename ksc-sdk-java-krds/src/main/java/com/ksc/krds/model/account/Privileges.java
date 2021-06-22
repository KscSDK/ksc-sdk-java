package com.ksc.krds.model.account;

import java.util.ArrayList;
import java.util.List;

public class Privileges {

    private List<String> GlobalPriv;

    private List<PrivDetail> ColPriv;

    private List<PrivDetail> DbPriv;

    private List<PrivDetail> TbPriv;

    public List<String> getGlobalPriv() {
        return GlobalPriv;
    }

    public void setGlobalPriv(List<String> globalPriv) {
        GlobalPriv = globalPriv;
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
}
