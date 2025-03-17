package org.example.entities;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Mensagem enviado por SMS: " + message);
    }
}
