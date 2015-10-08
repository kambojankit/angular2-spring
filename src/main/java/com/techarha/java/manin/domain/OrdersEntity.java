package com.techarha.java.manin.domain;

import javax.persistence.*;

/**
 * Created by ankit on 05/10/15.
 */
@Entity
@Table(name = "Orders", schema = "", catalog = "manin")
public class OrdersEntity {
    private int id;
    private String marketplace;
    private String marketplaceOrderId;
    private String invoiceNumber;
    private int variantId;
    private int shipmentId;
    private String orderDate;
    private int orderProcessId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "marketplace", nullable = true, insertable = true, updatable = true, length = 45)
    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    @Basic
    @Column(name = "marketplace_order_id", nullable = true, insertable = true, updatable = true, length = 45)
    public String getMarketplaceOrderId() {
        return marketplaceOrderId;
    }

    public void setMarketplaceOrderId(String marketplaceOrderId) {
        this.marketplaceOrderId = marketplaceOrderId;
    }

    @Basic
    @Column(name = "invoice_number", nullable = true, insertable = true, updatable = true, length = 45)
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Basic
    @Column(name = "variant_id", nullable = false, insertable = true, updatable = true)
    public int getVariantId() {
        return variantId;
    }

    public void setVariantId(int variantId) {
        this.variantId = variantId;
    }

    @Basic
    @Column(name = "shipment_id", nullable = false, insertable = true, updatable = true)
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Basic
    @Column(name = "order_date", nullable = true, insertable = true, updatable = true, length = 45)
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "order_process_id", nullable = false, insertable = true, updatable = true)
    public int getOrderProcessId() {
        return orderProcessId;
    }

    public void setOrderProcessId(int orderProcessId) {
        this.orderProcessId = orderProcessId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (id != that.id) return false;
        if (variantId != that.variantId) return false;
        if (shipmentId != that.shipmentId) return false;
        if (orderProcessId != that.orderProcessId) return false;
        if (marketplace != null ? !marketplace.equals(that.marketplace) : that.marketplace != null) return false;
        if (marketplaceOrderId != null ? !marketplaceOrderId.equals(that.marketplaceOrderId) : that.marketplaceOrderId != null)
            return false;
        if (invoiceNumber != null ? !invoiceNumber.equals(that.invoiceNumber) : that.invoiceNumber != null)
            return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (marketplace != null ? marketplace.hashCode() : 0);
        result = 31 * result + (marketplaceOrderId != null ? marketplaceOrderId.hashCode() : 0);
        result = 31 * result + (invoiceNumber != null ? invoiceNumber.hashCode() : 0);
        result = 31 * result + variantId;
        result = 31 * result + shipmentId;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + orderProcessId;
        return result;
    }
}
