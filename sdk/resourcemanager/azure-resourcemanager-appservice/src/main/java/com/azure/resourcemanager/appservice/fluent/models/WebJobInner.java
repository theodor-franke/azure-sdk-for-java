// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.WebJobType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Web Job Information. */
@Fluent
public final class WebJobInner extends ProxyOnlyResource {
    /*
     * WebJob resource specific properties
     */
    @JsonProperty(value = "properties")
    private WebJobProperties innerProperties;

    /**
     * Get the innerProperties property: WebJob resource specific properties.
     *
     * @return the innerProperties value.
     */
    private WebJobProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public WebJobInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the runCommand property: Run command.
     *
     * @return the runCommand value.
     */
    public String runCommand() {
        return this.innerProperties() == null ? null : this.innerProperties().runCommand();
    }

    /**
     * Set the runCommand property: Run command.
     *
     * @param runCommand the runCommand value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withRunCommand(String runCommand) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withRunCommand(runCommand);
        return this;
    }

    /**
     * Get the url property: Job URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Set the url property: Job URL.
     *
     * @param url the url value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withUrl(String url) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withUrl(url);
        return this;
    }

    /**
     * Get the extraInfoUrl property: Extra Info URL.
     *
     * @return the extraInfoUrl value.
     */
    public String extraInfoUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().extraInfoUrl();
    }

    /**
     * Set the extraInfoUrl property: Extra Info URL.
     *
     * @param extraInfoUrl the extraInfoUrl value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withExtraInfoUrl(String extraInfoUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withExtraInfoUrl(extraInfoUrl);
        return this;
    }

    /**
     * Get the webJobType property: Job type.
     *
     * @return the webJobType value.
     */
    public WebJobType webJobType() {
        return this.innerProperties() == null ? null : this.innerProperties().webJobType();
    }

    /**
     * Set the webJobType property: Job type.
     *
     * @param webJobType the webJobType value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withWebJobType(WebJobType webJobType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withWebJobType(webJobType);
        return this;
    }

    /**
     * Get the error property: Error information.
     *
     * @return the error value.
     */
    public String error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Set the error property: Error information.
     *
     * @param error the error value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withError(String error) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withError(error);
        return this;
    }

    /**
     * Get the usingSdk property: Using SDK?.
     *
     * @return the usingSdk value.
     */
    public Boolean usingSdk() {
        return this.innerProperties() == null ? null : this.innerProperties().usingSdk();
    }

    /**
     * Set the usingSdk property: Using SDK?.
     *
     * @param usingSdk the usingSdk value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withUsingSdk(Boolean usingSdk) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withUsingSdk(usingSdk);
        return this;
    }

    /**
     * Get the settings property: Job settings.
     *
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.innerProperties() == null ? null : this.innerProperties().settings();
    }

    /**
     * Set the settings property: Job settings.
     *
     * @param settings the settings value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withSettings(Map<String, Object> settings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebJobProperties();
        }
        this.innerProperties().withSettings(settings);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
