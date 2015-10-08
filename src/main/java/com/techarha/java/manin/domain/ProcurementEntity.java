package com.techarha.java.manin.domain;

import javax.persistence.*;

/**
 * Created by ankit on 05/10/15.
 */
@Entity
@Table(name = "Procurement", schema = "", catalog = "manin")
public class ProcurementEntity {
    private int id;
    private String billNumber;
    private String billDate;
    private String billImageAlbumUri;
    private String billAmount;
    private String shipCharges;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bill_number", nullable = true, insertable = true, updatable = true, length = 45)
    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    @Basic
    @Column(name = "bill_date", nullable = true, insertable = true, updatable = true, length = 45)
    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    @Basic
    @Column(name = "bill_image_album_uri", nullable = true, insertable = true, updatable = true, length = 45)
    public String getBillImageAlbumUri() {
        return billImageAlbumUri;
    }

    public void setBillImageAlbumUri(String billImageAlbumUri) {
        this.billImageAlbumUri = billImageAlbumUri;
    }

    @Basic
    @Column(name = "bill_amount", nullable = true, insertable = true, updatable = true, length = 45)
    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    @Basic
    @Column(name = "ship_charges", nullable = true, insertable = true, updatable = true, length = 45)
    public String getShipCharges() {
        return shipCharges;
    }

    public void setShipCharges(String shipCharges) {
        this.shipCharges = shipCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcurementEntity that = (ProcurementEntity) o;

        if (id != that.id) return false;
        if (billNumber != null ? !billNumber.equals(that.billNumber) : that.billNumber != null) return false;
        if (billDate != null ? !billDate.equals(that.billDate) : that.billDate != null) return false;
        if (billImageAlbumUri != null ? !billImageAlbumUri.equals(that.billImageAlbumUri) : that.billImageAlbumUri != null)
            return false;
        if (billAmount != null ? !billAmount.equals(that.billAmount) : that.billAmount != null) return false;
        if (shipCharges != null ? !shipCharges.equals(that.shipCharges) : that.shipCharges != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (billNumber != null ? billNumber.hashCode() : 0);
        result = 31 * result + (billDate != null ? billDate.hashCode() : 0);
        result = 31 * result + (billImageAlbumUri != null ? billImageAlbumUri.hashCode() : 0);
        result = 31 * result + (billAmount != null ? billAmount.hashCode() : 0);
        result = 31 * result + (shipCharges != null ? shipCharges.hashCode() : 0);
        return result;
    }
}
