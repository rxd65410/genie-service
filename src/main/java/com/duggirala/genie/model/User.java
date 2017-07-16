package com.duggirala.genie.model;

import org.springframework.data.annotation.Id;

/**
 * Created by raviteja on 7/15/17.
 */
public class User {
    @Id
    String userId;
    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
