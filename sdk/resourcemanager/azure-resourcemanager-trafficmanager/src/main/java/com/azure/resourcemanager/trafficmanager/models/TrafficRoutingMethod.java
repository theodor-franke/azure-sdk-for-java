// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The traffic routing method of the Traffic Manager profile. */
public final class TrafficRoutingMethod extends ExpandableStringEnum<TrafficRoutingMethod> {
    /** Static value Performance for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod PERFORMANCE = fromString("Performance");

    /** Static value Priority for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod PRIORITY = fromString("Priority");

    /** Static value Weighted for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod WEIGHTED = fromString("Weighted");

    /** Static value Geographic for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod GEOGRAPHIC = fromString("Geographic");

    /** Static value MultiValue for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod MULTI_VALUE = fromString("MultiValue");

    /** Static value Subnet for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod SUBNET = fromString("Subnet");

    /**
     * Creates or finds a TrafficRoutingMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrafficRoutingMethod.
     */
    @JsonCreator
    public static TrafficRoutingMethod fromString(String name) {
        return fromString(name, TrafficRoutingMethod.class);
    }

    /**
     * Gets known TrafficRoutingMethod values.
     *
     * @return known TrafficRoutingMethod values.
     */
    public static Collection<TrafficRoutingMethod> values() {
        return values(TrafficRoutingMethod.class);
    }
}
