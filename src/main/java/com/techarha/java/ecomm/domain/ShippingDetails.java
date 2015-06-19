package com.techarha.java.ecomm.domain;

import com.techarha.java.ecomm.pojo.Size;
import com.techarha.java.ecomm.pojo.Weight;

/**
 * Created by ankit on 29/03/15.
 */
public class ShippingDetails {
    private Long productID;
    private Long itemID;
    private Size size;
    private Weight weight;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}
