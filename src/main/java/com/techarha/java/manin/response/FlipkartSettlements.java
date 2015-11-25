
package com.techarha.java.manin.response;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="settlements" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderData" type="{http://www.techarha.com/schema/xsd/manin/FlipkartResponse}OrderData"/>
 *                   &lt;element name="transData" type="{http://www.techarha.com/schema/xsd/manin/FlipkartResponse}TransData" maxOccurs="unbounded"/>
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
    "settlements"
})
@XmlRootElement(name = "FlipkartSettlements", namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse")
public class FlipkartSettlements {

    @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
    protected List<FlipkartSettlements.Settlements> settlements;

    /**
     * Gets the value of the settlements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlipkartSettlements.Settlements }
     * 
     * 
     */
    public List<FlipkartSettlements.Settlements> getSettlements() {
        if (settlements == null) {
            settlements = new ArrayList<FlipkartSettlements.Settlements>();
        }
        return this.settlements;
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
     *         &lt;element name="orderData" type="{http://www.techarha.com/schema/xsd/manin/FlipkartResponse}OrderData"/>
     *         &lt;element name="transData" type="{http://www.techarha.com/schema/xsd/manin/FlipkartResponse}TransData" maxOccurs="unbounded"/>
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
        "orderData",
        "transData"
    })
    public static class Settlements {

        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected OrderData orderData;
        @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/FlipkartResponse", required = true)
        protected List<TransData> transData;

        /**
         * Gets the value of the orderData property.
         * 
         * @return
         *     possible object is
         *     {@link OrderData }
         *     
         */
        public OrderData getOrderData() {
            return orderData;
        }

        /**
         * Sets the value of the orderData property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderData }
         *     
         */
        public void setOrderData(OrderData value) {
            this.orderData = value;
        }

        /**
         * Gets the value of the transData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransData }
         * 
         * 
         */
        public List<TransData> getTransData() {
            if (transData == null) {
                transData = new ArrayList<TransData>();
            }
            return this.transData;
        }

    }

}
