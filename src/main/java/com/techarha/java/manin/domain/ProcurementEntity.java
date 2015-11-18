package com.techarha.java.manin.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by ankit on 15/11/15.
 */
@Entity
@Table(name = "procurement", schema = "", catalog = "manin")
public class ProcurementEntity {
    private int billId;
    private Timestamp billDate;
    private BigDecimal paymentDue;
    private Timestamp paymentDueDate;
    private String freightChargesPaid;
    private String vendor;

    @Id
    @Column(name = "bill_id")
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "bill_date")
    public Timestamp getBillDate() {
        return billDate;
    }

    public void setBillDate(Timestamp billDate) {
        this.billDate = billDate;
    }

    @Basic
    @Column(name = "payment_due")
    public BigDecimal getPaymentDue() {
        return paymentDue;
    }

    public void setPaymentDue(BigDecimal paymentDue) {
        this.paymentDue = paymentDue;
    }

    @Basic
    @Column(name = "payment_due_date")
    public Timestamp getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(Timestamp paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    @Basic
    @Column(name = "freight_charges_paid")
    public String getFreightChargesPaid() {
        return freightChargesPaid;
    }

    public void setFreightChargesPaid(String freightChargesPaid) {
        this.freightChargesPaid = freightChargesPaid;
    }

    @Basic
    @Column(name = "vendor")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcurementEntity that = (ProcurementEntity) o;

        if (billId != that.billId) return false;
        if (billDate != null ? !billDate.equals(that.billDate) : that.billDate != null) return false;
        if (paymentDue != null ? !paymentDue.equals(that.paymentDue) : that.paymentDue != null) return false;
        if (paymentDueDate != null ? !paymentDueDate.equals(that.paymentDueDate) : that.paymentDueDate != null)
            return false;
        if (freightChargesPaid != null ? !freightChargesPaid.equals(that.freightChargesPaid) : that.freightChargesPaid != null)
            return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId;
        result = 31 * result + (billDate != null ? billDate.hashCode() : 0);
        result = 31 * result + (paymentDue != null ? paymentDue.hashCode() : 0);
        result = 31 * result + (paymentDueDate != null ? paymentDueDate.hashCode() : 0);
        result = 31 * result + (freightChargesPaid != null ? freightChargesPaid.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        return result;
    }
}
