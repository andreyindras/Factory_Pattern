package org.example.entities;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Mensagem enviada por e-mail: " + message);
    }
}
