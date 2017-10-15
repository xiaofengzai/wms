package com.ens.service.account;

import com.ens.dao.UserDao;
import com.ens.domain.User;
import com.ens.exception.BusinessException;
import com.ens.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fengwen on 10/14/17.
 */
@Service
public class UserService extends BaseService{
    @Autowired
    private UserDao userDao;
    public void modifyPassword(String oldPassword,String newPassword){
        User loginUser=getUser();
        if(!loginUser.getPassword().equals(oldPassword))
            throw new BusinessException("旧密码不正确");
         loginUser.setPassword(newPassword);
        userDao.updatePassword(loginUser);
    }
}
