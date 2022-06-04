package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.History;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/history/{cId}")
    public List<String> selectOneByIdHistory(@PathVariable("cId") String cId) {
        return historyService.selectOneByIdHistory(cId);
    }

    @PostMapping("/history")
    public ResponseResult insertHistory(@RequestBody History history) {
        return historyService.insertHistory(history);
    }

}
