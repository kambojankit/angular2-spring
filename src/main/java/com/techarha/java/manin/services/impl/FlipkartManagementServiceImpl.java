package com.techarha.java.manin.services.impl;

import com.techarha.java.manin.controller.FlipkartController;
import com.techarha.java.manin.response.FlipkartOrdersResponse;
import com.techarha.java.manin.response.FlipkartPaymentsResponse;
import com.techarha.java.manin.response.FlipkartSettlements;
import com.techarha.java.manin.response.PingUserResponse;
import com.techarha.java.manin.services.FlipkartManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ankit on 15/11/15.
 */
public class FlipkartManagementServiceImpl implements FlipkartManagementService {

    @Autowired
    @Qualifier("flipkartController")
    private FlipkartController flipkartController;

    @Override
    public FlipkartPaymentsResponse getPaymentsDetails() {

        return flipkartController.getPaymentDetails();
    }

    @Override
    public FlipkartSettlements getSettlementsData() {
        return flipkartController.getSettlementData();
    }

    @Override
    public FlipkartOrdersResponse getOrderDetails() {
        return flipkartController.getOrderDetails();
    }

    @Override
    public PingUserResponse pingFlipUser() {
        PingUserResponse response = new PingUserResponse();
        response.setResult("Success");
        return response;
    }
}
