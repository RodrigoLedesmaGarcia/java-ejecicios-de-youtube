package com.spring.www.ejercicios._13_numerosCapicuas;

import java.util.Scanner;

public class NumerosCapicuas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero para saber si es capicua: ");
        String numero = scanner.nextLine();

        StringBuilder sb = new StringBuilder(numero);
        String invertido = sb.reverse().toString();

        if (numero.equals(invertido)) {
            System.out.println("El número ES capicúa");
        } else {
            System.out.println("El número NO es capicúa");
        }

        scanner.close();
    }
}
