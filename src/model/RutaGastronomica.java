package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() { return numeroDeParadas; }

    @Override
    public String toString() {
        return "RutaGastronomica{nombre='" + nombre + "', duracionHoras=" + duracionHoras + ", numeroDeParadas=" + numeroDeParadas + "}";
    }
}
