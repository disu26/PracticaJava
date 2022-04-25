package com.sofka;

public final class Television extends Electrodomestico{
    private static final Double defaultResolucion = 20.0;
    private static final Boolean defaultSintonizadorTDT = false;

    private Double resolucion;
    private Boolean sintonizadorTDT;

    public Television() {
        resolucion = defaultResolucion;
        sintonizadorTDT = defaultSintonizadorTDT;
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
        resolucion = defaultResolucion;
        sintonizadorTDT = defaultSintonizadorTDT;
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Double resolucion, Boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double resolucion() {
        return resolucion;
    }

    public Boolean sintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public Double precioFinal() {
        Double precioResolucion = precioResolucion();
        Double precioSintoniadorTDT = precioSintonizadorTDT();

        return super.precioFinal() + precioResolucion + precioSintoniadorTDT;
    }

    private Double precioResolucion(){
        if(resolucion >= 40.0){
            return super.precioFinal() * 0.3;
        }
        return 0.0;
    }

    private Double precioSintonizadorTDT(){
        if (Boolean.TRUE.equals(sintonizadorTDT)){
            return 50.0;
        }
        return 0.0;
    }
}
