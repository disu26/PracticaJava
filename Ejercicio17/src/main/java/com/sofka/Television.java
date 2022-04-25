package com.sofka;

/**
 * Clase televisión que hereda los métodos y atributos de la clase abstracta Electrodomestico y tiene atributos propios
 * como resolución y sintonizadorTDT.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Television extends Electrodomestico{
    private static final Integer defaultResolucion = 20;
    private static final Boolean defaultSintonizadorTDT = false;

    private Integer resolucion;
    private Boolean sintonizadorTDT;

    /**
     * Constructor que no recibe parametros de la clase television, inicializa los atributos con su valor por defecto.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Television() {
        resolucion = defaultResolucion;
        sintonizadorTDT = defaultSintonizadorTDT;
    }

    /**
     * Constructor que recibe dos parametros de la clase padre y estos son asignados en esta, se asignan los valores
     * por defecto de los atributos propios de Television.
     *
     * @param precioBase se asigna en la clase padre
     * @param peso se asigna en la clase padre
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
        resolucion = defaultResolucion;
        sintonizadorTDT = defaultSintonizadorTDT;
    }

    /**
     * Constructor que recibe todos los parametros de la clase padre y son asignados en esta, también se reciben y
     * asignan los valores propios de la clase.
     *
     * @param precioBase se asigna en la clase padre
     * @param color se asigna en la clase padre
     * @param consumoEnergetico se asigna en la clase padre
     * @param peso se asigna en la clase padre
     * @param resolucion del televisor, en pulgadas
     * @param sintonizadorTDT boolean que indica si hay o no sintonizadorTDT
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer resolucion, Boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Método que devuelve el valor de la resolución del televisor
     *
     * @return Integer con el valor de la resolución del televisor
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Integer resolucion() {
        return resolucion;
    }

    /**
     * Método que devuelve el valor del sintonizadorTDT
     *
     * @return Boolean que indica si hay o no sintonizadorTDT
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Boolean sintonizadorTDT() {
        return sintonizadorTDT;
    }

    /**
     * Se sobreescribe el método de precioFinal para añadir el precio extra de la resolución y el sintonizadorTDT.
     *
     * @return Double con el valor del precio final sumandole los costos erxtra por resolucion y sintonizadorTDT
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Double precioFinal() {
        Double precioResolucion = precioResolucion();
        Double precioSintonizadorTDT = precioSintonizadorTDT();

        return super.precioFinal() + precioResolucion + precioSintonizadorTDT;
    }

    /**
     * Método que devuelve el valor del precio extra a pagar de acuerdo a la resolucion
     *
     * @return Double con el valor del precio extra de acuerdo a la resolucion
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private Double precioResolucion(){
        if(resolucion >= 40.0){
            return super.precioFinal() * 0.3;
        }
        return 0.0;
    }

    /**
     * Método que devuelve el valor del precio extra a pagar de acuerdo a si hay o no sintonizadorTDT
     *
     * @return Double con el valor del precio extra de acuerdo a si hay o no sintonizadorTDT
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private Double precioSintonizadorTDT(){
        if (Boolean.TRUE.equals(sintonizadorTDT)){
            return 50.0;
        }
        return 0.0;
    }
}
