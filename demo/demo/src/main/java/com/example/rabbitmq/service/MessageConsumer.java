package com.example.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.example.rabbitmq.config.RabbitMQConfig;
import com.example.rabbitmq.model.CustomMessage;

@Component
public class MessageConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receiveMessage(CustomMessage message) {
        System.out.println("📥 Mensaje recibido:");
        System.out.println("Título: " + message.getTitle());
        System.out.println("Contenido: " + message.getContent());
        System.out.println("Enviado a las: " + message.getSentAt());
    }
}
