package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.Comsumer;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.pojo.User;

public interface LoginService {
    ResponseResult loginComsumer(Comsumer comsumer);

    ResponseResult logout();
}
