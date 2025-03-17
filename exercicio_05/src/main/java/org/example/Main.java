package org.example;

import org.example.entities.Notification;
import org.example.factory.NotificationFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o tipo de mensagem que deseja enviar:");
        System.out.println("(1) - E-mail");
        System.out.println("(2) - SMS");
        System.out.println("(3) - Push notification");
        System.out.print("Opção: ");
        int op = sc.nextInt();

        String type;
        switch (op) {
            case 1:

                type = "email";
                break;
            case 2:
                type = "sms";
                break;
            case 3:
                type = "push";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Digite a mensagem que deseja enviar");
        sc.nextLine();
        String msg = sc.nextLine();

        Notification notification = NotificationFactory.createNotification(type);
        notification.send(msg);

        sc.close();
    }
}