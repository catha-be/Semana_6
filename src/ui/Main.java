package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Agencia Llanquihue Tour ===");

        // Llamamos al método que crea los servicios de prueba
        ServicioTuristico[] servicios = GestorServicios.crearServiciosPrueba();

        // Mostramos cada servicio en consola usando toString()
        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
        }
    }
}
