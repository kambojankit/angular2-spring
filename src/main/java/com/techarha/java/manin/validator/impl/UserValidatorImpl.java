package com.techarha.java.manin.validator.impl;

import com.techarha.java.manin.request.AddUserRequest;
import com.techarha.java.manin.validator.UserValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by ankit on 04/10/15.
 */
@Component("userValidator")
public class UserValidatorImpl implements UserValidator {

    private static Logger logger = LoggerFactory.getLogger(UserValidatorImpl.class);

    @Override
    public boolean validateUserRequest(AddUserRequest adduserrequest) {
        logger.info("Validating Add User Request");
        logger.debug("> "+adduserrequest);

        return true;
    }
}
