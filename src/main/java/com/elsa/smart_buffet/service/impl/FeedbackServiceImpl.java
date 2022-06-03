package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.mapper.FeedbackMapper;
import com.elsa.smart_buffet.pojo.Feedback;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public ResponseResult selectAllFeedback() {
        return new ResponseResult(200, feedbackMapper.selectList(null));
    }

    @Override
    public ResponseResult selectOneByIdFeedback(int id) {
        return new ResponseResult(200, feedbackMapper.selectById(id));
    }

    @Override
    public ResponseResult updateFeedback(Feedback feedback) {
        return new ResponseResult(200, feedbackMapper.updateById(feedback));
    }

    @Override
    public ResponseResult deleteByIdFeedback(int id) {
        return new ResponseResult(200, feedbackMapper.deleteById(id));
    }

    @Override
    public ResponseResult insertFeedback(Feedback feedback) {
        return new ResponseResult(200, feedbackMapper.insert(feedback));
    }

}
