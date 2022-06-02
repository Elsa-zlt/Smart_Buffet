package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.Comsumer;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.pojo.User;
import com.elsa.smart_buffet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult loginComsumer(@RequestBody Comsumer comsumer) {
        System.out.println(comsumer);
        return loginService.loginComsumer(comsumer);
    }

    @RequestMapping("/user/logout")
    public ResponseResult logout(){
        return loginService.logout();
    }
}
