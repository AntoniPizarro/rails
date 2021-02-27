package gpl.pizarro.rails.estacion;

public class Estacion {

    private String nombre;
    private final String codigo;

    public Estacion(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombre() +
                "\nCodigo: " + getCodigo();
    }

}