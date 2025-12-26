package com.spring.www.ejercicios._16_cantidadNumerosParesImpares;

import java.util.Scanner;

public class NumerosImparesPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int pares = 0;
        int impares = 0;

        do {
            System.out.print("Ingresa un numero o -1 para salir: ");
            numero = scanner.nextInt();
            if (numero != -1){
                if ((numero%2) == 0 ){
                    pares++;
                } else {
                    impares++;
                }
            }

        } while (numero != -1);

        System.out.println("lA CANTIDAD DE PARES ES: "+pares);
        System.out.println("La CANTIDAD DE IMPARES ES "+impares);
    }
}
