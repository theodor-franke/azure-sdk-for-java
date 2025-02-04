// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.AttachedNetworkConnectionInner;

/** An immutable client-side representation of AttachedNetworkConnection. */
public interface AttachedNetworkConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the networkConnectionId property: The resource ID of the NetworkConnection you want to attach.
     *
     * @return the networkConnectionId value.
     */
    String networkConnectionId();

    /**
     * Gets the networkConnectionLocation property: The geo-location where the NetworkConnection resource specified in
     * 'networkConnectionResourceId' property lives.
     *
     * @return the networkConnectionLocation value.
     */
    String networkConnectionLocation();

    /**
     * Gets the healthCheckStatus property: Health check status values.
     *
     * @return the healthCheckStatus value.
     */
    HealthCheckStatus healthCheckStatus();

    /**
     * Gets the domainJoinType property: AAD Join type of the network. This is populated based on the referenced Network
     * Connection.
     *
     * @return the domainJoinType value.
     */
    DomainJoinType domainJoinType();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.AttachedNetworkConnectionInner object.
     *
     * @return the inner object.
     */
    AttachedNetworkConnectionInner innerModel();

    /** The entirety of the AttachedNetworkConnection definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The AttachedNetworkConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the AttachedNetworkConnection definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the AttachedNetworkConnection definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, devCenterName.
             *
             * @param resourceGroupName Name of the resource group within the Azure subscription.
             * @param devCenterName The name of the devcenter.
             * @return the next definition stage.
             */
            WithCreate withExistingDevcenter(String resourceGroupName, String devCenterName);
        }
        /**
         * The stage of the AttachedNetworkConnection definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithNetworkConnectionId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AttachedNetworkConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AttachedNetworkConnection create(Context context);
        }
        /** The stage of the AttachedNetworkConnection definition allowing to specify networkConnectionId. */
        interface WithNetworkConnectionId {
            /**
             * Specifies the networkConnectionId property: The resource ID of the NetworkConnection you want to attach..
             *
             * @param networkConnectionId The resource ID of the NetworkConnection you want to attach.
             * @return the next definition stage.
             */
            WithCreate withNetworkConnectionId(String networkConnectionId);
        }
    }
    /**
     * Begins update for the AttachedNetworkConnection resource.
     *
     * @return the stage of resource update.
     */
    AttachedNetworkConnection.Update update();

    /** The template for AttachedNetworkConnection update. */
    interface Update {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AttachedNetworkConnection apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AttachedNetworkConnection apply(Context context);
    }
    /** The AttachedNetworkConnection update stages. */
    interface UpdateStages {
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AttachedNetworkConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AttachedNetworkConnection refresh(Context context);
}
