package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() { return lugarHistorico; }

    @Override
    public String toString() {
        return "ExcursionCultural{nombre='" + nombre + "', duracionHoras=" + duracionHoras + ", lugarHistorico='" + lugarHistorico + "'}";
    }
}
