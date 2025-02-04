// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkTableRequestTargetDistributionOptions model. */
@Fluent
public final class LinkTableRequestTargetDistributionOptions {
    /*
     * Target table distribution type
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Target table distribution column
     */
    @JsonProperty(value = "distributionColumn")
    private String distributionColumn;

    /**
     * Get the type property: Target table distribution type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Target table distribution type.
     *
     * @param type the type value to set.
     * @return the LinkTableRequestTargetDistributionOptions object itself.
     */
    public LinkTableRequestTargetDistributionOptions setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the distributionColumn property: Target table distribution column.
     *
     * @return the distributionColumn value.
     */
    public String getDistributionColumn() {
        return this.distributionColumn;
    }

    /**
     * Set the distributionColumn property: Target table distribution column.
     *
     * @param distributionColumn the distributionColumn value to set.
     * @return the LinkTableRequestTargetDistributionOptions object itself.
     */
    public LinkTableRequestTargetDistributionOptions setDistributionColumn(String distributionColumn) {
        this.distributionColumn = distributionColumn;
        return this;
    }
}
