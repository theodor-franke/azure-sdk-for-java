// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Mapping of user object ID to role assignments. */
@Fluent
public final class UserRoleAssignmentValue {
    /*
     * A map of roles to assign to the parent user.
     */
    @JsonProperty(value = "roles")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, EnvironmentRole> roles;

    /**
     * Get the roles property: A map of roles to assign to the parent user.
     *
     * @return the roles value.
     */
    public Map<String, EnvironmentRole> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: A map of roles to assign to the parent user.
     *
     * @param roles the roles value to set.
     * @return the UserRoleAssignmentValue object itself.
     */
    public UserRoleAssignmentValue withRoles(Map<String, EnvironmentRole> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roles() != null) {
            roles()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
