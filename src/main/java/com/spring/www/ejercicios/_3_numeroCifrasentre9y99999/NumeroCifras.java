package com.spring.www.ejercicios._3_numeroCifrasentre9y99999;

import java.util.Scanner;

public class NumeroCifras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 9 y 99999: ");
        int numero = scanner.nextInt();

        if (numero >= 9 && numero <= 99999) {

            if (numero >= 10000) {
                System.out.println("El número tiene 5 cifras");
            } else if (numero >= 1000) {
                System.out.println("El número tiene 4 cifras");
            } else if (numero >= 100) {
                System.out.println("El número tiene 3 cifras");
            } else if (numero >= 10) {
                System.out.println("El número tiene 2 cifras");
            } else {
                System.out.println("El número tiene 1 cifra");
            }

        } else {
            System.out.println("Número fuera de rango");
        }

        scanner.close();
    }
}