/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ksc.partitions;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.KscClientException;
import com.ksc.annotation.SdkInternalApi;
import com.ksc.partitions.model.Partitions;
import com.ksc.regions.RegionMetadata;
import com.ksc.util.IOUtils;
import com.ksc.util.json.Jackson;

/**
 * Loads all the partition files into memory.
 */
@SdkInternalApi
// TODOFIX
public class PartitionsLoader {

    /**
     * class path from where all partition files are loaded.
     */
    public static final String PARTITIONS_RESOURCE_PATH =
            "com/ksc/partitions/endpoints.json";

    /**
     * override class path from where all partition files are loaded.
     */
    public static final String PARTITIONS_OVERRIDE_RESOURCE_PATH =
            "com/ksc/partitions/override/endpoints.json";

    /**
     * Jackson object mapper that is used for parsing the partition files.
     */
    private static final ObjectMapper mapper = Jackson.getObjectMapper();

    /**
     * classloader to to be used for loading the partitions.
     */
    private final ClassLoader classLoader;

    public PartitionsLoader() {
        this.classLoader = PartitionsLoader.class.getClassLoader();
    }

    /**
     * Loads the partition files from the {@link #PARTITIONS_OVERRIDE_RESOURCE_PATH}. If no files are present, then
     * loads the partition files from the {@link #PARTITIONS_RESOURCE_PATH}
     * <p/>
     * Builds the {@link RegionMetadata} from the partition files.
     */
    public PartitionMetadataProvider build() {

        InputStream stream = classLoader
                .getResourceAsStream(PARTITIONS_OVERRIDE_RESOURCE_PATH);

        if (stream != null) {
            return new PartitionMetadataProvider(loadPartitionFromStream(stream, PARTITIONS_OVERRIDE_RESOURCE_PATH).getPartitions());
        } else {
            stream = classLoader.getResourceAsStream(PARTITIONS_RESOURCE_PATH);
            if (stream == null) {
                throw new KscClientException("Unable to load parition metadata from " + PARTITIONS_RESOURCE_PATH);
            }
            return new PartitionMetadataProvider(loadPartitionFromStream(stream, PARTITIONS_RESOURCE_PATH).getPartitions());
        }
    }

    private Partitions loadPartitionFromStream(InputStream stream, String location) {

        try {

            return mapper.readValue(stream, Partitions.class);

        } catch (IOException e) {
            throw new KscClientException("Error while loading partitions " +
                    "file from " + location, e);
        } finally {
            IOUtils.closeQuietly(stream, null);
        }
    }
}
