package com.techarha.java.manin.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by ankit on 15/11/15.
 */
@Entity
@Table(name = "bill_details", schema = "", catalog = "manin")
public class BillDetailsEntity {
    private int billId;
    private BigDecimal cashRebateAmount;
    private String cashRebateFlag;
    private BigDecimal liquidationDiscountAmount;
    private String taxAmount;
    private BigDecimal cstRebate;
    private String imageUri;

    @Id
    @Column(name = "bill_id")
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "cash_rebate_amount")
    public BigDecimal getCashRebateAmount() {
        return cashRebateAmount;
    }

    public void setCashRebateAmount(BigDecimal cashRebateAmount) {
        this.cashRebateAmount = cashRebateAmount;
    }

    @Basic
    @Column(name = "cash_rebate_flag")
    public String getCashRebateFlag() {
        return cashRebateFlag;
    }

    public void setCashRebateFlag(String cashRebateFlag) {
        this.cashRebateFlag = cashRebateFlag;
    }

    @Basic
    @Column(name = "liquidation_discount_amount")
    public BigDecimal getLiquidationDiscountAmount() {
        return liquidationDiscountAmount;
    }

    public void setLiquidationDiscountAmount(BigDecimal liquidationDiscountAmount) {
        this.liquidationDiscountAmount = liquidationDiscountAmount;
    }

    @Basic
    @Column(name = "tax_amount")
    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Basic
    @Column(name = "cst_rebate")
    public BigDecimal getCstRebate() {
        return cstRebate;
    }

    public void setCstRebate(BigDecimal cstRebate) {
        this.cstRebate = cstRebate;
    }

    @Basic
    @Column(name = "image_uri")
    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillDetailsEntity that = (BillDetailsEntity) o;

        if (billId != that.billId) return false;
        if (cashRebateAmount != null ? !cashRebateAmount.equals(that.cashRebateAmount) : that.cashRebateAmount != null)
            return false;
        if (cashRebateFlag != null ? !cashRebateFlag.equals(that.cashRebateFlag) : that.cashRebateFlag != null)
            return false;
        if (liquidationDiscountAmount != null ? !liquidationDiscountAmount.equals(that.liquidationDiscountAmount) : that.liquidationDiscountAmount != null)
            return false;
        if (taxAmount != null ? !taxAmount.equals(that.taxAmount) : that.taxAmount != null) return false;
        if (cstRebate != null ? !cstRebate.equals(that.cstRebate) : that.cstRebate != null) return false;
        if (imageUri != null ? !imageUri.equals(that.imageUri) : that.imageUri != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId;
        result = 31 * result + (cashRebateAmount != null ? cashRebateAmount.hashCode() : 0);
        result = 31 * result + (cashRebateFlag != null ? cashRebateFlag.hashCode() : 0);
        result = 31 * result + (liquidationDiscountAmount != null ? liquidationDiscountAmount.hashCode() : 0);
        result = 31 * result + (taxAmount != null ? taxAmount.hashCode() : 0);
        result = 31 * result + (cstRebate != null ? cstRebate.hashCode() : 0);
        result = 31 * result + (imageUri != null ? imageUri.hashCode() : 0);
        return result;
    }
}
