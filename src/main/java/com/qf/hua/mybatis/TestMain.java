package com.qf.hua.mybatis;

import com.qf.hua.mybatis.entity.Test;
import com.qf.hua.mybatis.entity.User;
import com.qf.hua.mybatis.mapper.TestInsertMapper;
import com.qf.hua.mybatis.mapper.TestSelectMapper;
import com.qf.hua.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        //工厂模式的建造者模式
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(
                        TestMain.class.getClassLoader()
                                .getResourceAsStream(
                                        "mybatis-config.xml")
        );

        //原生mybatis默认为false;
        //true为自动提交事务 ,false则相反(用于是否开启事务,默认为true)
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //加载配置文件得到sqlSessionFactory的工具类
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //先存数据进User对象，再测试方法
        /*User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        int insert = mapper.insert(user);
        System.out.println(insert);*/

//        User user = mapper.selectById(1);
//        System.out.println(user);

        /*TestSelectMapper mapper1 = sqlSession.getMapper(TestSelectMapper.class);
        Test test = mapper1.selectById(2);
        List<Test> tests = mapper1.selectList(0, 10);
        System.out.println(test);
        tests.forEach(test1 -> {
            System.out.println(test1.getId());
        });*/

        TestInsertMapper mapper = sqlSession.getMapper(TestInsertMapper.class);
        Test test = new Test();
        test.setName("test1");
        int insert = mapper.insert(test);
        if (insert > 0){
            System.out.println("添加成功");
            System.out.println(test.getId());
        }else {
            System.out.println("添加失败");
        }
    }
}
