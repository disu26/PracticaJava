package com.sofka;

import java.util.Scanner;

/**
 * Programa que indica, dadas dos variables ingresadas por consola,qué número es
 * mayor o si son iguales.
 *
 * @version 1.0.0 2022-04-20
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese el primer número");
        num1 = read.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = read.nextInt();
        System.out.println(evaluate(num1,num2));
    }

    /**
     * Función que evalúa qué número es el mayor o si son iguales.
     *
     * @param num1 Primer número a evaluar.
     * @param num2 Segundo número a evaluar.
     * @return devuelve un String con el mensaje de qué numero es el mayor o si son iguales.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static String evaluate(int num1, int num2){
        if(num1 > num2){
            return "El numero " + num1 + " es mayor que el " + num2;
        }else if(num1 < num2){
            return "El numero " + num2 + " es mayor que el " + num1;
        }
        return "Los numeros son iguales";
    }
}
