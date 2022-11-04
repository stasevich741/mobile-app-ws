package com.example.mobileappws.ui.model.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class UserLoginRequestModel {
    String email;
    String password;
}
