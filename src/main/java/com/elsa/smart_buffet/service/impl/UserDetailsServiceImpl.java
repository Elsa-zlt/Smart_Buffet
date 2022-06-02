package com.elsa.smart_buffet.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.elsa.smart_buffet.mapper.ComsumerMapper;
import com.elsa.smart_buffet.mapper.UserMapper;
import com.elsa.smart_buffet.pojo.Comsumer;
import com.elsa.smart_buffet.pojo.LoginComsumer;
import com.elsa.smart_buffet.pojo.LoginUser;
import com.elsa.smart_buffet.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ComsumerMapper comsumerMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        LambdaQueryWrapper<Comsumer> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(Comsumer::getCName, username);

        // 查询用户信息
//        User user = userMapper.selectOne(queryWrapper);
        Comsumer comsumer = comsumerMapper.selectOne(queryWrapper);

        // 如果没有查询到用户，就抛出异常
        if(Objects.isNull(comsumer)) {
            throw new RuntimeException("用户名或者密码错误");
        }

        // TODO 查询对应的权限信息

        // 把数据封装成UserDetails返回
        return new LoginComsumer(comsumer);
    }
}
