package com.techarha.java.manin.exceptions;

/**
 * Created by ankit on 04/10/15.
 */
public class UserValidationException extends Exception {

    private static String messagePrefix = "User Validation Failed: ";

    public UserValidationException(String message){
        super(messagePrefix + message);
    }

    public UserValidationException(String message, Throwable cause){
        super(messagePrefix+message, cause);
    }
}
