// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Address field value. */
@Fluent
public final class AddressValue {
    /*
     * House or building number.
     */
    @JsonProperty(value = "houseNumber")
    private String houseNumber;

    /*
     * Post office box number.
     */
    @JsonProperty(value = "poBox")
    private String poBox;

    /*
     * Street name.
     */
    @JsonProperty(value = "road")
    private String road;

    /*
     * Name of city, town, village, etc.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * First-level administrative division.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Postal code used for mail sorting.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /*
     * Country/region.
     */
    @JsonProperty(value = "countryRegion")
    private String countryRegion;

    /*
     * Street-level address, excluding city, state, countryRegion, and
     * postalCode.
     */
    @JsonProperty(value = "streetAddress")
    private String streetAddress;

    /**
     * Get the houseNumber property: House or building number.
     *
     * @return the houseNumber value.
     */
    public String getHouseNumber() {
        return this.houseNumber;
    }

    /**
     * Set the houseNumber property: House or building number.
     *
     * @param houseNumber the houseNumber value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Get the poBox property: Post office box number.
     *
     * @return the poBox value.
     */
    public String getPoBox() {
        return this.poBox;
    }

    /**
     * Set the poBox property: Post office box number.
     *
     * @param poBox the poBox value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setPoBox(String poBox) {
        this.poBox = poBox;
        return this;
    }

    /**
     * Get the road property: Street name.
     *
     * @return the road value.
     */
    public String getRoad() {
        return this.road;
    }

    /**
     * Set the road property: Street name.
     *
     * @param road the road value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setRoad(String road) {
        this.road = road;
        return this;
    }

    /**
     * Get the city property: Name of city, town, village, etc.
     *
     * @return the city value.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Set the city property: Name of city, town, village, etc.
     *
     * @param city the city value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the state property: First-level administrative division.
     *
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state property: First-level administrative division.
     *
     * @param state the state value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the postalCode property: Postal code used for mail sorting.
     *
     * @return the postalCode value.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: Postal code used for mail sorting.
     *
     * @param postalCode the postalCode value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the countryRegion property: Country/region.
     *
     * @return the countryRegion value.
     */
    public String getCountryRegion() {
        return this.countryRegion;
    }

    /**
     * Set the countryRegion property: Country/region.
     *
     * @param countryRegion the countryRegion value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
        return this;
    }

    /**
     * Get the streetAddress property: Street-level address, excluding city, state, countryRegion, and postalCode.
     *
     * @return the streetAddress value.
     */
    public String getStreetAddress() {
        return this.streetAddress;
    }

    /**
     * Set the streetAddress property: Street-level address, excluding city, state, countryRegion, and postalCode.
     *
     * @param streetAddress the streetAddress value to set.
     * @return the AddressValue object itself.
     */
    public AddressValue setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }
}
