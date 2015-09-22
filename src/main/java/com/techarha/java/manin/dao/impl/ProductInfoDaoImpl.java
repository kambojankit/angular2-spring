package com.techarha.java.manin.dao.impl;

import com.techarha.java.manin.dao.ProductInfoDao;
import com.techarha.java.manin.domain.ProductInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ankit on 29/03/15.
 */
@Component("productInfoDao")
public class ProductInfoDaoImpl implements ProductInfoDao {

//    @Autowired
//    MongoClient mongoClient;

//    @Autowired
//    private MyDatabase database;

    @Override
    public void insertProductInfo(ProductInfo productInfo) {
//        DB myDB = mongoClient.getDB(database.getDbName());
//        DBCollection myCollection = myDB.getCollection("product");
//
//        BasicDBObject size = new BasicDBObject();
//        size.put("length",productInfo.getSize().getLength());
//        size.put("width",productInfo.getSize().getWidth());
//        size.put("height",productInfo.getSize().getHeight());
//
//        BasicDBObject weight = new BasicDBObject();
//        weight.put("value",productInfo.getWeight().getValue());
//        weight.put("metrics",productInfo.getWeight().getMetrics());
//
//        BasicDBObject productInfoDoc = new BasicDBObject();
//        productInfoDoc.put("_id", productInfo.getProductID());
//        productInfoDoc.put("itemID", productInfo.getItemID());
//        productInfoDoc.put("title", productInfo.getTitle());
//        productInfoDoc.put("description", productInfo.getDescription());
//        productInfoDoc.put("shortDescription", productInfo.getShortDescription());
//        productInfoDoc.put("color", productInfo.getColor());
//
//        productInfoDoc.put("size", size);
//        productInfoDoc.put("weight", weight);
//
//        productInfoDoc.put("department", productInfo.getDepartment());
//        productInfoDoc.put("category", productInfo.getCategory());
//        productInfoDoc.put("brand", productInfo.getBrand());
//        productInfoDoc.put("thumbnailURI", productInfo.getThumbnailURI());
//        productInfoDoc.put("imageURI", productInfo.getImageURI());
//        productInfoDoc.put("type", productInfo.getType());
//        productInfoDoc.put("ratings", productInfo.getRatings());
//
//        productInfoDoc.put("createdAt", productInfo.getCreateAt());
//        productInfoDoc.put("createBy", productInfo.getCreatedBy());
//        productInfoDoc.put("updatedAt", productInfo.getUpdatedAt());
//        productInfoDoc.put("updatedBy", productInfo.getUpdatedBy());
//
//        myCollection.insert(productInfoDoc);
    }

    @Override
    public ProductInfo getProductInfo(Long id) {

        return null;
    }

    @Override
    public List<ProductInfo> getProductInfoList() {
        return null;
    }

    @Override
    public void updateProductInfo(ProductInfo productInfo) {

    }
}
