package com.example.mobileappws.ui.model.responce;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRest {

    String userId;
    String firstName;
    String lastName;
    String email;
}
