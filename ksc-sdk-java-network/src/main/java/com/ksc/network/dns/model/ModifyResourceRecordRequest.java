package com.ksc.network.dns.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.dns.model.transform.ModifyResourceRecordRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyResourceRecord.
 * </p>
 */
@Data
public class ModifyResourceRecordRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyResourceRecordRequest> {

    /**
     * 域名记录的ID
     */
    private String resourceRecordId;
    /**
     * 域名的ID
     */
    private String hostedZoneId;
    /**
     * 域名记录
     */
    private String resourceRecordName;
    /**
     * 域名记录的类型
     */
    private String resourceRecordType;
    /**
     * 域名记录的线路ID
     */
    private String geoLocationId;
    /**
     * TTL(Time-To-Live/生存时间)，是一个域名解析记录在DNS服务器中的存留时间
     */
    private Integer tTL;
    /**
     * 域名记录的记录值1如果是A、AX，则需要是合法的ip地址；2如果是TXT，则为字符串，长度不能超过255； 3如果是AAAA，则需要为一个ipv6的地址；4如果是CNAME、或者MX、NS，则需要符合域名规则
     */
    private String value;
    /**
     * 域名记录的权重1type为AX、MX时，record里必须含有weight字段；2其他类型域名记录里必须不能含有weight字段。3MX记录的weight值为1 ~ 50，AX记录的weight值为1 ~ 100。
     */
    private String weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyResourceRecordRequest that = (ModifyResourceRecordRequest) o;
        if (resourceRecordId != null ? !resourceRecordId.equals(that.resourceRecordId) : that.resourceRecordId != null)
            return false;
        if (hostedZoneId != null ? !hostedZoneId.equals(that.hostedZoneId) : that.hostedZoneId != null)
            return false;
        if (resourceRecordName != null ? !resourceRecordName.equals(that.resourceRecordName) : that.resourceRecordName != null)
            return false;
        if (resourceRecordType != null ? !resourceRecordType.equals(that.resourceRecordType) : that.resourceRecordType != null)
            return false;
        if (geoLocationId != null ? !geoLocationId.equals(that.geoLocationId) : that.geoLocationId != null)
            return false;
        if (tTL != null ? !tTL.equals(that.tTL) : that.tTL != null)
            return false;
        if (value != null ? !value.equals(that.value) : that.value != null)
            return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (resourceRecordId != null ? resourceRecordId.hashCode() : 0);
        result = 31 * result + (hostedZoneId != null ? hostedZoneId.hashCode() : 0);
        result = 31 * result + (resourceRecordName != null ? resourceRecordName.hashCode() : 0);
        result = 31 * result + (resourceRecordType != null ? resourceRecordType.hashCode() : 0);
        result = 31 * result + (geoLocationId != null ? geoLocationId.hashCode() : 0);
        result = 31 * result + (tTL != null ? tTL.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyResourceRecordRequest> getDryRunRequest() {
        Request<ModifyResourceRecordRequest> request = new ModifyResourceRecordRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyResourceRecordRequest clone() {
        return (ModifyResourceRecordRequest) super.clone();
    }
}

