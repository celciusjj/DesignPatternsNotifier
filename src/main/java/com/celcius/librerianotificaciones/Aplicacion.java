package main.java.com.celcius.librerianotificaciones;

import main.java.com.celcius.librerianotificaciones.handlers.NotificadorMultiple;

public class Aplicacion {

    static INotificadorStrategy notificadorStrategy;
    static INotificadorFactory notificadorFactory;

    public static void main(String[] args){
        String[] usuarios = {"diego", "juan", "felipe"};
        notificadorFactory = new NotificadorMultiple();
        setNotificador(notificadorFactory, usuarios);
    }

    static void setNotificador(INotificadorFactory notificaciones, String[] usuarios){
        notificaciones.createNotification(notificadorStrategy, usuarios);
    }
}
