package com.elsa.smart_buffet.service;

import com.elsa.smart_buffet.pojo.Restaurant;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;

public interface RestaurantService {

    ResponseResult selectAllRestaurant();

    ResponseResult selectOneByIdRestaurant(int id);

    ResponseResult updateRestaurant(Restaurant restaurant);

    ResponseResult deleteByIdRestaurant(int id);

    ResponseResult insertRestaurant(Restaurant restaurant);

}
