package com.sofka;

import java.util.Arrays;

/**
 * Clase abstracta electrodomestico, esta tiene los atributos color, precioBase, consumo energetico y peso, también
 * cuentas con otros atributos constantes que son usados para asignar los valores por defecto.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public abstract class Electrodomestico {
    private static final String defaultColor = "blanco";
    private static final Character defaultConsumoEnergetico = 'F';
    private static final Double defaultPrecioBase = 100.0;
    private static final Double defaultPeso = 5.0;
    private static final String[] avaliableColors = {defaultColor, "negro", "rojo", "azul", "gris"};

    private Double precioBase;
    private String color;
    private Character consumoEnergetico;
    private Double peso;

    /**
     * Constructor que no recibe ningún parametro de la clase electrodomestico, se asignan los valores por defecto.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    protected Electrodomestico() {
        precioBase = defaultPrecioBase;
        color = defaultColor;
        consumoEnergetico = defaultConsumoEnergetico;
        peso = defaultPeso;
    }

    /**
     * Constructor que redcibe algunos parametros de la clase electrodomestico, los otros valores se asignan por defecto.
     *
     * @param precioBase del electrodomestico
     * @param peso del electrodomestico
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    protected Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = defaultColor;
        consumoEnergetico = defaultConsumoEnergetico;
    }

    /**
     * Constructor que recibe como parametro todos los atributos de la clase.
     *
     * @param precioBase del electrodomestico
     * @param color del electrodomestico, este valor es verificado y si es incorrecto se asigna el valor por defecto
     * @param consumoEnergetico del electrodomestico, este valor es validado y si es incorrecto se asigna el valor por
     *                          defecto
     * @param peso del electrodomestico.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    protected Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        comprobarColor(color.toLowerCase());
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    /**
     * Método que comprueba que el consumo energetico ingresado sea un valor valido, de lo contrario se asigna un valor
     * por defecto.
     *
     * @param letra que representa el tipo de consumo energetico
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private void comprobarConsumoEnergetico(Character letra){
        if(letra >= 65 && letra <= 70){
            consumoEnergetico = letra;
        }else {
            consumoEnergetico = defaultConsumoEnergetico;
        }
    }

    /**
     * Método que comprueba que el color ingresado esté dentro de los valores admitidos, de lo contrario se asigna
     * un valor por defecto.
     *
     * @param color del electrodomestico.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private void comprobarColor(String color){
        String findColor = Arrays.stream(avaliableColors)
                              .filter(s -> s.equals(color))
                              .findFirst()
                              .orElse(null);

        if (findColor != null){
            this.color = color;
        }else {
            this.color = defaultColor;
        }
    }

    /**
     * Método que devuelve el precio final del electrodomestico, este llama a otros dos metodos que devuelven los
     * costos extra.
     *
     * @return Double con el valor del precio final del electrodomestico.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Double precioFinal(){
        Double precioConsumoEnergetico = precioConsumoEnergetico();
        Double precioPeso = precioPeso();

        return precioBase + precioPeso + precioConsumoEnergetico;
    }

    /**
     * Método que calcula el precio extra de acuerdo al consumo energetico del electrodomestico.
     *
     * @return Double con el valor del precio extra de acuerdo al consumo energetico
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private Double precioConsumoEnergetico(){
        Double precioConsumoEnergetico = 0.0;
        if(consumoEnergetico == 'A'){
            precioConsumoEnergetico = 100.0;
        }else if(consumoEnergetico == 'B'){
            precioConsumoEnergetico = 80.0;
        }else if(consumoEnergetico == 'C'){
            precioConsumoEnergetico = 60.0;
        }else if(consumoEnergetico == 'D'){
            precioConsumoEnergetico = 50.0;
        }else if(consumoEnergetico == 'E'){
            precioConsumoEnergetico = 30.0;
        }else if(consumoEnergetico == 'F'){
            precioConsumoEnergetico = 10.0;
        }
        return precioConsumoEnergetico;
    }

    /**
     * Método que calcula el precio extra de un producto de acuerdo a su peso.
     *
     * @return Double con el valor del precio extra del producto de acuerdo a su peso.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private Double precioPeso(){
        Double precioPeso = 0.0;

        if(peso >= 0.0 && peso <= 19.0){
            precioPeso = 10.0;
        }else if(peso >= 20.0 && peso <= 49.0){
            precioPeso = 50.0;
        }else if(peso >= 50.0 && peso <= 79.0){
            precioPeso = 80.0;
        }else if(peso >= 80.0){
            precioPeso = 100.0;
        }

        return precioPeso;
    }

    /**
     * Método que devuelve el precio base del electrodomestico.
     *
     * @return Double con el valor del precio base del electrodomestico.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Double precioBase() {
        return precioBase;
    }

    /**
     * Método que devuelve el color del electrodomestico.
     *
     * @return String con el valor del color del electrodomestico
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public String color() {
        return color;
    }

    /**
     * Método que devuelve el consumo energetico de un electrodomestico.
     *
     * @return Character con el valor del consumo energetico de un electrodomestico.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Character consumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Método que devuelve el peso del electrodomestico.
     *
     * @return Double con el valor del peso del electrodomestico.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Double peso() {
        return peso;
    }
}
