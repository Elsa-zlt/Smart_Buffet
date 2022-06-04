package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.Feedback;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedback/list")
    public ResponseResult selectAllFeedback() {
        return feedbackService.selectAllFeedback();
    }

    @GetMapping("/feedback/{id}")
    public ResponseResult selectOneByIdFeedback(@PathVariable("id") int id) {
        return feedbackService.selectOneByIdFeedback(id);
    }

    @PutMapping("/feedback")
    public ResponseResult updateFeedback(@RequestBody Feedback feedback) {
        return feedbackService.updateFeedback(feedback);
    }

    @DeleteMapping("/feedback/{id}")
    public ResponseResult deleteByIdFeedback(@PathVariable int id) {
        return  feedbackService.deleteByIdFeedback(id);
    }

    @PostMapping("/feedback")
    public ResponseResult insertFeedback(@RequestBody Feedback feedback) {
        return feedbackService.insertFeedback(feedback);
    }

}
