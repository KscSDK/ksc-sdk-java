package com.ksc.krds.model.krdsInstance;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListKrdsResponse {
    Data Data = new Data();
    private String RequestId;

    @Getter
    @Setter
    public class Data{
        List<Instance> Instances;
    }
}
