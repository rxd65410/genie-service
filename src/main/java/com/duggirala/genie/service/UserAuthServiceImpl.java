package com.duggirala.genie.service;

import com.duggirala.genie.model.UserAuth;
import com.duggirala.genie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by raviteja on 7/16/17.
 */
@Service("userDetailsService")
public class UserAuthServiceImpl implements UserAuthService {
    private final UserRepository userRepository;

    @Autowired
    public UserAuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user = userRepository.findOneByName(s);
        return user;
    }

    @Override
    public UserAuth createUser(UserAuth user) {
        String password = user.getPassword();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(password));
        return userRepository.save(user);
    }

    @Override
    public UserAuth findOne(String userId) {
        return userRepository.findOne(userId);
    }
}
