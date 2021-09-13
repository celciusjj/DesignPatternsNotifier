package main.java.com.celcius.librerianotificaciones.handlers;

import main.java.com.celcius.librerianotificaciones.INotificadorFactory;
import main.java.com.celcius.librerianotificaciones.INotificadorStrategy;
import main.java.com.celcius.librerianotificaciones.notificadores.Correo;
import main.java.com.celcius.librerianotificaciones.notificadores.Empresarial;
import main.java.com.celcius.librerianotificaciones.notificadores.Facebook;
import main.java.com.celcius.librerianotificaciones.notificadores.SMS;

public class NotificadorMultiple implements INotificadorFactory {

    @Override
    public void createNotification(INotificadorStrategy notificador, String[] usuarios) {
        notificador = new Correo();
        notificador.generarNotificacion(usuarios);
        notificador = new SMS();
        notificador.generarNotificacion(usuarios);
        notificador = new Facebook();
        notificador.generarNotificacion(usuarios);
        notificador = new Empresarial();
        notificador.generarNotificacion(usuarios);
    }
}
