package com.duggirala.genie.service;

import com.duggirala.genie.model.UserAuth;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * Created by raviteja on 7/16/17.
 */
@Service
public interface UserAuthService extends UserDetailsService {
    //Create new user.
    UserAuth createUser(UserAuth user);
    //Find User by UserID.
    UserAuth findOne(String userId);
}
