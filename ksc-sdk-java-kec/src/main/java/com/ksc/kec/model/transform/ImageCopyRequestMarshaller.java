package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ImageCopyRequest;
import com.ksc.kec.model.ImageImportRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class ImageCopyRequestMarshaller implements
        Marshaller<Request<ImageCopyRequest>, ImageCopyRequest> {

    public Request<ImageCopyRequest> marshall(
            ImageCopyRequest imageCopyRequest) {

        if (imageCopyRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ImageCopyRequest> request = new DefaultRequest<ImageCopyRequest>(
                imageCopyRequest, "kec");
        request.addParameter("Action", "CopyImage");
        String version=imageCopyRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if(imageCopyRequest.getDestinationImageName() != null){
            request.addParameter("DestinationImageName",
                    StringUtils.fromString(imageCopyRequest.getDestinationImageName()));
        }
        com.ksc.internal.SdkInternalList<String> imageIdList = (com.ksc.internal.SdkInternalList<String>) imageCopyRequest
                .getImageIdList();
        if (!imageIdList.isEmpty() || !imageIdList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String instanceIdsListValue : imageIdList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("ImageId." + instanceIdsListIndex,
                            StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }
        com.ksc.internal.SdkInternalList<String> destinationRegionList = (com.ksc.internal.SdkInternalList<String>) imageCopyRequest
                .getDestinationRegionList();
        if (!destinationRegionList.isEmpty() || !destinationRegionList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;
            for (String instanceIdsListValue : destinationRegionList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("DestinationRegion." + instanceIdsListIndex,
                            StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }
        return request;
    }

}
