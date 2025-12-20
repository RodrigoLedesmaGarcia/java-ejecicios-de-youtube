package com.spring.www.ejercicios._7_numerosParesImpares;

import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para saber si es par o impar: ");
        int numero = scanner.nextInt();

        String ParImpar = (numero % 2 == 0) ? "El numero "+numero+" es par" : "El numero "+numero+" es impar";

        System.out.println(ParImpar);
    }
}
