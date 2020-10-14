package com.example.demo.service;

import com.example.demo.dao.master.UserDao;
import com.example.demo.model.UserModel;

public interface UserService {

    /**
     * 获取用户
     * @param id
     * @return
     */
    public UserModel getUserById(Integer id);
}
