
package com.techarha.java.manin.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlipkartPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlipkartPricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderItemValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="saleTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discountTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="refund" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="protectionFund" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalMarketplaceFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="serviceTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="settlementValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="commissionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="paymentRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="paymentFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="feeDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cancellationFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fixedFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="emiFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="shippingFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reverseShippingFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="shippingZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentfee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalOffer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="flipkartOffer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="myShareOffer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlipkartPricing", namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", propOrder = {
    "orderItemValue",
    "saleTransactionAmount",
    "discountTransactionAmount",
    "refund",
    "protectionFund",
    "totalMarketplaceFee",
    "serviceTax",
    "settlementValue",
    "commissionRate",
    "commission",
    "paymentRate",
    "paymentFee",
    "feeDiscount",
    "cancellationFee",
    "fixedFee",
    "emiFee",
    "totalWeight",
    "shippingFee",
    "reverseShippingFee",
    "shippingZone",
    "paymentfee",
    "totalOffer",
    "flipkartOffer",
    "myShareOffer"
})
public class FlipkartPricing {

    protected double orderItemValue;
    protected double saleTransactionAmount;
    protected double discountTransactionAmount;
    protected double refund;
    protected double protectionFund;
    protected double totalMarketplaceFee;
    protected double serviceTax;
    protected double settlementValue;
    protected double commissionRate;
    protected double commission;
    protected double paymentRate;
    protected double paymentFee;
    protected double feeDiscount;
    protected double cancellationFee;
    protected double fixedFee;
    protected double emiFee;
    protected double totalWeight;
    protected double shippingFee;
    protected double reverseShippingFee;
    @XmlElement(required = true)
    protected String shippingZone;
    protected double paymentfee;
    protected double totalOffer;
    protected double flipkartOffer;
    protected double myShareOffer;

    /**
     * Gets the value of the orderItemValue property.
     * 
     */
    public double getOrderItemValue() {
        return orderItemValue;
    }

    /**
     * Sets the value of the orderItemValue property.
     * 
     */
    public void setOrderItemValue(double value) {
        this.orderItemValue = value;
    }

    /**
     * Gets the value of the saleTransactionAmount property.
     * 
     */
    public double getSaleTransactionAmount() {
        return saleTransactionAmount;
    }

    /**
     * Sets the value of the saleTransactionAmount property.
     * 
     */
    public void setSaleTransactionAmount(double value) {
        this.saleTransactionAmount = value;
    }

    /**
     * Gets the value of the discountTransactionAmount property.
     * 
     */
    public double getDiscountTransactionAmount() {
        return discountTransactionAmount;
    }

