package com.sofka;

/**
 * Clase serie que implementa la interfaz entregable, esta tiene los atributos titulo, numero temporadas, entregado,
 * genero y creador.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Serie implements IEntregable{
    private static final Integer defaultNumeroTemporadas = 3;
    private static final Boolean defaultEntregado = Boolean.FALSE;

    private String titulo;
    private Integer numeroTemporadas;
    private Boolean entregado;
    private String genero;
    private String creador;

    /**
     * Constructor que no recibe ningún parametro y asigna todos los valores por defecto.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Serie(){
        titulo = "";
        numeroTemporadas = defaultNumeroTemporadas;
        entregado = defaultEntregado;
        genero = "null";
        creador = "";
    }

    /**
     * Constructor de la clase serie que recibe dos parametros y el resto los asigna por defecto.
     *
     * @param titulo de la serie
     * @param creador de la serie
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        numeroTemporadas = defaultNumeroTemporadas;
        entregado = defaultEntregado;
        genero = "";
    }

    /**
     * Constructor de la clase serie que recibe todos los parametros y los asigna , también el valor por defecto de
     * entregado.
     *
     * @param titulo de la serie
     * @param numeroTemporadas de la serie
     * @param genero de la serie
     * @param creador de la serie
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        entregado = defaultEntregado;
    }

    /**
     * Método que devuelve el valor de la variable titulo.
     *
     * @return String con el valor de la variable titulo
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public String titulo() {
        return titulo;
    }

    /**
     * Método para asignar el valor a la variable titulo.
     *
     * @param titulo valor que se desea asignar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método que devuelve el valor de la variable numeroTemporadas.
     *
     * @return Integer con el valor de la variable numeroTemporadas
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Integer numeroTemporadas() {
        return numeroTemporadas;
    }

    /**
     * Método para asignar el valor a la variable numeroTEmporadas.
     *
     * @param numeroTemporadas valor que se desea asignar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    /**
     * Método que devuelve el valor de la variable genero.
     *
     * @return String con el valor de la variable genero
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public String genero() {
        return genero;
    }

    /**
     * Método para asignar el valor a la variable genero.
     *
     * @param genero valor que se desea asignar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Método que devuelve el valor de la variable creador.
     *
     * @return String con el valor de la variable creador
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public String creador() {
        return creador;
    }

    /**
     * Método para asignar el valor de creador
     *
     * @param creador valor que se desea asignar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * Se sobreescribe el metodo toString para mostrar un mensaje más personalziado.
     *
     * @return String con el mensaje que se desea mostrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Serie: " +
                "\nTitulo " + titulo +
                "\nNumero Temporadas " +numeroTemporadas +
                "\nEntregado " + entregado +
                "\nGenero " + genero +
                "\nCreador " + creador;
    }

    /**
     * Cambia el atributo entregado a true.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public void entregar() {
        entregado = Boolean.TRUE;
    }

    /**
     * Cambia el atributo entregado a false.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public void devolver() {
        entregado = Boolean.FALSE;
    }

    /**
     * Devuelve el estado del atributo entregado
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Boolean isEntregado() {
        return entregado;
    }

    /**
     * Compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
     *
     * @param a objeto a comparar.
     * @return Boolean que indica si es o no mayor.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Boolean compareTo(Object a) {
        if (this.numeroTemporadas > ((Serie) a).numeroTemporadas){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
