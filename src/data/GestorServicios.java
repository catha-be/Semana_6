package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {
    public static ServicioTuristico[] crearServiciosPrueba() {
        ServicioTuristico[] servicios = new ServicioTuristico[6];
        servicios[0] = new RutaGastronomica("Ruta Sabores Llanquihue", 4, 5);
        servicios[1] = new RutaGastronomica("Tour de Cafés", 3, 3);
        servicios[2] = new PaseoLacustre("Paseo por el Lago", 2, "Bote a remo");
        servicios[3] = new PaseoLacustre("Crucero Llanquihue", 5, "Catamarán");
        servicios[4] = new ExcursionCultural("Visita al Museo", 2, "Museo Regional");
        servicios[5] = new ExcursionCultural("Camino histórico", 3, "Fuerte Histórico");
        return servicios;
    }
}
