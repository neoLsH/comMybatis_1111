package com.hls.test;

import com.hls.dao.UserMapper;
import com.hls.pojo.User;
import com.hls.util.MybatisUtil;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class UserTest {

    @Test
    public void test(){
        //第一步，获得SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try{
            //执行SQl   方式一：getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            for (User user :
                    userList) {
                System.out.println(user);
            }

        }finally {
            //关闭SqlSession对象
            sqlSession.close();
        }
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userById = mapper.getUserById(1);

        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void AddUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Date date = new Date();
        User user = new User("黄乐枢123","13","广东省",date.toString());
        mapper.addUser(user);
        //提交事物
        sqlSession.commit();
        //关闭连接
        sqlSession.close();
    }

    @Test
    public void Update(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Date date = new Date();
        User user = new User(1,"huangleshu","12222","中山市吗",date.toString());
        mapper.Update(user);
        sqlSession.commit();
        sqlSession.close();
    }

}
