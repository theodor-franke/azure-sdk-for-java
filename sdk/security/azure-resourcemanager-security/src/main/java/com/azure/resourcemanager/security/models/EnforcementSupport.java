// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The machine supportability of Enforce feature. */
public final class EnforcementSupport extends ExpandableStringEnum<EnforcementSupport> {
    /** Static value Supported for EnforcementSupport. */
    public static final EnforcementSupport SUPPORTED = fromString("Supported");

    /** Static value NotSupported for EnforcementSupport. */
    public static final EnforcementSupport NOT_SUPPORTED = fromString("NotSupported");

    /** Static value Unknown for EnforcementSupport. */
    public static final EnforcementSupport UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a EnforcementSupport from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnforcementSupport.
     */
    @JsonCreator
    public static EnforcementSupport fromString(String name) {
        return fromString(name, EnforcementSupport.class);
    }

    /**
     * Gets known EnforcementSupport values.
     *
     * @return known EnforcementSupport values.
     */
    public static Collection<EnforcementSupport> values() {
        return values(EnforcementSupport.class);
    }
}
