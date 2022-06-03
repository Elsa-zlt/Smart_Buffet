package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.Feedback;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;

public interface FeedbackService {

    ResponseResult selectAllFeedback();

    ResponseResult selectOneByIdFeedback(int id);

    ResponseResult updateFeedback(Feedback feedback);

    ResponseResult deleteByIdFeedback(int id);

    ResponseResult insertFeedback(Feedback feedback);

}
