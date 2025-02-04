// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** IaaS VM workload-specific container. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "containerType",
    defaultImpl = IaaSvmContainer.class)
@JsonTypeName("IaasVMContainer")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "Microsoft.ClassicCompute/virtualMachines",
        value = AzureIaaSClassicComputeVMContainer.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/virtualMachines", value = AzureIaaSComputeVMContainer.class)
})
@Fluent
public class IaaSvmContainer extends ProtectionContainer {
    /*
     * Fully qualified ARM url of the virtual machine represented by this Azure
     * IaaS VM container.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

    /*
     * Specifies whether the container represents a Classic or an Azure
     * Resource Manager VM.
     */
    @JsonProperty(value = "virtualMachineVersion")
    private String virtualMachineVersion;

    /*
     * Resource group name of Recovery Services Vault.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get the virtualMachineId property: Fully qualified ARM url of the virtual machine represented by this Azure IaaS
     * VM container.
     *
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set the virtualMachineId property: Fully qualified ARM url of the virtual machine represented by this Azure IaaS
     * VM container.
     *
     * @param virtualMachineId the virtualMachineId value to set.
     * @return the IaaSvmContainer object itself.
     */
    public IaaSvmContainer withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

    /**
     * Get the virtualMachineVersion property: Specifies whether the container represents a Classic or an Azure Resource
     * Manager VM.
     *
     * @return the virtualMachineVersion value.
     */
    public String virtualMachineVersion() {
        return this.virtualMachineVersion;
    }

    /**
     * Set the virtualMachineVersion property: Specifies whether the container represents a Classic or an Azure Resource
     * Manager VM.
     *
     * @param virtualMachineVersion the virtualMachineVersion value to set.
     * @return the IaaSvmContainer object itself.
     */
    public IaaSvmContainer withVirtualMachineVersion(String virtualMachineVersion) {
        this.virtualMachineVersion = virtualMachineVersion;
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group name of Recovery Services Vault.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Resource group name of Recovery Services Vault.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the IaaSvmContainer object itself.
     */
    public IaaSvmContainer withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaaSvmContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaaSvmContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaaSvmContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaaSvmContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaaSvmContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
