// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.AdaptiveApplicationControlIssueSummary;
import com.azure.resourcemanager.security.models.ConfigurationStatus;
import com.azure.resourcemanager.security.models.EnforcementMode;
import com.azure.resourcemanager.security.models.PathRecommendation;
import com.azure.resourcemanager.security.models.ProtectionMode;
import com.azure.resourcemanager.security.models.RecommendationStatus;
import com.azure.resourcemanager.security.models.SourceSystem;
import com.azure.resourcemanager.security.models.VmRecommendation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a machines group and set of rules to be allowed running on a machine. */
@Fluent
public final class AdaptiveApplicationControlGroupData {
    /*
     * The application control policy enforcement/protection mode of the machine group
     */
    @JsonProperty(value = "enforcementMode")
    private EnforcementMode enforcementMode;

    /*
     * The protection mode of the collection/file types. Exe/Msi/Script are used for Windows, Executable is used for
     * Linux.
     */
    @JsonProperty(value = "protectionMode")
    private ProtectionMode protectionMode;

    /*
     * The configuration status of the machines group or machine or rule
     */
    @JsonProperty(value = "configurationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationStatus configurationStatus;

    /*
     * The initial recommendation status of the machine group or machine
     */
    @JsonProperty(value = "recommendationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendationStatus recommendationStatus;

    /*
     * The issues property.
     */
    @JsonProperty(value = "issues", access = JsonProperty.Access.WRITE_ONLY)
    private List<AdaptiveApplicationControlIssueSummary> issues;

    /*
     * The source type of the machine group
     */
    @JsonProperty(value = "sourceSystem", access = JsonProperty.Access.WRITE_ONLY)
    private SourceSystem sourceSystem;

    /*
     * The vmRecommendations property.
     */
    @JsonProperty(value = "vmRecommendations")
    private List<VmRecommendation> vmRecommendations;

    /*
     * The pathRecommendations property.
     */
    @JsonProperty(value = "pathRecommendations")
    private List<PathRecommendation> pathRecommendations;

    /**
     * Get the enforcementMode property: The application control policy enforcement/protection mode of the machine
     * group.
     *
     * @return the enforcementMode value.
     */
    public EnforcementMode enforcementMode() {
        return this.enforcementMode;
    }

    /**
     * Set the enforcementMode property: The application control policy enforcement/protection mode of the machine
     * group.
     *
     * @param enforcementMode the enforcementMode value to set.
     * @return the AdaptiveApplicationControlGroupData object itself.
     */
    public AdaptiveApplicationControlGroupData withEnforcementMode(EnforcementMode enforcementMode) {
        this.enforcementMode = enforcementMode;
        return this;
    }

    /**
     * Get the protectionMode property: The protection mode of the collection/file types. Exe/Msi/Script are used for
     * Windows, Executable is used for Linux.
     *
     * @return the protectionMode value.
     */
    public ProtectionMode protectionMode() {
        return this.protectionMode;
    }

    /**
     * Set the protectionMode property: The protection mode of the collection/file types. Exe/Msi/Script are used for
     * Windows, Executable is used for Linux.
     *
     * @param protectionMode the protectionMode value to set.
     * @return the AdaptiveApplicationControlGroupData object itself.
     */
    public AdaptiveApplicationControlGroupData withProtectionMode(ProtectionMode protectionMode) {
        this.protectionMode = protectionMode;
        return this;
    }

    /**
     * Get the configurationStatus property: The configuration status of the machines group or machine or rule.
     *
     * @return the configurationStatus value.
     */
    public ConfigurationStatus configurationStatus() {
        return this.configurationStatus;
    }

    /**
     * Get the recommendationStatus property: The initial recommendation status of the machine group or machine.
     *
     * @return the recommendationStatus value.
     */
    public RecommendationStatus recommendationStatus() {
        return this.recommendationStatus;
    }

    /**
     * Get the issues property: The issues property.
     *
     * @return the issues value.
     */
    public List<AdaptiveApplicationControlIssueSummary> issues() {
        return this.issues;
    }

    /**
     * Get the sourceSystem property: The source type of the machine group.
     *
     * @return the sourceSystem value.
     */
    public SourceSystem sourceSystem() {
        return this.sourceSystem;
    }

    /**
     * Get the vmRecommendations property: The vmRecommendations property.
     *
     * @return the vmRecommendations value.
     */
    public List<VmRecommendation> vmRecommendations() {
        return this.vmRecommendations;
    }

    /**
     * Set the vmRecommendations property: The vmRecommendations property.
     *
     * @param vmRecommendations the vmRecommendations value to set.
     * @return the AdaptiveApplicationControlGroupData object itself.
     */
    public AdaptiveApplicationControlGroupData withVmRecommendations(List<VmRecommendation> vmRecommendations) {
        this.vmRecommendations = vmRecommendations;
        return this;
    }

    /**
     * Get the pathRecommendations property: The pathRecommendations property.
     *
     * @return the pathRecommendations value.
     */
    public List<PathRecommendation> pathRecommendations() {
        return this.pathRecommendations;
    }

    /**
     * Set the pathRecommendations property: The pathRecommendations property.
     *
     * @param pathRecommendations the pathRecommendations value to set.
     * @return the AdaptiveApplicationControlGroupData object itself.
     */
    public AdaptiveApplicationControlGroupData withPathRecommendations(List<PathRecommendation> pathRecommendations) {
        this.pathRecommendations = pathRecommendations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protectionMode() != null) {
            protectionMode().validate();
        }
        if (issues() != null) {
            issues().forEach(e -> e.validate());
        }
        if (vmRecommendations() != null) {
            vmRecommendations().forEach(e -> e.validate());
        }
        if (pathRecommendations() != null) {
            pathRecommendations().forEach(e -> e.validate());
        }
    }
}
