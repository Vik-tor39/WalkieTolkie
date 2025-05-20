package com.example.rabbitmq.controller;

import com.example.rabbitmq.model.CustomMessage;
import com.example.rabbitmq.service.MessageProducer;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageProducer producer;

    public MessageController(MessageProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String publishMessage(@RequestBody CustomMessage message) {
        message.setSentAt(LocalDateTime.now());
        producer.sendMessage(message);
        return "Mensaje enviado a RabbitMQ.";
    }
}