package com.techarha.java.manin.domain;

import javax.persistence.*;

/**
 * Created by ankit on 05/10/15.
 */
@Entity
@Table(name = "shipments", schema = "", catalog = "manin")
public class ShipmentsEntity {
    private int id;
    private String trackingNumber;
    private String shipmentVendor;
    private String shipmentDate;
    private String deliveryDate;
    private String shipmentType;
    private String shipToUserId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tracking_number")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Basic
    @Column(name = "shipment_vendor")
    public String getShipmentVendor() {
        return shipmentVendor;
    }

    public void setShipmentVendor(String shipmentVendor) {
        this.shipmentVendor = shipmentVendor;
    }

    @Basic
    @Column(name = "shipment_date")
    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    @Basic
    @Column(name = "delivery_date")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "shipment_type")
    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    @Basic
    @Column(name = "ship_to_user_id")
    public String getShipToUserId() {
        return shipToUserId;
    }

    public void setShipToUserId(String shipToUserId) {
        this.shipToUserId = shipToUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShipmentsEntity that = (ShipmentsEntity) o;

        if (id != that.id) return false;
        if (trackingNumber != null ? !trackingNumber.equals(that.trackingNumber) : that.trackingNumber != null)
            return false;
        if (shipmentVendor != null ? !shipmentVendor.equals(that.shipmentVendor) : that.shipmentVendor != null)
            return false;
        if (shipmentDate != null ? !shipmentDate.equals(that.shipmentDate) : that.shipmentDate != null) return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (shipmentType != null ? !shipmentType.equals(that.shipmentType) : that.shipmentType != null) return false;
        if (shipToUserId != null ? !shipToUserId.equals(that.shipToUserId) : that.shipToUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (trackingNumber != null ? trackingNumber.hashCode() : 0);
        result = 31 * result + (shipmentVendor != null ? shipmentVendor.hashCode() : 0);
        result = 31 * result + (shipmentDate != null ? shipmentDate.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (shipmentType != null ? shipmentType.hashCode() : 0);
        result = 31 * result + (shipToUserId != null ? shipToUserId.hashCode() : 0);
        return result;
    }
}
