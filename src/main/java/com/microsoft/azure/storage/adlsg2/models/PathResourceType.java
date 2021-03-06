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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PathResourceType.
 */
public enum PathResourceType {
    /**
     * Enum value directory.
     */
    DIRECTORY("directory"),

    /**
     * Enum value file.
     */
    FILE("file");

    /**
     * The actual serialized value for a PathResourceType instance.
     */
    private final String value;

    private PathResourceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PathResourceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PathResourceType object, or null if unable to parse.
     */
    @JsonCreator
    public static PathResourceType fromString(String value) {
        PathResourceType[] items = PathResourceType.values();
        for (PathResourceType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
