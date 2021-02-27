package gpl.pizarro.rails.ruta;

import gpl.pizarro.rails.estacion.Estacion;
import gpl.pizarro.rails.tren.Tren;

import java.util.List;
import java.util.ArrayList;

public class Ruta {

    private List<Estacion> estaciones;
    private float distanciaTrayecto;
    private float precio;
    private float tiempoEstimado;
    private final Tren tren;

    public Ruta(List<Estacion> estaciones, float distanciaTrayecto, float precio, Tren tren) {
        this.estaciones = estaciones;
        this.distanciaTrayecto = distanciaTrayecto;
        this.precio = precio;
        this.tren = tren;
        tren.setRuta(this);
    }

    public Tren getTren() {
        return this.tren;
    }

    public List<Estacion> getEstaciones() {
        return this.estaciones;
    }

    public float getDistanciaTrayecto() {
        return this.distanciaTrayecto;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTiempoEstimado() {
        calcularTiempo();
        return String.format("%.2f", this.tiempoEstimado);
    }

    public void addEstacion(Estacion nuevaEstacion) {
        estaciones.add(nuevaEstacion);
    }

    public void removeEstacion(String codigo) {
        for (Estacion estacion : estaciones) {
            if (estacion.getCodigo() == codigo) {
                estaciones.remove(estacion);
            }
        }
    }

    private void calcularTiempo() {
        float velocidadTren = tren.getVelocidad() / 60;
        float numEstaciones = (float) estaciones.stream().count();
        tiempoEstimado = velocidadTren / distanciaTrayecto + numEstaciones * 5;
    }

    private String estacionToString() {
        String listaEstaciones = "";
        for (Estacion estacion : estaciones) {
            listaEstaciones += "\n\t\t" + estacion.getNombre();
        }
        return listaEstaciones;
    }

    @Override
    public String toString() {
        return "\n\tDistancia total: " + getDistanciaTrayecto() + "km" +
                "\n\tTiempo trayecto: " + getTiempoEstimado() + " min" +
                "\n\tPrecio: " + getPrecio() + " E" +
                "\n\tEstaciones: " + estacionToString();
    }

}