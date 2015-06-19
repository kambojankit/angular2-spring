package com.techarha.java.ecomm.business.impl;

import com.techarha.java.ecomm.business.ManageProductCatalog;
import com.techarha.java.ecomm.dao.ProductInfoDao;
import com.techarha.java.ecomm.domain.ProductInfo;
import com.techarha.java.ecomm.request.ManageCatalogRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ankit on 30/03/15.
 */
@Component("manageProductCatalog")
public class ManageProductCatalogImpl implements ManageProductCatalog {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public void addProduct(ManageCatalogRequest manageCatalogRequest) {
        //insert the product info
        ProductInfo productInfo = manageCatalogRequest.getProductInfo();

        productInfoDao.insertProductInfo(productInfo);
    }
}
