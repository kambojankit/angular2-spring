package com.techarha.java.manin.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ankit on 15/11/15.
 */
@Entity
@javax.persistence.Table(name = "flipkart_order", schema = "", catalog = "manin")
public class FlipkartOrderEntity {
    private int id;
    private String orderedOn;
    private String productName;
    private String fsn;
    private String hasOffer;
    private String orderId;
    private String primaryOrderItemId;
    private String orderItemId;
    private String orderType;
    private String skuCode;
    private String orderState;
    private String sellingPricePerItem;
    private String shippingChargePerItem;
    private String octroiFeePerItem;
    private String emiFeePerItem;
    private String quantity;
    private String totalAmount;
    private String invoiceNo;
    private String invoiceAmount;
    private String invoiceDate;
    private String vatExclusiveOthersTax;
    private String buyerName;
    private String shipToName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String pincode;
    private String procSla;
    private String dispatchAfterDate;
    private String rtdDate;
    private String formRequired;
    private String shipmentWeight;
    private String shipmentStatus;
    private String trackingId;
    private String sellerBuyerInvoiceNo;
    private String imei;
    private String returnDisputeTickets;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @javax.persistence.Column(name = "orderedOn")
    public String getOrderedOn() {
        return orderedOn;
    }

    public void setOrderedOn(String orderedOn) {
        this.orderedOn = orderedOn;
    }

    @Basic
    @javax.persistence.Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @javax.persistence.Column(name = "fsn")
    public String getFsn() {
        return fsn;
    }

    public void setFsn(String fsn) {
        this.fsn = fsn;
    }

    @Basic
    @javax.persistence.Column(name = "hasOffer")
    public String getHasOffer() {
        return hasOffer;
    }

    public void setHasOffer(String hasOffer) {
        this.hasOffer = hasOffer;
    }

    @Basic
    @javax.persistence.Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @javax.persistence.Column(name = "primaryOrderItemId")
    public String getPrimaryOrderItemId() {
        return primaryOrderItemId;
    }

    public void setPrimaryOrderItemId(String primaryOrderItemId) {
        this.primaryOrderItemId = primaryOrderItemId;
    }

    @Basic
    @javax.persistence.Column(name = "orderItemId")
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    @Basic
    @javax.persistence.Column(name = "orderType")
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Basic
    @javax.persistence.Column(name = "skuCode")
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    @Basic
    @javax.persistence.Column(name = "orderState")
    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    @Basic
    @javax.persistence.Column(name = "sellingPricePerItem")
    public String getSellingPricePerItem() {
        return sellingPricePerItem;
    }

    public void setSellingPricePerItem(String sellingPricePerItem) {
        this.sellingPricePerItem = sellingPricePerItem;
    }

    @Basic
    @javax.persistence.Column(name = "shippingChargePerItem")
    public String getShippingChargePerItem() {
        return shippingChargePerItem;
    }

    public void setShippingChargePerItem(String shippingChargePerItem) {
        this.shippingChargePerItem = shippingChargePerItem;
    }

    @Basic
    @javax.persistence.Column(name = "octroiFeePerItem")
    public String getOctroiFeePerItem() {
        return octroiFeePerItem;
    }

    public void setOctroiFeePerItem(String octroiFeePerItem) {
        this.octroiFeePerItem = octroiFeePerItem;
    }

    @Basic
    @javax.persistence.Column(name = "emiFeePerItem")
    public String getEmiFeePerItem() {
        return emiFeePerItem;
    }

    public void setEmiFeePerItem(String emiFeePerItem) {
        this.emiFeePerItem = emiFeePerItem;
    }

