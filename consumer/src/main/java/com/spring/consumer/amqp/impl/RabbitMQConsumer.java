package com.spring.consumer.amqp.impl;

import com.spring.consumer.amqp.AmqpConsumer;
import com.spring.consumer.dto.MessageDto;
import com.spring.consumer.service.ConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer implements AmqpConsumer<MessageDto> {

    @Autowired
    private ConsumerService service;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.routing-key.producer}")
    public void consumer(MessageDto message){
        service.action(message);
    }
}
