package com.sofka;

/**
 * Clase lavadora que hereda los métodos y atributos de la clase abstracta Electrodomestico y tiene atributos propios
 * como carga.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Lavadora extends Electrodomestico{
    private static final Double defaultCarga = 5.0;

    private Double carga;

    /**
     * Constructor que no recibe parametros, este asigna el valor por defecto de carga.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Lavadora() {
        this.carga = defaultCarga;
    }

    /**
     * Constructor que recibe los parametros precioBase y peso que los asigna utilizando el cosntructor de la clase
     * padre y asigna su propio atributo carga.
     *
     * @param precioBase este se asigna en la clase padre
     * @param peso este se asigna en la clase padre
     * @param carga carga que soporta la lavadora
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Lavadora(Double precioBase, Double peso, Double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    /**
     * Constructor que recibe todos los parametroos de la clase Electrodomesticos y también carga que es de la clase
     * lavadora.
     *
     * @param precioBase este se asigna en la clase padre
     * @param color este se asigna en la clase padre
     * @param consumoEnergetico este se asigna en la clase padre
     * @param peso este se asigna en la clase padre
     * @param carga carga que soporta la lavadora
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * Método que devuelve el valor de la carga de la lavadora.
     *
     * @return Double con el valor de la carga de la lavadora
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Double carga() {
        return carga;
    }

    /**
     * Se sobreescribe el método de precioFinal para añadir el precio extra de la carga.
     *
     * @return Double con el valor del precio final sumandole el precio de la carga
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Double precioFinal() {
        Double precioCarga = precioCarga();
        return super.precioFinal() + precioCarga;
    }

    /**
     * Método que calcula el precio adicional de acuerdo a la carga de la lavadora.
     *
     * @return Double con el valor del precio adicional por carga de la lavadora
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private Double precioCarga(){
        if(carga >= 30.0){
            return 50.0;
        }
        return 0.0;
    }
}
