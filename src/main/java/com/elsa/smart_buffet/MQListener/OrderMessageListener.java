package com.elsa.smart_buffet.MQListener;

import com.elsa.smart_buffet.statistics.DayStatistics;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderMessageListener {

    @Autowired
    private DayStatistics dayStatistics;

    @RabbitListener(queues = "order_queue")
    public void receiveOrderQueue(String oId) {
        dayStatistics.dayStatistics(oId);
        System.out.println("已完成订单统计业务(RabbitMQ Direct order_queue)，id：" + oId);
    }

}
