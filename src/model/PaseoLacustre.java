package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() { return tipoEmbarcacion; }

    @Override
    public String toString() {
        return "PaseoLacustre{nombre='" + nombre + "', duracionHoras=" + duracionHoras + ", tipoEmbarcacion='" + tipoEmbarcacion + "'}";
    }
}
