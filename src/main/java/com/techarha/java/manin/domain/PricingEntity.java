package com.techarha.java.manin.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by ankit on 15/11/15.
 */
@Entity
@Table(name = "pricing", schema = "", catalog = "manin")
public class PricingEntity {
    private int id;
    private String currency;
    private BigDecimal costPrice;
    private BigDecimal procurementPrice;
    private BigDecimal maintainencePrice;
    private BigDecimal sellingPrice;
    private BigDecimal discount;
    private BigDecimal maxDiscount;
    private BigDecimal markedPrice;
    private Integer createdBy;
    private Timestamp createdAt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "cost_price")
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    @Basic
    @Column(name = "procurement_price")
    public BigDecimal getProcurementPrice() {
        return procurementPrice;
    }

    public void setProcurementPrice(BigDecimal procurementPrice) {
        this.procurementPrice = procurementPrice;
    }

    @Basic
    @Column(name = "maintainence_price")
    public BigDecimal getMaintainencePrice() {
        return maintainencePrice;
    }

    public void setMaintainencePrice(BigDecimal maintainencePrice) {
        this.maintainencePrice = maintainencePrice;
    }

    @Basic
    @Column(name = "selling_price")
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Basic
    @Column(name = "discount")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "max_discount")
    public BigDecimal getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(BigDecimal maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    @Basic
    @Column(name = "marked_price")
    public BigDecimal getMarkedPrice() {
        return markedPrice;
    }

    public void setMarkedPrice(BigDecimal markedPrice) {
        this.markedPrice = markedPrice;
    }

    @Basic
    @Column(name = "created_by")
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PricingEntity that = (PricingEntity) o;

        if (id != that.id) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (costPrice != null ? !costPrice.equals(that.costPrice) : that.costPrice != null) return false;
        if (procurementPrice != null ? !procurementPrice.equals(that.procurementPrice) : that.procurementPrice != null)
            return false;
        if (maintainencePrice != null ? !maintainencePrice.equals(that.maintainencePrice) : that.maintainencePrice != null)
            return false;
        if (sellingPrice != null ? !sellingPrice.equals(that.sellingPrice) : that.sellingPrice != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (maxDiscount != null ? !maxDiscount.equals(that.maxDiscount) : that.maxDiscount != null) return false;
        if (markedPrice != null ? !markedPrice.equals(that.markedPrice) : that.markedPrice != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (costPrice != null ? costPrice.hashCode() : 0);
        result = 31 * result + (procurementPrice != null ? procurementPrice.hashCode() : 0);
        result = 31 * result + (maintainencePrice != null ? maintainencePrice.hashCode() : 0);
        result = 31 * result + (sellingPrice != null ? sellingPrice.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (maxDiscount != null ? maxDiscount.hashCode() : 0);
        result = 31 * result + (markedPrice != null ? markedPrice.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        return result;
    }
}
