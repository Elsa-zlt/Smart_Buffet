package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.Comsumer;
import com.elsa.smart_buffet.pojo.Manager;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/consumer/login")
    public ResponseResult loginConsumer(@RequestBody Comsumer comsumer) {
        System.out.println(comsumer);
        return loginService.loginComsumer(comsumer);
    }

    @PostMapping("/manager/login")
    public ResponseResult loginManager(@RequestBody Manager manager) {
        System.out.println(manager);
        return loginService.loginManager(manager);
    }

    @RequestMapping("/consumer/logout")
    public ResponseResult logoutConsumer(){
        return loginService.logoutConsumer();
    }

    @RequestMapping("/manager/logout")
    public ResponseResult logoutManager() {
        return loginService.logoutManager();
    }

}
