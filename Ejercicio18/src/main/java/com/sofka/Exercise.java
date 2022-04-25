package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que crea objetos de tipo series y videojuegos y utiliza algunos de sus métodos.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        crearSeries();
        crearVideojuegos();
    }

    /**
     * Método para crear las series, se crean con valores asignados.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private static void crearSeries(){
        Serie[] series = new Serie[5];
        Integer seriesEntregados = 0;
        Serie masTemporadas = new Serie();

        Serie serie1 = new Serie();
        series[0] = serie1;
        Serie serie2 = new Serie("Los soprano", "HBO");
        series[1] = serie2;
        Serie serie3 = new Serie("Breaking Bad", 5, "Accion", "AMC");
        series[2] = serie3;
        Serie serie4 = new Serie("Game of Thrones", 8, "Fantasia", "HBO");
        series[3] = serie4;
        Serie serie5 = new Serie("Friends", 10, "Comedia", "WARNER");
        series[4] = serie5;

        serie1.entregar();
        serie3.entregar();

        for (Serie serie : series) {
            if(Boolean.TRUE.equals(serie.isEntregado())){
                seriesEntregados++;
                serie.devolver();
            }
        }

        JOptionPane.showMessageDialog(null,"Han sido entregados " + seriesEntregados + " series");

        for (int i = 1; i < series.length; i++){
            if(Boolean.TRUE.equals(series[i].compareTo(series[i-1]))){
                masTemporadas = series[i];
            }
        }

        JOptionPane.showMessageDialog(null, "La serie con mas temporadas es \n" + masTemporadas);
    }

    /**
     * Método para crear los videojuegos, se crean con valores asignados.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private static void crearVideojuegos(){
        Videojuego[] videojuegos = new Videojuego[5];
        Integer videojuegosEntregados = 0;
        Videojuego masHoras = new Videojuego();

        Videojuego videojuego1 = new Videojuego();
        videojuegos[0] = videojuego1;
        Videojuego videojuego2 = new Videojuego("FIFA", 1000);
        videojuegos[1] = videojuego2;
        Videojuego videojuego3 = new Videojuego("MINECRAFT", 10000, "Aventura", "MICROSOFT");
        videojuegos[2] = videojuego3;
        Videojuego videojuego4 = new Videojuego("Age of EMpires", 500, "Estrategia", "MICROSOFT");
        videojuegos[3] = videojuego4;
        Videojuego videojuego5 = new Videojuego("Valorant", 200, "Shooter", "RIOT");
        videojuegos[4] = videojuego5;

        videojuego1.entregar();
        videojuego5.entregar();


        for (Videojuego videojuego : videojuegos) {
            if(Boolean.TRUE.equals(videojuego.isEntregado())){
                videojuegosEntregados++;
                videojuego.devolver();
            }
        }

        JOptionPane.showMessageDialog(null,"Han sido entregados " + videojuegosEntregados + " videojuegos");

        for (int i = 1; i < videojuegos.length; i++){
            if(Boolean.TRUE.equals(videojuegos[i].compareTo(videojuegos[i-1]))){
                masHoras = videojuegos[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El videojuego con mas horas es \n" + masHoras);
    }
}
