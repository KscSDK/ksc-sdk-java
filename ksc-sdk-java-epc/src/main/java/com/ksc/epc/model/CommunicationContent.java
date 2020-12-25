package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class CommunicationContent {

    /**
     * 配件售卖方式
     */
    private String remarks;
    /**
     * 配件类型
     */
    private String author;
    /**
     * 配件规格
     */
    private String createTime;


}
