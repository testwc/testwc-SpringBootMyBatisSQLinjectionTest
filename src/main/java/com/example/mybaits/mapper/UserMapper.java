package com.example.mybaits.mapper;

import com.example.mybaits.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper//这是一个操作数据库的mapper
public interface UserMapper {
    public List<User> allUser();
}
