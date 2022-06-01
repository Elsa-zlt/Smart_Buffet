package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.pojo.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
