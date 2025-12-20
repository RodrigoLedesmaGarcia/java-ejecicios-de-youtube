package com.spring.www.ejercicios._5_notaPorPromedio;

import java.util.Scanner;

public class NotaPromedio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificacion del alumno (0 a 10): ");
        double numero = scanner.nextDouble();

        if (numero >= 0 && numero <= 10) {

            if (numero < 6) {
                System.out.println("Reprobado");
            } else if (numero < 7.5) {
                System.out.println("Regular");
            } else if (numero < 8.5) {
                System.out.println("Bueno");
            } else {
                System.out.println("Excelente");
            }

        } else {
            System.out.println("Rango invalido");
        }

        scanner.close();
    }
}