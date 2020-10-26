package com.ksc.kec.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by pengtong on 2020/9/30 15:27.
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class KeyItem {

    private String instanceId;

    private Boolean Return;
}
