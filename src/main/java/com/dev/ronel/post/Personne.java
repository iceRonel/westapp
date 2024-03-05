package com.dev.ronel.post;

import org.springframework.util.ObjectUtils;

public class Personne {

    private String name;
    private String firstName;

    private String email;


    Personne sample(){
        name = ObjectUtils.nullSafeToString("name");
        firstName = ObjectUtils.nullSafeToString("firstname");
        email =ObjectUtils.nullSafeToString("email");
        return this;
    }
}
