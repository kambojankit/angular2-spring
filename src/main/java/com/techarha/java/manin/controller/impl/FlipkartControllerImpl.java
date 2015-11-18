package com.techarha.java.manin.controller.impl;

import com.techarha.java.manin.business.FlipkartPaymentsManager;
import com.techarha.java.manin.controller.FlipkartController;
import com.techarha.java.manin.response.FlipkartOrdersResponse;
import com.techarha.java.manin.response.FlipkartPaymentsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ankit on 18/11/15.
 */
@Component("flipkartController")
public class FlipkartControllerImpl implements FlipkartController {

    @Autowired
    @Qualifier("flipkartPaymentsManager")
    private FlipkartPaymentsManager flipkartPaymentsManager;

    @Override
    public FlipkartPaymentsResponse getPaymentDetails() {
        return flipkartPaymentsManager.getPaymentDetails();
    }

    @Override
    public FlipkartOrdersResponse getOrderDetails() {
        return flipkartPaymentsManager.getOrderDetails();
    }
}
