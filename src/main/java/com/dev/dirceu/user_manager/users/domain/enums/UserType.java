package com.dev.dirceu.user_manager.users.domain.enums;

public enum UserType {
    PERSON("PERSON"),
    BUSINESS("BUSINESS");

    private final String userType;

    UserType(String userType){
        this.userType = userType;
    }
}
