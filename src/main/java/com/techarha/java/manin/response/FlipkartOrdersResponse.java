
package com.techarha.java.manin.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderDetails" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderedOn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="hasOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="primaryOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="skuCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sellingPricePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="shippingChargePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="octroiFeePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="emiFeePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="invoiceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="invoiceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="vatExclusiveOthersTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="buyerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shipToName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="procSla" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dispatchAfterDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="rtdDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="formRequired" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shipmentWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="shipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sellerBuyerInvoiceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="returnDisputeTickets" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderDetails"
})
@XmlRootElement(name = "FlipkartOrdersResponse", namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
public class FlipkartOrdersResponse {

    @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
    protected List<FlipkartOrdersResponse.OrderDetails> orderDetails;

    /**
     * Gets the value of the orderDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlipkartOrdersResponse.OrderDetails }
     * 
     * 
     */
    public List<FlipkartOrdersResponse.OrderDetails> getOrderDetails() {
        if (orderDetails == null) {
            orderDetails = new ArrayList<FlipkartOrdersResponse.OrderDetails>();
        }
        return this.orderDetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="orderedOn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hasOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="primaryOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="skuCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderState" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sellingPricePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="shippingChargePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="octroiFeePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="emiFeePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="invoiceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="invoiceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="vatExclusiveOthersTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="buyerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shipToName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="procSla" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dispatchAfterDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="rtdDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="formRequired" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shipmentWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="shipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sellerBuyerInvoiceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="returnDisputeTickets" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderedOn",
        "productName",
        "fsn",
        "hasOffer",
        "orderId",
        "primaryOrderItemId",
        "orderItemId",
        "orderType",
        "skuCode",
        "orderState",
        "sellingPricePerItem",
        "shippingChargePerItem",
        "octroiFeePerItem",
        "emiFeePerItem",
        "quantity",
        "totalAmount",
        "invoiceNo",
        "invoiceAmount",
        "invoiceDate",
        "vatExclusiveOthersTax",
        "buyerName",
        "shipToName",
        "addressLine1",
        "addressLine2",
        "city",
        "state",
        "pincode",
        "procSla",
        "dispatchAfterDate",
        "rtdDate",
        "formRequired",
        "shipmentWeight",
        "shipmentStatus",
        "trackingId",
        "sellerBuyerInvoiceNo",
        "imei",
        "returnDisputeTickets"
    })
    public static class OrderDetails {

        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderedOn;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String productName;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String fsn;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String hasOffer;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderId;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String primaryOrderItemId;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderItemId;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderType;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String skuCode;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderState;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double sellingPricePerItem;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double shippingChargePerItem;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double octroiFeePerItem;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double emiFeePerItem;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected int quantity;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double totalAmount;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String invoiceNo;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double invoiceAmount;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar invoiceDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double vatExclusiveOthersTax;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String buyerName;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String shipToName;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String addressLine1;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String addressLine2;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String city;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String state;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String pincode;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String procSla;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dispatchAfterDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar rtdDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String formRequired;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double shipmentWeight;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String shipmentStatus;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String trackingId;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String sellerBuyerInvoiceNo;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String imei;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String returnDisputeTickets;

        /**
         * Gets the value of the orderedOn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderedOn() {
            return orderedOn;
        }

        /**
         * Sets the value of the orderedOn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderedOn(String value) {
            this.orderedOn = value;
        }

        /**
         * Gets the value of the productName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Sets the value of the productName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * Gets the value of the fsn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFsn() {
            return fsn;
        }

        /**
         * Sets the value of the fsn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFsn(String value) {
            this.fsn = value;
        }

        /**
         * Gets the value of the hasOffer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHasOffer() {
            return hasOffer;
        }

        /**
         * Sets the value of the hasOffer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHasOffer(String value) {
            this.hasOffer = value;
        }

        /**
         * Gets the value of the orderId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderId() {
            return orderId;
        }

        /**
         * Sets the value of the orderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderId(String value) {
            this.orderId = value;
        }

        /**
         * Gets the value of the primaryOrderItemId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryOrderItemId() {
            return primaryOrderItemId;
        }

        /**
         * Sets the value of the primaryOrderItemId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryOrderItemId(String value) {
            this.primaryOrderItemId = value;
        }

        /**
         * Gets the value of the orderItemId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderItemId() {
            return orderItemId;
        }

        /**
         * Sets the value of the orderItemId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderItemId(String value) {
            this.orderItemId = value;
        }

        /**
         * Gets the value of the orderType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderType() {
            return orderType;
        }

        /**
         * Sets the value of the orderType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderType(String value) {
            this.orderType = value;
        }

        /**
         * Gets the value of the skuCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkuCode() {
            return skuCode;
        }

        /**
         * Sets the value of the skuCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkuCode(String value) {
            this.skuCode = value;
        }

        /**
         * Gets the value of the orderState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderState() {
            return orderState;
        }

        /**
         * Sets the value of the orderState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderState(String value) {
            this.orderState = value;
        }

        /**
         * Gets the value of the sellingPricePerItem property.
         * 
         */
        public double getSellingPricePerItem() {
            return sellingPricePerItem;
        }

        /**
         * Sets the value of the sellingPricePerItem property.
         * 
         */
        public void setSellingPricePerItem(double value) {
            this.sellingPricePerItem = value;
        }

        /**
         * Gets the value of the shippingChargePerItem property.
         * 
         */
        public double getShippingChargePerItem() {
            return shippingChargePerItem;
        }

        /**
         * Sets the value of the shippingChargePerItem property.
         * 
         */
        public void setShippingChargePerItem(double value) {
            this.shippingChargePerItem = value;
        }

        /**
         * Gets the value of the octroiFeePerItem property.
         * 
         */
        public double getOctroiFeePerItem() {
            return octroiFeePerItem;
        }

        /**
         * Sets the value of the octroiFeePerItem property.
         * 
         */
        public void setOctroiFeePerItem(double value) {
            this.octroiFeePerItem = value;
        }

        /**
         * Gets the value of the emiFeePerItem property.
         * 
         */
        public double getEmiFeePerItem() {
            return emiFeePerItem;
        }

        /**
         * Sets the value of the emiFeePerItem property.
         * 
         */
        public void setEmiFeePerItem(double value) {
            this.emiFeePerItem = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the totalAmount property.
         * 
         */
        public double getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         */
        public void setTotalAmount(double value) {
            this.totalAmount = value;
        }

        /**
         * Gets the value of the invoiceNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceNo() {
            return invoiceNo;
        }

        /**
         * Sets the value of the invoiceNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceNo(String value) {
            this.invoiceNo = value;
        }

        /**
         * Gets the value of the invoiceAmount property.
         * 
         */
        public double getInvoiceAmount() {
            return invoiceAmount;
        }

        /**
         * Sets the value of the invoiceAmount property.
         * 
         */
        public void setInvoiceAmount(double value) {
            this.invoiceAmount = value;
        }

        /**
         * Gets the value of the invoiceDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInvoiceDate() {
            return invoiceDate;
        }

        /**
         * Sets the value of the invoiceDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInvoiceDate(XMLGregorianCalendar value) {
            this.invoiceDate = value;
        }

        /**
         * Gets the value of the vatExclusiveOthersTax property.
         * 
         */
        public double getVatExclusiveOthersTax() {
            return vatExclusiveOthersTax;
        }

        /**
         * Sets the value of the vatExclusiveOthersTax property.
         * 
         */
        public void setVatExclusiveOthersTax(double value) {
            this.vatExclusiveOthersTax = value;
        }

        /**
         * Gets the value of the buyerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuyerName() {
            return buyerName;
        }

        /**
         * Sets the value of the buyerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuyerName(String value) {
            this.buyerName = value;
        }

        /**
         * Gets the value of the shipToName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToName() {
            return shipToName;
        }

        /**
         * Sets the value of the shipToName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToName(String value) {
            this.shipToName = value;
        }

        /**
         * Gets the value of the addressLine1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine1() {
            return addressLine1;
        }

        /**
         * Sets the value of the addressLine1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine1(String value) {
            this.addressLine1 = value;
        }

        /**
         * Gets the value of the addressLine2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine2() {
            return addressLine2;
        }

        /**
         * Sets the value of the addressLine2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine2(String value) {
            this.addressLine2 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the pincode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPincode() {
            return pincode;
        }

        /**
         * Sets the value of the pincode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPincode(String value) {
            this.pincode = value;
        }

        /**
         * Gets the value of the procSla property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcSla() {
            return procSla;
        }

        /**
         * Sets the value of the procSla property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcSla(String value) {
            this.procSla = value;
        }

        /**
         * Gets the value of the dispatchAfterDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDispatchAfterDate() {
            return dispatchAfterDate;
        }

        /**
         * Sets the value of the dispatchAfterDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDispatchAfterDate(XMLGregorianCalendar value) {
            this.dispatchAfterDate = value;
        }

        /**
         * Gets the value of the rtdDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRtdDate() {
            return rtdDate;
        }

        /**
         * Sets the value of the rtdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRtdDate(XMLGregorianCalendar value) {
            this.rtdDate = value;
        }

        /**
         * Gets the value of the formRequired property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormRequired() {
            return formRequired;
        }

        /**
         * Sets the value of the formRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormRequired(String value) {
            this.formRequired = value;
        }

        /**
         * Gets the value of the shipmentWeight property.
         * 
         */
        public double getShipmentWeight() {
            return shipmentWeight;
        }

        /**
         * Sets the value of the shipmentWeight property.
         * 
         */
        public void setShipmentWeight(double value) {
            this.shipmentWeight = value;
        }

        /**
         * Gets the value of the shipmentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipmentStatus() {
            return shipmentStatus;
        }

        /**
         * Sets the value of the shipmentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipmentStatus(String value) {
            this.shipmentStatus = value;
        }

        /**
         * Gets the value of the trackingId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrackingId() {
            return trackingId;
        }

        /**
         * Sets the value of the trackingId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrackingId(String value) {
            this.trackingId = value;
        }

        /**
         * Gets the value of the sellerBuyerInvoiceNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSellerBuyerInvoiceNo() {
            return sellerBuyerInvoiceNo;
        }

        /**
         * Sets the value of the sellerBuyerInvoiceNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSellerBuyerInvoiceNo(String value) {
            this.sellerBuyerInvoiceNo = value;
        }

        /**
         * Gets the value of the imei property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImei() {
            return imei;
        }

        /**
         * Sets the value of the imei property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImei(String value) {
            this.imei = value;
        }

        /**
         * Gets the value of the returnDisputeTickets property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnDisputeTickets() {
            return returnDisputeTickets;
        }

        /**
         * Sets the value of the returnDisputeTickets property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnDisputeTickets(String value) {
            this.returnDisputeTickets = value;
        }

    }

}
