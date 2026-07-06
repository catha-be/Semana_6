package ui;

import data.GestorServicios;
import model.ServicioTuristico;
import model.Cliente;
import model.Proveedor;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║        🎯 SISTEMA DE GESTIÓN - LLANQUIHUE TOUR 🎯             ║");
        System.out.println("║           Aplicando Polimorfismo y Colecciones                ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        // ===== CREAR INSTANCIA DE GESTOR DE SERVICIOS =====
        GestorServicios gestor = new GestorServicios();

        // ===== MOSTRAR SERVICIOS TURÍSTICOS (Array tradicional) =====
        System.out.println("--- SERVICIOS TURÍSTICOS (Vista clásica) ---");
        ServicioTuristico[] servicios = GestorServicios.crearServiciosPrueba();
        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
            System.out.println("  Descripción: " + servicio.obtenerDescripcion());
            System.out.println("  Guía: " + servicio.getGuia().obtenerInfoGuia());
            System.out.println();
        }

        // ===== PASO 3 Y 4: OBTENER LISTA Y RECORRER CON POLIMORFISMO =====
        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║        PASO 4: RECORRIDO DESDE MAIN CON POLIMORFISMO          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");
        
        // Llamar al método que retorna la lista
        List<ServicioTuristico> listaServicios = gestor.getServicios();
        System.out.println("✓ Lista obtenida de GestorServicios.getServicios()");
        System.out.println("✓ Total de elementos en colección: " + listaServicios.size() + "\n");

        // Recorrer y mostrar usando polimorfismo
        gestor.mostrarTodosLosServicios();

        // ===== VERIFICACIÓN: Comportamiento según tipo de servicio =====
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║     VERIFICACIÓN: Comportamiento según tipo de servicio       ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");
        
        System.out.println("Analizando cada servicio de la colección:\n");
        
        for (int i = 0; i < listaServicios.size(); i++) {
            ServicioTuristico servicio = listaServicios.get(i);
            String tipo = servicio.getClass().getSimpleName();
            
            System.out.println((i+1) + ". " + tipo + ": " + servicio.getNombre());
            
            // Verificar comportamiento según tipo
            if (tipo.equals("RutaGastronomica")) {
                System.out.println("   ✓ Tipo: RUTA GASTRONÓMICA");
                System.out.println("   ✓ Comportamiento: Muestra información específica de paradas");
            } else if (tipo.equals("PaseoLacustre")) {
                System.out.println("   ✓ Tipo: PASEO LACUSTRE");
                System.out.println("   ✓ Comportamiento: Muestra información específica de embarcación");
            } else if (tipo.equals("ExcursionCultural")) {
                System.out.println("   ✓ Tipo: EXCURSIÓN CULTURAL");
                System.out.println("   ✓ Comportamiento: Muestra información específica de lugar histórico");
            }
            
            System.out.println("   • Duración: " + servicio.getDuracionHoras() + " horas");
            System.out.println("   • Ubicación: " + servicio.getUbicacion().getCiudad());
            System.out.println();
        }

        // ===== MOSTRAR CLIENTES =====
        System.out.println("\n--- CLIENTES REGISTRADOS ---");
        Cliente[] clientes = GestorServicios.crearClientesPrueba();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println("  Contacto: " + cliente.obtenerInfoContacto());
            System.out.println();
        }

        // ===== MOSTRAR PROVEEDORES =====
        System.out.println("\n--- PROVEEDORES ASOCIADOS ---");
        Proveedor[] proveedores = GestorServicios.crearProveedoresPrueba();
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor);
            System.out.println("  Info: " + proveedor.obtenerInfoProveedor());
            System.out.println("  ¿Experimentado?: " + (proveedor.esExperimentado() ? "Sí" : "No"));
            System.out.println();
        }
        
        // ===== ESTADÍSTICAS DE SERVICIOS =====
        gestor.mostrarEstadisticas();
        
        // ===== RESUMEN FINAL =====
        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    ✅ EJECUCIÓN COMPLETADA                    ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝");
        System.out.println("\n✓ Se demostró polimorfismo con " + listaServicios.size() + " servicios");
        System.out.println("✓ Cada servicio ejecutó su método mostrarInformacion() específico");
        System.out.println("✓ Sistema escalable sin necesidad de modificar Main");
    }
}
