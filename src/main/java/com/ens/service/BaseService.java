package com.ens.service;

import com.ens.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by fengwen on 10/14/17.
 */
@Service
public class BaseService {
    protected User getUser(){
        return AuthenticationService.getUser();
    }
}
