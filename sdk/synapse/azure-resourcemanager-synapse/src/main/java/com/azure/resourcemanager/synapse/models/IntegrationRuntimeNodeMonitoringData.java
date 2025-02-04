// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Monitoring data for integration runtime node. */
@Fluent
public final class IntegrationRuntimeNodeMonitoringData {
    /*
     * Name of the integration runtime node.
     */
    @JsonProperty(value = "nodeName", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeName;

    /*
     * Available memory (MB) on the integration runtime node.
     */
    @JsonProperty(value = "availableMemoryInMB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer availableMemoryInMB;

    /*
     * CPU percentage on the integration runtime node.
     */
    @JsonProperty(value = "cpuUtilization", access = JsonProperty.Access.WRITE_ONLY)
    private Integer cpuUtilization;

    /*
     * Maximum concurrent jobs on the integration runtime node.
     */
    @JsonProperty(value = "concurrentJobsLimit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer concurrentJobsLimit;

    /*
     * The number of jobs currently running on the integration runtime node.
     */
    @JsonProperty(value = "concurrentJobsRunning", access = JsonProperty.Access.WRITE_ONLY)
    private Integer concurrentJobsRunning;

    /*
     * The maximum concurrent jobs in this integration runtime.
     */
    @JsonProperty(value = "maxConcurrentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxConcurrentJobs;

    /*
     * Sent bytes on the integration runtime node.
     */
    @JsonProperty(value = "sentBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Float sentBytes;

    /*
     * Received bytes on the integration runtime node.
     */
    @JsonProperty(value = "receivedBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Float receivedBytes;

    /*
     * Monitoring data for integration runtime node.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the nodeName property: Name of the integration runtime node.
     *
     * @return the nodeName value.
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Get the availableMemoryInMB property: Available memory (MB) on the integration runtime node.
     *
     * @return the availableMemoryInMB value.
     */
    public Integer availableMemoryInMB() {
        return this.availableMemoryInMB;
    }

    /**
     * Get the cpuUtilization property: CPU percentage on the integration runtime node.
     *
     * @return the cpuUtilization value.
     */
    public Integer cpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * Get the concurrentJobsLimit property: Maximum concurrent jobs on the integration runtime node.
     *
     * @return the concurrentJobsLimit value.
     */
    public Integer concurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }

    /**
     * Get the concurrentJobsRunning property: The number of jobs currently running on the integration runtime node.
     *
     * @return the concurrentJobsRunning value.
     */
    public Integer concurrentJobsRunning() {
        return this.concurrentJobsRunning;
    }

    /**
     * Get the maxConcurrentJobs property: The maximum concurrent jobs in this integration runtime.
     *
     * @return the maxConcurrentJobs value.
     */
    public Integer maxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    /**
     * Get the sentBytes property: Sent bytes on the integration runtime node.
     *
     * @return the sentBytes value.
     */
    public Float sentBytes() {
        return this.sentBytes;
    }

    /**
     * Get the receivedBytes property: Received bytes on the integration runtime node.
     *
     * @return the receivedBytes value.
     */
    public Float receivedBytes() {
        return this.receivedBytes;
    }

    /**
     * Get the additionalProperties property: Monitoring data for integration runtime node.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Monitoring data for integration runtime node.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeNodeMonitoringData object itself.
     */
    public IntegrationRuntimeNodeMonitoringData withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
