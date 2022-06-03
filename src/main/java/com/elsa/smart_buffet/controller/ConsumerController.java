package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.Comsumer;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer/list")
    public ResponseResult selectAllConsumer() {
        return consumerService.selectAllConsumer();
    }

    @GetMapping("/consumer/{id}")
    public ResponseResult selectOneByIdConsumer(@PathVariable("id") int id) {
        return consumerService.selectOneByIdConsumer(id);
    }

    @PutMapping("/consumer")
    public ResponseResult updateConsumer(@RequestBody Comsumer comsumer) {
        return consumerService.updateConsumer(comsumer);
    }

    @DeleteMapping("/consumer/{id}")
    public ResponseResult deleteByIdConsumer(@PathVariable int id) {
        return  consumerService.deleteByIdConsumer(id);
    }

    @PostMapping("/consumer")
    public ResponseResult insertConsumer(@RequestBody Comsumer comsumer) {
        return consumerService.insertConsumer(comsumer);
    }

}
