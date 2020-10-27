package com.qf.hua.mybatis.mapper;

import com.qf.hua.mybatis.entity.Test;
import org.apache.ibatis.annotations.Param;

/*
* 增删改永远返回影响的行数
* */
public interface TestInsertMapper {
    /**
     * 对应持久化的对象
     * @param test
     * @return
     */
    int insert(@Param("test") Test test/*, @Param("id") int id*/);

}
