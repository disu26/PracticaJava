package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que, del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior
 * por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola
 * y las muestre luego unidas.
 *
 * @version 1.0.0 2022-04-23
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        replaceConcat();
    }

    /**
     * Método que remplaza la 'a' por una 'e' y lo concatena con un nuevo texto que se pide por consola.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static void replaceConcat(){
        String defaultText = "La sonrisa sera la mejor arma contra la tristeza";
        String newText = defaultText.replace('a','e');
        String concatText = JOptionPane.showInputDialog("Ingrese la frase que quiere unir");
        String finalText = newText + " " + concatText;
        JOptionPane.showMessageDialog(null,"La nueva frase es: \n" + finalText);
    }
}