    @Basic
    @javax.persistence.Column(name = "quantity")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Basic
    @javax.persistence.Column(name = "totalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @javax.persistence.Column(name = "invoiceNo")
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Basic
    @javax.persistence.Column(name = "invoiceAmount")
    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @Basic
    @javax.persistence.Column(name = "invoiceDate")
    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Basic
    @javax.persistence.Column(name = "vatExclusiveOthersTax")
    public String getVatExclusiveOthersTax() {
        return vatExclusiveOthersTax;
    }

    public void setVatExclusiveOthersTax(String vatExclusiveOthersTax) {
        this.vatExclusiveOthersTax = vatExclusiveOthersTax;
    }

    @Basic
    @javax.persistence.Column(name = "buyerName")
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Basic
    @javax.persistence.Column(name = "shipToName")
    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    @Basic
    @javax.persistence.Column(name = "addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Basic
    @javax.persistence.Column(name = "addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Basic
    @javax.persistence.Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @javax.persistence.Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @javax.persistence.Column(name = "pincode")
    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Basic
    @javax.persistence.Column(name = "procSLA")
    public String getProcSla() {
        return procSla;
    }

    public void setProcSla(String procSla) {
        this.procSla = procSla;
    }

    @Basic
    @javax.persistence.Column(name = "dispatchAfterDate")
    public String getDispatchAfterDate() {
        return dispatchAfterDate;
    }

    public void setDispatchAfterDate(String dispatchAfterDate) {
        this.dispatchAfterDate = dispatchAfterDate;
    }

    @Basic
    @javax.persistence.Column(name = "rtdDate")
    public String getRtdDate() {
        return rtdDate;
    }

    public void setRtdDate(String rtdDate) {
        this.rtdDate = rtdDate;
    }

    @Basic
    @javax.persistence.Column(name = "formRequired")
    public String getFormRequired() {
        return formRequired;
    }

    public void setFormRequired(String formRequired) {
        this.formRequired = formRequired;
    }

    @Basic
    @javax.persistence.Column(name = "shipmentWeight")
    public String getShipmentWeight() {
        return shipmentWeight;
    }

    public void setShipmentWeight(String shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }

    @Basic
    @javax.persistence.Column(name = "shipmentStatus")
    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    @Basic
    @javax.persistence.Column(name = "trackingID")
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    @Basic
    @javax.persistence.Column(name = "sellerBuyerInvoiceNo")
    public String getSellerBuyerInvoiceNo() {
        return sellerBuyerInvoiceNo;
    }

    public void setSellerBuyerInvoiceNo(String sellerBuyerInvoiceNo) {
        this.sellerBuyerInvoiceNo = sellerBuyerInvoiceNo;
    }

    @Basic
    @javax.persistence.Column(name = "imei")
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Basic
    @javax.persistence.Column(name = "returnDisputeTickets")
    public String getReturnDisputeTickets() {
        return returnDisputeTickets;
    }

    public void setReturnDisputeTickets(String returnDisputeTickets) {
        this.returnDisputeTickets = returnDisputeTickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlipkartOrderEntity that = (FlipkartOrderEntity) o;

        if (id != that.id) return false;
        if (orderedOn != null ? !orderedOn.equals(that.orderedOn) : that.orderedOn != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (fsn != null ? !fsn.equals(that.fsn) : that.fsn != null) return false;
        if (hasOffer != null ? !hasOffer.equals(that.hasOffer) : that.hasOffer != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (primaryOrderItemId != null ? !primaryOrderItemId.equals(that.primaryOrderItemId) : that.primaryOrderItemId != null)
            return false;
        if (orderItemId != null ? !orderItemId.equals(that.orderItemId) : that.orderItemId != null) return false;
        if (orderType != null ? !orderType.equals(that.orderType) : that.orderType != null) return false;
        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null) return false;
        if (orderState != null ? !orderState.equals(that.orderState) : that.orderState != null) return false;
        if (sellingPricePerItem != null ? !sellingPricePerItem.equals(that.sellingPricePerItem) : that.sellingPricePerItem != null)
            return false;
        if (shippingChargePerItem != null ? !shippingChargePerItem.equals(that.shippingChargePerItem) : that.shippingChargePerItem != null)
            return false;
        if (octroiFeePerItem != null ? !octroiFeePerItem.equals(that.octroiFeePerItem) : that.octroiFeePerItem != null)
            return false;
        if (emiFeePerItem != null ? !emiFeePerItem.equals(that.emiFeePerItem) : that.emiFeePerItem != null)
            return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (totalAmount != null ? !totalAmount.equals(that.totalAmount) : that.totalAmount != null) return false;
        if (invoiceNo != null ? !invoiceNo.equals(that.invoiceNo) : that.invoiceNo != null) return false;
        if (invoiceAmount != null ? !invoiceAmount.equals(that.invoiceAmount) : that.invoiceAmount != null)
            return false;
        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null) return false;
        if (vatExclusiveOthersTax != null ? !vatExclusiveOthersTax.equals(that.vatExclusiveOthersTax) : that.vatExclusiveOthersTax != null)
            return false;
        if (buyerName != null ? !buyerName.equals(that.buyerName) : that.buyerName != null) return false;
        if (shipToName != null ? !shipToName.equals(that.shipToName) : that.shipToName != null) return false;
        if (addressLine1 != null ? !addressLine1.equals(that.addressLine1) : that.addressLine1 != null) return false;
        if (addressLine2 != null ? !addressLine2.equals(that.addressLine2) : that.addressLine2 != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (pincode != null ? !pincode.equals(that.pincode) : that.pincode != null) return false;
        if (procSla != null ? !procSla.equals(that.procSla) : that.procSla != null) return false;
        if (dispatchAfterDate != null ? !dispatchAfterDate.equals(that.dispatchAfterDate) : that.dispatchAfterDate != null)
            return false;
        if (rtdDate != null ? !rtdDate.equals(that.rtdDate) : that.rtdDate != null) return false;
        if (formRequired != null ? !formRequired.equals(that.formRequired) : that.formRequired != null) return false;
        if (shipmentWeight != null ? !shipmentWeight.equals(that.shipmentWeight) : that.shipmentWeight != null)
            return false;
        if (shipmentStatus != null ? !shipmentStatus.equals(that.shipmentStatus) : that.shipmentStatus != null)
            return false;
        if (trackingId != null ? !trackingId.equals(that.trackingId) : that.trackingId != null) return false;
        if (sellerBuyerInvoiceNo != null ? !sellerBuyerInvoiceNo.equals(that.sellerBuyerInvoiceNo) : that.sellerBuyerInvoiceNo != null)
            return false;
        if (imei != null ? !imei.equals(that.imei) : that.imei != null) return false;
        if (returnDisputeTickets != null ? !returnDisputeTickets.equals(that.returnDisputeTickets) : that.returnDisputeTickets != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderedOn != null ? orderedOn.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (fsn != null ? fsn.hashCode() : 0);
        result = 31 * result + (hasOffer != null ? hasOffer.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (primaryOrderItemId != null ? primaryOrderItemId.hashCode() : 0);
        result = 31 * result + (orderItemId != null ? orderItemId.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (orderState != null ? orderState.hashCode() : 0);
        result = 31 * result + (sellingPricePerItem != null ? sellingPricePerItem.hashCode() : 0);
        result = 31 * result + (shippingChargePerItem != null ? shippingChargePerItem.hashCode() : 0);
        result = 31 * result + (octroiFeePerItem != null ? octroiFeePerItem.hashCode() : 0);
        result = 31 * result + (emiFeePerItem != null ? emiFeePerItem.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (totalAmount != null ? totalAmount.hashCode() : 0);
        result = 31 * result + (invoiceNo != null ? invoiceNo.hashCode() : 0);
        result = 31 * result + (invoiceAmount != null ? invoiceAmount.hashCode() : 0);
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (vatExclusiveOthersTax != null ? vatExclusiveOthersTax.hashCode() : 0);
        result = 31 * result + (buyerName != null ? buyerName.hashCode() : 0);
        result = 31 * result + (shipToName != null ? shipToName.hashCode() : 0);
        result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
        result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (pincode != null ? pincode.hashCode() : 0);
        result = 31 * result + (procSla != null ? procSla.hashCode() : 0);
        result = 31 * result + (dispatchAfterDate != null ? dispatchAfterDate.hashCode() : 0);
        result = 31 * result + (rtdDate != null ? rtdDate.hashCode() : 0);
        result = 31 * result + (formRequired != null ? formRequired.hashCode() : 0);
        result = 31 * result + (shipmentWeight != null ? shipmentWeight.hashCode() : 0);
        result = 31 * result + (shipmentStatus != null ? shipmentStatus.hashCode() : 0);
        result = 31 * result + (trackingId != null ? trackingId.hashCode() : 0);
        result = 31 * result + (sellerBuyerInvoiceNo != null ? sellerBuyerInvoiceNo.hashCode() : 0);
        result = 31 * result + (imei != null ? imei.hashCode() : 0);
        result = 31 * result + (returnDisputeTickets != null ? returnDisputeTickets.hashCode() : 0);
        return result;
    }
}
