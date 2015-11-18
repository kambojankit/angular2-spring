package com.techarha.java.manin.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ankit on 15/11/15.
 */
@Entity
@javax.persistence.Table(name = "flipkart_trans", schema = "", catalog = "manin")
public class FlipkartTransEntity {
    private int id;
    private String orderId;
    private String orderItemId;
    private String fsn;
    private String orderDate;
    private String dispatchDate;
    private String deliveryDate;
    private String cancellationDate;
    private String settlementDate;
    private String orderStatus;
    private String quantity;
    private String settlementRefNo;
    private String orderType;
    private String fulfilmentType;
    private String sellerSku;
    private String wsn;
    private String orderItemValue;
    private String saleTransactionAmount;
    private String discountTransactionAmount;
    private String refund;
    private String protectionFund;
    private String marketplaceFee;
    private String serviceTax;
    private String settlementValue;
    private String commissionRate;
    private String commissionAmount;
    private String paymentRate;
    private String paymentFee;
    private String feeDiscount;
    private String cancellationFee;
    private String fixedFee;
    private String emiFee;
    private String totalWeight;
    private String shippingFee;
    private String reverseShippingFee;
    private String shippingZone;
    private String tokenOfApology;
    private String pickAndPack;
    private String storageFee;
    private String removalFee;
    private String invoiceAmount;
    private String subCategory;
    private String totalOfferAmount;
    private String myOfferShare;
    private String flipkartOfferShare;
    private String invoiceId;
    private String invoiceDate;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @javax.persistence.Column(name = "orderItemId")
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
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
    @javax.persistence.Column(name = "orderDate")
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @javax.persistence.Column(name = "dispatchDate")
    public String getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    @Basic
    @javax.persistence.Column(name = "deliveryDate")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @javax.persistence.Column(name = "cancellationDate")
    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    @Basic
    @javax.persistence.Column(name = "settlementDate")
    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    @Basic
    @javax.persistence.Column(name = "orderStatus")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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
    @javax.persistence.Column(name = "settlementRefNo")
    public String getSettlementRefNo() {
        return settlementRefNo;
    }

    public void setSettlementRefNo(String settlementRefNo) {
        this.settlementRefNo = settlementRefNo;
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
    @javax.persistence.Column(name = "fulfilmentType")
    public String getFulfilmentType() {
        return fulfilmentType;
    }

    public void setFulfilmentType(String fulfilmentType) {
        this.fulfilmentType = fulfilmentType;
    }

    @Basic
    @javax.persistence.Column(name = "sellerSKU")
    public String getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    @Basic
    @javax.persistence.Column(name = "wsn")
    public String getWsn() {
        return wsn;
    }

    public void setWsn(String wsn) {
        this.wsn = wsn;
    }

    @Basic
    @javax.persistence.Column(name = "orderItemValue")
    public String getOrderItemValue() {
        return orderItemValue;
    }

    public void setOrderItemValue(String orderItemValue) {
        this.orderItemValue = orderItemValue;
    }

    @Basic
    @javax.persistence.Column(name = "saleTransactionAmount")
    public String getSaleTransactionAmount() {
        return saleTransactionAmount;
    }

    public void setSaleTransactionAmount(String saleTransactionAmount) {
        this.saleTransactionAmount = saleTransactionAmount;
    }

    @Basic
    @javax.persistence.Column(name = "discountTransactionAmount")
    public String getDiscountTransactionAmount() {
        return discountTransactionAmount;
    }

    public void setDiscountTransactionAmount(String discountTransactionAmount) {
        this.discountTransactionAmount = discountTransactionAmount;
    }

    @Basic
    @javax.persistence.Column(name = "refund")
    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
    }

    @Basic
    @javax.persistence.Column(name = "protectionFund")
    public String getProtectionFund() {
        return protectionFund;
    }

    public void setProtectionFund(String protectionFund) {
        this.protectionFund = protectionFund;
    }

    @Basic
    @javax.persistence.Column(name = "marketplaceFee")
    public String getMarketplaceFee() {
        return marketplaceFee;
    }

    public void setMarketplaceFee(String marketplaceFee) {
        this.marketplaceFee = marketplaceFee;
    }

