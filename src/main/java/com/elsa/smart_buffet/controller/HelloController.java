package com.elsa.smart_buffet.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, welcome to the smart self-service catering system, please put the dishes under the camera to identify and order";
    }

}
