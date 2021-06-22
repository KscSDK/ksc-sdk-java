package com.ksc.krds.model.account;

import java.util.List;

public class ListAccountSupportPrivilegesResponse {

    private List<String> GlobalSupportPriv;
    private List<String> DbSupportPriv;
    private List<String> TbSupportPriv;
    private List<String> ColSupportPriv;

    public List<String> getGlobalSupportPriv() {
        return GlobalSupportPriv;
    }

    public void setGlobalSupportPriv(List<String> globalSupportPriv) {
        GlobalSupportPriv = globalSupportPriv;
    }

    public List<String> getDbSupportPriv() {
        return DbSupportPriv;
    }

    public void setDbSupportPriv(List<String> dbSupportPriv) {
        DbSupportPriv = dbSupportPriv;
    }

    public List<String> getTbSupportPriv() {
        return TbSupportPriv;
    }

    public void setTbSupportPriv(List<String> tbSupportPriv) {
        TbSupportPriv = tbSupportPriv;
    }

    public List<String> getColSupportPriv() {
        return ColSupportPriv;
    }

    public void setColSupportPriv(List<String> colSupportPriv) {
        ColSupportPriv = colSupportPriv;
    }
}
