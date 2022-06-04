package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.mapper.MenuMapper;
import com.elsa.smart_buffet.pojo.Menu;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public ResponseResult selectAllMenu() {
        return new ResponseResult(200, menuMapper.selectList(null));
    }

    @Override
    public ResponseResult selectOneByIdMenu(int id) {
        return new ResponseResult(200, menuMapper.selectById(id));
    }

    @Override
    public ResponseResult updateMenu(Menu menu) {
        return new ResponseResult(200, menuMapper.updateById(menu));
    }

    @Override
    public ResponseResult deleteByIdMenu(int id) {
        return new ResponseResult(200, menuMapper.deleteById(id));
    }

    @Override
    public ResponseResult insertMenu(Menu menu) {
        return new ResponseResult(200, menuMapper.insert(menu));
    }
}
