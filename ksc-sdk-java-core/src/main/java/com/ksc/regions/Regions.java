/*
 * Copyright 2013-2016 Ksyun Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://ksyun.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ksc.regions;


/**
 * Enumeration of region names
 */
public enum Regions {

    CN_BEIJING_6("cn-beijing-6"),
    CN_SHANGHAI_2("cn-shanghai-2"),
    ;

    /**
     * The default region that new customers in the US are encouraged to use
     * when using KSC services for the first time.
     */
    public static final Regions DEFAULT_REGION = CN_BEIJING_6;

    private final String name;

    private Regions(String name) {
        this.name = name;
    }

    /**
     * The name of this region, used in the regions.xml file to identify it.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a region enum corresponding to the given region name.
     *
     * @param regionName
     *            The name of the region. Ex.: eu-west-1
     * @return Region enum representing the given region name.
     */
    public static Regions fromName(String regionName) {
        for (Regions region : Regions.values()) {
            if (regionName.equals(region.getName())) {
                return region;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + regionName + " value!");
    }
}
