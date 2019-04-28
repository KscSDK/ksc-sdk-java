package com.ksc.krds.model.krdsInstance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateKrdsResponse {
    Data Data = new Data();
    private String RequestId;

    @Getter
    @Setter
    public class Data{
        Instance DBInstance;
    }
}
