package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá un numero entre 0 y 9999 y mostrara el número de cifras");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca un número dentro del rango");
        //Guardamos en la variable el primer valor
        int num1 = sc.nextInt();

        //Se hacen las comparaciones para ordenarlos
        if (num1>=0&&num1<=9999) {
            String num = String.valueOf(num1);
            System.out.println("El numero introducido tiene "+num.length()+" cifras");


        } else {
            System.out.println("El número introducido esta fura del rango 0 y 9999");
        }


    }

}