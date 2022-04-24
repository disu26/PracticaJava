package com.sofka;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Programa que permite consultar la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        showActualDateTime();
    }

    /**
     * Método que le asigna el formato con el que se va a mostrar y muestra la fecha y hora actual.
     */
    private static void showActualDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        JOptionPane.showMessageDialog(null,"Fecha y Hora Actual: \n"
                + dtf.format(LocalDateTime.now()));
    }
}
