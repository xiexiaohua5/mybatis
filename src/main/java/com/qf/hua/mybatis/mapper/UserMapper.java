package com.qf.hua.mybatis.mapper;

import com.qf.hua.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(@Param("user") User user);

    User selectById(@Param("userId") int UserId);
}
