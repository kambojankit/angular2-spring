package com.techarha.java.ecomm.validator.impl;

import com.techarha.java.ecomm.domain.ProductInfo;
import com.techarha.java.ecomm.request.ManageCatalogRequest;
import com.techarha.java.ecomm.validator.ManageCatalogRequestValidator;
import org.springframework.stereotype.Component;

/**
 * Created by ankit on 30/03/15.
 */
@Component("ManageCatalogRequestValidator")
public class ManageCatalogRequestValidatorImpl implements ManageCatalogRequestValidator {

    @Override
    public boolean validateManageCatalogRequest(ManageCatalogRequest manageCatalogRequest) {
        boolean isValid = false;
        if(manageCatalogRequest!=null){
            isValid = true;
        }

        return isValid;
    }

    private boolean validateProductInfo(ProductInfo productInfo){
        boolean isValid = false;

        if(productInfo!=null){
            isValid = true;
        }else{
            isValid=false;
        }
        return  isValid;
    }
}
