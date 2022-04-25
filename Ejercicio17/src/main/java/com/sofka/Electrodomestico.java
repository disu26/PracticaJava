package com.sofka;

import java.util.Arrays;

public abstract class Electrodomestico {
    private static final String defaultColor = "blanco";
    private static final Character defaultConsumoEnergetico = 'F';
    private static final Double defaultPrecioBase = 100.0;
    private static final Double defaultPeso = 5.0;
    private static final String[] avaliableColors = {"blanco", "negro", "rojo", "azul", "gris"};

    private Double precioBase;
    private String color;
    private Character consumoEnergetico;
    private Double peso;

    public Electrodomestico() {
        precioBase = defaultPrecioBase;
        color = defaultColor;
        consumoEnergetico = defaultConsumoEnergetico;
        peso = defaultPeso;
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = defaultColor;
        consumoEnergetico = defaultConsumoEnergetico;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        comprobarColor(color.toLowerCase());
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(Character letra){
        if(letra >= 65 && letra <= 70){
            consumoEnergetico = letra;
        }else {
            consumoEnergetico = defaultConsumoEnergetico;
        }
    }

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

    public Double precioFinal(){
        Double precioConsumoEnergetico = precioConsumoEnergetico();
        Double precioPeso = precioPeso();

        return precioBase + precioPeso + precioConsumoEnergetico;
    }

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

    public Double precioBase() {
        return precioBase;
    }

    public String color() {
        return color;
    }

    public Character consumoEnergetico() {
        return consumoEnergetico;
    }

    public Double peso() {
        return peso;
    }
}
