package com.sofka;

/**
 * Interfaz con los metodos entregar, devolver, isEntregado y compareTo para ser implementados.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface IEntregable {

    /**
     * Cambia el atributo entregado a true.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    void entregar();

    /**
     * Cambia el atributo entregado a false.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    void devolver();

    /**
     * Devuelve el estado del atributo entregado
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    Boolean isEntregado();

    /**
     * Compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
     *
     * @param a objeto a comparar.
     * @return Boolean que indica si es o no mayor.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    Boolean compareTo(Object a);
}
