package com.dev.dirceu.user_manager.users.domain.enums;

import lombok.Getter;

@Getter
public enum Provider {
    APPLICATION("APPLICATION"),
    GOOGLE("GOOGLE"),
    FACEBOOK("FACEBOOK"),
    LINKEDIN("LINKEDIN");

    private final String provider;

    Provider(String provider){
        this.provider = provider;
    }
}
