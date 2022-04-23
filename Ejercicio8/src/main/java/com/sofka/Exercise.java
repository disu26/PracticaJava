package com.sofka;

import javax.swing.JOptionPane;

/**
 * Aplicación que pide un día de la semana y que indica si este es un día laboral o no.
 *
 * @version 1.0.0 2022-04-23
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        String day = JOptionPane.showInputDialog("Ingrese un dia de la semana").toLowerCase();
        if(workingDay(day)){
            JOptionPane.showMessageDialog(null,"El dia " + day + " es un dia laboral");
        }else {
            JOptionPane.showMessageDialog(null,"El dia " + day + " no es un laboral");
        }
    }

    /**
     * Método que comprueba si un dia de la semana es laboral o no.
     *
     * @param day Dia de la semana a evaluar.
     * @return boolean que indica si un día de la semana es laboral o no.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public static boolean workingDay(String day){
        switch (day){
            case "lunes":
                return true;
            case "martes":
                return true;
            case "miercoles":
                return true;
            case "jueves":
                return true;
            case "viernes":
                return true;
            case "sabado":
                return false;
            case "domingo":
                return false;
            default:
                JOptionPane.showMessageDialog(null,"Ingrese un dia de la semana valido");
                return false;
        }
    }
}
