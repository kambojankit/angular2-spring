
package com.techarha.java.manin.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="skuCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellingPricePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="shippingChargePerItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invoiceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="shipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderData", namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", propOrder = {
    "orderId",
    "orderType",
    "skuCode",
    "orderState",
    "sellingPricePerItem",
    "shippingChargePerItem",
    "quantity",
    "totalAmount",
    "invoiceNo",
    "invoiceAmount",
    "invoiceDate",
    "shipmentStatus"
})
public class OrderData {

    @XmlElement(required = true)
    protected String orderId;
    @XmlElement(required = true)
    protected String orderType;
    @XmlElement(required = true)
    protected String skuCode;
    @XmlElement(required = true)
    protected String orderState;
    protected double sellingPricePerItem;
    protected double shippingChargePerItem;
    protected int quantity;
    protected double totalAmount;
    @XmlElement(required = true)
    protected String invoiceNo;
    protected double invoiceAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(required = true)
    protected String shipmentStatus;

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

}
