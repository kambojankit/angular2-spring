
package com.techarha.java.ecomm.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="price">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="costPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="procurementPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="maintenancePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="profitMargin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="sellingPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="maxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="markedPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="currency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="INR"/>
 *               &lt;enumeration value="GBP"/>
 *               &lt;enumeration value="USD"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "price",
    "currency"
})
@XmlRootElement(name = "PriceType")
public class PriceType {

    @XmlElement(required = true)
    protected PriceType.Price price;
    @XmlElement(required = true)
    protected String currency;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType.Price }
     *     
     */
    public PriceType.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType.Price }
     *     
     */
    public void setPrice(PriceType.Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     *         &lt;element name="costPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="procurementPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="maintenancePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="profitMargin" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="sellingPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="maxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="markedPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
        "costPrice",
        "procurementPrice",
        "maintenancePrice",
        "profitMargin",
        "sellingPrice",
        "discount",
        "maxDiscount",
        "markedPrice"
    })
    public static class Price {

        protected double costPrice;
        protected double procurementPrice;
        protected double maintenancePrice;
        protected double profitMargin;
        protected double sellingPrice;
        protected double discount;
        protected double maxDiscount;
        protected double markedPrice;

        /**
         * Gets the value of the costPrice property.
         * 
         */
        public double getCostPrice() {
            return costPrice;
        }

        /**
         * Sets the value of the costPrice property.
         * 
         */
        public void setCostPrice(double value) {
            this.costPrice = value;
        }

        /**
         * Gets the value of the procurementPrice property.
         * 
         */
        public double getProcurementPrice() {
            return procurementPrice;
        }

        /**
         * Sets the value of the procurementPrice property.
         * 
         */
        public void setProcurementPrice(double value) {
            this.procurementPrice = value;
        }

        /**
         * Gets the value of the maintenancePrice property.
         * 
         */
        public double getMaintenancePrice() {
            return maintenancePrice;
        }

        /**
         * Sets the value of the maintenancePrice property.
         * 
         */
        public void setMaintenancePrice(double value) {
            this.maintenancePrice = value;
        }

        /**
         * Gets the value of the profitMargin property.
         * 
         */
        public double getProfitMargin() {
            return profitMargin;
        }

        /**
         * Sets the value of the profitMargin property.
         * 
         */
        public void setProfitMargin(double value) {
            this.profitMargin = value;
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
         * Gets the value of the discount property.
         * 
         */
        public double getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         */
        public void setDiscount(double value) {
            this.discount = value;
        }

        /**
         * Gets the value of the maxDiscount property.
         * 
         */
        public double getMaxDiscount() {
            return maxDiscount;
        }

        /**
         * Sets the value of the maxDiscount property.
         * 
         */
        public void setMaxDiscount(double value) {
            this.maxDiscount = value;
        }

        /**
         * Gets the value of the markedPrice property.
         * 
         */
        public double getMarkedPrice() {
            return markedPrice;
        }

        /**
         * Sets the value of the markedPrice property.
         * 
         */
        public void setMarkedPrice(double value) {
            this.markedPrice = value;
        }

    }

}
