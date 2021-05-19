package com.spring.consumer.service.impl;

import com.spring.consumer.dto.MessageDto;
import com.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(MessageDto message){
        System.out.println(message.getMsg());
    }
}
