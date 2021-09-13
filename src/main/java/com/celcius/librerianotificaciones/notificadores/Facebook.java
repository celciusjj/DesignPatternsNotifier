package main.java.com.celcius.librerianotificaciones.notificadores;

import main.java.com.celcius.librerianotificaciones.INotificadorStrategy;

public class Facebook implements INotificadorStrategy {
    @Override
    public void generarNotificacion(String[] usuarios) {
        System.out.println("entra en facebook");
    }
}
