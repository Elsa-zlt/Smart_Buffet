package com.elsa.smart_buffet.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.elsa.smart_buffet.mapper.UserMapper;
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(User::getUserName, username);

        // 查询用户信息
        User user = userMapper.selectOne(queryWrapper);

        // 如果没有查询到用户，就抛出异常
        if(Objects.isNull(user)) {
            throw new RuntimeException("用户名或者密码错误");
        }

        // TODO 查询对应的权限信息

        // 把数据封装成UserDetails返回
        return new LoginUser(user);
    }
}
