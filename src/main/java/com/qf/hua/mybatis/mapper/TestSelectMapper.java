package com.qf.hua.mybatis.mapper;

import com.qf.hua.mybatis.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestSelectMapper {
    /*
    * 一个Mapper接口对应一个数据库表的操作
    * 方法命名 一般使用SQL的关键字
    * 返回值 查询返回对应的持久化对象或者集合
    * 参数 如果参数数量太少  直接使用基本类型声明
    * 能用id尽量使用id
    * */

    Test selectById(@Param("id") Integer id);

    List<Test> selectList(@Param("page") Integer page,@Param("size") Integer size);

}
