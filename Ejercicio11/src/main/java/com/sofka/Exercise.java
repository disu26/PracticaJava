package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que, al ingresar una frase por teclado muestra la longitud y cuenta las repeticiones
 * de las vocales.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Ingrese un texto");
        JOptionPane.showMessageDialog(null,"Esta frase tiene una longitud de " + text.length() +
                " caracteres");
        repeatedVowels(text, 'a');
        repeatedVowels(text, 'e');
        repeatedVowels(text, 'i');
        repeatedVowels(text, 'o');
        repeatedVowels(text, 'u');
    }

    /**
     * Método que recorre un string para contar cuántas veces se repite una vocal.
     *
     * @param text texto a recorrer
     * @param vowel vocal a buscar
     */
    public static void repeatedVowels(String text, char vowel){
        Integer counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == vowel){
                counter++;
            }
        }
        JOptionPane.showMessageDialog(null, "La vocal " + vowel + " se repite " + counter + " veces");
    }
}
