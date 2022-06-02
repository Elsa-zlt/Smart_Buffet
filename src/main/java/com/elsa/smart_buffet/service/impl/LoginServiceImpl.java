package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.pojo.*;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.LoginService;
import com.elsa.smart_buffet.utils.JwtUtil;
import com.elsa.smart_buffet.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public ResponseResult loginComsumer(Comsumer comsumer) {

        // AuthenticationManager authenticate 进行用户认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(comsumer.getCName(), comsumer.getCPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        // 如果没有通过，则给出对应的提示
        if(Objects.isNull(authenticate)) {
            throw new RuntimeException("登录失败");
        }

        // 认证通过，根据userid去生成一个jwt，jwt存入ResponseResult返回
        LoginComsumer loginComsumer = (LoginComsumer) authenticate.getPrincipal();
        String comsumerid = loginComsumer.getComsumer().getCId().toString();
        String jwt = JwtUtil.createJWT(comsumerid);
        Map<String, String> map = new HashMap<>();
        map.put("token", jwt);

        // 把用户信息存入redis，userid做完key
        redisCache.setCacheObject("login:" + comsumerid, loginComsumer);
//        System.out.println("login:" + userid);
//        System.out.println(loginUser);
        return new ResponseResult(200, "登录成功", map);
    }

    public ResponseResult loginManager(Manager manager) {
        // AuthenticationManager authenticate 进行用户认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(manager.getMaName(), manager.getMaPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        // 如果没有通过，则给出对应的提示
        if(Objects.isNull(authenticate)) {
            throw new RuntimeException("登录失败");
        }

        // 认证通过，根据userid去生成一个jwt，jwt存入ResponseResult返回
        LoginManager loginManager = (LoginManager) authenticate.getPrincipal();
        String managerid = loginManager.getManager().getMaId().toString();
        String jwt = JwtUtil.createJWT(managerid);
        Map<String, String> map = new HashMap<>();
        map.put("token", jwt);

        // 把用户信息存入redis，userid做完key
        redisCache.setCacheObject("login:" + managerid, loginManager);
//        System.out.println("login:" + userid);
//        System.out.println(loginUser);
        return new ResponseResult(200, "登录成功", map);
    }

    @Override
    public ResponseResult logoutConsumer() {
        //获取SecurityContextHolder中的用户id
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        LoginComsumer loginComsumer = (LoginComsumer) authentication.getPrincipal();
        int userid = loginComsumer.getComsumer().getCId();
        //删除redis中的值
        redisCache.deleteObject("login:"+userid);
        return new ResponseResult(200,"注销成功");
    }

    @Override
    public ResponseResult logoutManager() {
        //获取SecurityContextHolder中的用户id
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        LoginManager loginManager = (LoginManager) authentication.getPrincipal();
        int userid = loginManager.getManager().getMaId();
        //删除redis中的值
        redisCache.deleteObject("login:"+userid);
        return new ResponseResult(200,"注销成功");
    }
}
