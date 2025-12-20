package com.spring.www.ejercicios._2_numeroNegativosPositivos;

import java.util.Scanner;

public class NumeroNagativosPositivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para saber si es positivo  o negativo: ");
        int numero = scanner.nextInt();

        if (numero > 0 ){
            System.out.println("El número "+numero+" es positivo");
        } else {
            System.out.println("El número "+numero+" es negativo");
        }
    }
}
