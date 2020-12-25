package com.ksc.kec.model;

import java.io.Serializable;
import java.util.List;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.CreateImageRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class CreateImageRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<CreateImageRequest>{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 待创建镜像的实例ID
	 * 类型: String
	 * 有效值：标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
	 * 是否可缺省: 否
	 */
	private String InstanceId;

	/**
	 * 新镜像的名称
	 * 类型: String
	 * 有效值：2-64个字符，支持中文、字母、数字以及-_@#.字符
	 * 是否可缺省: 否
	 */
	private String Name;

	/**
	 * 实例需要制作镜像的数据盘ID
	 * 类型: String
	 * 有效值：标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
	 * 是否可缺省: 是
	 */
	private List<String> DataDiskIds;

	/**
	 * 实例需要制作镜像的快照ID，里面必须包含一个系统盘快照ID
	 * 类型: String
	 * 有效值：标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
	 * 是否可缺省: 是，根据快照创建镜像时该参数不可缺省
	 */
	private List<String> SnapshotIds;

	
    @Override
	public Request<CreateImageRequest> getDryRunRequest() {
    	
    	Request<CreateImageRequest> request = new CreateImageRequestMarshaller().marshall(this);
    	request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}


	public String getInstanceId() {
		return InstanceId;
	}


	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

	public List<String> getDataDiskIds() {
		return DataDiskIds;
	}

	public void setDataDiskIds(List<String> dataDiskIds) {
		DataDiskIds = dataDiskIds;
	}

	public List<String> getSnapshotIds() {
		return SnapshotIds;
	}

	public void setSnapshotIds(List<String> snapshotIds) {
		SnapshotIds = snapshotIds;
	}

	public void withDataDiskIds(String... dataDiskIds) {
		if (this.DataDiskIds == null) {
			this.setDataDiskIds(new com.ksc.internal.SdkInternalList<String>());
		}
		for (String ele : dataDiskIds) {
			this.DataDiskIds.add(ele);
		}
	}

	public void withSnapshotIds(String... snapshotIds) {
		if (this.SnapshotIds == null) {
			this.setSnapshotIds(new com.ksc.internal.SdkInternalList<String>());
		}
		for (String ele : snapshotIds) {
			this.SnapshotIds.add(ele);
		}
	}

}
