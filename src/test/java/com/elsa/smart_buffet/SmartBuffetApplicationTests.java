package com.elsa.smart_buffet;

import com.elsa.smart_buffet.mapper.*;
import com.elsa.smart_buffet.pojo.*;
import com.elsa.smart_buffet.utils.RedisCache;
import com.elsa.smart_buffet.utils.TimeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SmartBuffetApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DayMapper dayMapper;

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

    @Autowired
    private RedisCache redisCache;

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

    @Test
    void testRedis() {
        List list = redisCache.getCacheList("3");
        if(list != null) {
            redisCache.deleteObject("3");
        }
        if(list.size() >= 6) {
            int i = 1;
            for(Iterator it = list.iterator(); it.hasNext();){
                i++;
                Object obj = it.next();
                if(i == 6) {
                    it.remove();//试图删除迭代出来的元素
                }
            }
        }

        list.add("zlt");
        redisCache.setCacheList("3",list);
        System.out.println(list.size());
        System.out.println(list);
//        System.out.println(redisCache.getCacheSet("1"));

//        redisCache.setCacheObject("1","Elsa");
//        String s = redisCache.getCacheObject("1");
//        System.out.println(s);
    }

    @Autowired
    private TimeUtil timeUtil;

    @Test
    void dayTest(){
        System.out.println(timeUtil.getMonthTime());
        System.out.println(timeUtil.getYearTime());
    }

    @Test
    void testOrder() {
        Date date = new Date();
        int year = date.getYear();
        year = year - 100;
        year = 2000 + year;
        year = year * 10000;
        int month = date.getMonth() + 1;
        month = month * 100;
        int day = date.getDate();
        System.out.println(year + month + day);
        int dId = year + month + day;
        Day day1 = dayMapper.selectById(dId);
        if(day1 == null) {
            System.out.println("day 为空");
            Order order = orderMapper.selectById(4);
            System.out.println(order);
        }
    }

}
