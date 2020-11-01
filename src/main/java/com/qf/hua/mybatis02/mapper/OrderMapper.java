package com.qf.hua.mybatis02.mapper;

import com.qf.hua.mybatis02.entity.Order;

public interface OrderMapper {
    Order selectOrderByNo(int no);
}
