package com.elsa.smart_buffet;

import com.elsa.smart_buffet.mapper.*;
import com.elsa.smart_buffet.pojo.*;
import com.elsa.smart_buffet.utils.RedisCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

}
