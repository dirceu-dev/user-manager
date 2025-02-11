package com.dev.dirceu.user_manager.users.domain.enums;

import lombok.Getter;

@Getter
public enum Profile {
    USER("USER"),
    ADMIN("ADMIN"),
    MANAGER("MANAGER");

    private final String profile;

    Profile(String profile){
        this.profile = profile;
    }
}
