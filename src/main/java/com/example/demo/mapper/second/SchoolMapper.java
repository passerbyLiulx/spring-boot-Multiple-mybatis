package com.example.demo.mapper.second;

import com.example.demo.dao.master.UserDao;
import com.example.demo.dao.second.SchoolDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchoolMapper {

    /**
     * 查询学校
     * @param schoolId
     * @return
     */
    public SchoolDao getSchoolById(@Param(value = "schoolId") Integer schoolId);
}
