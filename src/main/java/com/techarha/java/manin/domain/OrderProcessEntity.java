package com.techarha.java.manin.domain;

import javax.persistence.*;

/**
 * Created by ankit on 05/10/15.
 */
@Entity
@Table(name = "order_process", schema = "", catalog = "manin")
public class OrderProcessEntity {
    private int id;
    private String receiveDate;
    private String packDate;
    private String dispatchDate;
    private String deliveryDate;
    private String packagingMaterial;
    private String manifestDate;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "receive_date", nullable = true, insertable = true, updatable = true, length = 45)
    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Basic
    @Column(name = "pack_date", nullable = true, insertable = true, updatable = true, length = 45)
    public String getPackDate() {
        return packDate;
    }

    public void setPackDate(String packDate) {
        this.packDate = packDate;
    }

    @Basic
    @Column(name = "dispatch_date", nullable = true, insertable = true, updatable = true, length = 45)
    public String getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    @Basic
    @Column(name = "delivery_date", nullable = true, insertable = true, updatable = true, length = 45)
    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "packaging_material", nullable = true, insertable = true, updatable = true, length = 45)
    public String getPackagingMaterial() {
        return packagingMaterial;
    }

    public void setPackagingMaterial(String packagingMaterial) {
        this.packagingMaterial = packagingMaterial;
    }

    @Basic
    @Column(name = "manifest_date", nullable = true, insertable = true, updatable = true, length = 45)
    public String getManifestDate() {
        return manifestDate;
    }

    public void setManifestDate(String manifestDate) {
        this.manifestDate = manifestDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderProcessEntity that = (OrderProcessEntity) o;

        if (id != that.id) return false;
        if (receiveDate != null ? !receiveDate.equals(that.receiveDate) : that.receiveDate != null) return false;
        if (packDate != null ? !packDate.equals(that.packDate) : that.packDate != null) return false;
        if (dispatchDate != null ? !dispatchDate.equals(that.dispatchDate) : that.dispatchDate != null) return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (packagingMaterial != null ? !packagingMaterial.equals(that.packagingMaterial) : that.packagingMaterial != null)
            return false;
        if (manifestDate != null ? !manifestDate.equals(that.manifestDate) : that.manifestDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (receiveDate != null ? receiveDate.hashCode() : 0);
        result = 31 * result + (packDate != null ? packDate.hashCode() : 0);
        result = 31 * result + (dispatchDate != null ? dispatchDate.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (packagingMaterial != null ? packagingMaterial.hashCode() : 0);
        result = 31 * result + (manifestDate != null ? manifestDate.hashCode() : 0);
        return result;
    }
}
