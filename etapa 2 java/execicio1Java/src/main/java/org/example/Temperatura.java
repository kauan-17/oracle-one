package org.example;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite o valor em Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit =  (celsius * 1.8) + 32;
        System.out.println(String.format("O valor em Fahrenheit: %.1f  e a temperatura em Celsius e de %.2f", fahrenheit,celsius));

    }
}
