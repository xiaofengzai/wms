package com.ens.controller;

import com.ens.commom.InvokeResult;
import com.ens.domain.User;
import com.ens.service.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * Created by fengwen on 10/14/17.
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected User getUser() {
        return AuthenticationService.getUser();
    }
    protected InvokeResult ValidateFailResult(BindingResult result) {
        FieldError fieldError = result.getFieldErrors().get(0);
        return InvokeResult.Fail(fieldError.isBindingFailure() ? fieldError.getField() + "参数类型错误！" : fieldError.getDefaultMessage(), 100);
    }
}
