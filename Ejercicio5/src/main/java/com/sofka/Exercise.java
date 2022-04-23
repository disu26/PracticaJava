package com.sofka;

/**
 * Programa que muestra los números impares y pares del 1 al 100 con ciclo while.
 *
 * @version 1.0.0 2022-04-22
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
        int i = 1;
        while (i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     * Método para mostrar los números impares
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static void showOddNumbers(){
        int i = 1;
        while (i <= 100){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
