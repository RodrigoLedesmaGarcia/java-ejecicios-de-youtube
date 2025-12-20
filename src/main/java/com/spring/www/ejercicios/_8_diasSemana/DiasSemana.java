package com.spring.www.ejercicios._8_diasSemana;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para saber que dia de la semana corresponde: ");
        int dia = scanner.nextInt();

        if (dia >= 1 && dia < 8){
            switch (dia){
                case 1 -> {
                    System.out.println("El dia un corresponde a lunes");
                }
                case 2 -> {
                    System.out.println("El dia dos corresponde a martes");
                }
                case 3 -> {
                    System.out.println("El dia tres corresponde a miercoles");
                }
                case 4 -> {
                    System.out.println("El dia cuatro corresponde a jueves");
                }
                case 5 -> {
                    System.out.println("El dia cinco corresponde a viernes");
                }
                case 6 -> {
                    System.out.println("El dia seis corresponde a sabado");
                }
                case 7 -> {
                    System.out.println("El dia siete corresponde a domingo");
                }
            }
        } else {
            System.out.println("Dia de la semana invalido");
        }
    }
}
