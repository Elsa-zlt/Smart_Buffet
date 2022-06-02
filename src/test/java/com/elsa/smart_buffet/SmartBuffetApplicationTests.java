package com.elsa.smart_buffet;

import com.elsa.smart_buffet.mapper.ComsumerMapper;
import com.elsa.smart_buffet.pojo.Comsumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SmartBuffetApplicationTests {

    @Autowired
    private ComsumerMapper comsumerMapper;

    @Test
    void contextLoads() {
        List<Comsumer> comsumers = comsumerMapper.selectList(null);
        System.out.println(comsumers);
    }

}
