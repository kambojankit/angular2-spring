package com.techarha.java.ecomm.domain;

import org.joda.time.DateTime;

/**
 * Created by ankit on 29/03/15.
 */
public class Pricing {
    private Long productID;
    private Long itemID;
    private String currency;

    private Double purchaseCost;
    private Double procurementCost;
    private Double maintenanceCost;
    private Double minProfitExp;
    private Double sellingPrice;
    private Double discount;
    private Double maxDiscount;
    private Double markedPrice;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(Double purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public Double getProcurementCost() {
        return procurementCost;
    }

    public void setProcurementCost(Double procurementCost) {
        this.procurementCost = procurementCost;
    }

    public Double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(Double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public Double getMinProfitExp() {
        return minProfitExp;
    }

    public void setMinProfitExp(Double minProfitExp) {
        this.minProfitExp = minProfitExp;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(Double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public Double getMarkedPrice() {
        return markedPrice;
    }

    public void setMarkedPrice(Double markedPrice) {
        this.markedPrice = markedPrice;
    }
}
