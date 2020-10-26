package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.internal.SdkInternalList;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class AttachKeyResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String RequestId;

    private SdkInternalList<KeyItem> InstancesSet;

    public AttachKeyResult withInstancesSet(KeyItem... keyItems) {
        if (this.InstancesSet == null) {
            this.InstancesSet = new SdkInternalList<KeyItem>();
        }
        for (KeyItem keyItem : keyItems) {
            this.InstancesSet.add(keyItem);
        }
        return this;
    }

}
