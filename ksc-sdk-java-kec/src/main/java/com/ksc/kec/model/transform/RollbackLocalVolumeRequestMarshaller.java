package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.RollbackLocalVolumeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class RollbackLocalVolumeRequestMarshaller 
       implements Marshaller<Request<RollbackLocalVolumeRequest>, RollbackLocalVolumeRequest>{
	@Override
	public Request<RollbackLocalVolumeRequest> marshall(RollbackLocalVolumeRequest rollbackLocalVolumeRequest){
		 if (rollbackLocalVolumeRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<RollbackLocalVolumeRequest> request = new DefaultRequest<RollbackLocalVolumeRequest>(
	        		rollbackLocalVolumeRequest, "kec");
	        request.addParameter("Action", "RollbackLocalVolume");
	        String version=rollbackLocalVolumeRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);
	        
	        if(rollbackLocalVolumeRequest.getLocalVolumeId() != null){
	        	request.addParameter("LocalVolumeId", 
	        			StringUtils.fromString(rollbackLocalVolumeRequest.getLocalVolumeId()));
	        }
	        if(rollbackLocalVolumeRequest.getLocalVolumeSnapshotId() != null){
	        	request.addParameter("LocalVolumeSnapshotId", 
	        			StringUtils.fromString(rollbackLocalVolumeRequest.getLocalVolumeSnapshotId()));
	        }
	        
	        return request;
	}
}
