package com.spring.www.ejercicios._1_mayorDosNumeros;

import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos números para saber cual es el mayor");
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Ambos números son iguales");
        } else {
            if (numero1 > numero2){
                System.out.println("El número "+numero1+" es mayor que: "+numero2);
            } else {
                System.out.println("El numero "+numero2+" es mayor que "+numero1);
            }
        }
    }
}
