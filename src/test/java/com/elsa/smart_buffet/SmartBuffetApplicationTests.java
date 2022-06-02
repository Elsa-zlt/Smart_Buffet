package com.elsa.smart_buffet;

import com.elsa.smart_buffet.mapper.*;
import com.elsa.smart_buffet.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SmartBuffetApplicationTests {

    @Autowired
    private ComsumerMapper comsumerMapper;

    @Autowired
    private EvaluateMapper evaluateMapper;

    @Autowired
    private RestaurantMapper restaurantMapper;

    @Autowired
    private MonthMapper monthMapper;

    @Autowired
    private HistoryMapper historyMapper;

    @Test
    void contextLoads() {
        List<Comsumer> comsumers = comsumerMapper.selectList(null);
        System.out.println(comsumers);
    }

    @Test
    void testMapper() {
        List<Evaluate> evaluates = evaluateMapper.selectList(null);
        System.out.println(evaluates);
        List<Month> months = monthMapper.selectList(null);
        System.out.println(months);
        List<History> histories = historyMapper.selectList(null);
        System.out.println(histories);
        List<Restaurant> restaurants = restaurantMapper.selectList(null);
        System.out.println(restaurants);
    }

}
