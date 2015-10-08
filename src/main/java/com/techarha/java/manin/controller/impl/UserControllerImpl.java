package com.techarha.java.manin.controller.impl;

import com.techarha.java.manin.controller.UserController;
import com.techarha.java.manin.exceptions.UserValidationException;
import com.techarha.java.manin.request.AddUserRequest;
import com.techarha.java.manin.request.GetUserDetailsRequest;
import com.techarha.java.manin.request.RemoveUserRequest;
import com.techarha.java.manin.request.UpdateUserDetailsRequest;
import com.techarha.java.manin.response.*;
import com.techarha.java.manin.validator.UserValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ankit on 04/10/15.
 */
@Component("userManagerController")
public class UserControllerImpl implements UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    @Qualifier("userValidator")
    private UserValidator userValidator;


    @Override
    public AddUserResponse addUser(AddUserRequest adduserrequest) {
        logger.info("Initiating Process To add user to the system.");
        try {
            // validate the user request, including data type validation and and controller validation
            logger.info("Validating addUserRequest");
            boolean isValid = userValidator.validateUserRequest(adduserrequest);


            //transfer data to controller layer for applying required controller logic, which will then add the data to DB
            if(isValid){

            }
            //

        } catch (UserValidationException e) {
            e.printStackTrace();
        }

        return null;
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
}
