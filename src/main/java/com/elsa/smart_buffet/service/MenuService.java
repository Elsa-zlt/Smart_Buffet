package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.Menu;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;

public interface MenuService {

    ResponseResult selectAllMenu();

    ResponseResult selectOneByIdMenu(int id);

    ResponseResult updateMenu(Menu menu);

    ResponseResult deleteByIdMenu(int id);

    ResponseResult insertMenu(Menu menu);

}
