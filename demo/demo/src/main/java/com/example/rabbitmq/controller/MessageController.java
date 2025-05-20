package com.example.rabbitmq.controller;

import com.example.rabbitmq.service.MessageProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensajes")
public class MessageController {

    private final MessageProducer producer;

    public MessageController(MessageProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String enviarMensaje(@RequestBody String mensaje) {
        producer.send(mensaje);
        return "Mensaje enviado: " + mensaje;
    }
}
