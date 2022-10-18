package com.example.mobileappws.shared.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class UserDto implements Serializable {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    static final long serialVersionUiD = 777L;

    long id;
    String userId;
    String firstName;
    String lastName;
    String email;
    String password;
    String encryptedPassword;
    String emailVerificationToken;
    boolean emailVerificationStatus = false;
//    List<AddressDTO> addresses;
}
