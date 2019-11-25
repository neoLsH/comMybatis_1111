package com.hls.test;

import com.hls.dao.UserDao;
import com.hls.pojo.User;
import com.hls.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {

    @Test
    public void test(){
        //第一步，获得SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //执行SQl   方式一：getMapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for (User user :
                userList) {
            System.out.println(user);
        }

        //关闭SqlSession对象
        sqlSession.close();
    }
}
