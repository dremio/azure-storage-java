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
 * Defines values for PathUpdateAction.
 */
public enum PathUpdateAction {
    /**
     * Enum value append.
     */
    APPEND("append"),

    /**
     * Enum value flush.
     */
    FLUSH("flush"),

    /**
     * Enum value setProperties.
     */
    SET_PROPERTIES("setProperties"),

    /**
     * Enum value setAccessControl.
     */
    SET_ACCESS_CONTROL("setAccessControl");

    /**
     * The actual serialized value for a PathUpdateAction instance.
     */
    private final String value;

    private PathUpdateAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PathUpdateAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PathUpdateAction object, or null if unable to parse.
     */
    @JsonCreator
    public static PathUpdateAction fromString(String value) {
        PathUpdateAction[] items = PathUpdateAction.values();
        for (PathUpdateAction item : items) {
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
