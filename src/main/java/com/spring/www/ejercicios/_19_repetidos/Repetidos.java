package com.spring.www.ejercicios._19_repetidos;

import java.util.*;

public class Repetidos {
    public static void main(String[] args) {

        int N = 10;
        int[] a = new int[N];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num;

        for (int i = 0; i < N; i++) {
            a[i] = random.nextInt(10) + 1;
            System.out.print(a[i] + " ");
        }

        System.out.println("\nIngresa un numero entre 1 y 10:");
        num = scanner.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Numero fuera de rango. Intenta de nuevo:");
            num = scanner.nextInt();
        }

        int finalNum = num;
        long count = Arrays.stream(a)
                .filter(x -> x == finalNum)
                .count();

        System.out.println("El numero " + num + " se repite " + count + " veces");
    }
}
