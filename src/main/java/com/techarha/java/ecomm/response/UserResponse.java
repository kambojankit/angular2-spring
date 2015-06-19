package com.techarha.java.ecomm.response;

import com.techarha.java.ecomm.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankit on 28/03/15.
 */
public class UserResponse {
    private List<User> users;
    private String message;
    private String code;
    private Boolean isSuccess;

    public UserResponse() {
        this.users = new ArrayList<User>(0);
    }

    public List<User> getUsers() {
        return users;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
