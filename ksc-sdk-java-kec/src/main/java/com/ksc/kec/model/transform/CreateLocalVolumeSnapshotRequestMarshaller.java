package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.CreateLocalVolumeSnapshotRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateLocalVolumeSnapshotRequestMarshaller 
       implements Marshaller<Request<CreateLocalVolumeSnapshotRequest>, CreateLocalVolumeSnapshotRequest>{

	@Override
	public Request<CreateLocalVolumeSnapshotRequest> marshall(CreateLocalVolumeSnapshotRequest createLocalVolumeSnapshotRequest){
		 if (createLocalVolumeSnapshotRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<CreateLocalVolumeSnapshotRequest> request = new DefaultRequest<CreateLocalVolumeSnapshotRequest>(
	        		createLocalVolumeSnapshotRequest, "kec");
	        request.addParameter("Action", "CreateLocalVolumeSnapshot");
	        String version=createLocalVolumeSnapshotRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);
	        
	        if(createLocalVolumeSnapshotRequest.getLocalVolumeId() != null){
	        	request.addParameter("LocalVolumeId", 
	        			StringUtils.fromString(createLocalVolumeSnapshotRequest.getLocalVolumeId()));
	        }
	        if(createLocalVolumeSnapshotRequest.getLocalVolumeSnapshotName() != null){
	        	request.addParameter("LocalVolumeSnapshotName", 
	        			StringUtils.fromString(createLocalVolumeSnapshotRequest.getLocalVolumeSnapshotName()));
	        }
	        if(createLocalVolumeSnapshotRequest.getLocalVolumeSnapshotName() != null){
	        	request.addParameter("LocalVolumeSnapshotDesc", 
	        			StringUtils.fromString(createLocalVolumeSnapshotRequest.getLocalVolumeSnapshotDesc()));
	        }
	        
	        return request;
	}

}

