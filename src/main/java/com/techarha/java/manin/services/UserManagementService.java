/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.techarha.java.manin.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.techarha.java.manin.request.AddUserRequest;
import com.techarha.java.manin.request.GetUserDetailsRequest;
import com.techarha.java.manin.request.RemoveUserRequest;
import com.techarha.java.manin.request.UpdateUserDetailsRequest;
import com.techarha.java.manin.response.AddUserResponse;
import com.techarha.java.manin.response.GetAllUsersResponse;
import com.techarha.java.manin.response.GetUserDetailsResponse;
import com.techarha.java.manin.response.PingUserResponse;
import com.techarha.java.manin.response.RemoveUserResponse;
import com.techarha.java.manin.response.UpdateUserDetailsResponse;

@Path("/ManageUser")
public interface UserManagementService {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/addUser")
    AddUserResponse addUser(AddUserRequest adduserrequest);

    @POST
    @Produces("application/json")
    @Path("/getAllUsers")
    GetAllUsersResponse getAllUsers();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/getUserDetails")
    GetUserDetailsResponse getUserDetails(GetUserDetailsRequest getuserdetailsrequest);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/updateUserDetails")
    UpdateUserDetailsResponse updateUserDetails(UpdateUserDetailsRequest updateuserdetailsrequest);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/removeUser")
    RemoveUserResponse removeUser(RemoveUserRequest removeuserrequest);

    @GET
    @Produces("application/json")
    @Path("/pingUser")
    PingUserResponse pingUser();

}