package com.aribanilia.oauth.service;

import com.aribanilia.oauth.entity.User;
import com.aribanilia.oauth.entity.UserAuthority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by ivan_j4u on 5/31/2017.
 */
public class CustomUserDetailServices implements UserDetailsService {

    @Autowired private UserServices servicesUser;
    @Autowired private UserAuthorityServices servicesUserAuthor;
    @Autowired private AuthorityServices servicesAuthority;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        // Find User by userId
        User user = servicesUser.getByUserId(userId);
        if (user == null) {
            throw new UsernameNotFoundException(userId);
        } else {
            // Find User Authorities
        }


        return null;
    }
}
