package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        ServicioTuristico[] servicios = GestorServicios.crearServiciosPrueba();
        System.out.println("Servicios creados:");
        for (ServicioTuristico s : servicios) {
            System.out.println(s.toString());
        }
    }
}
