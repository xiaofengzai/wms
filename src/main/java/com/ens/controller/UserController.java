package com.ens.controller;

import com.ens.commom.InvokeResult;
import com.ens.service.account.UserService;
import com.ens.viewmodel.ModifyPasswordViewModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengwen on 10/14/17.
 */
@Api(value = "用戶接口")
@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController{
    @Autowired
    private UserService userService;

    @ApiOperation("修改密码")
    @PreAuthorize("permitAll")
    @RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
    public InvokeResult modifyPassword(@Validated @RequestBody ModifyPasswordViewModel viewModel, BindingResult result) {
        if (result.hasErrors())
            return ValidateFailResult(result);
        userService.modifyPassword(viewModel.getPassword(), viewModel.getNewPassword());
        return InvokeResult.SuccessResult();
    }
}
