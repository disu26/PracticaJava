package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que, al ingresar una frase por teclado elimina los espacios que esta contenga.
 *
 * @version 1.0.0 2022-04-23
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        String initialText = JOptionPane.showInputDialog("Ingrese un texto");
        JOptionPane.showMessageDialog(null, "El texto sin espacios queda asi: " +
                "\n" +removeSpaces(initialText));
    }

    /**
     * Método para remover los espacios de un texto.
     *
     * @param text texto al que se le desean eliminar los espacios.
     * @return String que contiene el texto sin los espacios.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static String removeSpaces(String text){
        return text.replace(" ","");
    }
}
