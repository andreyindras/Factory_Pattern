package org.example.factory;

import org.example.entities.EmailNotification;
import org.example.entities.Notification;
import org.example.entities.PushNotification;
import org.example.entities.SMSNotification;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Erro ao selecionar um tipo de notificação");
        }
    }
}