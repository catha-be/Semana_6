package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion,
                        Guia guia, Ubicacion ubicacion) {
        super(nombre, duracionHoras, guia, ubicacion);
        if (tipoEmbarcacion == null || tipoEmbarcacion.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de embarcación no puede estar vacío");
        }
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() { return tipoEmbarcacion; }
    public void setTipoEmbarcacion(String tipoEmbarcacion) { this.tipoEmbarcacion = tipoEmbarcacion; }

    @Override
    public String obtenerDescripcion() {
        return nombre + " en " + tipoEmbarcacion + " (" + duracionHoras + " horas) - " + ubicacion.getCiudad();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== PASEO LACUSTRE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
        System.out.println("Ubicación: " + ubicacion.getCiudad() + ", " + ubicacion.getRegion());
        System.out.println("Guía especializado: " + guia.obtenerInfoGuia());
        System.out.println("Especialidad: Turismo Acuático");
    }

    @Override
    public String toString() {
        return "PaseoLacustre{" +
                "nombre='" + nombre + "'" +
                ", duracionHoras=" + duracionHoras +
                ", tipoEmbarcacion='" + tipoEmbarcacion + "'" +
                ", " + guia +
                ", " + ubicacion +
                "}";
    }
}
