package com.ksc.cdn.model.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by CrazyHorse on 8/22/16.
 * 数据类型， 取值为edge:边缘数据; origin:回源数据; 支持多类型选择，多个类型用逗号（半角）分隔，缺省为edge
 */
@Getter
public enum DataTypeEnum {

    EDGE("edge", "边缘"),
    ORIGIN("origin", "回源");

    private String value;
    private String description;

    DataTypeEnum(String value, String description){
        this.value = value;
        this.description = description;
    }

    public static DataTypeEnum getByValue(String value){
        DataTypeEnum[] values = DataTypeEnum.values();
        for (DataTypeEnum dataType : values){
            if (StringUtils.equals(dataType.getValue(), value)){
                return dataType;
            }
        }
        return null;
    }
}
