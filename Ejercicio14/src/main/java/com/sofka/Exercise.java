package com.sofka;

import java.util.Scanner;

/**
 * Programa que, dado un número imprime ls números desde ese número hasta el 1000 con saltos de 2 en 2.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Integer startNumber;
        System.out.println("Ingrese el número inicial");
        startNumber = read.nextInt();
        numbersToThousand(startNumber);
    }

    /**
     * Método para imprimir los números hasta el 1000 con saltos de 2 en 2.
     *
     * @param startNumber Numero desde el que se va a empezar a mostrar.
     */
    public static void numbersToThousand(Integer startNumber){
        for (int i = startNumber; i <= 1000; i+=2) {
            System.out.println(i);
        }
    }
}
