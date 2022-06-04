package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.Feedback;
import com.elsa.smart_buffet.pojo.Menu;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.FeedbackService;
import com.elsa.smart_buffet.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/menu/list")
    public ResponseResult selectAllMenu() {
        return menuService.selectAllMenu();
    }

    @GetMapping("/menu/{id}")
    public ResponseResult selectOneByIdMenu(@PathVariable("id") int id) {
        return menuService.selectOneByIdMenu(id);
    }

    @PutMapping("/menu")
    public ResponseResult updateMenu(@RequestBody Menu menu) {
        return menuService.updateMenu(menu);
    }

    @DeleteMapping("/menu/{id}")
    public ResponseResult deleteByIdMenu(@PathVariable int id) {
        return  menuService.deleteByIdMenu(id);
    }

    @PostMapping("/menu")
    public ResponseResult insertMenu(@RequestBody Menu menu) {
        return menuService.insertMenu(menu);
    }

}
