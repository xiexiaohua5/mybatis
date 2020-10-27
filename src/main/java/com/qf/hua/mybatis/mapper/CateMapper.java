package com.qf.hua.mybatis.mapper;


import com.qf.hua.mybatis.entity.Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CateMapper {
    List<Cate> selectList();
    int insert(@Param("cate") Cate cate);
}
