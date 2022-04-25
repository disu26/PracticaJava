package com.sofka;

import javax.swing.JOptionPane;

/**
 * Programa que muestra un método y solo sale cuando el usuario lo desea.
 */
public final class Exercise {
    public static void main(String[] args) {
        menu();
    }

    /**
     * Método que muestra el menú de opciones.
     */
    private static void menu(){
        Boolean exit = false;
        try {
            do {
                Integer option = Integer.valueOf(JOptionPane.showInputDialog("""
                        ****** GESTION CINEMATOGRAFICA ********
                        1.NUEVO ACTOR
                        2.BUSCAR ACTOR
                        3.ELIMINAR ACTOR
                        4.MODIFICAR ACTOR
                        5.VER TODOS LOS ACTORES
                        6.VER PELICULAS DE LOS ACTORES
                        7.VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                        8.SALIR"""));
                if(option == 8){
                    exit = true;
                }else if(option < 1 || option > 8){
                    JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                }
            }while(Boolean.FALSE.equals(exit));
        }catch (NumberFormatException exc){
            JOptionPane.showMessageDialog(null,"Ingrese un numero");
        }

    }
}
