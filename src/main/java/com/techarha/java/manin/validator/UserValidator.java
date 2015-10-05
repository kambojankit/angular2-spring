package com.techarha.java.manin.validator;

import com.techarha.java.manin.exceptions.UserValidationException;
import com.techarha.java.manin.request.AddUserRequest;

/**
 * Created by ankit on 04/10/15.
 */
public interface UserValidator {
    boolean validateUserRequest(AddUserRequest adduserrequest) throws UserValidationException;
}
