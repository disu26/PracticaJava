package com.sofka;

public final class Lavadora extends Electrodomestico{
    private static final Double defaultCarga = 5.0;

    private Double carga;

    public Lavadora(Double carga) {
        this.carga = defaultCarga;
    }

    public Lavadora(Double precioBase, Double peso, Double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double carga() {
        return carga;
    }

    @Override
    public Double precioFinal() {
        Double precioCarga = precioCarga();
        return super.precioFinal() + precioCarga;
    }

    private Double precioCarga(){
        if(carga >= 30.0){
            return 50.0;
        }
        return 0.0;
    }
}
