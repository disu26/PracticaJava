package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que, al ingresar dos palabras indica si son iguales, y si no son iguales muestra sus
 * diferencias
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Ingrese una palabra");
        String word2 = JOptionPane.showInputDialog("Ingrese otra palabra");
        equalWord(word1, word2);
    }

    /**
     * Método que verifica si las palabras son iguales, si no lo son ejecuta el método notEquals
     *
     * @param word1 Primera palabra a comparar
     * @param word2 Segunda palabra a comparar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private static void equalWord(String word1, String word2){
        if (word1.equals(word2)){
            JOptionPane.showMessageDialog(null,"Las palabras son iguales");
        }else if(word1.length() < word2.length()){
            notEquals(word1, word2);
        }else {
            notEquals(word2, word1);
        }
    }

    /**
     * Método que se ejecuta cuando dos palabras no son iguales, se recorren las dos palabras y se muestran
     * sus diferencias por posición.
     *
     * @param word1 Primera palabra a comparar
     * @param word2 Segunda palabra a comparar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private static void notEquals(String word1, String word2){
        for (int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i) != word2.charAt(i)){
                JOptionPane.showMessageDialog(null,"Las palabras son diferentes en " +
                        "la posicion " + i + " ya que en una palabra se ve la letra " + word1.charAt(i) +
                        " y en la otra palabra se ve la letra " + word2.charAt(i));
            }
        }
    }
}
