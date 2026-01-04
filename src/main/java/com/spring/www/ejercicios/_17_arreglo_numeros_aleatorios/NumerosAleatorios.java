package com.spring.www.ejercicios._17_arreglo_numeros_aleatorios;

import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {

        int[] arreglo;
        int tamano = 0;
        int minimo = 0;
        int maximo = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del arreglo: ");
        tamano = scanner.nextInt();

        arreglo = new int[tamano];

        for (int i = 0; i < tamano; i++){
            arreglo[i] = (int)(Math.random()*((maximo-minimo+1)+minimo));
        }

        System.out.println("El arreglo es: ");
        for (int i = 0; i < tamano; i++){
            System.out.println(arreglo[i]);
        }

    }
}
