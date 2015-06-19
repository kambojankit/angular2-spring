package com.techarha.java.ecomm.domain;

import org.joda.time.DateTime;

/**
 * Created by ankit on 29/03/15.
 */
public class Lifecycle {
    private DateTime inStockSince;

    public DateTime getInStockSince() {
        return inStockSince;
    }

    public void setInStockSince(DateTime inStockSince) {
        this.inStockSince = inStockSince;
    }
}
