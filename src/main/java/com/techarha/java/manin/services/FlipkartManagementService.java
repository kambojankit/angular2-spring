/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.techarha.java.manin.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.techarha.java.manin.response.FlipkartOrdersResponse;
import com.techarha.java.manin.response.FlipkartPaymentsResponse;
import com.techarha.java.manin.response.PingUserResponse;

@Path("/ManageFlipkart")
public interface FlipkartManagementService {

    @GET
    @Produces("application/json")
    @Path("/getPayments")
    FlipkartPaymentsResponse getPaymentsDetails();

    @GET
    @Produces("application/json")
    @Path("/getOrders")
    FlipkartOrdersResponse getOrderDetails();

    @GET
    @Produces("application/json")
    @Path("/pingFlipUser")
    PingUserResponse pingFlipUser();

}