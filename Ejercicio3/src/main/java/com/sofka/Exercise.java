package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que indica, dado el radio de un círculo cuánto vale su área.
 *
 * @version 1.0.0 2022-04-22
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        try {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
            JOptionPane.showMessageDialog(null,"El area del circulo " +
                    "es: "+ calculateCircleArea(radio));
        }catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"Solo ingrese valores numericos.");
        }

    }

    /**
     * Función que calcula el área del círculo.
     *
     * @param radio, valor dado por el usuario.
     * @return área del círculo.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static double calculateCircleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }
}
