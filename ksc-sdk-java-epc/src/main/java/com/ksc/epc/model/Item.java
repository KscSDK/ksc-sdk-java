package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Item {

    /**
     * 类型
     */
    private String item;
    /**
     * 状态
     */
    private String status;


}
