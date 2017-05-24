package com.ksc.cdn.model.content;

import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import lombok.Data;

import java.util.Map;

/**
 * 刷新节点上的文件内容。刷新指定URL内容至Cache节点，支持URL、目录批量刷新。
 * <p>
 * 说明：
 * <p>
 * 同一个 ID 每日设有提交刷新类请求条数限制额度，与控制台共享此额度，具体额度可查看控制台或调用GetRefreshOrPreloadQuota接口获取
 * 刷新预热类接口包含 RefreshCaches刷新接口和PreloadCaches 预热接口
 * Files与Dirs必须至少指定一种，可同时指定，即文件刷新和目录刷新可同时进行
 * 注意：
 * <p>
 * 每个 Url 必须以http://或者https://开头
 * 每个 Url 最大长度 1000 字符
 * 每个 Url 所在的域名必须是该用户在金山云加速的域名。
 * Url 如果包含中文字符，请使用urlencode方式提交。
 * 单次调用文件类刷新 Url上限为1000条，目录类刷新 Url 上限为30条
 * 支持Url及目录刷新，不支持正则
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class RefreshCachesRequest implements GeneralRequest {

    private Url[] Files;

    private Url[] Dirs;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("RefreshCaches", "2016-09-01", "/2016-09-01/content/RefreshCaches");
    }

    @Override
    public Map<String, String> buildParams() {
        return null;
    }
}
