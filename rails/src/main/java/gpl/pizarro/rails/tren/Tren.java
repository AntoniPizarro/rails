package gpl.pizarro.rails.tren;

import gpl.pizarro.rails.ruta.Ruta;
import gpl.pizarro.rails.estacion.Estacion;

public class Tren {

    private float velocidad;
    private Ruta ruta;
    private final String codigo;
    private Estacion currentEstacion;

    public Estacion getCurrentEstacion() {
        return this.currentEstacion;
    }

    public void setCurrentEstacion(Estacion currentEstacion) {
        this.currentEstacion = currentEstacion;
    }

    public Tren(float velocidad, String codigo, Estacion currentEstacion) {
        this.velocidad = velocidad;
        this.codigo = codigo;
        this.currentEstacion = currentEstacion;
    }

    public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public Ruta getRuta() {
        return this.ruta;
    }

    public void setRuta(Ruta nuevaRuta) {
        this.ruta = nuevaRuta;
    }    

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return "Tren INFO" +
                "\nVelocidad: " + getVelocidad() +
                "\nCodigo: " + getCodigo() +
                "\nRuta:" + ruta.toString();
    }

}