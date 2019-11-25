package com.hls.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Shu
 * @date 2019-11-19
 * */

//sqlSessionFactory --->sqlSession
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        //获取sqlsessionfactory对象
        try {
            String resource = "MyBatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static SqlSession getSqlSession(){
        /*省略了SqlSession对象的建立*/
        /*SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;

        SqlSession 完全包含了面向数据库执行 SQL 命令所需要的方法

        */
        return sqlSessionFactory.openSession();

    }

}
