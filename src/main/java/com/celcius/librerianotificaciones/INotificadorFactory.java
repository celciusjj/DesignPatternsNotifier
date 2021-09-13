package main.java.com.celcius.librerianotificaciones;

public interface INotificadorFactory {
    void createNotification(INotificadorStrategy notificador, String[] usuarios);
}
