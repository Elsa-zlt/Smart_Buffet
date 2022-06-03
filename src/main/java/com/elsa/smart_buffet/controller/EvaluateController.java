package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.Evaluate;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;

    @GetMapping("/evaluate/list")
    public ResponseResult selectAllEvaluate() {
        return evaluateService.selectAllEvaluate();
    }

    @GetMapping("/evaluate/{id}")
    public ResponseResult selectOneByIdEvaluate(@PathVariable("id") int id) {
        return evaluateService.selectOneByIdEvaluate(id);
    }

    @PutMapping("/evaluate")
    public ResponseResult updateEvaluate(@RequestBody Evaluate evaluate) {
        return evaluateService.updateEvaluate(evaluate);
    }

    @DeleteMapping("/evaluate/{id}")
    public ResponseResult deleteByIdEvaluate(@PathVariable int id) {
        return  evaluateService.deleteByIdEvaluate(id);
    }

    @PostMapping("/evaluate")
    public ResponseResult insertEvaluate(@RequestBody Evaluate evaluate) {
        return evaluateService.insertEvaluate(evaluate);
    }

}
