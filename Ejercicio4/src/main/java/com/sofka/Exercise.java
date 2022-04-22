package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que indica, dado el precio de un producto es su precio final aplicandole el IVA.
 *
 * @version 1.0.0 2022-04-22
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        try {
            double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto"));
            JOptionPane.showMessageDialog(null, "El precio final del producto, " +
                    "con un IVA del " + IVA*100 +"% es: "+ finalPrice(productPrice));
        }catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"Solo ingrese valores numericos.");
        }
    }

    private static final double IVA = 0.21;

    /**
     * Método que calcula el precio final del producto, aplicandole el IVA.
     *
     * @param productPrice precio inicial del producto.
     * @return precio final del producto, aplicandole el IVA.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static double finalPrice(double productPrice){
        return productPrice * IVA + productPrice;
    }
}
