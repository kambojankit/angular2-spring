package com.techarha.java.manin.request;

import com.techarha.java.manin.domain.ProductInfo;

/**
 * Created by ankit on 30/03/15.
 */
public class ManageCatalogRequest {
    public ProductInfo productInfo;

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }
}
