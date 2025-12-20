package com.spring.www.ejercicios._6_valorAbsoluto;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un númerp parea saber su valor absoluto: ");
        int numero = scanner.nextInt();

        int numero1 = numero;

        if (numero < 0){
            numero1 = numero* -1;
        }

        System.out.println("El valor Absoluto de: "+numero+" es: "+numero1);
    }
}
