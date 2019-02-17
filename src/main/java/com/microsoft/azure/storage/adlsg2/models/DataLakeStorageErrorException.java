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

import com.microsoft.rest.v2.RestException;
import com.microsoft.rest.v2.http.HttpResponse;

/**
 * Exception thrown for an invalid response with DataLakeStorageError information.
 */
public final class DataLakeStorageErrorException extends RestException {
    /**
     * Initializes a new instance of the DataLakeStorageErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public DataLakeStorageErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the DataLakeStorageErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param body the deserialized response body.
     */
    public DataLakeStorageErrorException(String message, HttpResponse response, DataLakeStorageError body) {
        super(message, response, body);
    }

    @Override
    public DataLakeStorageError body() {
        return (DataLakeStorageError) super.body();
    }
}