package model;

public class ServicioTuristico {
    protected String nombre;
    protected int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() { return nombre; }
    public int getDuracionHoras() { return duracionHoras; }

    @Override
    public String toString() {
        return "ServicioTuristico{nombre='" + nombre + "', duracionHoras=" + duracionHoras + "}";
    }
}
