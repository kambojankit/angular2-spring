/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.techarha.java.manin.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.techarha.java.manin.request.AddProductDetailsRequest;
import com.techarha.java.manin.request.AddVariantDetailsRequest;
import com.techarha.java.manin.request.GetProductDetailsRequest;
import com.techarha.java.manin.request.UpdateProductDetailsRequest;
import com.techarha.java.manin.request.UpdateVariantDetailsRequest;
import com.techarha.java.manin.response.AddProductDetailsResponse;
import com.techarha.java.manin.response.AddVariantDetailsResponse;
import com.techarha.java.manin.response.GetProductDetailsResponse;
import com.techarha.java.manin.response.PingResponse;
import com.techarha.java.manin.response.UpdateProductDetailsResponse;
import com.techarha.java.manin.response.UpdateVariantDetailsResponse;

@Path("/ManageProduct")
public interface ManageProductsService {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/addProductDetails")
    AddProductDetailsResponse addProductDetails(AddProductDetailsRequest addproductdetailsrequest);

    @POST
    @Produces("application/json")
    @Path("/addProductDetailsP")
    AddProductDetailsRequest addProductDetailsP();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/addVariantDetails")
    AddVariantDetailsResponse addVariantDetails(AddVariantDetailsRequest addvariantdetailsrequest);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/getProductDetails")
    GetProductDetailsResponse getProductDetails(GetProductDetailsRequest getproductdetailsrequest);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/getVariantDetails")
    AddVariantDetailsResponse getVariantDetails(AddVariantDetailsRequest addvariantdetailsrequest);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/updateProductDetails")
    UpdateProductDetailsResponse updateProductDetails(UpdateProductDetailsRequest updateproductdetailsrequest);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/updateVariantDetails")
    UpdateVariantDetailsResponse updateVariantDetails(UpdateVariantDetailsRequest updatevariantdetailsrequest);

    @GET
    @Produces("application/json")
    @Path("/ping")
    PingResponse ping();

}