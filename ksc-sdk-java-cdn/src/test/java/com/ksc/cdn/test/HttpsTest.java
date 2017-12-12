package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.model.domain.domainhttps.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * HttpsTest
 * 证书管理单元测试
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsTest {
    KscCdnClient client;

    @Before
    public void setup() {
        client = new KscCdnClient("your ak",
                "your sk",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-2",
                "cdn");
    }

    /**
     * 为单域名或者多域名配置证书，多域名用英文半角逗号隔开
     * <p>
     * 说明：
     * <p>
     * Eable取值on或者off，DomainIds必填。
     * on的时候，CertificateId为空的时候，证书名称，证书内容，证书私钥必填
     * off的时候，只有DomainIds是必填
     * @throws Exception
     */
    @Test
    public void testConfigCertificate() throws Exception {
        HttpsConfCertRequest request = new HttpsConfCertRequest();
        request.setEnable("on");
        request.setDomainIds("2D09VN9");
        request.setCertificateName("2D09VN9_test");
        request.setServerCertificate("-----BEGIN CERTIFICATE-----\n" +
                "MIIDiTCCAnGgAwIBAgIJANF7PDOT9Wm8MA0GCSqGSIb3DQEBCwUAMFsxCzAJBgNV\n" +
                "BAYTAmFoMQswCQYDVQQIDAJiajELMAkGA1UEBwwCYmoxETAPBgNVBAoMCGtpbmdz\n" +
                "b2Z0MQowCAYDVQQLDAFzMRMwEQYDVQQDDAphYWEuY29tLmNuMB4XDTE3MDcxMzA4\n" +
                "MTA1NFoXDTE3MDgxMjA4MTA1NFowWzELMAkGA1UEBhMCYWgxCzAJBgNVBAgMAmJq\n" +
                "MQswCQYDVQQHDAJiajERMA8GA1UECgwIa2luZ3NvZnQxCjAIBgNVBAsMAXMxEzAR\n" +
                "BgNVBAMMCmFhYS5jb20uY24wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\n" +
                "AQCwp3KNrIW288L93DGyuBQ1eVL2XVW2IsCW3SKuntiTtFxA5+xecKN1xoTbNrJp\n" +
                "oWjIHUow/DRyH2k0j1zHrWs7mHfx/1LR2G6PfCGUgvA2EDNaoDia3gIPmmt6QUVh\n" +
                "l2XFqUrjmcaDk870dy8o5VMwblaC/mFhEFwlxGAjM6GqHHVlZ0AeXR+NJ7F3Fu85\n" +
                "8dP/zFfb2kSzpjgsBuAQ2W5+fxtvlKHZlMfLE4OuQiME8JhvL/czzOVK9q2wGUzl\n" +
                "/IkbyG3SwLoLFrTry2TsSibdfZe8ZrpS3gKaNqwSg1RVvShDlyvLfjm6nLgV7l2i\n" +
                "fO9vHsaHjdmb9mUwK/soRvNFAgMBAAGjUDBOMB0GA1UdDgQWBBTK3MSboh5vOtTF\n" +
                "/i7ly75c7uHPJjAfBgNVHSMEGDAWgBTK3MSboh5vOtTF/i7ly75c7uHPJjAMBgNV\n" +
                "HRMEBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQCtVHjp0C94iHqXS2E1e2gdP8eU\n" +
                "qg2naXxMRCXo2hSLEcPmNhv2Z8SfCpu54CInEyINxZg58z7KxNFD3AmNcj1/r67L\n" +
                "lVmkZzZrNsLT3Ti3SYiPgRUOSTiABZZrr0HRRbD+N32mLJ/2IeuBneBM6o0ER3Lp\n" +
                "HDD+hVcB15+MmC0uj68kWCbYcfd3go6XiPpmVyaPkTkhYQDHufW0SZ+dILvDNIVy\n" +
                "rAh7ZEUiP81LxYZcsf8fPKA/MmscQ4wZ2Owxt0KecgrkXcPTeOBdFUQAanmdsyLt\n" +
                "+U+EGOF31pUgw7FLg5Tb0ejhE1aOmjYybWCt6FTldPBHHEDCcQZjOEXn56YG\n" +
                "-----END CERTIFICATE-----\n");
        request.setPrivateKey("-----BEGIN PRIVATE KEY-----\n" +
                "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCwp3KNrIW288L9\n" +
                "3DGyuBQ1eVL2XVW2IsCW3SKuntiTtFxA5+xecKN1xoTbNrJpoWjIHUow/DRyH2k0\n" +
                "j1zHrWs7mHfx/1LR2G6PfCGUgvA2EDNaoDia3gIPmmt6QUVhl2XFqUrjmcaDk870\n" +
                "dy8o5VMwblaC/mFhEFwlxGAjM6GqHHVlZ0AeXR+NJ7F3Fu858dP/zFfb2kSzpjgs\n" +
                "BuAQ2W5+fxtvlKHZlMfLE4OuQiME8JhvL/czzOVK9q2wGUzl/IkbyG3SwLoLFrTr\n" +
                "y2TsSibdfZe8ZrpS3gKaNqwSg1RVvShDlyvLfjm6nLgV7l2ifO9vHsaHjdmb9mUw\n" +
                "K/soRvNFAgMBAAECggEBAIOw0Jz899GjdsF43TO2NpqGj2pJuhPFZH0S7T/v+tRh\n" +
                "qERaoMLmhXTPQUuKQwar5UkJTL2nxhEtiWg9V5UjmsUarJAjHsKA7irZBs+HrTsg\n" +
                "aKguuQP6bN7k5yqEbgyKqLvpsIJrqKl+DtH/55A9JP79wlB1AnMxlwAwnNqhKut8\n" +
                "flwaeO6719IexNXb4WF9TZtKoW/XTqr0HOeiasaltJ/3tZBEXrIoC0Qvxa0534Nf\n" +
                "RfrBc2Kq86wFVl1P47JoaKv7obpZndAVrRWif1CVrtzQzIG+WhIfIhNPEYJniAWH\n" +
                "8UtVhcGT3Eiiq8HfZEiqklNnG++oWKGfsx98mkb2SgECgYEA3Ohjxyhb8bFazC9h\n" +
                "hvF/GytKzbhCKfGM2cjD+OvGT17pEUma7QvLMA20Sm3f27e/Sw5NZtyGx9a3fGGf\n" +
                "dY0jEQ6y3R+4dhcf4ZfKkkBL4R8jA29wRiACRc3rpYFqYB+GsiI3A6IZHfnKUU2S\n" +
                "DTOjxQJJvuzM5Ppjs0OmLToXQDECgYEAzLdnC8FfAG3P4JpT0trrnxax7nBCo6d3\n" +
                "RKvz320W1dGtfECVe60DaaYB0W8AFEIsmakdWBsWNdCBaYxQ1spC1mNUyo7sIwme\n" +
                "OSyZ+Cxdg/r4e02zyFPtHKd7ar7o3CpkSQIcM0Zk/m2eMG6C7m0ChjJY8934NBYb\n" +
                "PhsN6BG7E1UCgYEAwdWDn3/xVVzan+k/OSnz7sII7AOuwqD5hysbkfJH2uMbvJiK\n" +
                "QU8k5bBQrzJDx8YuKsyM7CG6feUQsSnzwjCqQVBVb6NitvPJfKg1Dikuq4Unst74\n" +
                "c/+oHtn12A57aYagKPPOs/hq85t3g+l9qunR3I8KaGXdz1lJXEWSrYKYXjECgYB7\n" +
                "YQWf1hk1nvksOpbOe9aJ+RmfxNTE4UdGggPm4k5i644NVrdA5JMr9zsdSDLaAs/y\n" +
                "hDQFR73pDRMR09lcumXx48fUlLLIoyFTAAiDw+lQg8+CMOBrmflLzbzaJtkc6Aes\n" +
                "4LKyTHjNxq8SLWiH3fcpfeqSf3L5oWEl2xRUi2seSQKBgQCvlZnes+BmikpJTUsY\n" +
                "ZeRym1Ojw/Dlmf90sHQRPOn+SXq3Nxi4Qye+TO0aLsey4+6S1CZ8q8iwzV8RZoLS\n" +
                "Uh7RZC32iKP+TdxeXlTpHKxfCfp5NvXRoH5BBnI2kcwvmEMKKToWYppv99/jmXQA\n" +
                "bT7gY3gln0TZI6WyJTxCZ7NJIg==\n" +
                "-----END PRIVATE KEY-----\n");
        client.configCertificate(request);
    }

    /**
     * 更新证书
     * <p>
     * 注意
     * <p>
     * 证书名称一旦确定，不能修改，此处证书名称非必传
     * @throws Exception
     */
    @Test
    public void testSetCertificate() throws Exception {
        HttpsSetCertRequest request = new HttpsSetCertRequest();
        request.setCertificateId("914");
//        request.setCertificateName("2D09VNasfdadsf9_test1");
        request.setServerCertificate("-----BEGIN CERTIFICATE-----\n" +
                "MIIDiTCCAnGgAwIBAgIJANF7PDOT9Wm8MA0GCSqGSIb3DQEBCwUAMFsxCzAJBgNV\n" +
                "BAYTAmFoMQswCQYDVQQIDAJiajELMAkGA1UEBwwCYmoxETAPBgNVBAoMCGtpbmdz\n" +
                "b2Z0MQowCAYDVQQLDAFzMRMwEQYDVQQDDAphYWEuY29tLmNuMB4XDTE3MDcxMzA4\n" +
                "MTA1NFoXDTE3MDgxMjA4MTA1NFowWzELMAkGA1UEBhMCYWgxCzAJBgNVBAgMAmJq\n" +
                "MQswCQYDVQQHDAJiajERMA8GA1UECgwIa2luZ3NvZnQxCjAIBgNVBAsMAXMxEzAR\n" +
                "BgNVBAMMCmFhYS5jb20uY24wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\n" +
                "AQCwp3KNrIW288L93DGyuBQ1eVL2XVW2IsCW3SKuntiTtFxA5+xecKN1xoTbNrJp\n" +
                "oWjIHUow/DRyH2k0j1zHrWs7mHfx/1LR2G6PfCGUgvA2EDNaoDia3gIPmmt6QUVh\n" +
                "l2XFqUrjmcaDk870dy8o5VMwblaC/mFhEFwlxGAjM6GqHHVlZ0AeXR+NJ7F3Fu85\n" +
                "8dP/zFfb2kSzpjgsBuAQ2W5+fxtvlKHZlMfLE4OuQiME8JhvL/czzOVK9q2wGUzl\n" +
                "/IkbyG3SwLoLFrTry2TsSibdfZe8ZrpS3gKaNqwSg1RVvShDlyvLfjm6nLgV7l2i\n" +
                "fO9vHsaHjdmb9mUwK/soRvNFAgMBAAGjUDBOMB0GA1UdDgQWBBTK3MSboh5vOtTF\n" +
                "/i7ly75c7uHPJjAfBgNVHSMEGDAWgBTK3MSboh5vOtTF/i7ly75c7uHPJjAMBgNV\n" +
                "HRMEBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQCtVHjp0C94iHqXS2E1e2gdP8eU\n" +
                "qg2naXxMRCXo2hSLEcPmNhv2Z8SfCpu54CInEyINxZg58z7KxNFD3AmNcj1/r67L\n" +
                "lVmkZzZrNsLT3Ti3SYiPgRUOSTiABZZrr0HRRbD+N32mLJ/2IeuBneBM6o0ER3Lp\n" +
                "HDD+hVcB15+MmC0uj68kWCbYcfd3go6XiPpmVyaPkTkhYQDHufW0SZ+dILvDNIVy\n" +
                "rAh7ZEUiP81LxYZcsf8fPKA/MmscQ4wZ2Owxt0KecgrkXcPTeOBdFUQAanmdsyLt\n" +
                "+U+EGOF31pUgw7FLg5Tb0ejhE1aOmjYybWCt6FTldPBHHEDCcQZjOEXn56YG\n" +
                "-----END CERTIFICATE-----\n");
        request.setPrivateKey("-----BEGIN PRIVATE KEY-----\n" +
                "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCwp3KNrIW288L9\n" +
                "3DGyuBQ1eVL2XVW2IsCW3SKuntiTtFxA5+xecKN1xoTbNrJpoWjIHUow/DRyH2k0\n" +
                "j1zHrWs7mHfx/1LR2G6PfCGUgvA2EDNaoDia3gIPmmt6QUVhl2XFqUrjmcaDk870\n" +
                "dy8o5VMwblaC/mFhEFwlxGAjM6GqHHVlZ0AeXR+NJ7F3Fu858dP/zFfb2kSzpjgs\n" +
                "BuAQ2W5+fxtvlKHZlMfLE4OuQiME8JhvL/czzOVK9q2wGUzl/IkbyG3SwLoLFrTr\n" +
                "y2TsSibdfZe8ZrpS3gKaNqwSg1RVvShDlyvLfjm6nLgV7l2ifO9vHsaHjdmb9mUw\n" +
                "K/soRvNFAgMBAAECggEBAIOw0Jz899GjdsF43TO2NpqGj2pJuhPFZH0S7T/v+tRh\n" +
                "qERaoMLmhXTPQUuKQwar5UkJTL2nxhEtiWg9V5UjmsUarJAjHsKA7irZBs+HrTsg\n" +
                "aKguuQP6bN7k5yqEbgyKqLvpsIJrqKl+DtH/55A9JP79wlB1AnMxlwAwnNqhKut8\n" +
                "flwaeO6719IexNXb4WF9TZtKoW/XTqr0HOeiasaltJ/3tZBEXrIoC0Qvxa0534Nf\n" +
                "RfrBc2Kq86wFVl1P47JoaKv7obpZndAVrRWif1CVrtzQzIG+WhIfIhNPEYJniAWH\n" +
                "8UtVhcGT3Eiiq8HfZEiqklNnG++oWKGfsx98mkb2SgECgYEA3Ohjxyhb8bFazC9h\n" +
                "hvF/GytKzbhCKfGM2cjD+OvGT17pEUma7QvLMA20Sm3f27e/Sw5NZtyGx9a3fGGf\n" +
                "dY0jEQ6y3R+4dhcf4ZfKkkBL4R8jA29wRiACRc3rpYFqYB+GsiI3A6IZHfnKUU2S\n" +
                "DTOjxQJJvuzM5Ppjs0OmLToXQDECgYEAzLdnC8FfAG3P4JpT0trrnxax7nBCo6d3\n" +
                "RKvz320W1dGtfECVe60DaaYB0W8AFEIsmakdWBsWNdCBaYxQ1spC1mNUyo7sIwme\n" +
                "OSyZ+Cxdg/r4e02zyFPtHKd7ar7o3CpkSQIcM0Zk/m2eMG6C7m0ChjJY8934NBYb\n" +
                "PhsN6BG7E1UCgYEAwdWDn3/xVVzan+k/OSnz7sII7AOuwqD5hysbkfJH2uMbvJiK\n" +
                "QU8k5bBQrzJDx8YuKsyM7CG6feUQsSnzwjCqQVBVb6NitvPJfKg1Dikuq4Unst74\n" +
                "c/+oHtn12A57aYagKPPOs/hq85t3g+l9qunR3I8KaGXdz1lJXEWSrYKYXjECgYB7\n" +
                "YQWf1hk1nvksOpbOe9aJ+RmfxNTE4UdGggPm4k5i644NVrdA5JMr9zsdSDLaAs/y\n" +
                "hDQFR73pDRMR09lcumXx48fUlLLIoyFTAAiDw+lQg8+CMOBrmflLzbzaJtkc6Aes\n" +
                "4LKyTHjNxq8SLWiH3fcpfeqSf3L5oWEl2xRUi2seSQKBgQCvlZnes+BmikpJTUsY\n" +
                "ZeRym1Ojw/Dlmf90sHQRPOn+SXq3Nxi4Qye+TO0aLsey4+6S1CZ8q8iwzV8RZoLS\n" +
                "Uh7RZC32iKP+TdxeXlTpHKxfCfp5NvXRoH5BBnI2kcwvmEMKKToWYppv99/jmXQA\n" +
                "bT7gY3gln0TZI6WyJTxCZ7NJIg==\n" +
                "-----END PRIVATE KEY-----\n");
        client.setCertificate(request);
    }

    /**
     * 删除证书
     * @throws Exception
     */
    @Test
    public void testRemoveCertificates() throws Exception {
        HttpsRemoveCertRequest request = new HttpsRemoveCertRequest();
        request.setCertificateIds("911,910");
        client.removeCertificates(request);
    }
    /**
     * 分页获取用户证书列表
     * @return
     * @throws Exception
     */
    @Test
    public void testGetCertificates() throws Exception {
        HttpsGetCertRequest request = new HttpsGetCertRequest();
        request.setPageNum(1L);
        request.setPageSize(50L);
        HttpsGetCertResponse response = client.getCertificates(request);
        Assert.assertNotNull(response);
    }
}
