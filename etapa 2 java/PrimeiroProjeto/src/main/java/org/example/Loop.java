package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaAvalicao=0, nota;

        for (int i = 0; i < 3; i++) {
        System.out.println("Diga sua avaliação para o filme de 0 ate 10:");
        nota = sc.nextDouble();
        mediaAvalicao += nota;

        }
        System.out.println(String.format("A media foi de %.2f", mediaAvalicao/3));
    }
}
