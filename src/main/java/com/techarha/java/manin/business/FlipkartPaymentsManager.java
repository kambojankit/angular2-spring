package com.techarha.java.manin.business;

import com.techarha.java.manin.response.FlipkartOrdersResponse;
import com.techarha.java.manin.response.FlipkartPaymentsResponse;
import com.techarha.java.manin.response.FlipkartSettlements;
import org.springframework.stereotype.Component;

/**
 * Created by ankit on 18/11/15.
 */
public interface FlipkartPaymentsManager {

    FlipkartPaymentsResponse getPaymentDetails();

    FlipkartOrdersResponse getOrderDetails();

    FlipkartSettlements getSettlementData();
}
