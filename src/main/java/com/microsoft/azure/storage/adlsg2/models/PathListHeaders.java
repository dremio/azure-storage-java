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

/**
 * Defines headers for List operation.
 */
public final class PathListHeaders {
    /**
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private String date;

    /**
     * An HTTP entity tag associated with the filesystem.  Changes to
     * filesystem properties affect the entity tag, but operations on files and
     * directories do not.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The data and time the filesystem was last modified.  Changes to
     * filesystem properties update the last modified time, but operations on
     * files and directories do not.
     */
    @JsonProperty(value = "Last-Modified")
    private String lastModified;

    /**
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /**
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /**
     * If the number of paths to be listed exceeds the maxResults limit, a
     * continuation token is returned in this response header.  When a
     * continuation token is returned in the response, it must be specified in
     * a subsequent invocation of the list operation to continue listing the
     * paths.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String xMsContinuation;

    /**
     * Get the date value.
     *
     * @return the date value.
     */
    public String date() {
        return this.date;
    }

    /**
     * Set the date value.
     *
     * @param date the date value to set.
     * @return the PathListHeaders object itself.
     */
    public PathListHeaders withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set.
     * @return the PathListHeaders object itself.
     */
    public PathListHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value.
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set.
     * @return the PathListHeaders object itself.
     */
    public PathListHeaders withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the xMsRequestId value.
     *
     * @return the xMsRequestId value.
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId value.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PathListHeaders object itself.
     */
    public PathListHeaders withXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsVersion value.
     *
     * @return the xMsVersion value.
     */
    public String xMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion value.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the PathListHeaders object itself.
     */
    public PathListHeaders withXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsContinuation value.
     *
     * @return the xMsContinuation value.
     */
    public String xMsContinuation() {
        return this.xMsContinuation;
    }

    /**
     * Set the xMsContinuation value.
     *
     * @param xMsContinuation the xMsContinuation value to set.
     * @return the PathListHeaders object itself.
     */
    public PathListHeaders withXMsContinuation(String xMsContinuation) {
        this.xMsContinuation = xMsContinuation;
        return this;
    }
}
