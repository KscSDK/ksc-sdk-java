package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;


@Data
@ToString
@EqualsAndHashCode
public class Price {

    /**
     * 币种
     */
    private String currency;
    /**
     * 折扣价
     */
    private BigDecimal discountPrice;
    /**
     * 原价
     */
    private BigDecimal originalPrice;
    /**
     * 成交价
     */
    private BigDecimal tradePrice;


}
