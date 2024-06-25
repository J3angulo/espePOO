/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mi_primer_archivo;

/**
 *
 * @author Makurbo
 */
public class Clase1 {
    // Atributos privados
    private static String mensaje = "Hola, este es mi primer archivo";

    // Método getter
    public static String getMensaje() {
        return mensaje;
    }

    // Método setter
    public static void setMensaje(String nuevoMensaje) {
        mensaje = nuevoMensaje;
    }

    // Método main de Clase1
    public static void main(String[] args) {
        System.out.println(getMensaje());
    }
}
