package com.spring.www.ejercicios._10_teorema_pitagoras;

import java.util.Scanner;

public class TeoremaPitagoras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        System.out.println("*** teorema de pitagoras ***");
        System.out.println("1.- calcula la hipotenusa: ");
        System.out.println("2.- calcula un cateto:");
        System.out.println("3.- salir");
        System.out.print("Ingrese una opcion: ");
        opcion = scanner.nextInt();

        switch (opcion){

            case 1 -> {
                callH();
            }
            case 2 -> {
                callC();
            }
            case 3 ->{
                System.out.println("Adios");
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
    }

    public static void callH(){
        double h, c1, c2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer cateto: ");
        c1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo cateto: ");
        c2 = scanner.nextDouble();

        if (c1 > 0 && c2 > 0){
            h = Math.sqrt(Math.pow(c1, 2)+ Math.pow(c2,2));
            System.out.println("El valor de la hipotenusa es: "+h);
        } else {
            System.out.println("Datos no validos");
        }
    }

    public static void callC(){
        double h, c1, c2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de la hipotenusa: ");
        h = scanner.nextDouble();
        System.out.print("Ingresa el valor del cateto: ");
        c1 = scanner.nextDouble();

        if ((h > 0) && (c1 > 0) && ((h-c1 >0))){
            c2 = Math.sqrt(Math.pow(h, 2) - Math.pow(c1, 2));
            System.out.println("El valor de la hipotenusa es: "+c2);
        } else {
            System.out.println("Datos no validos");
        }
    }
}
