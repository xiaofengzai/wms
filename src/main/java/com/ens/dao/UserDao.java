package com.ens.dao;

import com.ens.domain.User;


public interface UserDao {
    public User findByUserName(String username);

    public void updatePassword(User user);

    public User findById(String id);
}
