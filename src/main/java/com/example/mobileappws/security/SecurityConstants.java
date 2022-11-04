package com.example.mobileappws.security;

import com.example.mobileappws.SpringApplicationContext;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PUBLIC, makeFinal = true)
public class SecurityConstants {
    static long EXPIRATION_TIME = 864_000_000; // 10 days
    static String TOKEN_PREFIX = "Bearer ";
    static String HEADER_STRING = "Authorization";
    static String SIGN_UP_URL = "/users";

    public static String getTokenSecret() {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }
}
