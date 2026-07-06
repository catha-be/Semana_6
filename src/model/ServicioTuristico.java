package model;

public class  ServicioTuristico {
    protected String nombre;
    protected int duracionHoras;
    protected Guia guia;           // COMPOSICIÓN
    protected Ubicacion ubicacion; // COMPOSICIÓN

    public ServicioTuristico(String nombre, int duracionHoras, Guia guia, Ubicacion ubicacion) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor a 0 horas");
        }
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.guia = guia;
        this.ubicacion = ubicacion;
    }

    public String getNombre() { return nombre; }
    public int getDuracionHoras() { return duracionHoras; }
    public Guia getGuia() { return guia; }
    public Ubicacion getUbicacion() { return ubicacion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDuracionHoras(int duracionHoras) { this.duracionHoras = duracionHoras; }
    public void setGuia(Guia guia) { this.guia = guia; }
    public void setUbicacion(Ubicacion ubicacion) { this.ubicacion = ubicacion; }

    public String obtenerDescripcion() {
        return nombre + " (" + duracionHoras + " horas)";
    }

    public void mostrarInformacion() {
        System.out.println("=== SERVICIO TURÍSTICO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Ubicación: " + ubicacion.getCiudad() + ", " + ubicacion.getRegion());
        System.out.println("Guía: " + guia.obtenerInfoGuia());
    }

    @Override
    public String toString() {
        return "ServicioTuristico{" +
                "nombre='" + nombre + "'" +
                ", duracionHoras=" + duracionHoras +
                ", " + guia +
                ", " + ubicacion +
                "}";
    }
}
