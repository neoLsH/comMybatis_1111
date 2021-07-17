package com.hls.test;

import com.hls.dao.UserMapper;
import com.hls.pojo.User;
import com.hls.util.MybatisUtil;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.*;

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
//        int i = input.nextInt();
//        System.out.println(i);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userById = mapper.getUserById(1);

        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void AddUser(){
//        System.out.println("请输入年龄：");
//        String ago = input.next();
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Date date = new Date();
//        String ago1 = "123";
        Double d = Math.random();
        Double aDouble = ((d + 1) * 1000);
        aDouble = Double.valueOf(aDouble.hashCode());
        User user = new User("123","123","广东省",date.toString());
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

    @Test
    public void delete(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(2);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectMember(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        //通过mapper找到map的key然后匹配value
        objectObjectHashMap.put("id",1);
        objectObjectHashMap.put("name","");
        User userByIdAndname = mapper.getUserByIdAndname(objectObjectHashMap);
        System.out.println(userByIdAndname);
        sqlSession.close();
    }

    @Test
    public void GetUserByMapId(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("UserId","6");
        System.out.println(mapper.getUserByIdMap(hashMap));
        sqlSession.close();
    }
    @Test
    public void testWhere(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println("请输入编号：");
        Scanner input = new Scanner(System.in);
        int Scan = input.nextInt();
        List<User> userById = mapper.getUserById(Scan);
        System.out.println(Scan);
        for (User temp:
             userById) {
            System.out.println(temp.toString());
        }

    }




}

