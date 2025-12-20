package com.spring.www.ejercicios._15_calcularPromedio;

import java.util.Arrays;
import java.util.List;

public class CalcularPromedio {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10,10,10,10,11,12,10,10);

        double promedio = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(promedio);
    }
}
