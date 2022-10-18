package com.example.mobileappws.ui.model.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

//@Data
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDetailsRequestModel {

    String firstName;
    String lastName;
    String email;
    String password;
}
