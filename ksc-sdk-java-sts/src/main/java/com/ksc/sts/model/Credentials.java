package com.ksc.sts.model;

import java.io.Serializable;

public class Credentials implements Serializable, Cloneable {

    private static final long serialVersionUID = -6388283198781518837L;

    private String accessKeyId;

    private String secretAccessKey;

    private java.util.Date expiration;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public java.util.Date getExpiration() {
        return expiration;
    }

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((accessKeyId == null) ? 0 : accessKeyId.hashCode());
        result = prime * result
                + ((expiration == null) ? 0 : expiration.hashCode());
        result = prime * result
                + ((secretAccessKey == null) ? 0 : secretAccessKey.hashCode());
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
        Credentials other = (Credentials) obj;
        if (accessKeyId == null) {
            if (other.accessKeyId != null)
                return false;
        } else if (!accessKeyId.equals(other.accessKeyId))
            return false;
        if (expiration == null) {
            if (other.expiration != null)
                return false;
        } else if (!expiration.equals(other.expiration))
            return false;
        if (secretAccessKey == null) {
            if (other.secretAccessKey != null)
                return false;
        } else if (!secretAccessKey.equals(other.secretAccessKey))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Credentials [accessKeyId=" + accessKeyId + ", secretAccessKey="
                + secretAccessKey + ", expiration=" + expiration + "]";
    }

}
