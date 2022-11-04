package com.example.mobileappws.security;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppProperties {

    @Autowired
    Environment environment;

    public String getTokenSecret() {
        return environment.getProperty("tokenSecret");
    }
}
