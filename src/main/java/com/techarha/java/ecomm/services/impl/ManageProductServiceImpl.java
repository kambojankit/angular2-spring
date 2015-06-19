package com.techarha.java.ecomm.services.impl;

import com.techarha.java.ecomm.model.*;
import com.techarha.java.ecomm.model.common.CapacityType;
import com.techarha.java.ecomm.model.common.SizeType;
import com.techarha.java.ecomm.model.common.WeightType;
import com.techarha.java.ecomm.request.*;
import com.techarha.java.ecomm.response.*;
import com.techarha.java.ecomm.services.ManageProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ankit on 13/04/15.
 */
public class ManageProductServiceImpl implements ManageProductsService{

    public static final Logger LOG = LoggerFactory.getLogger("ManageProductServiceImpl");

    @Override
    public AddProductDetailsResponse addProductDetails(AddProductDetailsRequest addProductDetailsRequest) {
        LOG.info("Adding Products to the catalog");

        //Data Validation

        //Map Request object to Representative Object using Dozer.

        //Fire the respective Business Method.

        AddProductDetailsResponse addProductDetailsResponse = new AddProductDetailsResponse();
        addProductDetailsRequest.setProduct(addProductDetailsRequest.getProduct());
        addProductDetailsRequest.setUserID("1234");
        return addProductDetailsResponse;
    }

    @Override
    public AddProductDetailsRequest addProductDetailsP() {
        AddProductDetailsRequest request = new AddProductDetailsRequest();
        request.setUserID("test");

        Product product = new Product();

        ProductDetailsType detailsType = new ProductDetailsType();
        detailsType.setBrand("testBrand");
        CapacityType capacityType = new CapacityType();
        capacityType.setValue(3);
        capacityType.setMetrics("c-cm");
        detailsType.setCapacity(capacityType);
        detailsType.setCharacters("TestCharacters");
        detailsType.setColor("testColor");
        detailsType.setGender("male");
        detailsType.setImageURI("test.com");
        detailsType.setMaterial("polyster");
        detailsType.setQuantityInStock("2");
        detailsType.setThumbnailURI("test.com");
        detailsType.setType("testType");
        SizeType sizeType = new SizeType();
        sizeType.setMetrics("in");
        sizeType.setLength(11);
        sizeType.setHeight(12);
        sizeType.setWidth(14);
        detailsType.setSize(sizeType);
        WeightType weightType = new WeightType();
        weightType.setMetrics("kg");
        weightType.setValue(1);
        detailsType.setWeight(weightType);
        product.setProductDetailsType(detailsType);


        ProductInfoType infoType = new ProductInfoType();
        infoType.setDescription("Test Description");
        infoType.setShortDescription("test desc");
        infoType.setProductName("Test Name");
        infoType.setProductTitle("Test Title");
        infoType.setRatings("5");
        product.setProductInfoType(infoType);

        ProductInventoryType inventoryType = new ProductInventoryType();
        inventoryType.setQuantity("3");
        product.setProductInventoryType(inventoryType);

        VendorDetailsType vendorDetailsType = new VendorDetailsType();
        vendorDetailsType.setVendorID("12345");
        vendorDetailsType.setVendorSPUC("12345");
        vendorDetailsType.setVendorSUK("234");

        product.setVendorDetailsType(vendorDetailsType);

        //Product Category
        ProductCategoryType categoryType = new ProductCategoryType();
        categoryType.setCategory("TestCat");
        categoryType.setDepartment("TestDepart");
        product.setProductCategoryType(categoryType);

        request.setProduct(product);
        return  request;
    }

    @Override
    public AddVariantDetailsResponse addVariantDetails(AddVariantDetailsRequest addVariantDetailsRequest) {
        LOG.info("addVariantDetails");
        return null;
    }

    @Override
    public GetProductDetailsResponse getProductDetails(GetProductDetailsRequest getProductDetailsRequest) {
        return null;
    }

    @Override
    public AddVariantDetailsResponse getVariantDetails(AddVariantDetailsRequest addVariantDetailsRequest) {
        return null;
    }

    @Override
    public UpdateProductDetailsResponse updateProductDetails(UpdateProductDetailsRequest updateProductDetailsRequest) {
        return null;
    }

    @Override
    public UpdateVariantDetailsResponse updateVariantDetails(UpdateVariantDetailsRequest updateVariantDetailsRequest) {
        return null;
    }

    @Override
    public PingResponse ping() {
        PingResponse pingResponse = new PingResponse();
        pingResponse.setResult("Successful");
        return pingResponse;
    }
}
