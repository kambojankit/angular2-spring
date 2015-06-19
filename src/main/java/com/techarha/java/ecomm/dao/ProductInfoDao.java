package com.techarha.java.ecomm.dao;

import com.techarha.java.ecomm.domain.ProductInfo;

import java.util.List;

/**
 * Created by ankit on 29/03/15.
 */
public interface ProductInfoDao {

    public void insertProductInfo(ProductInfo productInfo);

    public ProductInfo getProductInfo(Long id);

    public List<ProductInfo> getProductInfoList();

    public void updateProductInfo(ProductInfo productInfo);

}
