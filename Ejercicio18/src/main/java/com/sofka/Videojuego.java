package com.sofka;

/**
 * Clase videojuego que implementa la interfaz entregable, esta tiene los atributos titulo, horas estimadas, entregado,
 * genero y compañia.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Videojuego implements IEntregable{
    private static final Integer defaultHorasEstimadas = 10;
    private static final Boolean defaultEntregado = Boolean.FALSE;

    private String titulo;
    private Integer horasEstimadas;
    private Boolean entregado;
    private String genero;
    private String compania;

    /**
     * Constructor de la clase videojuego que no recibe parametros, inicializa todos los atributos por defecto
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Videojuego(){
        titulo = "";
        horasEstimadas = defaultHorasEstimadas;
        entregado = defaultEntregado;
        genero = "null";
        compania = "";
    }

    /**
     * Constructor de la clase videojuego que recibe dos parametros y el resto los inicializa por defecto.
     *
     * @param titulo del videojuego
     * @param horasEstimadas de duración del videojuego
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.compania = "";
        entregado = defaultEntregado;
        genero = null;
    }

    /**
     * Constructor de la clase videojuego que recibe todos los parametros menos entregado, este lo inicializa por defecto.
     *
     * @param titulo del videojuego
     * @param horasEstimadas de duración del videojuego
     * @param genero del videojuego
     * @param compania creadora del videojuego
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
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
     * Método que devuelve el valor de la variable horasEstimadas.
     *
     * @return Integer con el valor de la variable horasEstimadas
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Integer horasEstimadas() {
        return horasEstimadas;
    }

    /**
     * Método para asignar el valor a la variable horasEstimadas.
     *
     * @param horasEstimadas valor que se desea asignar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
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
     * Método que devuelve el valor de la variable compania.
     *
     * @return String con el valor de la variable compania
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public String compania() {
        return compania;
    }

    /**
     * Método para asignar el valor de compania
     *
     * @param compania valor que se desea asignar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setCompania(String compania) {
        this.compania = compania;
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
                "\nHoras Estimadas " +horasEstimadas +
                "\nEntregado " + entregado +
                "\nGenero " + genero +
                "\nCompania " + compania;
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
        if (this.horasEstimadas > ((Videojuego) a).horasEstimadas){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
