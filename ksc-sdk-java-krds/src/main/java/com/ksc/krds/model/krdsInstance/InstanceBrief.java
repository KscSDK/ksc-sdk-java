package com.ksc.krds.model.krdsInstance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstanceBrief {
    private String DBInstanceIdentifier;
    private String DBInstanceName;
    private String Vip;
    private String Created;
}
