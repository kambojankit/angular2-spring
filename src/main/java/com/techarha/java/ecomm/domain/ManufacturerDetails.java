package com.techarha.java.ecomm.domain;

import org.joda.time.DateTime;

/**
 * Created by ankit on 29/03/15.
 */
public class ManufacturerDetails {
    private Long manufacID;
    private User manufacturer;
    private DateTime dealingSince;

    public Long getManufacID() {
        return manufacID;
    }

    public void setManufacID(Long manufacID) {
        this.manufacID = manufacID;
    }

    public User getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(User manufacturer) {
        this.manufacturer = manufacturer;
    }

    public DateTime getDealingSince() {
        return dealingSince;
    }

    public void setDealingSince(DateTime dealingSince) {
        this.dealingSince = dealingSince;
    }
}
