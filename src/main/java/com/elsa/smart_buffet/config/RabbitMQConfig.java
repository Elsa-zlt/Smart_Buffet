package com.elsa.smart_buffet.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    // Direct模式的队列
    public Queue directQueue() {
        // durable:是否持久化，默认false
        // exclusive:是否当前连接专用，默认False，连接关闭后队列即被删除
        // autoDelete:是否自动删除，当生产者或消费者不再使用此队列，自动删除
        // 一个参数的构造方法内部默认调用了4个参数的构造方法，后三个参数依次为true,false,false
        return new Queue("order_queue");
    }

    @Bean
    // Direct模式的交换机
    public DirectExchange directExchange() {
        return new DirectExchange("orderExchange");
    }

    @Bean
    public Binding bindingDirect() {
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("order");
    }

}
