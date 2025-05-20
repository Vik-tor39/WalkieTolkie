package com.example.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "${app.queue.name}")
    public void listen(String message) {
        System.out.println("Mensaje recibido: " + message);
    }
}
