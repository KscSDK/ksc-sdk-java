package com.ksc.krds.model.krdsInstance;

public enum BILLTYPE {

    UNKNOWN(0),
    YEAR_MONTH(1),
    HOUR(2),
    PEAK(3),
    AMOUNT(4),
    DAY(5),
    TEMPUSE(6),
    HourlyInstantSettlement(87);
    private Integer code;
    BILLTYPE(Integer code){
        this.code = code;
    }

}
