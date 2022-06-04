package com.elsa.smart_buffet.controller;

import com.elsa.smart_buffet.pojo.Restaurant;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurant/list")
    public ResponseResult selectAllRestaurant() {
        return restaurantService.selectAllRestaurant();
    }

    @GetMapping("/restaurant/{id}")
    public ResponseResult selectOneByIdRestaurant(@PathVariable("id") int id) {
        return restaurantService.selectOneByIdRestaurant(id);
    }

    @PutMapping("/restaurant")
    public ResponseResult updateRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(restaurant);
    }

    @DeleteMapping("/restaurant/{id}")
    public ResponseResult deleteByIdRestaurant(@PathVariable int id) {
        return  restaurantService.deleteByIdRestaurant(id);
    }

    @PostMapping("/restaurant")
    public ResponseResult insertRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.insertRestaurant(restaurant);
    }

}