    /**
     * Sets the value of the discountTransactionAmount property.
     * 
     */
    public void setDiscountTransactionAmount(double value) {
        this.discountTransactionAmount = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     */
    public double getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     */
    public void setRefund(double value) {
        this.refund = value;
    }

    /**
     * Gets the value of the protectionFund property.
     * 
     */
    public double getProtectionFund() {
        return protectionFund;
    }

    /**
     * Sets the value of the protectionFund property.
     * 
     */
    public void setProtectionFund(double value) {
        this.protectionFund = value;
    }

    /**
     * Gets the value of the totalMarketplaceFee property.
     * 
     */
    public double getTotalMarketplaceFee() {
        return totalMarketplaceFee;
    }

    /**
     * Sets the value of the totalMarketplaceFee property.
     * 
     */
    public void setTotalMarketplaceFee(double value) {
        this.totalMarketplaceFee = value;
    }

    /**
     * Gets the value of the serviceTax property.
     * 
     */
    public double getServiceTax() {
        return serviceTax;
    }

    /**
     * Sets the value of the serviceTax property.
     * 
     */
    public void setServiceTax(double value) {
        this.serviceTax = value;
    }

    /**
     * Gets the value of the settlementValue property.
     * 
     */
    public double getSettlementValue() {
        return settlementValue;
    }

    /**
     * Sets the value of the settlementValue property.
     * 
     */
    public void setSettlementValue(double value) {
        this.settlementValue = value;
    }

    /**
     * Gets the value of the commissionRate property.
     * 
     */
    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * Sets the value of the commissionRate property.
     * 
     */
    public void setCommissionRate(double value) {
        this.commissionRate = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     */
    public void setCommission(double value) {
        this.commission = value;
    }

    /**
     * Gets the value of the paymentRate property.
     * 
     */
    public double getPaymentRate() {
        return paymentRate;
    }

    /**
     * Sets the value of the paymentRate property.
     * 
     */
    public void setPaymentRate(double value) {
        this.paymentRate = value;
    }

    /**
     * Gets the value of the paymentFee property.
     * 
     */
    public double getPaymentFee() {
        return paymentFee;
    }

    /**
     * Sets the value of the paymentFee property.
     * 
     */
    public void setPaymentFee(double value) {
        this.paymentFee = value;
    }

    /**
     * Gets the value of the feeDiscount property.
     * 
     */
    public double getFeeDiscount() {
        return feeDiscount;
    }

    /**
     * Sets the value of the feeDiscount property.
     * 
     */
    public void setFeeDiscount(double value) {
        this.feeDiscount = value;
    }

    /**
     * Gets the value of the cancellationFee property.
     * 
     */
    public double getCancellationFee() {
        return cancellationFee;
    }

    /**
     * Sets the value of the cancellationFee property.
     * 
     */
    public void setCancellationFee(double value) {
        this.cancellationFee = value;
    }

    /**
     * Gets the value of the fixedFee property.
     * 
     */
    public double getFixedFee() {
        return fixedFee;
    }

    /**
     * Sets the value of the fixedFee property.
     * 
     */
    public void setFixedFee(double value) {
        this.fixedFee = value;
    }

    /**
     * Gets the value of the emiFee property.
     * 
     */
    public double getEmiFee() {
        return emiFee;
    }

    /**
     * Sets the value of the emiFee property.
     * 
     */
    public void setEmiFee(double value) {
        this.emiFee = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     */
    public double getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     */
    public void setTotalWeight(double value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the shippingFee property.
     * 
     */
    public double getShippingFee() {
        return shippingFee;
    }

    /**
     * Sets the value of the shippingFee property.
     * 
     */
    public void setShippingFee(double value) {
        this.shippingFee = value;
    }

    /**
     * Gets the value of the reverseShippingFee property.
     * 
     */
    public double getReverseShippingFee() {
        return reverseShippingFee;
    }

    /**
     * Sets the value of the reverseShippingFee property.
     * 
     */
    public void setReverseShippingFee(double value) {
        this.reverseShippingFee = value;
    }

    /**
     * Gets the value of the shippingZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingZone() {
        return shippingZone;
    }

    /**
     * Sets the value of the shippingZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingZone(String value) {
        this.shippingZone = value;
    }

    /**
     * Gets the value of the paymentfee property.
     * 
     */
    public double getPaymentfee() {
        return paymentfee;
    }

    /**
     * Sets the value of the paymentfee property.
     * 
     */
    public void setPaymentfee(double value) {
        this.paymentfee = value;
    }

    /**
     * Gets the value of the totalOffer property.
     * 
     */
    public double getTotalOffer() {
        return totalOffer;
    }

    /**
     * Sets the value of the totalOffer property.
     * 
     */
    public void setTotalOffer(double value) {
        this.totalOffer = value;
    }

    /**
     * Gets the value of the flipkartOffer property.
     * 
     */
    public double getFlipkartOffer() {
        return flipkartOffer;
    }

    /**
     * Sets the value of the flipkartOffer property.
     * 
     */
    public void setFlipkartOffer(double value) {
        this.flipkartOffer = value;
    }

    /**
     * Gets the value of the myShareOffer property.
     * 
     */
    public double getMyShareOffer() {
        return myShareOffer;
    }

    /**
     * Sets the value of the myShareOffer property.
     * 
     */
    public void setMyShareOffer(double value) {
        this.myShareOffer = value;
    }

}
