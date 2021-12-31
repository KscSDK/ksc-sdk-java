package com.ksc.redis.model.backup;


import java.util.List;

/***
 * @ClassName: DownloadLevelSnapshotResponse
 */
public class DownloadLevelSnapshotResponse {
    private List<String> download_url;

    public List<String> getDownload_url() {
        return download_url;
    }

    public void setDownload_url(List<String> download_url) {
        this.download_url = download_url;
    }
}
