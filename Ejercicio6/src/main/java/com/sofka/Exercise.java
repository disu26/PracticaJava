package com.sofka;

/**
 * Programa que muestra los números impares y pares del 1 al 100 con ciclo for.
 *
 * @version 1.0.0 2022-04-23
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        System.out.println("Numeros pares: ");
        showPairNumbers();
        System.out.println("Numeros impares: ");
        showOddNumbers();
    }

    /**
     * Método para mostrar los números pares
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static void showPairNumbers(){
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    /**
     * Método para mostrar los números impares
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static void showOddNumbers(){
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
