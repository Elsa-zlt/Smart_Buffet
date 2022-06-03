package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.Comsumer;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;

public interface ConsumerService {

    ResponseResult selectAllConsumer();

    ResponseResult selectOneByIdConsumer(int id);

    ResponseResult updateConsumer(Comsumer comsumer);

    ResponseResult deleteByIdConsumer(int id);

    ResponseResult insertConsumer(Comsumer comsumer);

}
