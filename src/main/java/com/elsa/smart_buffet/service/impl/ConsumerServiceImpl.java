package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.mapper.ComsumerMapper;
import com.elsa.smart_buffet.pojo.Comsumer;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ComsumerMapper comsumerMapper;

    @Override
    public ResponseResult selectAllConsumer() {
        return new ResponseResult(200, comsumerMapper.selectList(null));
    }

    @Override
    public ResponseResult selectOneByIdConsumer(int id) {
        return new ResponseResult(200, comsumerMapper.selectById(id));
    }

    @Override
    public ResponseResult updateConsumer(Comsumer comsumer) {
        return new ResponseResult(200, comsumerMapper.updateById(comsumer));
    }

    @Override
    public ResponseResult deleteByIdConsumer(int id) {
        return new ResponseResult(200, comsumerMapper.deleteById(id));
    }

    @Override
    public ResponseResult insertConsumer(Comsumer comsumer) {
        return new ResponseResult(200, comsumerMapper.insert(comsumer));
    }

}
