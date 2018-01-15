package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DeleteLocalVolumeSnapshotRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteLocalVolumeSnapshotRequestMarshaller implements
       Marshaller<Request<DeleteLocalVolumeSnapshotRequest>, DeleteLocalVolumeSnapshotRequest>{

	public Request<DeleteLocalVolumeSnapshotRequest> marshall(
			DeleteLocalVolumeSnapshotRequest deleteLocalVolumeSnapshotRequest) {

        if (deleteLocalVolumeSnapshotRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteLocalVolumeSnapshotRequest> request = new DefaultRequest<DeleteLocalVolumeSnapshotRequest>(
        		deleteLocalVolumeSnapshotRequest, "kec");
        request.addParameter("Action", "DeleteLocalVolumeSnapshot");
        String version=deleteLocalVolumeSnapshotRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> localVolumeSnapshotIdList = (com.ksc.internal.SdkInternalList<String>) deleteLocalVolumeSnapshotRequest
                .getLocalVolumeSnapshotIds();
        if (!localVolumeSnapshotIdList.isEmpty() || !localVolumeSnapshotIdList.isAutoConstruct()) {
            int localVolumeSnapshotIdsListIndex = 1;

            for (String localVolumeSnapshotIdsListValue : localVolumeSnapshotIdList) {
                if (localVolumeSnapshotIdsListValue != null) {
                    request.addParameter("LocalVolumeSnapshotId." + localVolumeSnapshotIdsListIndex,
                            StringUtils.fromString(localVolumeSnapshotIdsListValue));
                }
                localVolumeSnapshotIdsListIndex++;
            }
        }
        
        return request;
    }
}
