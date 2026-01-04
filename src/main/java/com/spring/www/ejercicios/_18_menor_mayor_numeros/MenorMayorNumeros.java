package com.spring.www.ejercicios._18_menor_mayor_numeros;

import java.util.Scanner;

public class MenorMayorNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menor, num, res;

        System.out.print("Ingresa un numero: ");
        menor = scanner.nextInt();
        System.out.print("Quieres ingresar otro numero 1 si, 2 No: ");
        res = scanner.nextInt();


        while (res != 2){
            System.out.print("Ingresa un numero: ");
            num = scanner.nextInt();
            if(num < menor){
                menor = num;
            }
            System.out.print("Quieres ingresar otro numero 1 si, 2 No: ");
            res = scanner.nextInt();
        }

        System.out.println("El numero menor es: "+menor);
    }
}