    @Basic
    @javax.persistence.Column(name = "serviceTax")
    public String getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(String serviceTax) {
        this.serviceTax = serviceTax;
    }

    @Basic
    @javax.persistence.Column(name = "settlementValue")
    public String getSettlementValue() {
        return settlementValue;
    }

    public void setSettlementValue(String settlementValue) {
        this.settlementValue = settlementValue;
    }

    @Basic
    @javax.persistence.Column(name = "commissionRate")
    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Basic
    @javax.persistence.Column(name = "commissionAmount")
    public String getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(String commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    @Basic
    @javax.persistence.Column(name = "paymentRate")
    public String getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(String paymentRate) {
        this.paymentRate = paymentRate;
    }

    @Basic
    @javax.persistence.Column(name = "paymentFee")
    public String getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(String paymentFee) {
        this.paymentFee = paymentFee;
    }

    @Basic
    @javax.persistence.Column(name = "feeDiscount")
    public String getFeeDiscount() {
        return feeDiscount;
    }

    public void setFeeDiscount(String feeDiscount) {
        this.feeDiscount = feeDiscount;
    }

    @Basic
    @javax.persistence.Column(name = "cancellationFee")
    public String getCancellationFee() {
        return cancellationFee;
    }

    public void setCancellationFee(String cancellationFee) {
        this.cancellationFee = cancellationFee;
    }

    @Basic
    @javax.persistence.Column(name = "fixedFee")
    public String getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(String fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Basic
    @javax.persistence.Column(name = "emiFee")
    public String getEmiFee() {
        return emiFee;
    }

    public void setEmiFee(String emiFee) {
        this.emiFee = emiFee;
    }

    @Basic
    @javax.persistence.Column(name = "totalWeight")
    public String getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Basic
    @javax.persistence.Column(name = "shippingFee")
    public String getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(String shippingFee) {
        this.shippingFee = shippingFee;
    }

    @Basic
    @javax.persistence.Column(name = "reverseShippingFee")
    public String getReverseShippingFee() {
        return reverseShippingFee;
    }

    public void setReverseShippingFee(String reverseShippingFee) {
        this.reverseShippingFee = reverseShippingFee;
    }

    @Basic
    @javax.persistence.Column(name = "shippingZone")
    public String getShippingZone() {
        return shippingZone;
    }

    public void setShippingZone(String shippingZone) {
        this.shippingZone = shippingZone;
    }

    @Basic
    @javax.persistence.Column(name = "tokenOfApology")
    public String getTokenOfApology() {
        return tokenOfApology;
    }

    public void setTokenOfApology(String tokenOfApology) {
        this.tokenOfApology = tokenOfApology;
    }

    @Basic
    @javax.persistence.Column(name = "pickAndPack")
    public String getPickAndPack() {
        return pickAndPack;
    }

    public void setPickAndPack(String pickAndPack) {
        this.pickAndPack = pickAndPack;
    }

    @Basic
    @javax.persistence.Column(name = "storageFee")
    public String getStorageFee() {
        return storageFee;
    }

    public void setStorageFee(String storageFee) {
        this.storageFee = storageFee;
    }

    @Basic
    @javax.persistence.Column(name = "removalFee")
    public String getRemovalFee() {
        return removalFee;
    }

    public void setRemovalFee(String removalFee) {
        this.removalFee = removalFee;
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
    @javax.persistence.Column(name = "subCategory")
    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    @Basic
    @javax.persistence.Column(name = "totalOfferAmount")
    public String getTotalOfferAmount() {
        return totalOfferAmount;
    }

    public void setTotalOfferAmount(String totalOfferAmount) {
        this.totalOfferAmount = totalOfferAmount;
    }

    @Basic
    @javax.persistence.Column(name = "myOfferShare")
    public String getMyOfferShare() {
        return myOfferShare;
    }

    public void setMyOfferShare(String myOfferShare) {
        this.myOfferShare = myOfferShare;
    }

    @Basic
    @javax.persistence.Column(name = "flipkartOfferShare")
    public String getFlipkartOfferShare() {
        return flipkartOfferShare;
    }

    public void setFlipkartOfferShare(String flipkartOfferShare) {
        this.flipkartOfferShare = flipkartOfferShare;
    }

    @Basic
    @javax.persistence.Column(name = "invoiceID")
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @javax.persistence.Column(name = "invoiceDate")
    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlipkartTransEntity that = (FlipkartTransEntity) o;

        if (id != that.id) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (orderItemId != null ? !orderItemId.equals(that.orderItemId) : that.orderItemId != null) return false;
        if (fsn != null ? !fsn.equals(that.fsn) : that.fsn != null) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (dispatchDate != null ? !dispatchDate.equals(that.dispatchDate) : that.dispatchDate != null) return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (cancellationDate != null ? !cancellationDate.equals(that.cancellationDate) : that.cancellationDate != null)
            return false;
        if (settlementDate != null ? !settlementDate.equals(that.settlementDate) : that.settlementDate != null)
            return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (settlementRefNo != null ? !settlementRefNo.equals(that.settlementRefNo) : that.settlementRefNo != null)
            return false;
        if (orderType != null ? !orderType.equals(that.orderType) : that.orderType != null) return false;
        if (fulfilmentType != null ? !fulfilmentType.equals(that.fulfilmentType) : that.fulfilmentType != null)
            return false;
        if (sellerSku != null ? !sellerSku.equals(that.sellerSku) : that.sellerSku != null) return false;
        if (wsn != null ? !wsn.equals(that.wsn) : that.wsn != null) return false;
        if (orderItemValue != null ? !orderItemValue.equals(that.orderItemValue) : that.orderItemValue != null)
            return false;
        if (saleTransactionAmount != null ? !saleTransactionAmount.equals(that.saleTransactionAmount) : that.saleTransactionAmount != null)
            return false;
        if (discountTransactionAmount != null ? !discountTransactionAmount.equals(that.discountTransactionAmount) : that.discountTransactionAmount != null)
            return false;
        if (refund != null ? !refund.equals(that.refund) : that.refund != null) return false;
        if (protectionFund != null ? !protectionFund.equals(that.protectionFund) : that.protectionFund != null)
            return false;
        if (marketplaceFee != null ? !marketplaceFee.equals(that.marketplaceFee) : that.marketplaceFee != null)
            return false;
        if (serviceTax != null ? !serviceTax.equals(that.serviceTax) : that.serviceTax != null) return false;
        if (settlementValue != null ? !settlementValue.equals(that.settlementValue) : that.settlementValue != null)
            return false;
        if (commissionRate != null ? !commissionRate.equals(that.commissionRate) : that.commissionRate != null)
            return false;
        if (commissionAmount != null ? !commissionAmount.equals(that.commissionAmount) : that.commissionAmount != null)
            return false;
        if (paymentRate != null ? !paymentRate.equals(that.paymentRate) : that.paymentRate != null) return false;
        if (paymentFee != null ? !paymentFee.equals(that.paymentFee) : that.paymentFee != null) return false;
        if (feeDiscount != null ? !feeDiscount.equals(that.feeDiscount) : that.feeDiscount != null) return false;
        if (cancellationFee != null ? !cancellationFee.equals(that.cancellationFee) : that.cancellationFee != null)
            return false;
        if (fixedFee != null ? !fixedFee.equals(that.fixedFee) : that.fixedFee != null) return false;
        if (emiFee != null ? !emiFee.equals(that.emiFee) : that.emiFee != null) return false;
        if (totalWeight != null ? !totalWeight.equals(that.totalWeight) : that.totalWeight != null) return false;
        if (shippingFee != null ? !shippingFee.equals(that.shippingFee) : that.shippingFee != null) return false;
        if (reverseShippingFee != null ? !reverseShippingFee.equals(that.reverseShippingFee) : that.reverseShippingFee != null)
            return false;
        if (shippingZone != null ? !shippingZone.equals(that.shippingZone) : that.shippingZone != null) return false;
        if (tokenOfApology != null ? !tokenOfApology.equals(that.tokenOfApology) : that.tokenOfApology != null)
            return false;
        if (pickAndPack != null ? !pickAndPack.equals(that.pickAndPack) : that.pickAndPack != null) return false;
        if (storageFee != null ? !storageFee.equals(that.storageFee) : that.storageFee != null) return false;
        if (removalFee != null ? !removalFee.equals(that.removalFee) : that.removalFee != null) return false;
        if (invoiceAmount != null ? !invoiceAmount.equals(that.invoiceAmount) : that.invoiceAmount != null)
            return false;
        if (subCategory != null ? !subCategory.equals(that.subCategory) : that.subCategory != null) return false;
        if (totalOfferAmount != null ? !totalOfferAmount.equals(that.totalOfferAmount) : that.totalOfferAmount != null)
            return false;
        if (myOfferShare != null ? !myOfferShare.equals(that.myOfferShare) : that.myOfferShare != null) return false;
        if (flipkartOfferShare != null ? !flipkartOfferShare.equals(that.flipkartOfferShare) : that.flipkartOfferShare != null)
            return false;
        if (invoiceId != null ? !invoiceId.equals(that.invoiceId) : that.invoiceId != null) return false;
        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (orderItemId != null ? orderItemId.hashCode() : 0);
        result = 31 * result + (fsn != null ? fsn.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (dispatchDate != null ? dispatchDate.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (cancellationDate != null ? cancellationDate.hashCode() : 0);
        result = 31 * result + (settlementDate != null ? settlementDate.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (settlementRefNo != null ? settlementRefNo.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (fulfilmentType != null ? fulfilmentType.hashCode() : 0);
        result = 31 * result + (sellerSku != null ? sellerSku.hashCode() : 0);
        result = 31 * result + (wsn != null ? wsn.hashCode() : 0);
        result = 31 * result + (orderItemValue != null ? orderItemValue.hashCode() : 0);
        result = 31 * result + (saleTransactionAmount != null ? saleTransactionAmount.hashCode() : 0);
        result = 31 * result + (discountTransactionAmount != null ? discountTransactionAmount.hashCode() : 0);
        result = 31 * result + (refund != null ? refund.hashCode() : 0);
        result = 31 * result + (protectionFund != null ? protectionFund.hashCode() : 0);
        result = 31 * result + (marketplaceFee != null ? marketplaceFee.hashCode() : 0);
        result = 31 * result + (serviceTax != null ? serviceTax.hashCode() : 0);
        result = 31 * result + (settlementValue != null ? settlementValue.hashCode() : 0);
        result = 31 * result + (commissionRate != null ? commissionRate.hashCode() : 0);
        result = 31 * result + (commissionAmount != null ? commissionAmount.hashCode() : 0);
        result = 31 * result + (paymentRate != null ? paymentRate.hashCode() : 0);
        result = 31 * result + (paymentFee != null ? paymentFee.hashCode() : 0);
        result = 31 * result + (feeDiscount != null ? feeDiscount.hashCode() : 0);
        result = 31 * result + (cancellationFee != null ? cancellationFee.hashCode() : 0);
        result = 31 * result + (fixedFee != null ? fixedFee.hashCode() : 0);
        result = 31 * result + (emiFee != null ? emiFee.hashCode() : 0);
        result = 31 * result + (totalWeight != null ? totalWeight.hashCode() : 0);
        result = 31 * result + (shippingFee != null ? shippingFee.hashCode() : 0);
        result = 31 * result + (reverseShippingFee != null ? reverseShippingFee.hashCode() : 0);
        result = 31 * result + (shippingZone != null ? shippingZone.hashCode() : 0);
        result = 31 * result + (tokenOfApology != null ? tokenOfApology.hashCode() : 0);
        result = 31 * result + (pickAndPack != null ? pickAndPack.hashCode() : 0);
        result = 31 * result + (storageFee != null ? storageFee.hashCode() : 0);
        result = 31 * result + (removalFee != null ? removalFee.hashCode() : 0);
        result = 31 * result + (invoiceAmount != null ? invoiceAmount.hashCode() : 0);
        result = 31 * result + (subCategory != null ? subCategory.hashCode() : 0);
        result = 31 * result + (totalOfferAmount != null ? totalOfferAmount.hashCode() : 0);
        result = 31 * result + (myOfferShare != null ? myOfferShare.hashCode() : 0);
        result = 31 * result + (flipkartOfferShare != null ? flipkartOfferShare.hashCode() : 0);
        result = 31 * result + (invoiceId != null ? invoiceId.hashCode() : 0);
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        return result;
    }
}
