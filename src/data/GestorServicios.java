package data;

import model.ExcursionCultural;
import model.Guia;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import model.Ubicacion;
import model.Cliente;
import model.Proveedor;
import model.Direccion;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    
    // ===== ATRIBUTOS =====
    private List<ServicioTuristico> servicios;

    // ===== CONSTRUCTOR =====
    public GestorServicios() {
        this.servicios = new ArrayList<>();
        cargarServicios();
    }

    // ===== GETTER PARA ACCEDER A LA COLECCIÓN =====
    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    // ===== MÉTODO PARA MOSTRAR TODOS LOS SERVICIOS USANDO POLIMORFISMO =====
    public void mostrarTodosLosServicios() {
        System.out.println("========================================");
        System.out.println("--- RECORRIDO POLIMÓRFICO DE SERVICIOS ---");
        System.out.println("========================================\n");
        
        int contador = 1;
        for (ServicioTuristico servicio : servicios) {
            System.out.println(">>> SERVICIO #" + contador + " <<<");
            servicio.mostrarInformacion();
            System.out.println();
            contador++;
        }
    }

    // ===== MÉTODO PARA CONTAR SERVICIOS POR TIPO =====
    public void mostrarEstadisticas() {
        System.out.println("\n--- ESTADÍSTICAS DE SERVICIOS ---");
        System.out.println("Total de servicios en colección: " + servicios.size());
        
        long rutasGastronomicas = servicios.stream()
            .filter(s -> s.getClass().getSimpleName().equals("RutaGastronomica"))
            .count();
        long paseosLacustres = servicios.stream()
            .filter(s -> s.getClass().getSimpleName().equals("PaseoLacustre"))
            .count();
        long excursionesCulturales = servicios.stream()
            .filter(s -> s.getClass().getSimpleName().equals("ExcursionCultural"))
            .count();
        
        System.out.println("  • Rutas Gastronómicas: " + rutasGastronomicas);
        System.out.println("  • Paseos Lacustres: " + paseosLacustres);
        System.out.println("  • Excursiones Culturales: " + excursionesCulturales);
    }

    // ===== MÉTODO PARA CARGAR SERVICIOS EN LA COLECCIÓN =====
    private void cargarServicios() {
        Guia[] guias = crearGuias();
        Ubicacion[] ubicaciones = crearUbicaciones();

        servicios.add(new RutaGastronomica("Ruta Sabores Llanquihue", 4, 5, guias[0], ubicaciones[0]));
        servicios.add(new RutaGastronomica("Tour de Cafés Premium", 3, 3, guias[1], ubicaciones[1]));
        servicios.add(new PaseoLacustre("Paseo por el Lago", 2, "Bote a remo", guias[2], ubicaciones[1]));
        servicios.add(new PaseoLacustre("Crucero Llanquihue", 5, "Catamarán", guias[3], ubicaciones[0]));
        servicios.add(new ExcursionCultural("Visita al Museo Regional", 2, "Museo Regional", guias[4], ubicaciones[0]));
        servicios.add(new ExcursionCultural("Ruta Histórica Ensenada", 3, "Fuerte Histórico", guias[5], ubicaciones[2]));
    }

    // ===== MÉTODOS PARA CREAR GUÍAS =====
    private static Guia[] crearGuias() {
        Guia[] guias = new Guia[6];
        guias[0] = new Guia("Carlos", "Molina", "Gastronomía", 5, "+56987654321", "Español, Inglés");
        guias[1] = new Guia("Lorena", "Díaz", "Gastronomía", 3, "+56987654322", "Español");
        guias[2] = new Guia("Roberto", "Vega", "Turismo Acuático", 8, "+56987654323", "Español, Inglés, Alemán");
        guias[3] = new Guia("Magdalena", "Torres", "Turismo Acuático", 6, "+56987654324", "Español, Portugués");
        guias[4] = new Guia("Javier", "Romero", "Historia", 7, "+56987654325", "Español, Inglés, Francés");
        guias[5] = new Guia("Sofía", "Navarro", "Historia", 4, "+56987654326", "Español");
        return guias;
    }

    // ===== MÉTODOS PARA CREAR UBICACIONES =====
    private static Ubicacion[] crearUbicaciones() {
        Ubicacion[] ubicaciones = new Ubicacion[3];
        ubicaciones[0] = new Ubicacion("Puerto Varas", "Los Lagos", -41.3206, -72.4974);
        ubicaciones[1] = new Ubicacion("Llanquihue", "Los Lagos", -41.3742, -72.4122);
        ubicaciones[2] = new Ubicacion("Ensenada", "Los Lagos", -41.1244, -71.9208);
        return ubicaciones;
    }

    // ===== MÉTODOS PARA CREAR DIRECCIONES =====
    private static Direccion[] crearDirecciones() {
        Direccion[] direcciones = new Direccion[3];
        direcciones[0] = new Direccion("Calle Santa Rosa", 456, "Puerto Varas", "Puerto Varas", "5550000");
        direcciones[1] = new Direccion("Avenida Llanquihue", 789, "Llanquihue", "Llanquihue", "5560000");
        direcciones[2] = new Direccion("Camino a Ensenada", 123, "Ensenada", "Ensenada", "5570000");
        return direcciones;
    }

    // ===== MÉTODO PARA CREAR SERVICIOS TURÍSTICOS =====
    public static ServicioTuristico[] crearServiciosPrueba() {
        Guia[] guias = crearGuias();
        Ubicacion[] ubicaciones = crearUbicaciones();

        ServicioTuristico[] servicios = new ServicioTuristico[6];
        
        servicios[0] = new RutaGastronomica("Ruta Sabores Llanquihue", 4, 5, guias[0], ubicaciones[0]);
        servicios[1] = new RutaGastronomica("Tour de Cafés Premium", 3, 3, guias[1], ubicaciones[1]);
        
        servicios[2] = new PaseoLacustre("Paseo por el Lago", 2, "Bote a remo", guias[2], ubicaciones[1]);
        servicios[3] = new PaseoLacustre("Crucero Llanquihue", 5, "Catamarán", guias[3], ubicaciones[0]);
        
        servicios[4] = new ExcursionCultural("Visita al Museo Regional", 2, "Museo Regional", guias[4], ubicaciones[0]);
        servicios[5] = new ExcursionCultural("Ruta Histórica Ensenada", 3, "Fuerte Histórico", guias[5], ubicaciones[2]);
        
        return servicios;
    }

    // ===== MÉTODO PARA CREAR COLECCIÓN POLIMÓRFICA =====
    public static List<ServicioTuristico> crearServiciosPolimorficos() {
        List<ServicioTuristico> servicios = new ArrayList<>();
        
        Guia[] guias = crearGuias();
        Ubicacion[] ubicaciones = crearUbicaciones();

        servicios.add(new RutaGastronomica("Ruta Sabores Llanquihue", 4, 5, guias[0], ubicaciones[0]));
        servicios.add(new RutaGastronomica("Tour de Cafés Premium", 3, 3, guias[1], ubicaciones[1]));
        servicios.add(new PaseoLacustre("Paseo por el Lago", 2, "Bote a remo", guias[2], ubicaciones[1]));
        servicios.add(new PaseoLacustre("Crucero Llanquihue", 5, "Catamarán", guias[3], ubicaciones[0]));
        servicios.add(new ExcursionCultural("Visita al Museo Regional", 2, "Museo Regional", guias[4], ubicaciones[0]));
        servicios.add(new ExcursionCultural("Ruta Histórica Ensenada", 3, "Fuerte Histórico", guias[5], ubicaciones[2]));
        
        return servicios;
    }

    // ===== MÉTODO PARA CREAR CLIENTES =====
    public static Cliente[] crearClientesPrueba() {
        Direccion[] direcciones = crearDirecciones();
        Direccion dir1 = new Direccion("Pasaje Los Andes", 234, "Puerto Varas", "Puerto Varas", "5550000");
        Direccion dir2 = new Direccion("Calle Central", 567, "Puerto Montt", "Puerto Montt", "5550001");
        
        Cliente[] clientes = new Cliente[2];
        clientes[0] = new Cliente("18.456.789-K", "María García López", "maria.garcia@email.com", 
                                 "+56987123456", dir1);
        clientes[1] = new Cliente("19.234.567-9", "Pedro Sánchez Ruiz", "pedro.sanchez@email.com", 
                                 "+56981234567", dir2);
        
        return clientes;
    }

    // ===== MÉTODO PARA CREAR PROVEEDORES =====
    public static Proveedor[] crearProveedoresPrueba() {
        Direccion[] direcciones = crearDirecciones();
        
        Proveedor[] proveedores = new Proveedor[3];
        proveedores[0] = new Proveedor("Turismo Gourmet", "Gastronomía", "+56912345678", 
                                      "info@turismogourmet.cl", direcciones[0], 6);
        proveedores[1] = new Proveedor("Tours Acuáticos Llanquihue", "Turismo Acuático", "+56987654999", 
                                      "contacto@toursacuaticos.cl", direcciones[1], 8);
        proveedores[2] = new Proveedor("Patrimonio Histórico Tours", "Historia y Cultura", "+56998765432", 
                                      "info@patrimoniotours.cl", direcciones[2], 7);
        
        return proveedores;
    }
}
