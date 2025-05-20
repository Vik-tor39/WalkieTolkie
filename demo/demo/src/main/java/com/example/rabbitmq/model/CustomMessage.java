package com.example.rabbitmq.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CustomMessage implements Serializable {
    private String title;
    private String content;
    private LocalDateTime sentAt;

    public CustomMessage() {}

    // public CustomMessage(String title, String content) {
    //     this.title = title;
    //     this.content = content;
    // }

    // Getters y Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
