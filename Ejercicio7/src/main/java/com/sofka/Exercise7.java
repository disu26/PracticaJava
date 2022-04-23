package com.sofka;

import javax.swing.JOptionPane;

/**
 * Función que lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo
 * es lo volverá a pedir (do while), después muestra ese número por consola.
 *
 * @version 1.0.0 2022-04-23
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise7 {
    public static void main(String[] args) {
        Boolean greaterEquals;
        Integer number;
        do {
            number = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un numero"));
            greaterEquals = greaterEqualsCero(number);
            if (Boolean.FALSE.equals(greaterEquals)){
                JOptionPane.showMessageDialog(null,"Ingrese un numero mayor o igual a cero");
            }
        } while (Boolean.FALSE.equals(greaterEquals));
        JOptionPane.showMessageDialog(null,"El numero ingresado es: "+number);
    }

    /**
     * Método que evalua si un número es mayor o igual a cero.
     *
     * @param number numero ingresado por pantalla, este es el que será evaluado.
     * @return boolean que indica si el número es mayor o igual a cero.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static boolean greaterEqualsCero(Integer number){
        return number >= 0;
    }
}
