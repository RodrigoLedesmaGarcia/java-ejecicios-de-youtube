package com.spring.www.ejercicios._11_numero_cifras;

import java.util.Scanner;

public class NumeroCifras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para saber su cantidad de cifras: ");
        int numero = scanner.nextInt();

        int aux = numero;
        int cifras = 0;

        while (aux != 0) {
            aux = aux / 10;
            cifras++;
        }

        System.out.println("El número tiene " + cifras + " cifras");
    }
}
