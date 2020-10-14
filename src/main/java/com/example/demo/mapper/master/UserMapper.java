package com.example.demo.mapper.master;

import com.example.demo.dao.master.UserDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    /**
     * 查询用户集合
     * @return
     */
    public UserDao userList();

    /**
     * 查询用户
     * @param userId
     * @return
     */
    public UserDao getUserById(@Param(value = "userId") Integer userId);
}
