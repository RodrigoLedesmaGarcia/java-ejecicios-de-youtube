package com.spring.www.ejercicios._20_palindromos;

import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase para saber si es un palindromo: ");
        String palabra = scanner.nextLine();

        String normalizar = palabra
                .toLowerCase()
                .replaceAll(" ", "");


        StringBuilder palindromo = new StringBuilder(normalizar);
        String reversa = palindromo.reverse().toString();

        String respuesta = (reversa.equals(normalizar)) ? "Si es un palindromo": "No es un palindromo";
        System.out.println(respuesta);


    }
}
