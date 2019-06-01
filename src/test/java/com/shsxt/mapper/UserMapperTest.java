package com.shsxt.mapper;

import com.shsxt.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/5/31.
 */
public class UserMapperTest {
    
    private UserMapper userMapper;
    
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    
    @Test
    public void queryUserByName() throws Exception {
        List<User> userList =userMapper.queryUserByName(null);
        //System.out.println(userList);
        userList.stream().forEach(System.out::println);
    }

    @Test
    public void queryUserByNation() throws Exception {
        List<User> userList =userMapper.queryUserByNation(null);
        //System.out.println(userList);
        userList.stream().forEach(System.out::println);
    }

}