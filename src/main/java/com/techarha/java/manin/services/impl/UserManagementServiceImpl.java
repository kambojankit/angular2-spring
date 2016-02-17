package com.techarha.java.manin.services.impl;

import com.techarha.java.manin.controller.UserController;
import com.techarha.java.manin.request.AddUserRequest;
import com.techarha.java.manin.request.GetUserDetailsRequest;
import com.techarha.java.manin.request.RemoveUserRequest;
import com.techarha.java.manin.request.UpdateUserDetailsRequest;
import com.techarha.java.manin.response.*;
import com.techarha.java.manin.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ankit on 23/09/15.
 */
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    @Qualifier("userManagerController")
    private UserController userController;

    @Override
    public AddUserResponse addUser(AddUserRequest addUserRequest) {
        //This layer should be responsible for forwarding the request to UserManagementController
        return userController.addUser(addUserRequest);
    }

    @Override
    public GetAllUsersResponse getAllUsers() {

        return null;
    }

    @Override
    public GetUserDetailsResponse getUserDetails(GetUserDetailsRequest getuserdetailsrequest) {
        return null;
    }

    @Override
    public UpdateUserDetailsResponse updateUserDetails(UpdateUserDetailsRequest updateuserdetailsrequest) {
        return null;
    }

    @Override
    public RemoveUserResponse removeUser(RemoveUserRequest removeuserrequest) {
        return null;
    }

    @Override
    public PingUserResponse pingUser() {
        PingUserResponse response = new PingUserResponse();
        response.setResult(""+ userController.addUser(null));
        return response;
    }
}
