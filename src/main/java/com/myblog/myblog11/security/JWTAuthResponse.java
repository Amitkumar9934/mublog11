package com.myblog.myblog11.security;

import com.myblog.myblog11.entity.Role;

import java.util.Set;

public class JWTAuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";

public JWTAuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }
}

