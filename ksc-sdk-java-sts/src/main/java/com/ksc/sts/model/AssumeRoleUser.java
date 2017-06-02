package com.ksc.sts.model;

import java.io.Serializable;

public class AssumeRoleUser implements Serializable, Cloneable {

    private static final long serialVersionUID = 8625117087303081345L;

    private String assumedRoleId;

    private String krn;

    public String getAssumedRoleId() {
        return assumedRoleId;
    }

    public void setAssumedRoleId(String assumedRoleId) {
        this.assumedRoleId = assumedRoleId;
    }

    public String getKrn() {
        return krn;
    }

    public void setKrn(String krn) {
        this.krn = krn;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((assumedRoleId == null) ? 0 : assumedRoleId.hashCode());
        result = prime * result + ((krn == null) ? 0 : krn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AssumeRoleUser other = (AssumeRoleUser) obj;
        if (assumedRoleId == null) {
            if (other.assumedRoleId != null)
                return false;
        } else if (!assumedRoleId.equals(other.assumedRoleId))
            return false;
        if (krn == null) {
            if (other.krn != null)
                return false;
        } else if (!krn.equals(other.krn))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AssumeRoleUser [assumedRoleId=" + assumedRoleId + ", krn=" + krn
                + "]";
    }

}
