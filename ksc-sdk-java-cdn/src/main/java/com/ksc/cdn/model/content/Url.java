package com.ksc.cdn.model.content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Url {

    /**
     * 需要提交刷新的Url，单条
     */
    private String Url;

}
