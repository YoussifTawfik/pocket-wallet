package com.pocket.wallet.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserModel implements IBasicModel {

    private String asyncId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String category;
}