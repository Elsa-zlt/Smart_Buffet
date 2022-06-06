package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMessageServiceMQImpl implements MessageService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(String oId) {
        System.out.println("待订单已纳入处理队列，id：" + oId);
        // 指定RabbitDirectConfig中的内容
        amqpTemplate.convertAndSend("orderExchange", "order", oId);
    }

    @Override
    public String doMessage() {
        String oId = (String) amqpTemplate.receiveAndConvert("orderExchange");
        System.out.println("已发送业务，id：" + oId);
        return oId;
    }
}
