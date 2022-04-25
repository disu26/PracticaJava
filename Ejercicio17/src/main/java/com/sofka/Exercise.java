package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que cuenta con una clase abstracta Electrodomestico y clases Television y Lavadora que heredan de esta clase.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        Double precioTotal = 0.0;
        Double precioFinalTelevisores = 0.0;
        Double precioFinalLavadoras = 0.0;

        Lavadora lavadora1 = new Lavadora();
        electrodomesticos[0] = lavadora1;
        Lavadora lavadora2 = new Lavadora(180599.99, 300.0, 40.0);
        electrodomesticos[1] = lavadora2;
        Lavadora lavadora3 = new Lavadora(1245699.99, "rojo", 'A', 400.5, 20.0);
        electrodomesticos[2] = lavadora3;
        Lavadora lavadora4 = new Lavadora(2245699.99, "blanco", 'F', 200.3, 75.0);
        electrodomesticos[3] = lavadora4;
        Lavadora lavadora5 = new Lavadora(3245699.99, "NEGRO", 'E', 800.50, 25.0);
        electrodomesticos[4] = lavadora5;

        Television television1 = new Television();
        electrodomesticos[5] = television1;
        Television television2 = new Television(1999999.99, 100.0);
        electrodomesticos[6] = television2;
        Television television3 = new Television(1599999.99, "ROJO", 'E', 150.0, 40, Boolean.TRUE);
        electrodomesticos[7] = television3;
        Television television4 = new Television(2699999.99, "negro", 'C', 50.0, 10, Boolean.FALSE);
        electrodomesticos[8] = television4;
        Television television5 = new Television(1599999.99, "azul", 'B', 200.0, 65, Boolean.TRUE);
        electrodomesticos[9] = television5;

        for (int i = 0; i < electrodomesticos.length; i++) {
            if(i < 5){
                precioFinalLavadoras += electrodomesticos[i].precioFinal();
            }else {
                precioFinalTelevisores += electrodomesticos[i].precioFinal();
            }
        }
        precioTotal = precioFinalLavadoras + precioFinalTelevisores;

        JOptionPane.showMessageDialog(null, "El precio total es: " + precioTotal +
                                                                    "\nEl precio total de las lavadoras es: " + precioFinalLavadoras +
                                                                    "\nEl precio total de los televisores es: " + precioFinalTelevisores);
    }

}
