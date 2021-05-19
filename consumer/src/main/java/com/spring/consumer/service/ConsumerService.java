package com.spring.consumer.service;

import com.spring.consumer.dto.MessageDto;

public interface ConsumerService {
    void action(MessageDto message);
}
