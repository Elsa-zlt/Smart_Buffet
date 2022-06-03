package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;

import java.util.List;
import java.util.Map;

public interface OrderService {

    ResponseResult insertOrder(List<Map<String, Object>> list);

}
