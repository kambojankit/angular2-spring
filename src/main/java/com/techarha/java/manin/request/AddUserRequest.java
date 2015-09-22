
package com.techarha.java.manin.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.techarha.java.manin.model.common.BasicUserType;


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
 *         &lt;element name="user" type="{http://www.techarha.com/schema/xsd/common/CommonTypes}BasicUserType"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "user",
    "type"
})
@XmlRootElement(name = "addUserRequest", namespace = "http://www.techarha.com/schema/xsd/manin/UserRequest")
public class AddUserRequest {

    @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/UserRequest", required = true)
    protected BasicUserType user;
    @XmlElement(namespace = "http://www.techarha.com/schema/xsd/manin/UserRequest", required = true)
    protected String type;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link BasicUserType }
     *     
     */
    public BasicUserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicUserType }
     *     
     */
    public void setUser(BasicUserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
