package gpl.pizarro.rails;

import gpl.pizarro.rails.estacion.Estacion;
import gpl.pizarro.rails.ruta.Ruta;
import gpl.pizarro.rails.tren.Tren;

import java.util.List;
import java.util.ArrayList;

public class Rails {
    
    public static void main( String[] args ) {
        
        /*
        Construir 10 estaciones, comprar 3 trenes
        y asignarles una ruta a cada uno. Todas 
        las estaciones estan en una ruta.
        */
        List<Estacion> listaEstaciones1 = new ArrayList<Estacion>();
        List<Estacion> listaEstaciones2 = new ArrayList<Estacion>();
        List<Estacion> listaEstaciones3 = new ArrayList<Estacion>();

        //Estaciones
        Estacion estacion1 = new Estacion("Palma", "dhr7tIyn");
        Estacion estacion2 = new Estacion("Marratxi", "6fTIdXBi");
        Estacion estacion3 = new Estacion("Inca", "KN5SjGgt");
        Estacion estacion4 = new Estacion("Alcudia", "uJbwTxlW");
        Estacion estacion5 = new Estacion("Pollença", "ZnSmQkqy");
        Estacion estacion6 = new Estacion("Port Pollença", "vLHxJgtd");
        Estacion estacion7 = new Estacion("Manacor", "ben3pn66");
        Estacion estacion8 = new Estacion("Villafranca", "VMDbN3Pl");
        Estacion estacion9 = new Estacion("Montuiri", "xDqj2b21");
        Estacion estacion10 = new Estacion("Algaida", "xG06Rnke");

        listaEstaciones1.add(estacion1);
        listaEstaciones1.add(estacion2);
        listaEstaciones1.add(estacion3);
        listaEstaciones2.add(estacion4);
        listaEstaciones2.add(estacion5);
        listaEstaciones2.add(estacion6);
        listaEstaciones3.add(estacion7);
        listaEstaciones3.add(estacion8);
        listaEstaciones3.add(estacion9);
        listaEstaciones3.add(estacion10);

        //Trenes
        Tren tren1 = new Tren(168.9f, "rUkC4x1F", estacion1);
        Tren tren2 = new Tren(257.8f, "FvTebw1A", estacion4);
        Tren tren3 = new Tren(300.1f, "2q0bLqBX", estacion7);

        //Rutas
        Ruta ruta1 = new Ruta(listaEstaciones1, 30, 6.30f, tren1);
        Ruta ruta2 = new Ruta(listaEstaciones2, 30, 6.30f, tren2);
        Ruta ruta3 = new Ruta(listaEstaciones3, 30, 6.30f, tren3);

        /*
        Calcula el tiempo que tardara el tren de la ruta 1
        en recorrer todo el trayecto.
        */
        System.out.println("========================");
        System.out.println("|Tiempo estimado ruta 1|");
        System.out.println("=======================");
        System.out.println(ruta1.getTiempoEstimado());

        /*
        Muestra la información del tren 2.
        */
        System.out.println("====================");
        System.out.println("|Información tren 2|");
        System.out.println("====================");
        System.out.println(tren2.toString());

    }

}
