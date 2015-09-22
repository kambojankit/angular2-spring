package com.techarha.java.manin.business.impl;

import com.techarha.java.manin.business.ManageProductCatalog;
import com.techarha.java.manin.dao.ProductInfoDao;
import com.techarha.java.manin.domain.ProductInfo;
import com.techarha.java.manin.request.ManageCatalogRequest;
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
