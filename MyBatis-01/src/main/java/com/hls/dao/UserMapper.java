package com.hls.dao;

import com.hls.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    List<User> getUserById(int id);
    //insert一个用户
    int addUser(User user);
    //修改用户
    int Update(User user);
}
