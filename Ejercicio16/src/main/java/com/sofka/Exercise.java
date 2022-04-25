package com.sofka;

import javax.swing.JOptionPane;

/**
 * Creacion de 3 personas y manejo de la información de estos según se pedía.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Exercise {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        Double peso = Double.valueOf(JOptionPane.showInputDialog("Ingrese su peso en Kg"));
        Double altura = Double.valueOf(JOptionPane.showInputDialog("Ingrese su altura en m"));

        Persona persona1 = new Persona(nombre, edad, 'L', peso, altura);
        Persona persona2 = new Persona(nombre, edad, 'k');
        Persona persona3 = new Persona();

        int persona1IMC = persona1.calcularIMC();
        int persona2IMC = persona2.calcularIMC();
        int persona3IMC = persona3.calcularIMC();

        JOptionPane.showMessageDialog(null,"La persona 1 "+ mensajeIMC(persona1IMC));
        JOptionPane.showMessageDialog(null,"La persona 2 "+ mensajeIMC(persona2IMC));
        JOptionPane.showMessageDialog(null,"La persona 3 "+ mensajeIMC(persona3IMC));

        JOptionPane.showMessageDialog(null,"La persona 1 "+ esMayorEdad(persona1.esMayorDeEdad()));
        JOptionPane.showMessageDialog(null,"La persona 2 "+ esMayorEdad(persona2.esMayorDeEdad()));
        JOptionPane.showMessageDialog(null,"La persona 3 "+ esMayorEdad(persona3.esMayorDeEdad()));

        JOptionPane.showMessageDialog(null,persona1);
        JOptionPane.showMessageDialog(null,persona2);
        JOptionPane.showMessageDialog(null,persona3);
    }

    /**
     * Método para mostrar un mensaje diferente dependiendo del IMC de una persona.
     *
     * @param IMC valor de la persona a evaluar.
     * @return String con un mensaje dependiendo del IMC.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private static String mensajeIMC(int IMC){
        if (IMC == -1){
            return "esta en su peso ideal";
        }else if(IMC == 0){
            return "esta por debajo de su peso ideal";
        }
        return "tiene sobrepeso";
    }

    /**
     * Método para mostrar un mensaje diferente dependiendo de si una persona es o no mayor de edad.
     *
     * @param indicador boolean que indica si una persona es o no mayor de edad.
     * @return String con el mensaje personalziado.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private static String esMayorEdad(Boolean indicador){
        if (Boolean.TRUE.equals(indicador)){
            return "es mayor de edad";
        }
        return "es menor de edad";
    }
}
