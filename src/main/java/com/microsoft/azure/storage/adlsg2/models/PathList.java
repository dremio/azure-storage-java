/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.adlsg2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PathList model.
 */
public final class PathList {
    /**
     * The paths property.
     */
    @JsonProperty(value = "paths")
    private List<Path> paths;

    /**
     * Get the paths value.
     *
     * @return the paths value.
     */
    public List<Path> paths() {
        return this.paths;
    }

    /**
     * Set the paths value.
     *
     * @param paths the paths value to set.
     * @return the PathList object itself.
     */
    public PathList withPaths(List<Path> paths) {
        this.paths = paths;
        return this;
    }
}
