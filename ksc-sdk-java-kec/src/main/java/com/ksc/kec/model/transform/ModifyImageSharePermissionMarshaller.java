package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ImageCopyRequest;
import com.ksc.kec.model.ModifyImageSharePermissionRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class ModifyImageSharePermissionMarshaller implements
        Marshaller<Request<ModifyImageSharePermissionRequest>, ModifyImageSharePermissionRequest> {

    public Request<ModifyImageSharePermissionRequest> marshall(
            ModifyImageSharePermissionRequest modifyImageSharePermissionRequest) {

        if (modifyImageSharePermissionRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyImageSharePermissionRequest> request = new DefaultRequest<ModifyImageSharePermissionRequest>(
                modifyImageSharePermissionRequest, "kec");
        request.addParameter("Action", "ModifyImageSharePermission");
        String version=modifyImageSharePermissionRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if(modifyImageSharePermissionRequest.getImageId() != null){
            request.addParameter("ImageId",
                    StringUtils.fromString(modifyImageSharePermissionRequest.getImageId()));
        }
        if(modifyImageSharePermissionRequest.getPermission() != null){
            request.addParameter("Permission",
                    StringUtils.fromString(modifyImageSharePermissionRequest.getPermission()));
        }
        com.ksc.internal.SdkInternalList<String> accountIdList = (com.ksc.internal.SdkInternalList<String>) modifyImageSharePermissionRequest
                .getAccountIdList();
        if (!accountIdList.isEmpty() || !accountIdList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String instanceIdsListValue : accountIdList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("AccountId." + instanceIdsListIndex,
                            StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }
        return request;
    }

}
