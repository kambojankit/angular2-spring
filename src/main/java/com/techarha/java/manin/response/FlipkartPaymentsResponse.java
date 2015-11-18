
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
 *         &lt;element name="transactionDetails" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="dispatch" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="orderState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderStatusTrans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="quantityTrans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sellingPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="shippingCharges" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="totalInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="settlementRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderPricing" type="{http://www.techarha.com/schema/xsd/manin/FlipkartResponse}FlipkartPricing"/>
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
    "transactionDetails"
})
@XmlRootElement(name = "FlipkartPaymentsResponse", namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
public class FlipkartPaymentsResponse {

    @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
    protected List<FlipkartPaymentsResponse.TransactionDetails> transactionDetails;

    /**
     * Gets the value of the transactionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlipkartPaymentsResponse.TransactionDetails }
     * 
     * 
     */
    public List<FlipkartPaymentsResponse.TransactionDetails> getTransactionDetails() {
        if (transactionDetails == null) {
            transactionDetails = new ArrayList<FlipkartPaymentsResponse.TransactionDetails>();
        }
        return this.transactionDetails;
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
     *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="dispatch" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="orderState" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderStatusTrans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="quantityTrans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sellingPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="shippingCharges" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="totalInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="settlementRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderPricing" type="{http://www.techarha.com/schema/xsd/manin/FlipkartResponse}FlipkartPricing"/>
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
        "orderId",
        "orderItemId",
        "fsn",
        "orderDate",
        "invoiceDate",
        "dispatch",
        "shipDate",
        "deliveryDate",
        "cancellationDate",
        "settlementDate",
        "orderState",
        "orderStatusTrans",
        "quantityTrans",
        "productName",
        "sku",
        "sellingPrice",
        "shippingCharges",
        "totalInvoiceAmount",
        "settlementRefNo",
        "orderType",
        "orderPricing"
    })
    public static class TransactionDetails {

        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderId;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderItemId;
        @XmlElement(name = "FSN", namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String fsn;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar orderDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar invoiceDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dispatch;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar shipDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar deliveryDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar cancellationDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar settlementDate;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderState;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderStatusTrans;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String quantityTrans;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String productName;
        @XmlElement(name = "SKU", namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String sku;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double sellingPrice;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double shippingCharges;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
        protected double totalInvoiceAmount;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String settlementRefNo;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected String orderType;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected FlipkartPricing orderPricing;

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
         * Gets the value of the fsn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFSN() {
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
        public void setFSN(String value) {
            this.fsn = value;
        }

        /**
         * Gets the value of the orderDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOrderDate() {
            return orderDate;
        }

        /**
         * Sets the value of the orderDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOrderDate(XMLGregorianCalendar value) {
            this.orderDate = value;
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
         * Gets the value of the dispatch property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDispatch() {
            return dispatch;
        }

        /**
         * Sets the value of the dispatch property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDispatch(XMLGregorianCalendar value) {
            this.dispatch = value;
        }

        /**
         * Gets the value of the shipDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getShipDate() {
            return shipDate;
        }

        /**
         * Sets the value of the shipDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setShipDate(XMLGregorianCalendar value) {
            this.shipDate = value;
        }

        /**
         * Gets the value of the deliveryDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDeliveryDate() {
            return deliveryDate;
        }

        /**
         * Sets the value of the deliveryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDeliveryDate(XMLGregorianCalendar value) {
            this.deliveryDate = value;
        }

        /**
         * Gets the value of the cancellationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCancellationDate() {
            return cancellationDate;
        }

        /**
         * Sets the value of the cancellationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCancellationDate(XMLGregorianCalendar value) {
            this.cancellationDate = value;
        }

        /**
         * Gets the value of the settlementDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSettlementDate() {
            return settlementDate;
        }

        /**
         * Sets the value of the settlementDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSettlementDate(XMLGregorianCalendar value) {
            this.settlementDate = value;
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
         * Gets the value of the orderStatusTrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderStatusTrans() {
            return orderStatusTrans;
        }

        /**
         * Sets the value of the orderStatusTrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderStatusTrans(String value) {
            this.orderStatusTrans = value;
        }

        /**
         * Gets the value of the quantityTrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantityTrans() {
            return quantityTrans;
        }

        /**
         * Sets the value of the quantityTrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantityTrans(String value) {
            this.quantityTrans = value;
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
         * Gets the value of the sku property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSKU() {
            return sku;
        }

        /**
         * Sets the value of the sku property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSKU(String value) {
            this.sku = value;
        }

        /**
         * Gets the value of the sellingPrice property.
         * 
         */
        public double getSellingPrice() {
            return sellingPrice;
        }

        /**
         * Sets the value of the sellingPrice property.
         * 
         */
        public void setSellingPrice(double value) {
            this.sellingPrice = value;
        }

        /**
         * Gets the value of the shippingCharges property.
         * 
         */
        public double getShippingCharges() {
            return shippingCharges;
        }

        /**
         * Sets the value of the shippingCharges property.
         * 
         */
        public void setShippingCharges(double value) {
            this.shippingCharges = value;
        }

        /**
         * Gets the value of the totalInvoiceAmount property.
         * 
         */
        public double getTotalInvoiceAmount() {
            return totalInvoiceAmount;
        }

        /**
         * Sets the value of the totalInvoiceAmount property.
         * 
         */
        public void setTotalInvoiceAmount(double value) {
            this.totalInvoiceAmount = value;
        }

        /**
         * Gets the value of the settlementRefNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSettlementRefNo() {
            return settlementRefNo;
        }

        /**
         * Sets the value of the settlementRefNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSettlementRefNo(String value) {
            this.settlementRefNo = value;
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
         * Gets the value of the orderPricing property.
         * 
         * @return
         *     possible object is
         *     {@link FlipkartPricing }
         *     
         */
        public FlipkartPricing getOrderPricing() {
            return orderPricing;
        }

        /**
         * Sets the value of the orderPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlipkartPricing }
         *     
         */
        public void setOrderPricing(FlipkartPricing value) {
            this.orderPricing = value;
        }

    }

}
