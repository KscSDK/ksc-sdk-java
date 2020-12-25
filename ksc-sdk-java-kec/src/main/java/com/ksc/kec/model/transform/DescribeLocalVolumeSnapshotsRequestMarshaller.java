package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeLocalVolumeSnapshotsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeLocalVolumeSnapshotsRequestMarshaller implements
        Marshaller<Request<DescribeLocalVolumeSnapshotsRequest>, DescribeLocalVolumeSnapshotsRequest> {

    public Request<DescribeLocalVolumeSnapshotsRequest> marshall(
            DescribeLocalVolumeSnapshotsRequest describeLocalVolumeSnapshotsRequest) {

        if (describeLocalVolumeSnapshotsRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeLocalVolumeSnapshotsRequest> request = new DefaultRequest<DescribeLocalVolumeSnapshotsRequest>(
                describeLocalVolumeSnapshotsRequest, "kec");
        request.addParameter("Action", "DescribeLocalVolumeSnapshots");
        String version = describeLocalVolumeSnapshotsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(describeLocalVolumeSnapshotsRequest.getLocalVolumeName())) {
            request.addParameter("LocalVolumeName",
                    StringUtils.fromString(describeLocalVolumeSnapshotsRequest.getLocalVolumeName()));
        }

        if (!StringUtils.isNullOrEmpty(describeLocalVolumeSnapshotsRequest.getSourceLocalVolumeId())) {
            request.addParameter("SourceLocalVolumeId",
                    StringUtils.fromString(describeLocalVolumeSnapshotsRequest.getSourceLocalVolumeId()));
        }

        if (!StringUtils.isNullOrEmpty(describeLocalVolumeSnapshotsRequest.getLocalVolumeSnapshotId())) {
            request.addParameter("LocalVolumeSnapshotId",
                    StringUtils.fromString(describeLocalVolumeSnapshotsRequest.getLocalVolumeSnapshotId()));
        }

        return request;
    }

}
