package com.techarha.java.manin.controller;

import com.techarha.java.manin.response.FlipkartOrdersResponse;
import com.techarha.java.manin.response.FlipkartPaymentsResponse;

/**
 * Created by ankit on 18/11/15.
 */
public interface FlipkartController {
    FlipkartPaymentsResponse getPaymentDetails();

    FlipkartOrdersResponse getOrderDetails();
}
