package com.sofka;

/**
 * Clase persona con sus atributos, esta clase cuenta con 3 constructores.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Persona {
    private static final char defaultSex = 'H';
    private static final Integer pesoIdeal = -1;
    private static final Integer menorPesoIdeal = 0;
    private static final Integer sobrepeso = 1;

    private String nombre = "";
    private Integer edad = 0;
    private String DNI = "";
    private char sexo = defaultSex;
    private Double peso = 0.0;
    private Double altura = 0.0;

    /**
     * Constructor vacío de la clase persona, genera un DNI.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Persona(){
        generarDNI();
    }

    /**
     * Constructor  con 3 parametros de la clase persona, aparte de estos paramteros se genera un DNI.
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        generarDNI();
    }

    /**
     * Constructor  con 5 parametros de la clase persona, aparte de estos paramteros se genera un DNI.
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     * @param peso de la persona
     * @param altura de la persona
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Persona(String nombre, Integer edad, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDNI();
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Método para calcular el IMC de una persona.
     *
     * @return int que depende del IMC -1: Peso ideal, 0:Menos Peso Ideal, 1:Sobrepeso.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public int calcularIMC(){
        Double IMC = peso/(Math.pow(altura,2));
        if(IMC < 20){
            return pesoIdeal;
        }else if(IMC >= 20 && IMC <= 25){
            return menorPesoIdeal;
        }
        return sobrepeso;
    }

    /**
     * Método para saber si una persona es mayor de edad o no.
     *
     * @return boolean que es verdadero si una persona es mayor de 18 años, de lo contrario es falso.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    /**
     * Método para comprobar que se ingrese un sexo válido, de lo contrario se asigna como 'H' por defecto.
     *
     * @param sexo de la persona.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private void comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        }else {
            this.sexo = 'H';
        }
    }

    /**
     * Método para generar un DNI aleatorio con un numero de 8 cifras y un char aleatorio de una letra
     * mayúscula, el char se genera de acuerdo a su código ASCII.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private void generarDNI(){
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        char letraDNI = (char) Math.floor(Math.random() * (90 - 65) + 65);
        DNI = letraDNI + Integer.toString(numDNI);
    }

    /**
     * Método set para el nombre
     *
     * @param nombre de la persona
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método set para la edad
     *
     * @param edad de la persona
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * Método set para el sexo
     *
     * @param sexo de la persona
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Método set para el peso
     *
     * @param peso de la persona
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * Método set para la altura
     *
     * @param altura de la persona
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * Se sobreescribe el método toString, así se mostrará a partir de ahora el objeto persona cuando se imprima.
     *
     * @return String con la estructura del objeto.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Persona" +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + DNI +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }
}
