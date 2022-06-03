package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.mapper.EvaluateMapper;
import com.elsa.smart_buffet.pojo.Evaluate;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluateServiceImpl implements EvaluateService {

    @Autowired
    private EvaluateMapper evaluateMapper;

    @Override
    public ResponseResult selectAllEvaluate() {
        return new ResponseResult(200, evaluateMapper.selectList(null));
    }

    @Override
    public ResponseResult selectOneByIdEvaluate(int id) {
        return new ResponseResult(200, evaluateMapper.selectById(id));
    }

    @Override
    public ResponseResult updateEvaluate(Evaluate evaluate) {
        return new ResponseResult(200, evaluateMapper.updateById(evaluate));
    }

    @Override
    public ResponseResult deleteByIdEvaluate(int id) {
        return new ResponseResult(200, evaluateMapper.deleteById(id));
    }

    @Override
    public ResponseResult insertEvaluate(Evaluate evaluate) {
        return new ResponseResult(200, evaluateMapper.insert(evaluate));
    }

}
