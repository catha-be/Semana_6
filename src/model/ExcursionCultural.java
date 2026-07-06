package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico,
                            Guia guia, Ubicacion ubicacion) {
        super(nombre, duracionHoras, guia, ubicacion);
        if (lugarHistorico == null || lugarHistorico.trim().isEmpty()) {
            throw new IllegalArgumentException("El lugar histórico no puede estar vacío");
        }
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() { return lugarHistorico; }
    public void setLugarHistorico(String lugarHistorico) { this.lugarHistorico = lugarHistorico; }

    @Override
    public String obtenerDescripcion() {
        return nombre + " en " + lugarHistorico + " (" + duracionHoras + " horas) - " + ubicacion.getCiudad();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== EXCURSIÓN CULTURAL ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Lugar histórico: " + lugarHistorico);
        System.out.println("Ubicación: " + ubicacion.getCiudad() + ", " + ubicacion.getRegion());
        System.out.println("Guía especializado: " + guia.obtenerInfoGuia());
        System.out.println("Especialidad: Historia y Cultura");
    }

    @Override
    public String toString() {
        return "ExcursionCultural{" +
                "nombre='" + nombre + "'" +
                ", duracionHoras=" + duracionHoras +
                ", lugarHistorico='" + lugarHistorico + "'" +
                ", " + guia +
                ", " + ubicacion +
                "}";
    }
}
