package com.ksc.network.vpc.model.vpc;

import lombok.Data;

@Data
public class SecondaryCidr {
    /**
     * Cidr的ID
     */
    private String secondaryCidrid;
    /**
     * Cidr
     */
    private String cidr;
}
