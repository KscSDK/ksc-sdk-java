package com.ksc.cdn.model.content;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import lombok.Data;

import java.text.ParseException;
import java.util.Map;

/**
 * 将源站的内容主动预热到Cache节点上，用户首次访问可直接命中缓存，缓解源站压力。
 * <p>
 * 说明：
 * <p>
 * 同一个 ID 每日设有提交预热类请求条数限制额度，与控制台共享此额度，具体额度可查看控制台或调用GetRefreshOrPreloadQuota接口获取
 * 刷新预热类接口包含 RefreshCaches刷新接口和PreloadCaches 预热接口
 * 注意：
 * <p>
 * 每个 Url 必须以http://或者https://开头
 * 每个 Url 最大长度 1000 字符
 * 每个 Url 所在的域名必须是该用户在金山云加速的域名。
 * Url 如果包含中文字符
 * 单次调用 Url 上限为1000条
 * 预热仅支持Url，不支持目录预热，不支持正则
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class PreloadCachesRequest implements GeneralRequest {

    /**
     * 需要预热的Url列表
     */
    private Url[] Urls;


    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("PreloadCaches", "2016-09-01", "/2016-09-01/content/PreloadCaches");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
