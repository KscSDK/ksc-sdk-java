package com.ksc.cdn.model.enums;


/**
 * Created by CrazyHorse on 9/18/16.
 */
public enum ActionTypeEnum {

    START("start"),
    STOP("stop");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

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
