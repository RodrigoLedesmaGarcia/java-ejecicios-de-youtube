package com.spring.www.ejercicios._9_adivinarNumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num, usuario, intentos = 0;

        num = random.nextInt(101);

        do {
            System.out.println("Ingrese un numero entre el 0 y el 100");
            usuario =scanner.nextInt();

            if (num > usuario){
                System.out.println("El numero que buscas es mayor");
            } else if (num < usuario) {
                System.out.println("Elk numero que buscas es menor");
            }
            intentos++;

        } while (num != usuario);

        System.out.println("Encontraste el numero "+num+" en "+intentos+" intentos");
    }
}
