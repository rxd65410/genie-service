package com.duggirala.genie.controller;


import com.duggirala.genie.model.UserAuth;
import com.duggirala.genie.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * Created by raviteja on 7/16/17.
 */
@RestController
public class UserController {
    private final UserAuthService userAuthService;

    @Autowired
    public UserController(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    @RequestMapping(value = "/user/create/", method = POST,
            consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<UserAuth> createRide(@Valid @RequestBody UserAuth user) {
        UserAuth createdUser = userAuthService.createUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdUser);
    }

    @RequestMapping(value = "/user/{userId}",method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<UserAuth> getRideByPostId(@PathVariable String userId){
        UserAuth user = userAuthService.findOne(userId);
        if(user==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(user);
        }
        return ResponseEntity.ok(user);
    }
}
