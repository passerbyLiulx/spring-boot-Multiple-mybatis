package com.example.demo.service.impl;

import com.example.demo.dao.master.UserDao;
import com.example.demo.dao.second.SchoolDao;
import com.example.demo.mapper.second.SchoolMapper;
import com.example.demo.mapper.master.UserMapper;
import com.example.demo.model.SchoolModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public UserModel getUserById(Integer id) {
        UserDao userDao = userMapper.getUserById(id);
        SchoolDao schoolDao = schoolMapper.getSchoolById(userDao.getSchoolId());
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDao, userModel);
        SchoolModel schoolModel = new SchoolModel();
        BeanUtils.copyProperties(schoolDao, schoolModel);
        userModel.setSchoolModel(schoolModel);
        return userModel;
    }
}
