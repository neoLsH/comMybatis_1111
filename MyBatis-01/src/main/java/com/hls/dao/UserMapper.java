package com.hls.dao;

import com.hls.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserLike(String value);

    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    List<User> getUserById(int id);
    //insert一个用户
    int addUser(User user);
    //修改用户
    int Update(User user);
    //删除用户
    int delete(int id);
    //通过Map锁定Id和Name从而获取对应条件的用户
    User getUserByIdAndname(Map<String,Object> map);
    //通过Map锁定对象的Id
    User getUserByIdMap(Map<String,Object> map);
}
