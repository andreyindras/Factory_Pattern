package org.example.entities;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Mensagem enviado por push: " + message);
    }
}
