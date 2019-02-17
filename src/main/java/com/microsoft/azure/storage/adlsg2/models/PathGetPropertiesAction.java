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
 * Defines values for PathGetPropertiesAction.
 */
public enum PathGetPropertiesAction {
    /**
     * Enum value getAccessControl.
     */
    GET_ACCESS_CONTROL("getAccessControl"),

    /**
     * Enum value getStatus.
     */
    GET_STATUS("getStatus");

    /**
     * The actual serialized value for a PathGetPropertiesAction instance.
     */
    private final String value;

    private PathGetPropertiesAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PathGetPropertiesAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PathGetPropertiesAction object, or null if unable to parse.
     */
    @JsonCreator
    public static PathGetPropertiesAction fromString(String value) {
        PathGetPropertiesAction[] items = PathGetPropertiesAction.values();
        for (PathGetPropertiesAction item : items) {
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
