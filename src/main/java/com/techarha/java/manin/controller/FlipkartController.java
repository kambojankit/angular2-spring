package com.techarha.java.manin.controller;

import com.techarha.java.manin.response.FlipkartOrdersResponse;
import com.techarha.java.manin.response.FlipkartPaymentsResponse;
import com.techarha.java.manin.response.FlipkartSettlements;

/**
 * Created by ankit on 18/11/15.
 */
public interface FlipkartController {
    FlipkartPaymentsResponse getPaymentDetails();

    FlipkartOrdersResponse getOrderDetails();

    FlipkartSettlements getSettlementData();
}
