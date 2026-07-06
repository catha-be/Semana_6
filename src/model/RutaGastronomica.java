package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas, 
                           Guia guia, Ubicacion ubicacion) {
        super(nombre, duracionHoras, guia, ubicacion);
        if (numeroDeParadas <= 0) {
            throw new IllegalArgumentException("El número de paradas debe ser mayor a 0");
        }
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() { return numeroDeParadas; }
    public void setNumeroDeParadas(int numeroDeParadas) { this.numeroDeParadas = numeroDeParadas; }

    @Override
    public String obtenerDescripcion() {
        return nombre + " - Ruta Gastronómica con " + numeroDeParadas + " paradas (" + 
               duracionHoras + " horas) en " + ubicacion.getCiudad();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== RUTA GASTRONÓMICA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Número de paradas: " + numeroDeParadas);
        System.out.println("Ubicación: " + ubicacion.getCiudad() + ", " + ubicacion.getRegion());
        System.out.println("Guía especializado: " + guia.obtenerInfoGuia());
        System.out.println("Especialidad: Gastronomía");
    }

    @Override
    public String toString() {
        return "RutaGastronomica{" +
                "nombre='" + nombre + "'" +
                ", duracionHoras=" + duracionHoras +
                ", numeroDeParadas=" + numeroDeParadas +
                ", " + guia +
                ", " + ubicacion +
                "}";
    }
}
