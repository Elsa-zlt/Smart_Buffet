package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.Feedback;
import com.elsa.smart_buffet.pojo.History;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;

import java.util.List;

public interface HistoryService {

    List<String> selectOneByIdHistory(String cId);

    ResponseResult insertHistory(History history);

}
