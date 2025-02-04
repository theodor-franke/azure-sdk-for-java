// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NginxConfigurationFile model. */
@Fluent
public final class NginxConfigurationFile {
    /*
     * The content property.
     */
    @JsonProperty(value = "content")
    private String content;

    /*
     * The virtualPath property.
     */
    @JsonProperty(value = "virtualPath")
    private String virtualPath;

    /**
     * Get the content property: The content property.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The content property.
     *
     * @param content the content value to set.
     * @return the NginxConfigurationFile object itself.
     */
    public NginxConfigurationFile withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the virtualPath property: The virtualPath property.
     *
     * @return the virtualPath value.
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    /**
     * Set the virtualPath property: The virtualPath property.
     *
     * @param virtualPath the virtualPath value to set.
     * @return the NginxConfigurationFile object itself.
     */
    public NginxConfigurationFile withVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
