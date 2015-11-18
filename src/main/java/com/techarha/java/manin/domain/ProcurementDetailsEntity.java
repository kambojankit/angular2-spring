package com.techarha.java.manin.domain;

import javax.persistence.*;

/**
 * Created by ankit on 15/11/15.
 */
@Entity
@Table(name = "procurement_details", schema = "", catalog = "manin")
public class ProcurementDetailsEntity {
    private int billId;
    private Integer billedVariantId;
    private Integer billedQuantity;
    private Integer actualVariantId;
    private String actualQuantity;
    private String mrp;
    private String consumerDiscount;
    private String tradeDiscount;
    private String additionalDiscount;

    @Id
    @Column(name = "bill_id")
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "billed_variant_id")
    public Integer getBilledVariantId() {
        return billedVariantId;
    }

    public void setBilledVariantId(Integer billedVariantId) {
        this.billedVariantId = billedVariantId;
    }

    @Basic
    @Column(name = "billed_quantity")
    public Integer getBilledQuantity() {
        return billedQuantity;
    }

    public void setBilledQuantity(Integer billedQuantity) {
        this.billedQuantity = billedQuantity;
    }

    @Basic
    @Column(name = "actual_variant_id")
    public Integer getActualVariantId() {
        return actualVariantId;
    }

    public void setActualVariantId(Integer actualVariantId) {
        this.actualVariantId = actualVariantId;
    }

    @Basic
    @Column(name = "actual_quantity")
    public String getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(String actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    @Basic
    @Column(name = "mrp")
    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    @Basic
    @Column(name = "consumer_discount")
    public String getConsumerDiscount() {
        return consumerDiscount;
    }

    public void setConsumerDiscount(String consumerDiscount) {
        this.consumerDiscount = consumerDiscount;
    }

    @Basic
    @Column(name = "trade_discount")
    public String getTradeDiscount() {
        return tradeDiscount;
    }

    public void setTradeDiscount(String tradeDiscount) {
        this.tradeDiscount = tradeDiscount;
    }

    @Basic
    @Column(name = "additional_discount")
    public String getAdditionalDiscount() {
        return additionalDiscount;
    }

    public void setAdditionalDiscount(String additionalDiscount) {
        this.additionalDiscount = additionalDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcurementDetailsEntity that = (ProcurementDetailsEntity) o;

        if (billId != that.billId) return false;
        if (billedVariantId != null ? !billedVariantId.equals(that.billedVariantId) : that.billedVariantId != null)
            return false;
        if (billedQuantity != null ? !billedQuantity.equals(that.billedQuantity) : that.billedQuantity != null)
            return false;
        if (actualVariantId != null ? !actualVariantId.equals(that.actualVariantId) : that.actualVariantId != null)
            return false;
        if (actualQuantity != null ? !actualQuantity.equals(that.actualQuantity) : that.actualQuantity != null)
            return false;
        if (mrp != null ? !mrp.equals(that.mrp) : that.mrp != null) return false;
        if (consumerDiscount != null ? !consumerDiscount.equals(that.consumerDiscount) : that.consumerDiscount != null)
            return false;
        if (tradeDiscount != null ? !tradeDiscount.equals(that.tradeDiscount) : that.tradeDiscount != null)
            return false;
        if (additionalDiscount != null ? !additionalDiscount.equals(that.additionalDiscount) : that.additionalDiscount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId;
        result = 31 * result + (billedVariantId != null ? billedVariantId.hashCode() : 0);
        result = 31 * result + (billedQuantity != null ? billedQuantity.hashCode() : 0);
        result = 31 * result + (actualVariantId != null ? actualVariantId.hashCode() : 0);
        result = 31 * result + (actualQuantity != null ? actualQuantity.hashCode() : 0);
        result = 31 * result + (mrp != null ? mrp.hashCode() : 0);
        result = 31 * result + (consumerDiscount != null ? consumerDiscount.hashCode() : 0);
        result = 31 * result + (tradeDiscount != null ? tradeDiscount.hashCode() : 0);
        result = 31 * result + (additionalDiscount != null ? additionalDiscount.hashCode() : 0);
        return result;
    }
}
