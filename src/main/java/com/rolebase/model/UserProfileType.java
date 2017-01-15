package com.rolebase.model;

import java.io.Serializable;

/**
 * Created by dorsa on 1/15/17.
 */
public enum UserProfileType implements Serializable {
    USER("USER"),
    SELLER("SELLER"),
    ADMIN("ADMIN");

    String userProfileType;

    private UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }
}
