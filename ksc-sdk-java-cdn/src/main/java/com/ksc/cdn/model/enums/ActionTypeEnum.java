package com.ksc.cdn.model.enums;

import lombok.Getter;

/**
 * Created by CrazyHorse on 9/18/16.
 */
@Getter
public enum ActionTypeEnum {

    START("start"),
    STOP("stop");

    private String value;

    ActionTypeEnum(String value) {
        this.value = value;
    }

    public static ActionTypeEnum value(String actionType) {
        for (ActionTypeEnum actionTypeEnum : ActionTypeEnum.values()) {
            if (actionTypeEnum.getValue().equals(actionType)) {
                return actionTypeEnum;
            }
        }
        return null;
    }
}
