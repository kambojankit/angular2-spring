package com.techarha.java.manin.controller;

import com.techarha.java.manin.request.AddUserRequest;
import com.techarha.java.manin.request.GetUserDetailsRequest;
import com.techarha.java.manin.request.RemoveUserRequest;
import com.techarha.java.manin.request.UpdateUserDetailsRequest;
import com.techarha.java.manin.response.*;

/**
 * Created by ankit on 04/10/15.
 */
public interface UserController {

    AddUserResponse addUser(AddUserRequest adduserrequest);

    GetAllUsersResponse getAllUsers();

    GetUserDetailsResponse getUserDetails(GetUserDetailsRequest getuserdetailsrequest);

    UpdateUserDetailsResponse updateUserDetails(UpdateUserDetailsRequest updateuserdetailsrequest);

    RemoveUserResponse removeUser(RemoveUserRequest removeuserrequest);
}
