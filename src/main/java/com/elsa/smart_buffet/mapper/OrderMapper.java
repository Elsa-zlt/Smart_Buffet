package com.elsa.smart_buffet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elsa.smart_buffet.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}