package com.gwhn.rabbitmqconsumer.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author banxian1804@qq.com
 * @date 2021/12/10 10:35
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {

    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("FanoutReceiverA消费者收到消息  : " +testMessage.toString());
    }
}
