package com.techarha.java.ecomm.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by ankit on 29/03/15.
 */
@Component
public class MyDatabase {
    private String dbName;

    public MyDatabase(String dbName){
        this.dbName = dbName;
    }

    public String getDbName() {
        return dbName;
    }
}
