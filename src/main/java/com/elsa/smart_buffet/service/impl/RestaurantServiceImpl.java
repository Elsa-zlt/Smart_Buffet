package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.mapper.RestaurantMapper;
import com.elsa.smart_buffet.pojo.Restaurant;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantMapper restaurantMapper;

    @Override
    public ResponseResult selectAllRestaurant() {
        return new ResponseResult(200, restaurantMapper.selectList(null));
    }

    @Override
    public ResponseResult selectOneByIdRestaurant(int id) {
        return new ResponseResult(200, restaurantMapper.selectById(id));
    }

    @Override
    public ResponseResult updateRestaurant(Restaurant restaurant) {
        return new ResponseResult(200, restaurantMapper.updateById(restaurant));
    }

    @Override
    public ResponseResult deleteByIdRestaurant(int id) {
        return new ResponseResult(200, restaurantMapper.deleteById(id));
    }

    @Override
    public ResponseResult insertRestaurant(Restaurant restaurant) {
        return new ResponseResult(200, restaurantMapper.insert(restaurant));
    }

}
