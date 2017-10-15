package com.ens.service;

import com.ens.domain.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * Created by fengwen on 10/14/17.
 */
@Service
public class AuthenticationService {
    public static User getUser() {
        UserDetails userDetails= (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return (User)userDetails;
    }
}
