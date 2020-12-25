package com.ksc.kec.model;

import java.io.Serializable;
import java.util.List;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ModifyInstanceImageRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyInstanceImageRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<ModifyInstanceImageRequest>{

	private static final long serialVersionUID = 1L;

	/**
	 * 待更换或者重新安装操作系统的实例ID
	 * 类型: String
	 * 有效值：标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
	 * 是否可缺省: 否
	 */
	private String InstanceId;

	/**
	 * 待更换的镜像ID；如果缺省，表明无需改变镜像，只需重新安装实例的操作系统。
	 * 类型: String
	 * 有效值：标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
	 * 是否可缺省: 是
	 */
	private String ImageId;

	/**
	 * 云主机系统盘配置参数。若不指定该参数，则按照系统默认值进行分配。通用型N2、N3主机支持更换操作系统时指定系统盘大小。
	 * 类型：SystemDisk
	 * 是否可缺省：是
	 */
	private SystemDisk SystemDisk;

	/**
	 * 实例开机密码
	 * 类型: String
	 * 有效值：最短8字符，最长32字符，必须包含大小写英文字符和数字，支持其他可见字符
	 * 是否可缺省: 是
	 */
	private String InstancePassword;

	/**
	 * 密钥ID
	 * 类型：String
	 * 是否可缺省：是
	 */
	private List<String> KeyIds;

	/**
	 * 保留镜像设置登录。该参数只对使用自定义镜像有效。当该值填写为true，默认InstancePassword参数无效。该参数与InstancePassword必须填写一个。
	 * 类型：Boolean
	 * 有效值：true | false
	 * 默认值：false
	 * 是否可以缺省：是
	 */
	private Boolean KeepImageLogin;
	
	@Override
	public Request<ModifyInstanceImageRequest> getDryRunRequest() {
	    	
	    Request<ModifyInstanceImageRequest> request = new ModifyInstanceImageRequestMarshaller().marshall(this);
	    request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getImageId() {
		return ImageId;
	}
	public void setImageId(String imageId) {
		ImageId = imageId;
	}
	public String getInstancePassword() {
		return InstancePassword;
	}
	public void setInstancePassword(String instancePassword) {
		InstancePassword = instancePassword;
	}

	public com.ksc.kec.model.SystemDisk getSystemDisk() {
		return SystemDisk;
	}

	public void setSystemDisk(com.ksc.kec.model.SystemDisk systemDisk) {
		SystemDisk = systemDisk;
	}

	public List<String> getKeyIds() {
		return KeyIds;
	}

	public void setKeyIds(com.ksc.internal.SdkInternalList<String> keyIds) {
		KeyIds = keyIds;
	}

	public Boolean getKeepImageLogin() {
		return KeepImageLogin;
	}

	public void setKeepImageLogin(Boolean keepImageLogin) {
		KeepImageLogin = keepImageLogin;
	}

	public void withKeyIds(String... keyIds) {
		if (this.KeyIds == null) {
			setKeyIds(new com.ksc.internal.SdkInternalList<String>());
		}
		for (String ele : keyIds) {
			this.KeyIds.add(ele);
		}
	}
}
