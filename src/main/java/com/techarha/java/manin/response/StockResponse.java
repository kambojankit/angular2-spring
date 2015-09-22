
package com.techarha.java.manin.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.techarha.java.manin.model.UID;


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
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/manin/Product}UID"/>
 *         &lt;element name="updatedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "uid",
    "updatedQuantity"
})
@XmlRootElement(name = "stockResponse", namespace = "http://www.techarha.com/schema/xsd/manin/InventoryResponse")
public class StockResponse {

    @XmlElement(name = "UID", namespace = "http://www.techarha.com/schema/xsd/manin/Product", required = true)
    protected UID uid;
    @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/InventoryResponse")
    protected int updatedQuantity;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link UID }
     *     
     */
    public UID getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UID }
     *     
     */
    public void setUID(UID value) {
        this.uid = value;
    }

    /**
     * Gets the value of the updatedQuantity property.
     * 
     */
    public int getUpdatedQuantity() {
        return updatedQuantity;
    }

    /**
     * Sets the value of the updatedQuantity property.
     * 
     */
    public void setUpdatedQuantity(int value) {
        this.updatedQuantity = value;
    }

}
