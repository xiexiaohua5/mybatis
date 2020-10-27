package com.qf.hua.mybatis.mapper;

import com.qf.hua.mybatis.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    List<Product> selectListByCateId(@Param("cateId") int cateId);
    int insert(@Param("product") Product product);
}
