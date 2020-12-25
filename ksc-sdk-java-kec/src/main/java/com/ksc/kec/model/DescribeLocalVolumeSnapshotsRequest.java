package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeLocalVolumeSnapshotsRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeLocalVolumeSnapshotsRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeLocalVolumeSnapshotsRequest>{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 本地硬盘名称
	 * 类型: String
	 * 是否可缺省: 是
	 */
	private String LocalVolumeName;

	/**
	 * 本地硬盘ID
	 * 类型: String
	 * 是否可缺省: 是
	 */
	private String SourceLocalVolumeId;

	/**
	 * 本地硬盘快照ID
	 * 类型: String
	 * 是否可缺省: 是
	 */
	private String LocalVolumeSnapshotId;


    @Override
	public Request<DescribeLocalVolumeSnapshotsRequest> getDryRunRequest() {
		Request<DescribeLocalVolumeSnapshotsRequest> request = new DescribeLocalVolumeSnapshotsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public String getLocalVolumeName() {
		return LocalVolumeName;
	}

	public void setLocalVolumeName(String localVolumeName) {
		LocalVolumeName = localVolumeName;
	}

	public String getSourceLocalVolumeId() {
		return SourceLocalVolumeId;
	}

	public void setSourceLocalVolumeId(String sourceLocalVolumeId) {
		SourceLocalVolumeId = sourceLocalVolumeId;
	}

	public String getLocalVolumeSnapshotId() {
		return LocalVolumeSnapshotId;
	}

	public void setLocalVolumeSnapshotId(String localVolumeSnapshotId) {
		LocalVolumeSnapshotId = localVolumeSnapshotId;
	}
}
